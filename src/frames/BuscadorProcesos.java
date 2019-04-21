/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import cliente.Cliente;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Popup;
import misc.ArgumentosPop_up;

/**
 *
 * @author raul
 */
public class BuscadorProcesos extends javax.swing.JPanel {
    
    private ArrayList<String> ultimosProcesos;
    BienvenidaFrame frame;
    
    /**
     * Creates new form BuscadorProcesos
     */
    public BuscadorProcesos(BienvenidaFrame frame) {
        initComponents();
        this.frame = frame;
        ultimosProcesos = new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        proc_inputText_proceso = new javax.swing.JTextField();
        proc_boton_aplicar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        proc_boton_reciente1 = new javax.swing.JButton();
        proc_panel_info = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        proc_texto_proceso = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        proc_boton_relanzar = new javax.swing.JButton();
        proc_boton_matar = new javax.swing.JButton();
        proc_switch_watcher = new javax.swing.JToggleButton();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        proc_textPanel_info = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        proc_panel_comando = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        proc_editable_argumento = new javax.swing.JTextField();
        proc_boton_enviar = new javax.swing.JButton();
        proc_texto_comando = new javax.swing.JLabel();
        proc_boton_reciente2 = new javax.swing.JButton();
        proc_boton_reciente3 = new javax.swing.JButton();
        proc_boton_reciente4 = new javax.swing.JButton();
        proc_actualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(712, 566));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        proc_inputText_proceso.setText("nombre proceso");
        proc_inputText_proceso.setToolTipText("Nombre proceso");
        proc_inputText_proceso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                proc_inputText_procesoFocusGained(evt);
            }
        });
        proc_inputText_proceso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                proc_inputText_procesoKeyPressed(evt);
            }
        });
        add(proc_inputText_proceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 70, 580, -1));

        proc_boton_aplicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_search_black_24dp.png"))); // NOI18N
        proc_boton_aplicar.setToolTipText("Buscar");
        proc_boton_aplicar.setPreferredSize(new java.awt.Dimension(36, 36));
        proc_boton_aplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proc_boton_aplicarActionPerformed(evt);
            }
        });
        add(proc_boton_aplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 65, -1, -1));

        jLabel12.setText("Recientes:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        proc_boton_reciente1.setText("jButton5");
        proc_boton_reciente1.setToolTipText("Reciente 1");
        proc_boton_reciente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proc_boton_reciente1ActionPerformed(evt);
            }
        });
        add(proc_boton_reciente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 136, -1));

        proc_panel_info.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel13.setText("Proceso:");

        proc_texto_proceso.setText("null");
        proc_texto_proceso.setToolTipText("Proceso actual");

        jLabel15.setText("Estado:");

        proc_boton_relanzar.setText("Relanzar");
        proc_boton_relanzar.setToolTipText("Relanzar proceso");
        proc_boton_relanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proc_boton_relanzarActionPerformed(evt);
            }
        });

        proc_boton_matar.setBackground(java.awt.Color.red);
        proc_boton_matar.setForeground(new java.awt.Color(254, 254, 254));
        proc_boton_matar.setText("Matar");
        proc_boton_matar.setToolTipText("Matar proceso");
        proc_boton_matar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proc_boton_matarActionPerformed(evt);
            }
        });

        proc_switch_watcher.setText("OFF");
        proc_switch_watcher.setToolTipText("Estado watcher");
        proc_switch_watcher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proc_switch_watcherActionPerformed(evt);
            }
        });

        jLabel18.setText("Watcher");

        proc_textPanel_info.setEditable(false);
        proc_textPanel_info.setBackground(new java.awt.Color(254, 254, 254));
        proc_textPanel_info.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        proc_textPanel_info.setTabSize(0);
        jScrollPane2.setViewportView(proc_textPanel_info);

        jButton1.setText("?");
        jButton1.setToolTipText("Más información");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout proc_panel_infoLayout = new javax.swing.GroupLayout(proc_panel_info);
        proc_panel_info.setLayout(proc_panel_infoLayout);
        proc_panel_infoLayout.setHorizontalGroup(
            proc_panel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proc_panel_infoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(proc_panel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, proc_panel_infoLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(proc_switch_watcher)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 355, Short.MAX_VALUE)
                        .addComponent(proc_boton_matar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(proc_boton_relanzar))
                    .addGroup(proc_panel_infoLayout.createSequentialGroup()
                        .addGroup(proc_panel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(proc_panel_infoLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(proc_texto_proceso))
                            .addGroup(proc_panel_infoLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        proc_panel_infoLayout.setVerticalGroup(
            proc_panel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proc_panel_infoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(proc_panel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(proc_texto_proceso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(proc_panel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(proc_panel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proc_boton_relanzar)
                    .addComponent(proc_boton_matar)
                    .addComponent(proc_switch_watcher)
                    .addComponent(jLabel18))
                .addContainerGap())
        );

        add(proc_panel_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 163, 646, 270));

        proc_panel_comando.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel17.setText("Se mandará el siguiente comando, edite los argumentos:");

        proc_editable_argumento.setText("argumentos");
        proc_editable_argumento.setToolTipText("argumentos");
        proc_editable_argumento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                proc_editable_argumentoFocusGained(evt);
            }
        });
        proc_editable_argumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proc_editable_argumentoActionPerformed(evt);
            }
        });
        proc_editable_argumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                proc_editable_argumentoKeyPressed(evt);
            }
        });

        proc_boton_enviar.setText("Enviar");
        proc_boton_enviar.setToolTipText("Enviar petición de relanzar");
        proc_boton_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proc_boton_enviarActionPerformed(evt);
            }
        });

        proc_texto_comando.setText("comando");
        proc_texto_comando.setToolTipText("Path proceso");

        javax.swing.GroupLayout proc_panel_comandoLayout = new javax.swing.GroupLayout(proc_panel_comando);
        proc_panel_comando.setLayout(proc_panel_comandoLayout);
        proc_panel_comandoLayout.setHorizontalGroup(
            proc_panel_comandoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proc_panel_comandoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(proc_panel_comandoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(proc_panel_comandoLayout.createSequentialGroup()
                        .addComponent(proc_texto_comando, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(proc_editable_argumento, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(proc_boton_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(81, 81, 81))
        );
        proc_panel_comandoLayout.setVerticalGroup(
            proc_panel_comandoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, proc_panel_comandoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(proc_panel_comandoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proc_editable_argumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proc_boton_enviar)
                    .addComponent(proc_texto_comando))
                .addGap(22, 22, 22))
        );

        add(proc_panel_comando, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 646, -1));

        proc_boton_reciente2.setText("jButton5");
        proc_boton_reciente2.setToolTipText("Reciente 2");
        proc_boton_reciente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proc_boton_reciente2ActionPerformed(evt);
            }
        });
        add(proc_boton_reciente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 136, -1));

        proc_boton_reciente3.setText("jButton5");
        proc_boton_reciente3.setToolTipText("Reciente 3");
        proc_boton_reciente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proc_boton_reciente3ActionPerformed(evt);
            }
        });
        add(proc_boton_reciente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 136, -1));

        proc_boton_reciente4.setText("jButton5");
        proc_boton_reciente4.setToolTipText("Reciente 4");
        proc_boton_reciente4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proc_boton_reciente4ActionPerformed(evt);
            }
        });
        add(proc_boton_reciente4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 136, -1));

        proc_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_autorenew_black_24dp.png"))); // NOI18N
        proc_actualizar.setToolTipText("Refrescar");
        proc_actualizar.setPreferredSize(new java.awt.Dimension(36, 36));
        proc_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proc_actualizarActionPerformed(evt);
            }
        });
        add(proc_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 34)); // NOI18N
        jLabel1.setText("BUSCADOR DE PROCESOS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void proc_boton_aplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proc_boton_aplicarActionPerformed
        buscarProceso(proc_inputText_proceso.getText());
    }//GEN-LAST:event_proc_boton_aplicarActionPerformed

    private void proc_boton_reciente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proc_boton_reciente1ActionPerformed
        // TODO add your handling code here:
        buscarProceso(proc_boton_reciente1.getText());
    }//GEN-LAST:event_proc_boton_reciente1ActionPerformed

    private void proc_boton_relanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proc_boton_relanzarActionPerformed
        // TODO add your handling code here:
        String path = frame.getCliente().peticion(Cliente.DAME_PATH + proc_texto_proceso.getText());
        proc_panel_comando.setVisible(true);
        proc_texto_comando.setText(path);
        proc_editable_argumento.setText("");
        
        
        
    }//GEN-LAST:event_proc_boton_relanzarActionPerformed

    private void proc_boton_matarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proc_boton_matarActionPerformed
        // TODO add your handling code here:
        String s = frame.getCliente().peticion(Cliente.MATAR_PROCESO+proc_texto_proceso.getText());
        buscarProceso(proc_texto_proceso.getText());
    }//GEN-LAST:event_proc_boton_matarActionPerformed

    private void proc_switch_watcherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proc_switch_watcherActionPerformed
        
        if(proc_switch_watcher.getText().equals("OFF")){
            
            
            String r = JOptionPane.showInputDialog("Introduzca argumentos para el wathcer:");
            if (!r.equals("")){
                frame.getCliente().peticion(String.valueOf(Cliente.ANADE_W) + proc_texto_proceso.getText()+"\n"+r);
                proc_switch_watcher.setText("ON");
            }
        }
        else{
            frame.getCliente().peticion(String.valueOf(Cliente.BORRA_W) + proc_texto_proceso.getText());
            proc_switch_watcher.setText("OFF");
        }
    }//GEN-LAST:event_proc_switch_watcherActionPerformed

    private void proc_editable_argumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proc_editable_argumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proc_editable_argumentoActionPerformed

    private void proc_boton_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proc_boton_enviarActionPerformed
        // TODO add your handling code here:
        System.out.println();
        String respuesta = frame.getCliente().peticion(Cliente.RELANZAR + proc_texto_comando.getText().replaceAll(System.lineSeparator(), "")
                +" "
                + proc_editable_argumento.getText().replaceAll(System.lineSeparator(), ""));
        if(respuesta.equals("08")){
            return;
        }
        buscarProceso(proc_texto_proceso.getText());
    }//GEN-LAST:event_proc_boton_enviarActionPerformed

    private void proc_boton_reciente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proc_boton_reciente2ActionPerformed
        // TODO add your handling code here:
        buscarProceso(proc_boton_reciente2.getText());
    }//GEN-LAST:event_proc_boton_reciente2ActionPerformed

    private void proc_boton_reciente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proc_boton_reciente3ActionPerformed
        // TODO add your handling code here:
        buscarProceso(proc_boton_reciente3.getText());
    }//GEN-LAST:event_proc_boton_reciente3ActionPerformed

    private void proc_boton_reciente4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proc_boton_reciente4ActionPerformed
        // TODO add your handling code here:
        buscarProceso(proc_boton_reciente4.getText());
    }//GEN-LAST:event_proc_boton_reciente4ActionPerformed

    private void proc_inputText_procesoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_proc_inputText_procesoKeyPressed
        // TODO add your handling code here:
        if (java.awt.event.KeyEvent.VK_ENTER == evt.getKeyCode()){
            proc_boton_aplicarActionPerformed(null);
        }
    }//GEN-LAST:event_proc_inputText_procesoKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String mensaje ="Los códigos de estado (la columna 'Stat') del proceso pueden ser:\n"
                + "D: suspendido no interrumpible\n"
                + "S: suspendido interrumpible\n"
                + "T: detenido\n"
                + "W: paginado \n"
                + "X: muerto\n"
                + "Z: proceso 'zombie'\n"
                + "\n"
                +"Para los formatos BSD:\n"
                +"<: alta prioridad\n"
                +"N: baja prioridad\n"
                +"L: tiene páginas bloqueadas en memoria\n"
                +"s: es un líder de sesión\n"
                +"l: es multihilado\n"
                +"+: está en el grupo de procesos en primer plano\n";
        frame.pop_up(mensaje);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void proc_inputText_procesoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_proc_inputText_procesoFocusGained
        // TODO add your handling code here:
        proc_inputText_proceso.setText("");
    }//GEN-LAST:event_proc_inputText_procesoFocusGained

    private void proc_editable_argumentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_proc_editable_argumentoFocusGained
        // TODO add your handling code here:
        proc_editable_argumento.setText("");
    }//GEN-LAST:event_proc_editable_argumentoFocusGained

    private void proc_editable_argumentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_proc_editable_argumentoKeyPressed
        // TODO add your handling code here:
         if (java.awt.event.KeyEvent.VK_ENTER == evt.getKeyCode()){
            proc_boton_enviarActionPerformed(null);
        }
    }//GEN-LAST:event_proc_editable_argumentoKeyPressed

    private void proc_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proc_actualizarActionPerformed
        // TODO add your handling code here:
        actualizarUltimosProcesos();
    }//GEN-LAST:event_proc_actualizarActionPerformed

    private void buscarProceso(String proceso){
        proc_panel_comando.setVisible(false);
        
        proc_boton_matar.setEnabled(true);
        proc_boton_relanzar.setEnabled(true);
        proc_switch_watcher.setEnabled(true);
        
        String s, w;
        s = frame.getCliente().peticion(Cliente.INFO_PROCESO + proceso);
        
        if (s.equals("00")){
            return;
        }
        else if(s.equals("")){
            s = "Proceso muerto.";
            proc_boton_matar.setEnabled(false);
        }
        else if(s.equals("null")){
            s = "Proceso no existente.";
            proc_boton_matar.setEnabled(false);
            proc_boton_relanzar.setEnabled(false);
            proc_switch_watcher.setEnabled(false);
        }
        else{
            w = frame.getCliente().peticion(String.valueOf(Cliente.ES_W) + proceso);
            if (w.equals("true")){
                proc_switch_watcher.setText("ON");
                proc_switch_watcher.setSelected(true);
            }
            else{
                proc_switch_watcher.setText("OFF");
                proc_switch_watcher.setSelected(false);
            }
         s = formatoTexto(s);
        }
       
            
        proc_panel_info.setVisible(true);
        proc_texto_proceso.setText(proceso);
        proc_textPanel_info.setText(s);
        //comprobamos que no existe el proceso en la lista y lo añadimos a recientes
        if(!ultimosProcesos.contains(proceso) && !proceso.equals("")){
            if(ultimosProcesos.size()==4){
                ultimosProcesos.add(0, proceso);
                ultimosProcesos.remove(4);
            }
            else ultimosProcesos.add(0,proceso);
        }
        actualizarUltimosProcesos();
    }

        //reestablece el aspecto predeterminado de la pestaña de procesos
    public void reestablecerProcesoTab(){
        proc_panel_info.setVisible(false);
        proc_panel_comando.setVisible(false);
        proc_boton_reciente4.setVisible(false);
        proc_boton_reciente3.setVisible(false);
        proc_boton_reciente2.setVisible(false);
        proc_boton_reciente1.setVisible(false);
        actualizarUltimosProcesos();
    }
    
    private void actualizarUltimosProcesos(){
        if(ultimosProcesos.size()>0){
            proc_boton_reciente1.setVisible(true);
            proc_boton_reciente1.setText(ultimosProcesos.get(0));
        }
        if(ultimosProcesos.size()>1){
            proc_boton_reciente2.setVisible(true);
            proc_boton_reciente2.setText(ultimosProcesos.get(1));
        }
        if(ultimosProcesos.size()>2){
            proc_boton_reciente3.setVisible(true);
            proc_boton_reciente3.setText(ultimosProcesos.get(2));
        }
        if(ultimosProcesos.size()>3){
            proc_boton_reciente4.setVisible(true);
            proc_boton_reciente4.setText(ultimosProcesos.get(3));
        }
    }
    
    
    private String getProcessStateDetail(String estado){
       String respuesta = "";
       switch(estado.charAt(0)){
            case 'D':
                respuesta.concat("Suspendido y no interrumpible.");
                break;
            case 'R':
                respuesta.concat("Corrinedo.");
                break;
            case 'S':
                respuesta.concat("suspendido e interrumpible.");
                break;
            case 'T':
                respuesta.concat("Detenido.");
                break;
            case 'W':
                respuesta.concat("Paginado.");
                break;
            case 'X':
                respuesta.concat("Muerto.");
                break;
            case 'Z':
                respuesta.concat("Zombie.");
                break;
               
       }
       
       if(estado.contains("<")) respuesta.concat("Prioridad alta.");
       if(estado.contains("N")) respuesta.concat("Prioridad baja.");
       if(estado.contains("L")) respuesta.concat("Páginas bloqueadas en memoria.");
       if(estado.contains("s")) respuesta.concat("Líder de sesión.");
       if(estado.contains("l")) respuesta.concat("Es multi-thread.");
       if(estado.contains("l")) respuesta.concat("Está en primer plano.");
        
        /*Los códigos de estado del proceso pueden ser:

    D: suspendido no interrumpible (generalmente esperando E/S)
    R: en ejecución o listo para ejecutarse (en cola)
    S: suspendido interrumpible (esperando que se complete un evento)
    T: detenido, por una señal de control de trabajo o porque está siendo traceado
    W: paginado (no válido a partir del kernel 2.6.xx)
    X: muerto (nunca debe ser visto)
    Z: proceso difunto ("zombie"), terminado pero no reclamado por el proceso padre

    Para los formatos BSD (por ejemplo como cuando se utiliza "ps axo" para mostrar la lista de procesos en un formato definido por el usuario) y cuando se utiliza la palabra clave "stat", se muestran los caracteres adicionales:

        <: alta prioridad
        N: baja prioridad
        L: tiene páginas bloqueadas en memoria
        s: es un líder de sesión (se trata de un proceso que ha iniciado una nueva sesión)
        l: es multihilado
        +: está en el grupo de procesos en primer plano
    */
        
        return respuesta;
    }
    
    private String formatoTexto(String s){
        String resultado = "";
        String[] lines = s.split(System.getProperty("line.separator"));

        for (String line : lines) {
            line = line.trim().replaceAll(" +", " ");
            String[] words = line.split(" "); 
            resultado = resultado + (String.format("%-10.10s %-7.7s %-7.7s %-3.3s %-6.6s %-8.8s %-5.5s %-6.6s %-25s \n",
                    words[0],words[1],words[2], words[3],words[4],words[5], words[6],words[7],words[8]));
            //System.out.println(resultado+"\n");
        }
        
        return resultado;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton proc_actualizar;
    private javax.swing.JButton proc_boton_aplicar;
    private javax.swing.JButton proc_boton_enviar;
    private javax.swing.JButton proc_boton_matar;
    private javax.swing.JButton proc_boton_reciente1;
    private javax.swing.JButton proc_boton_reciente2;
    private javax.swing.JButton proc_boton_reciente3;
    private javax.swing.JButton proc_boton_reciente4;
    private javax.swing.JButton proc_boton_relanzar;
    private javax.swing.JTextField proc_editable_argumento;
    private javax.swing.JTextField proc_inputText_proceso;
    private javax.swing.JPanel proc_panel_comando;
    private javax.swing.JPanel proc_panel_info;
    private javax.swing.JToggleButton proc_switch_watcher;
    private javax.swing.JTextArea proc_textPanel_info;
    private javax.swing.JLabel proc_texto_comando;
    private javax.swing.JLabel proc_texto_proceso;
    // End of variables declaration//GEN-END:variables
}