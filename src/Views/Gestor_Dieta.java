package Views;

import AccesoDB.Comida_Data;
import AccesoDB.DietaComida_Data;
import AccesoDB.Dieta_Data;
import AccesoDB.Paciente_Data;
import Entidades.Comida;
import Entidades.Dieta;
import Entidades.DietaComida;
import Entidades.Horario;
import Entidades.Paciente;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.table.DefaultTableModel;

public class Gestor_Dieta extends javax.swing.JInternalFrame {

    private Dieta_Data ddb;
    private Paciente_Data pdb;
    private Comida_Data cdb;
    private DietaComida_Data dcd;
    public int idDieta2;
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public Gestor_Dieta(Dieta_Data ddb, Paciente_Data pdb, Comida_Data cdb, DietaComida_Data dcd) {
        initComponents();
        this.ddb = ddb;
        this.pdb = pdb;
        this.cdb = cdb;
        this.dcd = dcd;
        cargarCombo();
        armarCabecera();
        agregarValidacionDni();
        setupNombreField();
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
        TFnombreDieta = new javax.swing.JTextField();
        TFpesoInicial = new javax.swing.JTextField();
        TFpesoFinal = new javax.swing.JTextField();
        BcrearDieta = new javax.swing.JButton();
        BeliminarDieta = new javax.swing.JButton();
        BactualizarDieta = new javax.swing.JButton();
        BbuscarDieta = new javax.swing.JButton();
        RBestado = new javax.swing.JRadioButton();
        TFdni = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        DCinicio = new com.toedter.calendar.JDateChooser();
        DCfinal = new com.toedter.calendar.JDateChooser();
        CBhorario = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TFnombreMenu = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tcomidas = new javax.swing.JTable();
        BmodificarDietaComida = new javax.swing.JButton();
        BeliminarDietaComida = new javax.swing.JButton();
        RBestadoDietaComida = new javax.swing.JRadioButton();
        TFidDieta = new javax.swing.JTextField();
        aqui = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel1.setText("Nombre de dieta");

        jLabel16.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Paciente - Dieta (Tratamiento)");
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

        BcrearDieta.setText("Crear Dieta");
        BcrearDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcrearDietaActionPerformed(evt);
            }
        });

        BeliminarDieta.setText("Eliminar Dieta");
        BeliminarDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeliminarDietaActionPerformed(evt);
            }
        });

        BactualizarDieta.setText("Modificar Dieta");
        BactualizarDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BactualizarDietaActionPerformed(evt);
            }
        });

        BbuscarDieta.setText("Buscar Dieta");
        BbuscarDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarDietaActionPerformed(evt);
            }
        });

        RBestado.setText("Estado");

        jLabel10.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel10.setText("ID paciente");

        CBhorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBhorarioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel3.setText("Horario");

        jLabel4.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel4.setText("Búsqueda Menú por nombre");

        TFnombreMenu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TFnombreMenuKeyReleased(evt);
            }
        });

        Tcomidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tcomidas);

        BmodificarDietaComida.setText("Modificar");

        BeliminarDietaComida.setText("Eliminar");

        RBestadoDietaComida.setText("Estado");

        aqui.setText("jButton1");
        aqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aquiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel3)))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CBhorario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(139, 139, 139))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(TFnombreDieta)
                                                .addGap(47, 47, 47)
                                                .addComponent(BbuscarDieta))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(TFdni)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(BbuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TFidPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(TFpesoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(77, 77, 77))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TFidDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(RBestado)))))))
                        .addGap(188, 188, 188))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(54, 54, 54)
                                    .addComponent(BcrearDieta)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BactualizarDieta)
                                    .addGap(104, 104, 104)
                                    .addComponent(BeliminarDieta)
                                    .addGap(90, 90, 90))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(DCinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(275, 275, 275)
                                    .addComponent(DCfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(138, 138, 138)
                                            .addComponent(TFpesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(119, 119, 119)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(344, 344, 344)
                                    .addComponent(jLabel7))))
                        .addContainerGap(246, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TFnombreMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(aqui)
                .addGap(243, 243, 243)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RBestadoDietaComida)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BmodificarDietaComida)
                        .addGap(106, 106, 106)
                        .addComponent(BeliminarDietaComida)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFidPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BbuscarPaciente)
                    .addComponent(TFdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFpesoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFpesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFnombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BbuscarDieta)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RBestado)
                    .addComponent(TFidDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DCfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DCinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BcrearDieta)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BeliminarDieta)
                        .addComponent(BactualizarDieta)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBhorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFnombreMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RBestadoDietaComida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BmodificarDietaComida)
                    .addComponent(BeliminarDietaComida)
                    .addComponent(aqui))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BbuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbuscarPacienteActionPerformed
        int dni = Integer.parseInt(TFdni.getText());
        Paciente paciente = pdb.buscarPaciente(dni);
        TFidPaciente.setText(String.valueOf(paciente.getIdPaciente()));
        TFpesoInicial.setText(String.valueOf(paciente.getPesoActual()));
    }//GEN-LAST:event_BbuscarPacienteActionPerformed

    private void BbuscarDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbuscarDietaActionPerformed
        String nombre = TFnombreDieta.getText();
        Dieta dieta = ddb.buscarDieta(nombre);
        TFidDieta.setText(String.valueOf(dieta.getIdDieta()));
        idDieta2 = dieta.getIdDieta();       
        RBestado.setSelected(dieta.isEstado());
    }//GEN-LAST:event_BbuscarDietaActionPerformed

    private void CBhorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBhorarioActionPerformed
      
    }//GEN-LAST:event_CBhorarioActionPerformed

    private void TFnombreMenuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFnombreMenuKeyReleased
        borrarFilas();
        for (Comida com : cdb.getComidas()) {
            if (com.getNombre().startsWith(TFnombreMenu.getText())) {
                modelo.addRow(new Object[]{
                    com.getIdComida(),
                    com.getNombre(),
                    com.getCantCalorias(),
                    com.isEstado(),});
            }
        }
    }//GEN-LAST:event_TFnombreMenuKeyReleased

    private void BeliminarDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeliminarDietaActionPerformed
        int idDieta = Integer.parseInt(TFidDieta.getText());
        ddb.eliminarPaciente(idDieta);
        limpiarCampos();
    }//GEN-LAST:event_BeliminarDietaActionPerformed

    private void BcrearDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcrearDietaActionPerformed
        String nombre = TFnombreDieta.getText();
        int idPaciente = Integer.parseInt(TFidPaciente.getText());
        double pesoInicial = Double.valueOf(TFpesoInicial.getText());
        double pesoFinal = Double.valueOf(TFpesoFinal.getText());
        LocalDate fechaInicial = DCinicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaFinal = DCfinal.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        boolean estado = RBestado.isSelected();
        Dieta nueva = new Dieta(nombre, idPaciente, fechaInicial, fechaFinal, pesoInicial, pesoFinal, estado);
        ddb.agregarDieta(nueva);
        limpiarCampos();

    }//GEN-LAST:event_BcrearDietaActionPerformed

    private void BactualizarDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BactualizarDietaActionPerformed
        String nombre = TFnombreDieta.getText();
        int idPaciente = Integer.parseInt(TFidPaciente.getText());
        double pesoInicial = Double.valueOf(TFpesoInicial.getText());
        double pesoFinal = Double.valueOf(TFpesoFinal.getText());
        LocalDate fechaInicial = DCinicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaFinal = DCfinal.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        boolean estado = RBestado.isSelected();
        Dieta nueva = new Dieta(nombre, idPaciente, fechaInicial, fechaFinal, pesoInicial, pesoFinal, estado);
        ddb.modificarPaciente(nueva);
        limpiarCampos();
    }//GEN-LAST:event_BactualizarDietaActionPerformed

    private void aquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aquiActionPerformed
        //int idDieta = Integer.parseInt(TFidDieta.getText());
        //int fila = Tcomidas.getSelectedRow();
        //int idComida = (int)Tcomidas.getValueAt(fila, 0);
        //
        //String horario = CBhorario.getSelectedItem().toString();
        //boolean estado = RBestado.isSelected();
        
        DietaComida nueva = new DietaComida(1, 1, "cena", true);
        //System.out.println(idComida + horario + estado);
        dcd.agregarDietaComida(nueva);
    }//GEN-LAST:event_aquiActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BactualizarDieta;
    private javax.swing.JButton BbuscarDieta;
    private javax.swing.JButton BbuscarPaciente;
    private javax.swing.JButton BcrearDieta;
    private javax.swing.JButton BeliminarDieta;
    private javax.swing.JButton BeliminarDietaComida;
    private javax.swing.JButton BmodificarDietaComida;
    private javax.swing.JComboBox<Horario> CBhorario;
    private com.toedter.calendar.JDateChooser DCfinal;
    private com.toedter.calendar.JDateChooser DCinicio;
    private javax.swing.JRadioButton RBestado;
    private javax.swing.JRadioButton RBestadoDietaComida;
    private javax.swing.JTextField TFdni;
    private javax.swing.JTextField TFidDieta;
    private javax.swing.JTextField TFidPaciente;
    private javax.swing.JTextField TFnombreDieta;
    private javax.swing.JTextField TFnombreMenu;
    private javax.swing.JTextField TFpesoFinal;
    private javax.swing.JTextField TFpesoInicial;
    private javax.swing.JTable Tcomidas;
    private javax.swing.JButton aqui;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
 private void limpiarCampos() {
        TFdni.setText("");
        TFidPaciente.setText("");
        TFnombreDieta.setText("");
        TFpesoFinal.setText("");
        TFpesoInicial.setText("");
        RBestado.setSelected(false);
        TFpesoInicial.setText("");
        TFpesoFinal.setText("");
    }
 private void agregarValidacionDni() {
        TFdni.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) )) {
                    evt.consume();
                    //JOptionPane.showMessageDialog(null, "Ingrese solo números en el campo de Edad.");
                }
            }
        });
    }
private void setupNombreField() {
        TFnombreDieta.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isLetter(c) && c != ' ') {
                    e.consume(); // Consumir (ignorar) el evento de tecla no alfabética
                    //JOptionPane.showMessageDialog(null, "Ingrese solo letras y espacios en el campo de Nombre.");
                }
            }
        });
    }

private void cargarCombo() {
        CBhorario.addItem(Horario.Desayuno);
        CBhorario.addItem(Horario.Almuerzo);
        CBhorario.addItem(Horario.Merienda);
        CBhorario.addItem(Horario.Cena);
        CBhorario.addItem(Horario.Snack);
    }
private void armarCabecera() {
        modelo.addColumn("IdComida");
        modelo.addColumn("Nombre");
        modelo.addColumn("Calorias por Porción");
        modelo.addColumn("Estado");
        Tcomidas.setModel(modelo);
    }
//  Este metodo es funcional pero sin el uso del keyRelease
//    private void cargarComidas() {
//        ArrayList<Comida> listarComidas = new ArrayList<>();
//        listarComidas = cdb.getComidas();
//        Tcomidas.removeAll();
//        for (Comida comida : listarComidas) {
//            modelo.addRow(new Object[]{
//                comida.getIdComida(),
//                comida.getNombre(),
//                comida.getCantCalorias(),
//                comida.isEstado(),});
//        }
//    }

    private void borrarFilas() {
        int f = Tcomidas.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
    // El metodo anterior es la abreviacion de este aqui abajo
//    private void borrarFilas(){
//        int filas=Tcomidas.getRowCount()-1;
//        for(int f=filas;f>=0;f--){
//            modelo.removeRow(f);
//        }
//    }
    
      
}


