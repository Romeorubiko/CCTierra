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
public class LineaWatcher extends javax.swing.JPanel {

    private BienvenidaFrame frame;
    /**
     * Creates new form LineaEnrutamiento
     */
    public LineaWatcher(String proceso, String estado, String hijos, String ubicacion, String argumentos, BienvenidaFrame frame){
        initComponents();
        this.proceso.setText(proceso);
        this.estado.setText(estado);
        this.hijos.setText(hijos);
        this.ubicacion.setText(ubicacion);
        this.argumentos.setText(argumentos);
        this.frame = frame;
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        proceso = new javax.swing.JLabel();
        estado = new javax.swing.JLabel();
        hijos = new javax.swing.JLabel();
        ubicacion = new javax.swing.JLabel();
        argumentos = new javax.swing.JLabel();
        boton_borrar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setMaximumSize(new java.awt.Dimension(32767, 45));
        setMinimumSize(new java.awt.Dimension(469, 45));
        setPreferredSize(new java.awt.Dimension(692, 45));
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel1.setText("    ");
        add(jLabel1);

        proceso.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        proceso.setText("PROCESO");
        proceso.setPreferredSize(new java.awt.Dimension(150, 18));
        add(proceso);

        estado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        estado.setText("ESTADO");
        estado.setMaximumSize(new java.awt.Dimension(20, 18));
        estado.setMinimumSize(new java.awt.Dimension(20, 18));
        estado.setPreferredSize(new java.awt.Dimension(75, 18));
        add(estado);

        hijos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        hijos.setText("HIJOS");
        hijos.setPreferredSize(new java.awt.Dimension(50, 18));
        add(hijos);

        ubicacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ubicacion.setText("UBICACIÓN");
        ubicacion.setPreferredSize(new java.awt.Dimension(150, 18));
        ubicacion.setRequestFocusEnabled(false);
        add(ubicacion);

        argumentos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        argumentos.setText("ARGUMENTOS");
        argumentos.setPreferredSize(new java.awt.Dimension(180, 18));
        add(argumentos);

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
        frame.getCliente().peticion(Cliente.BORRA_W+proceso.getText());
        frame.getPWatchers().actualizarWatchers();
    }//GEN-LAST:event_boton_borrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel argumentos;
    private javax.swing.JButton boton_borrar;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel hijos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel proceso;
    private javax.swing.JLabel ubicacion;
    // End of variables declaration//GEN-END:variables
}