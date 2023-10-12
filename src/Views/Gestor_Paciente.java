package Views;

import AccesoDB.Paciente_Data;
import Entidades.Paciente;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Gestor_Paciente extends javax.swing.JInternalFrame {

    private Paciente_Data pdb;

    public Gestor_Paciente(Paciente_Data pdb) {
        initComponents();
        this.pdb = pdb;
        agregarValidacionDNI();
        setupNombreField();
        setupApellidoField();
        agregarValidacionCelular();
        agregarValidacionEdad();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TFdni = new javax.swing.JTextField();
        Bbuscar = new javax.swing.JButton();
        Bagregar = new javax.swing.JButton();
        Beliminar = new javax.swing.JButton();
        TFnombre = new javax.swing.JTextField();
        TFapellido = new javax.swing.JTextField();
        TFdomicilio = new javax.swing.JTextField();
        TFcelular = new javax.swing.JTextField();
        RBestado = new javax.swing.JRadioButton();
        Bactualizar = new javax.swing.JButton();
        TFedad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TFid = new javax.swing.JTextField();
        Blimpiar = new javax.swing.JButton();
        TFpeso = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jLabel1.setText("PACIENTE");

        jLabel2.setText("DNI");

        jLabel3.setText("NOMBRE");

        jLabel4.setText("DOMICILIO");

        jLabel5.setText("CELULAR");

        jLabel6.setText("APELLIDO");

        Bbuscar.setText("Buscar");
        Bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarActionPerformed(evt);
            }
        });

        Bagregar.setText("Ingreso Nuevo Paciente");
        Bagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BagregarActionPerformed(evt);
            }
        });

        Beliminar.setText("Eliminar Paciente");
        Beliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeliminarActionPerformed(evt);
            }
        });

        TFapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFapellidoActionPerformed(evt);
            }
        });

        RBestado.setText("ESTADO");

        Bactualizar.setText("Actualizar Datos Paciente");
        Bactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BactualizarActionPerformed(evt);
            }
        });

        jLabel7.setText("Edad");

        jLabel8.setText("ID");

        TFid.setEditable(false);
        TFid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFidActionPerformed(evt);
            }
        });

        Blimpiar.setText("Limpiar");
        Blimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlimpiarActionPerformed(evt);
            }
        });

        jLabel9.setText("PesoActual");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Blimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TFnombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(TFdomicilio, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(TFedad)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Bagregar)
                                        .addGap(18, 18, 18)
                                        .addComponent(Bbuscar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(TFdni, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel6)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TFapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addComponent(jLabel8)
                                                .addGap(23, 23, 23))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(RBestado)
                                                        .addComponent(jLabel5))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel9)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TFcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TFid, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TFpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(23, 23, 23))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Bactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Beliminar)))))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TFdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TFapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFdomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bagregar)
                            .addComponent(Bbuscar)
                            .addComponent(RBestado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(TFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFpeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Beliminar)
                    .addComponent(Bactualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Blimpiar)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void TFidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFidActionPerformed

    private void TFapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFapellidoActionPerformed

    private void BlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_BlimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bactualizar;
    private javax.swing.JButton Bagregar;
    private javax.swing.JButton Bbuscar;
    private javax.swing.JButton Beliminar;
    private javax.swing.JButton Blimpiar;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        TFdni.setText("");
        TFapellido.setText("");
        TFnombre.setText("");
        TFdomicilio.setText("");
        TFedad.setText("");
        TFcelular.setText("");
        RBestado.setSelected(false);
        TFid.setText("");
        TFpeso.setText("");
    }

    private boolean validarNombre(String nombre) {
        return nombre.matches("[a-zA-Z ]+");
    }
private void agregarValidacionDNI() {
    TFdni.addKeyListener(new java.awt.event.KeyAdapter() {
        @Override
        public void keyTyped(java.awt.event.KeyEvent evt) {
            char c = evt.getKeyChar();
            if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
                evt.consume();
                JOptionPane.showMessageDialog(null, "Ingrese solo números en el campo de DNI.");
            }
        }
    });
}
private void setupNombreField() {
    TFnombre.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (!Character.isLetter(c) && c != ' ') {
                e.consume(); // Consumir (ignorar) el evento de tecla no alfabética
                JOptionPane.showMessageDialog(null, "Ingrese solo letras y espacios en el campo de Nombre.");
            }
        }
    });
}
private void setupApellidoField() {
    TFapellido.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (!Character.isLetter(c) && c != ' ') {
                e.consume(); // Consumir (ignorar) el evento de tecla no alfabética
                JOptionPane.showMessageDialog(null, "Ingrese solo letras y espacios en el campo de Apellido.");
            }
        }
    });
}
private void agregarValidacionCelular() {
    TFcelular.addKeyListener(new java.awt.event.KeyAdapter() {
        @Override
        public void keyTyped(java.awt.event.KeyEvent evt) {
            char c = evt.getKeyChar();
            if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
                evt.consume();
                JOptionPane.showMessageDialog(null, "Ingrese solo números en el campo de Celular.");
            }
        }
    });
}
private void agregarValidacionEdad() {
    TFedad.addKeyListener(new java.awt.event.KeyAdapter() {
        @Override
        public void keyTyped(java.awt.event.KeyEvent evt) {
            char c = evt.getKeyChar();
            if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
                evt.consume();
                JOptionPane.showMessageDialog(null, "Ingrese solo números en el campo de Edad.");
            }
        }
    });
}

}
