/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import frames.BienvenidaFrame;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author raul
 */
public class Cliente {
    
    private BienvenidaFrame frame;
    
    private final String hostname;
    private final int puertoServidor;
    private DatagramSocket socket;
    private InetAddress address;
    private final int timeout = 1500;

    private byte[] buffer;
    
    public static final char APAGAR = '0';
    public static final char DAME_IP = '1';
    public static final char DAME_ENRUTAMIENTO = '2';
    public static final char CAMBIO_IP = '3';
    public static final char BORRA_IP = '4';
    public static final char ANADE_IP = '5';
    public static final char INFO_PROCESO = '6';
    public static final char MATAR_PROCESO = '7';
    public static final char RELANZAR = '8';
    public static final char ANADE_W = '9';
    public static final char BORRA_W = 'A';
    public static final char ES_W = 'B';
    public static final char ERES_ROOT = 'C';
    public static final char DAME_TIMEOUT = 'D';
    public static final char CAMBIA_TIMEOUT = 'E'; 
    public static final char DAME_W_Y_C = 'F';
    public static final char DAME_PATH = 'G';
    public static final char DAME_PID_ESTADO = 'H';
    
    
    public Cliente(String hostname, int port, BienvenidaFrame frame){
        this.hostname = hostname;
        this.puertoServidor = port; 
        this.frame = frame;
    }
    
    public int inicializar(){
        try {  
            socket = new DatagramSocket();
            socket.setSoTimeout(timeout);
            address = InetAddress.getByName(hostname);
            
        } catch (SocketException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        } catch (UnknownHostException ex){
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            return 2;
        }
        return 0;
    }
    
    public String peticion(String mensaje){
        if(mensaje.equals("") || mensaje == null){
            System.out.println("Mensage vacío y no enviado");
            return "00";
        }
        try {
            buffer = new byte[mensaje.getBytes().length];
            buffer = mensaje.getBytes();
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, puertoServidor);
            System.out.println("enviando mensaje: ["+new String(packet.getData(), 0, packet.getLength())+"]");
            socket.send(packet);
            buffer = new byte[64*1024];
            packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);
            System.out.println("mensaje recibido: [longitud]:"+packet.getLength());
            frame.getInfo_texto_mi_puerto().setText(":"+String.valueOf(socket.getLocalPort()));
            frame.cambiarAConectado();
            String received = new String(packet.getData(), 0, packet.getLength());
            if(!esUnError(received))return received.substring(2);
            else return "00";
        } catch (IOException ex) {
            frame.pop_up(ex.getMessage());
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            frame.cambiarADesconectado();
        }
        return "00";
    }
    

    public int getPuertoServidor(){
        return puertoServidor;
    }
    
    public void cerrar(){
        socket.close();
    }

    public String getHostname() {
        return hostname;
    }
    
    public int getTimeout(){
        int resultado = 0;
        try {
            resultado = socket.getSoTimeout();
        } catch (SocketException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    public void setTimeout(int timeout){
        try {
            socket.setSoTimeout(timeout);
        } catch (SocketException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //comprobamos si el mensaje de vuelta ha sido un error y provocamos un pop-up en tal caso
    private boolean esUnError(String msn){
        boolean resultado = true;
        switch(msn.substring(0, 2)){
            case "01":
                frame.pop_up("Error 01: no existen interfaces de red");
                break;
            case "02":
                frame.pop_up("Error 02: no existe tabal de enrutamiento");
                break;
            case "03":
                frame.pop_up("Error 03: no se ha podido cambiar de IP el servidor");
                break;
            case "04":
                frame.pop_up("Error 04 al borrar línea de enrutamiento");
                break;
            case "05":
                frame.pop_up("Error 05 al añadir línea de enrutamiento");
                break;
            case "06":
                frame.pop_up("Error 06 al obtener información del proceso");
                break;
            /*case "16":
                frame.pop_up("Error 16 al obtener información del proceso");
                break;*/
            case "07":
                frame.pop_up("Error 07 al matar proceso");
                break;
            case "08":
                frame.pop_up("Error 08 al relanzar proceso");
                break;
            case "09":
                frame.pop_up("Error 08 al relanzar proceso");
                break;
            case "0A":
                frame.pop_up("Error 0A al añadir watcher");
                break;
            case "0B":
                frame.pop_up("Error 0B al eliminar watcher");
                break;
            case "1B":
                frame.pop_up("Error 1B al eliminar watcher");
                break;
            case "0C":
                frame.pop_up("Error 0C al preguntar si es un watcher");
                break;
            case "0D":
                frame.pop_up("Error 0D al obtener timeout del servidor");
                break;
            case "0E":
                frame.pop_up("Error 0E al cambiar timeout del servidor");
                break;
            case "99":
                frame.pop_up("Peticion rechazada, no se aceptan ese tipo de peticiones");
                break;
            default : 
                resultado = false;
                break;
        }
        
        
        return resultado;
    }
          
}
