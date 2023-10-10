package Views;

import AccesoDB.Paciente_Data;
import Entidades.Paciente;
import javax.swing.JOptionPane;

public class Gestor_Paciente extends javax.swing.JInternalFrame {

    private Paciente_Data pdb;

    public Gestor_Paciente(Paciente_Data pdb) {
        initComponents();
        this.pdb = pdb;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TFdni = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TFapellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TFnombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TFedad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TFdomicilio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TFcelular = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TFpeso = new javax.swing.JTextField();
        Bbuscar = new javax.swing.JButton();
        Bagregar = new javax.swing.JButton();
        Bactualizar = new javax.swing.JButton();
        Beliminar = new javax.swing.JButton();
        Blimpiar = new javax.swing.JButton();
        RBestado = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        TFid = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Bsalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(56, 150, 210));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("DNI:");

        TFdni.setBackground(new java.awt.Color(180, 215, 240));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Apellido:");

        TFapellido.setBackground(new java.awt.Color(180, 215, 240));
        TFapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFapellidoActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre:");

        TFnombre.setBackground(new java.awt.Color(180, 215, 240));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Edad:");

        TFedad.setBackground(new java.awt.Color(180, 215, 240));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Domicilio:");

        TFdomicilio.setBackground(new java.awt.Color(180, 215, 240));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Celular:");

        TFcelular.setBackground(new java.awt.Color(180, 215, 240));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("P.A:");

        TFpeso.setBackground(new java.awt.Color(180, 215, 240));

        Bbuscar.setText("Buscar");
        Bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarActionPerformed(evt);
            }
        });

        Bagregar.setBackground(new java.awt.Color(102, 255, 102));
        Bagregar.setText("Guardar");
        Bagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BagregarActionPerformed(evt);
            }
        });

        Bactualizar.setText("Modificar");
        Bactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BactualizarActionPerformed(evt);
            }
        });

        Beliminar.setText("Eliminar");
        Beliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeliminarActionPerformed(evt);
            }
        });

        Blimpiar.setText("Limpiar");
        Blimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlimpiarActionPerformed(evt);
            }
        });

        RBestado.setBackground(new java.awt.Color(180, 215, 240));
        RBestado.setForeground(new java.awt.Color(0, 0, 0));
        RBestado.setText("ESTADO");
        RBestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBestadoActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("ID");

        TFid.setEditable(false);
        TFid.setBackground(new java.awt.Color(180, 215, 240));
        TFid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TFapellido, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                            .addComponent(TFnombre)
                                            .addComponent(TFdni)))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(Bbuscar))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Blimpiar)
                                            .addComponent(RBestado)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(TFid, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TFedad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TFpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TFdomicilio, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                            .addComponent(TFcelular))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(185, 185, 185))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Bagregar)
                        .addGap(29, 29, 29)
                        .addComponent(Bactualizar)
                        .addGap(26, 26, 26)
                        .addComponent(Beliminar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bbuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TFapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBestado)
                    .addComponent(TFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TFdomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TFcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TFpeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Blimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bagregar)
                    .addComponent(Bactualizar)
                    .addComponent(Beliminar))
                .addGap(16, 16, 16))
        );

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Imagenes/img.pacientes.png"))); // NOI18N

        Bsalir.setBackground(new java.awt.Color(255, 102, 102));
        Bsalir.setText("Salir");
        Bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(Bsalir))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bsalir)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(14, 134, 210));

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Gestor de Pacientes");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFidActionPerformed

    private void BlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_BlimpiarActionPerformed

    private void BeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeliminarActionPerformed
        int dni = Integer.parseInt(TFdni.getText());
        pdb.eliminarPaciente(dni);
        limpiarCampos();
    }//GEN-LAST:event_BeliminarActionPerformed

    private void BactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BactualizarActionPerformed
        try {
            int idPaciente = Integer.parseInt(TFid.getText());
            int dni = Integer.parseInt(TFdni.getText());
            String apellido = TFapellido.getText();
            String nombre = TFnombre.getText();
            int edad = Integer.parseInt(TFedad.getText());
            String domicilio = TFdomicilio.getText();
            double pesoActual = Double.valueOf(TFpeso.getText());
            int celular = Integer.parseInt(TFcelular.getText());
            boolean estado = RBestado.isSelected();
            Paciente nuevo = new Paciente(idPaciente, nombre, apellido, dni, pesoActual, edad, domicilio, celular, estado);
            pdb.modificarPaciente(nuevo);
            limpiarCampos();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ha ingresado un parametro invalido, reintente");
        }
    }//GEN-LAST:event_BactualizarActionPerformed

    private void BagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BagregarActionPerformed
        try {
            int dni = Integer.parseInt(TFdni.getText());
            String apellido = TFapellido.getText();
            String nombre = TFnombre.getText();
            int edad = Integer.parseInt(TFedad.getText());
            String domicilio = TFdomicilio.getText();
            double pesoActual = Double.valueOf(TFpeso.getText());
            int celular = Integer.parseInt(TFcelular.getText());
            boolean estado = RBestado.isSelected();
            if (validarNombre(nombre)) {
                if (validarNombre(apellido)) {
                    Paciente nuevo = new Paciente(nombre, apellido, dni, pesoActual, edad, domicilio, celular, estado);
                    pdb.agregarPaciente(nuevo);
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(null, "Apellido inválido");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Nombre inválido");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ha ingresado un parámetro invalido, reintente");
        }
    }//GEN-LAST:event_BagregarActionPerformed

    private void BbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbuscarActionPerformed
        try {
            int dni = Integer.parseInt(TFdni.getText());
            Paciente paciente = pdb.buscarPaciente(dni);
            TFapellido.setText(paciente.getApellido());
            TFnombre.setText(paciente.getNombre());
            TFdomicilio.setText(paciente.getDomicilio());
            TFpeso.setText(String.valueOf(paciente.getPesoActual()));
            TFcelular.setText(String.valueOf(paciente.getCelular()));
            TFedad.setText(String.valueOf(paciente.getEdad()));
            TFid.setText(String.valueOf(paciente.getIdPaciente()));
            RBestado.isContentAreaFilled();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese Dni de paciente");
        } catch (NullPointerException e) {
        }
    }//GEN-LAST:event_BbuscarActionPerformed

    private void TFapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFapellidoActionPerformed

    private void RBestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBestadoActionPerformed

    private void BsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BsalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bactualizar;
    private javax.swing.JButton Bagregar;
    private javax.swing.JButton Bbuscar;
    private javax.swing.JButton Beliminar;
    private javax.swing.JButton Blimpiar;
    private javax.swing.JButton Bsalir;
    private javax.swing.JRadioButton RBestado;
    private javax.swing.JTextField TFapellido;
    private javax.swing.JTextField TFcelular;
    private javax.swing.JTextField TFdni;
    private javax.swing.JTextField TFdomicilio;
    private javax.swing.JTextField TFedad;
    private javax.swing.JTextField TFid;
    private javax.swing.JTextField TFnombre;
    private javax.swing.JTextField TFpeso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        TFdni.setText(" ");
        TFapellido.setText(" ");
        TFnombre.setText(" ");
        TFdomicilio.setText(" ");
        TFedad.setText(" ");
        TFcelular.setText(" ");
        RBestado.setSelected(false);
        TFid.setText(" ");
        TFpeso.setText(" ");
    }

    private boolean validarNombre(String nombre) {
        return nombre.matches("[a-zA-Z ]+");
    }
}
