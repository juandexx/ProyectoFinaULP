package Views;

import AccesoDB.Dieta_Data;
import AccesoDB.Paciente_Data;
import Entidades.Dieta;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
//➢	Todos los pacientes cuya dieta esté terminada o vigente, y cuando es la fecha de culminación.//Dieta
//➢	Se necesita listar los pacientes que a la fecha de culminación, no han llegado al peso buscado. //Dieta

public class Gestor_Consultas extends javax.swing.JInternalFrame {

    DefaultTableModel mod = new DefaultTableModel();
    private Paciente_Data pdb;
    private Dieta_Data ddb;

    public Gestor_Consultas(Paciente_Data pdb, Dieta_Data ddb) {
        initComponents();
        armarCabecera1();
        this.pdb = pdb;
        this.ddb = ddb;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TFdni = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TpacienteXvigencia = new javax.swing.JTable();
        DCprimero = new com.toedter.calendar.JDateChooser();
        DCsegundo = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        Bbuscar = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Comidas", jPanel3);

        jLabel1.setText("DNI:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFdni, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(334, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(230, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pacientes", jPanel1);

        jPanel2.setPreferredSize(new java.awt.Dimension(509, 261));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Hasta");

        TpacienteXvigencia.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(TpacienteXvigencia);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Desde");

        Bbuscar.setText("jButton1");
        Bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(DCprimero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Bbuscar))))
                        .addGap(36, 36, 36)
                        .addComponent(DCsegundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(402, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DCprimero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DCsegundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bbuscar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(jLabel3)
                    .addContainerGap(225, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Dietas", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbuscarActionPerformed
        borrarFilas();                
        for (Dieta die : ddb.getDietas()) {
            Date fechaFinal = DCsegundo.getDate();//.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Date fechaInicial = DCprimero.getDate();
            if (fechaInicial != null & fechaFinal != null) {             
            mod.addRow(new Object[]{
                    die.getIdPaciente(),
                    die.getNombre(),
                    die.getFechaInicial(),
                    die.getFechaFinal(),
                    die.isEstado(),});
            }
    }//GEN-LAST:event_BbuscarActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bbuscar;
    private com.toedter.calendar.JDateChooser DCprimero;
    private com.toedter.calendar.JDateChooser DCsegundo;
    private javax.swing.JTextField TFdni;
    private javax.swing.JTable TpacienteXvigencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera1() {
        mod.addColumn("ID Paciente");
        mod.addColumn("Nombre");
        mod.addColumn("Fecha de Inicio");
        mod.addColumn("Fecha Finalización");
        mod.addColumn("Estado");
        TpacienteXvigencia.setModel(mod);
    }

    private void borrarFilas() {
        int f = TpacienteXvigencia.getRowCount() - 1;
        for (; f >= 0; f--) {
            mod.removeRow(f);
        }
    }

}
