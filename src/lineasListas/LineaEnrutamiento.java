/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lineasListas;

import cliente.Cliente;
import frames.BienvenidaFrame;

/**
 *
 * @author raul
 */
public class LineaEnrutamiento extends javax.swing.JPanel {

    private BienvenidaFrame frame;
    private boolean enable;
    
    
    public LineaEnrutamiento(String linea, BienvenidaFrame container, boolean enable){
        initComponents();
        decodificarLinea(linea);
        this.frame = container;
        
        boton_borrar.setEnabled(enable);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        destino = new javax.swing.JLabel();
        pasarela = new javax.swing.JLabel();
        genmask = new javax.swing.JLabel();
        indic = new javax.swing.JLabel();
        metric = new javax.swing.JLabel();
        ref = new javax.swing.JLabel();
        uso = new javax.swing.JLabel();
        interfaz = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        boton_borrar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setMaximumSize(new java.awt.Dimension(32767, 45));
        setMinimumSize(new java.awt.Dimension(469, 45));
        setPreferredSize(new java.awt.Dimension(692, 45));
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        destino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        destino.setText("Destino");
        destino.setPreferredSize(new java.awt.Dimension(95, 18));
        add(destino);

        pasarela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pasarela.setText("Pasarela");
        pasarela.setPreferredSize(new java.awt.Dimension(95, 18));
        add(pasarela);

        genmask.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genmask.setText("Genmask");
        genmask.setPreferredSize(new java.awt.Dimension(95, 18));
        add(genmask);

        indic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indic.setText("Indic");
        indic.setPreferredSize(new java.awt.Dimension(50, 18));
        indic.setRequestFocusEnabled(false);
        add(indic);

        metric.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        metric.setText("Metric");
        metric.setPreferredSize(new java.awt.Dimension(50, 18));
        add(metric);

        ref.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ref.setText("Ref");
        ref.setPreferredSize(new java.awt.Dimension(40, 18));
        add(ref);

        uso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uso.setText("Uso");
        uso.setMaximumSize(new java.awt.Dimension(45, 18));
        uso.setPreferredSize(new java.awt.Dimension(40, 18));
        add(uso);

        interfaz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        interfaz.setText("Interfaz");
        interfaz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        interfaz.setMaximumSize(new java.awt.Dimension(70, 18));
        interfaz.setMinimumSize(new java.awt.Dimension(10, 18));
        interfaz.setPreferredSize(new java.awt.Dimension(70, 18));
        interfaz.setRequestFocusEnabled(false);
        add(interfaz);

        jLabel1.setText("                 ");
        add(jLabel1);

        boton_borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        boton_borrar.setMaximumSize(new java.awt.Dimension(30, 36));
        boton_borrar.setPreferredSize(new java.awt.Dimension(30, 36));
        boton_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_borrarActionPerformed(evt);
            }
        });
        add(boton_borrar);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_borrarActionPerformed
        // TODO add your handling code here:
        frame.getCliente().peticion(Cliente.BORRA_IP + "route del -net " + destino.getText() + " netmask " + genmask.getText());
        frame.getPEnrutamiento().actualizarEnrutamiento();
    }//GEN-LAST:event_boton_borrarActionPerformed

    //separa cada información individual de la linea que corresponde a una linea de la tabla de enrutamiento
    private void decodificarLinea(String linea){
        String elemento = "";
        int fase = 1;
        for (int i = 0; i < linea.length(); i++) {
            switch (fase){
                case 1:
                    if(linea.charAt(i)!=' ')elemento = elemento + linea.charAt(i);
                    else {
                        fase = fase * 10;
                        destino.setText(elemento);
                        elemento = "";
                    }
                    break;
                case 2:
                    if(linea.charAt(i)!=' ')elemento = elemento + linea.charAt(i);
                    else {
                        fase = fase * 10;
                        pasarela.setText(elemento);
                        elemento = "";
                    }
                    break;
                case 3:
                    if(linea.charAt(i)!=' ')elemento = elemento + linea.charAt(i);
                    else {
                        fase = fase * 10;
                        genmask.setText(elemento);
                        elemento = "";
                    }
                    break;
                case 4:
                    if(linea.charAt(i)!=' ')elemento = elemento + linea.charAt(i);
                    else {
                        fase = fase * 10;
                        indic.setText(elemento);
                        elemento = "";
                    }
                    break;
                case 5:
                    if(linea.charAt(i)!=' ')elemento = elemento + linea.charAt(i);
                    else {
                        fase = fase * 10;
                        metric.setText(elemento);
                        elemento = "";
                    }
                    break;
                case 6:
                    if(linea.charAt(i)!=' ')elemento = elemento + linea.charAt(i);
                    else {
                        fase = fase * 10;
                        ref.setText(elemento);
                        elemento = "";
                    }
                    break;
                case 7:
                    if(linea.charAt(i)!=' ')elemento = elemento + linea.charAt(i);
                    else {
                        fase = fase * 10;
                        uso.setText(elemento);
                        elemento = "";
                    }
                    break;
                case 8:
                    elemento = elemento + linea.charAt(i);
                    if(i==linea.length()-1){
                        interfaz.setText(elemento);
                        return;
                    }
                    break;
                case 10: 
                case 20:
                case 30:
                case 40: 
                case 50:
                case 60:
                case 70:
                    if(linea.charAt(i)!=' '){
                        elemento = elemento + linea.charAt(i);
                        fase = (fase/10)+1;
                    }
                    
                    break;
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_borrar;
    private javax.swing.JLabel destino;
    private javax.swing.JLabel genmask;
    private javax.swing.JLabel indic;
    private javax.swing.JLabel interfaz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel metric;
    private javax.swing.JLabel pasarela;
    private javax.swing.JLabel ref;
    private javax.swing.JLabel uso;
    // End of variables declaration//GEN-END:variables
}
