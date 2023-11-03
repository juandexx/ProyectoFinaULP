package Views;

import AccesoDB.Comida_Data;
import Entidades.Comida;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Gestor_Comida extends javax.swing.JInternalFrame {

    private Comida_Data cdb;

    public Gestor_Comida(Comida_Data cdb) {
        initComponents();
        this.cdb = cdb;
        validarCalorias();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAdescripcion = new javax.swing.JTextArea();
        TFid = new javax.swing.JTextField();
        TFnombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TFcalorias = new javax.swing.JTextField();
        RBestado = new javax.swing.JRadioButton();
        Bbuscar = new javax.swing.JButton();
        Bagregar = new javax.swing.JButton();
        Bmodificar = new javax.swing.JButton();
        Beliminar = new javax.swing.JButton();
        Bsalir = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(660, 477));

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestor de Comidas");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("ID");

        jLabel4.setText("Descripcion:");

        TAdescripcion.setColumns(20);
        TAdescripcion.setRows(5);
        jScrollPane1.setViewportView(TAdescripcion);

        TFid.setPreferredSize(new java.awt.Dimension(16, 24));

        TFnombre.setPreferredSize(new java.awt.Dimension(16, 24));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Calorías:");

        TFcalorias.setPreferredSize(new java.awt.Dimension(16, 24));

        RBestado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        RBestado.setText("ESTADO");
        RBestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBestadoActionPerformed(evt);
            }
        });

        Bbuscar.setText("Buscar");
        Bbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarActionPerformed(evt);
            }
        });

        Bagregar.setBackground(new java.awt.Color(102, 255, 102));
        Bagregar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Bagregar.setText("Agregar");
        Bagregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BagregarActionPerformed(evt);
            }
        });

        Bmodificar.setBackground(new java.awt.Color(255, 255, 51));
        Bmodificar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Bmodificar.setText("Modificar");
        Bmodificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmodificarActionPerformed(evt);
            }
        });

        Beliminar.setBackground(new java.awt.Color(255, 102, 102));
        Beliminar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Beliminar.setText("Eliminar");
        Beliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Beliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeliminarActionPerformed(evt);
            }
        });

        Bsalir.setBackground(new java.awt.Color(153, 153, 153));
        Bsalir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Bsalir.setForeground(new java.awt.Color(255, 255, 255));
        Bsalir.setText("Salir");
        Bsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Bagregar)
                        .addGap(46, 46, 46)
                        .addComponent(Bmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(Beliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bsalir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFnombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFcalorias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Bbuscar)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFid, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(RBestado))))
                .addGap(106, 106, 106))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jLabel4)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFcalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bbuscar)
                            .addComponent(jLabel3)
                            .addComponent(TFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RBestado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bagregar)
                    .addComponent(Bmodificar)
                    .addComponent(Beliminar)
                    .addComponent(Bsalir))
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmodificarActionPerformed
        try {
            int idComida = Integer.parseInt(TFid.getText());
            String nombre = TFnombre.getText();
            int cantCalorias = Integer.parseInt(TFcalorias.getText());
            String detalle = TAdescripcion.getText();
            boolean estado = RBestado.isSelected();
            if (!detalle.trim().isEmpty()) {
                Comida nuevo = new Comida(idComida, nombre, detalle, cantCalorias, estado);
                cdb.modificarComida(nuevo);
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar una descripción");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ha ingresado un parametro invalido, reintente");
        }
    }//GEN-LAST:event_BmodificarActionPerformed

    private void BagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BagregarActionPerformed
        try {
            String nombre = TFnombre.getText();
            int cantCalorias = Integer.parseInt(TFcalorias.getText());
            String detalle = TAdescripcion.getText();
            boolean estado = RBestado.isSelected();
            if (!detalle.trim().isEmpty()) {
                Comida nuevo = new Comida(nombre, detalle, cantCalorias, estado);
                cdb.agregarComida(nuevo);
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar una descripción");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ha ingresado un parametro invalido, reintente");
        }
    }//GEN-LAST:event_BagregarActionPerformed

    private void BeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeliminarActionPerformed
        int idComida = Integer.parseInt(TFid.getText());
        cdb.eliminarComida(idComida);
        limpiarCampos();
    }//GEN-LAST:event_BeliminarActionPerformed

    private void BbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbuscarActionPerformed
        try{
        String nombre = TFnombre.getText();
        Comida comida = cdb.buscarComida(nombre);
        TFnombre.setText(comida.getNombre());
        TFcalorias.setText(String.valueOf(comida.getCantCalorias()));
        TAdescripcion.setText(comida.getDetalle());
        RBestado.setSelected(comida.isEstado());
        TFid.setText(String.valueOf(comida.getIdComida()));
        }catch(NullPointerException e){
            
        }
    }//GEN-LAST:event_BbuscarActionPerformed

    private void RBestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBestadoActionPerformed

    private void BsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BsalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bagregar;
    private javax.swing.JButton Bbuscar;
    private javax.swing.JButton Beliminar;
    private javax.swing.JButton Bmodificar;
    private javax.swing.JButton Bsalir;
    private javax.swing.JRadioButton RBestado;
    private javax.swing.JTextArea TAdescripcion;
    private javax.swing.JTextField TFcalorias;
    private javax.swing.JTextField TFid;
    private javax.swing.JTextField TFnombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        TFid.setText("");
        TFnombre.setText("");
        TFcalorias.setText("");
        TAdescripcion.setText("");
        RBestado.setSelected(false);
    }

    private void validarNombre() {
        TFnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!(Character.isLetter(c))) {
                    evt.consume();
                }
            }
        });
    }

    private void validarCalorias() {
        TFcalorias.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE))) {
                    evt.consume();
                }
            }
        });
    }

}
