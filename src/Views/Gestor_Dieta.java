package Views;

import AccesoDB.Dieta_Data;
import AccesoDB.Paciente_Data;
import Entidades.Dieta;
import Entidades.Paciente;
import java.time.LocalDate;
import java.time.ZoneId;

public class Gestor_Dieta extends javax.swing.JInternalFrame {

    private Dieta_Data ddb;
    private Paciente_Data pdb;

    public Gestor_Dieta(Dieta_Data ddb, Paciente_Data pdb) {
        initComponents();
        this.ddb = ddb;
        this.pdb = pdb;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TFidPaciente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        BbuscarPaciente = new javax.swing.JButton();
        TFnombre = new javax.swing.JTextField();
        TFpesoInicial = new javax.swing.JTextField();
        TFpesoFinal = new javax.swing.JTextField();
        DCinicio = new com.toedter.calendar.JDateChooser();
        DCfinal = new com.toedter.calendar.JDateChooser();
        Bguardar = new javax.swing.JButton();
        Beliminar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        BbuscarDieta = new javax.swing.JButton();
        RBestado = new javax.swing.JRadioButton();
        TFdni = new javax.swing.JTextField();
        TFidDieta = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel1.setText("Nombre de dieta");

        jLabel16.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Dieta");
        jLabel16.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel2.setText("Inicio de Dieta");

        TFidPaciente.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel6.setText("Ingrese DNI de Paciente");

        jLabel7.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel7.setText("Finalización de Dieta");

        jLabel8.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel8.setText("ID dieta");

        jLabel5.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel5.setText("Peso Deseado");

        jLabel9.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel9.setText("Peso Inicial");

        BbuscarPaciente.setText("Buscar Paciente");
        BbuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarPacienteActionPerformed(evt);
            }
        });

        Bguardar.setText("Iniciar Tratamiento");
        Bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BguardarActionPerformed(evt);
            }
        });

        Beliminar.setText("Finalizar Tratamiento");
        Beliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeliminarActionPerformed(evt);
            }
        });

        jButton4.setText("Modificar Tratamiento");

        BbuscarDieta.setText("Buscar Tratamiento");
        BbuscarDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarDietaActionPerformed(evt);
            }
        });

        RBestado.setText("Estado");

        jLabel10.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel10.setText("ID paciente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel1)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(Bguardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(TFpesoInicial)
                                                .addComponent(TFnombre)
                                                .addComponent(DCinicio, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                                            .addComponent(TFdni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(29, 29, 29)
                                        .addComponent(TFpesoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(DCfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton4)
                                        .addGap(137, 137, 137)
                                        .addComponent(Beliminar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(BbuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(153, 153, 153))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(BbuscarDieta)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TFidDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TFidPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addGap(18, 18, 18)
                .addComponent(RBestado)
                .addGap(19, 19, 19))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(624, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(169, 169, 169)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DCinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFidPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BbuscarPaciente)
                            .addComponent(TFdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BbuscarDieta)
                            .addComponent(TFidDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RBestado))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFpesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFpesoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(DCfinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bguardar)
                    .addComponent(Beliminar)
                    .addComponent(jButton4))
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(80, 80, 80)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(324, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BguardarActionPerformed
        String nombre = TFnombre.getText();
        int idPaciente = Integer.parseInt(TFidPaciente.getText());
        double pesoInicial = Double.valueOf(TFpesoInicial.getText());
        double pesoFinal = Double.valueOf(TFpesoFinal.getText());
        LocalDate fechaInicial = DCinicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaFinal = DCfinal.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        boolean estado = RBestado.isSelected();
        Dieta nueva = new Dieta(nombre, idPaciente, fechaInicial, fechaFinal, pesoInicial, pesoFinal, estado);
        ddb.agregarDieta(nueva);
        limpiarCampos();
    }//GEN-LAST:event_BguardarActionPerformed

    private void BbuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbuscarPacienteActionPerformed
        int dni = Integer.parseInt(TFdni.getText());
        Paciente paciente = pdb.buscarPaciente(dni);
        TFidPaciente.setText(String.valueOf(paciente.getIdPaciente()));
        TFpesoInicial.setText(String.valueOf(paciente.getPesoActual()));
    }//GEN-LAST:event_BbuscarPacienteActionPerformed

    private void BeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeliminarActionPerformed
        String nombre = TFnombre.getText();

    }//GEN-LAST:event_BeliminarActionPerformed

    private void BbuscarDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbuscarDietaActionPerformed
        String nombre = TFnombre.getText();
        Dieta dieta = ddb.buscarDieta(nombre);
        TFidDieta.setText(String.valueOf(dieta.getIdDieta()));
        RBestado.setSelected(dieta.isEstado());

    }//GEN-LAST:event_BbuscarDietaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BbuscarDieta;
    private javax.swing.JButton BbuscarPaciente;
    private javax.swing.JButton Beliminar;
    private javax.swing.JButton Bguardar;
    private com.toedter.calendar.JDateChooser DCfinal;
    private com.toedter.calendar.JDateChooser DCinicio;
    private javax.swing.JRadioButton RBestado;
    private javax.swing.JTextField TFdni;
    private javax.swing.JTextField TFidDieta;
    private javax.swing.JTextField TFidPaciente;
    private javax.swing.JTextField TFnombre;
    private javax.swing.JTextField TFpesoFinal;
    private javax.swing.JTextField TFpesoInicial;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
 private void limpiarCampos() {
        TFdni.setText("");
        TFidPaciente.setText("");
        TFnombre.setText("");
        TFpesoFinal.setText("");
        TFpesoInicial.setText("");
        RBestado.setSelected(false);
        TFpesoInicial.setText("");
        TFpesoFinal.setText("");
    }
}
