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
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.table.DefaultTableModel;

public class Gestor_Dieta extends javax.swing.JInternalFrame {

    private Dieta_Data ddb;
    private Paciente_Data pdb;
    private Comida_Data cdb;
    private DietaComida_Data dcd;
   
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

        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        TFdni = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TFidPaciente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        BbuscarPaciente = new javax.swing.JButton();
        TFpesoInicial = new javax.swing.JTextField();
        TFpesoFinal = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        BactualizarDieta = new javax.swing.JButton();
        BbuscarDieta = new javax.swing.JButton();
        RBestado = new javax.swing.JRadioButton();
        DCinicio = new com.toedter.calendar.JDateChooser();
        DCfinal = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TFidDieta = new javax.swing.JTextField();
        TFnombreDieta = new javax.swing.JTextField();
        BcrearDieta = new javax.swing.JButton();
        BeliminarDieta = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        CBhorario = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TFnombreMenu = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tcomidas = new javax.swing.JTable();
        BmodificarDietaComida = new javax.swing.JButton();
        BeliminarDietaComida = new javax.swing.JButton();
        RBestadoDietaComida = new javax.swing.JRadioButton();
        BagregarDietaComida = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 153));
        setForeground(new java.awt.Color(102, 102, 102));

        jLabel16.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Paciente - Dieta (Tratamiento)");
        jLabel16.setToolTipText("");

        jLabel10.setText("ID paciente:");

        TFidPaciente.setEditable(false);

        jLabel6.setText("DNI del Paciente:");

        jLabel5.setText("Peso Deseado:");

        jLabel9.setText("Peso Inicial:");

        BbuscarPaciente.setText("Buscar Paciente");
        BbuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarPacienteActionPerformed(evt);
            }
        });

        TFpesoInicial.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(45, 45, 45)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TFdni, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(TFpesoInicial))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5)
                        .addGap(24, 24, 24)
                        .addComponent(TFpesoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BbuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFidPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFidPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BbuscarPaciente)
                    .addComponent(TFdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFpesoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFpesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        BactualizarDieta.setBackground(new java.awt.Color(255, 255, 51));
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

        jLabel1.setText("Nombre de la Dieta:");

        jLabel2.setText("Fecha de Inicio:");

        jLabel7.setText("Fecha Finalizacion:");

        jLabel8.setText("ID dieta:");

        TFidDieta.setEditable(false);

        BcrearDieta.setBackground(new java.awt.Color(102, 255, 102));
        BcrearDieta.setText("Crear Dieta");
        BcrearDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcrearDietaActionPerformed(evt);
            }
        });

        BeliminarDieta.setBackground(new java.awt.Color(255, 102, 102));
        BeliminarDieta.setText("Eliminar Dieta");
        BeliminarDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeliminarDietaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(BcrearDieta)
                        .addGap(57, 57, 57)
                        .addComponent(BactualizarDieta)
                        .addGap(45, 45, 45)
                        .addComponent(BeliminarDieta)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFnombreDieta))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DCinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(BbuscarDieta))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(DCfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RBestado))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFidDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BbuscarDieta)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TFnombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DCinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFidDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DCfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(RBestado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BeliminarDieta)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BactualizarDieta)
                        .addComponent(BcrearDieta)))
                .addContainerGap())
        );

        jLabel3.setText("Horario:");

        jLabel4.setText("Búsqueda de menú por Nombre:");

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

        BmodificarDietaComida.setBackground(new java.awt.Color(255, 255, 51));
        BmodificarDietaComida.setText("Modificar");

        BeliminarDietaComida.setBackground(new java.awt.Color(255, 102, 102));
        BeliminarDietaComida.setText("Eliminar");

        RBestadoDietaComida.setText("Estado");

        BagregarDietaComida.setBackground(new java.awt.Color(102, 255, 102));
        BagregarDietaComida.setText("Guardar");
        BagregarDietaComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BagregarDietaComidaActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(CBhorario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFnombreMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(BagregarDietaComida)
                                .addGap(76, 76, 76)
                                .addComponent(BmodificarDietaComida)
                                .addGap(82, 82, 82)
                                .addComponent(BeliminarDietaComida))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(RBestadoDietaComida))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFnombreMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBhorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(RBestadoDietaComida)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BagregarDietaComida)
                    .addComponent(BmodificarDietaComida)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BeliminarDietaComida)
                        .addComponent(jButton1)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        RBestado.setSelected(dieta.isEstado());
    }//GEN-LAST:event_BbuscarDietaActionPerformed

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

    private void BagregarDietaComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BagregarDietaComidaActionPerformed
        int idDieta = Integer.parseInt(TFidDieta.getText());
        int fila = Tcomidas.getSelectedRow();
        int idComida = (int) Tcomidas.getValueAt(fila, 0);        
        String horario = CBhorario.getSelectedItem().toString();
        boolean estado = RBestado.isSelected();        
        DietaComida nueva = new DietaComida(idDieta, idComida, horario, estado);        
        dcd.agregarDietaComida(nueva);
        limpiarCampos();
    }//GEN-LAST:event_BagregarDietaComidaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BactualizarDieta;
    private javax.swing.JButton BagregarDietaComida;
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
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
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

    private void borrarFilas() {
        int f = Tcomidas.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
}


