package Views;

import AccesoDB.Comida_Data;
import AccesoDB.Dieta_Data;
import AccesoDB.Paciente_Data;
import Entidades.Comida;
import Entidades.Dieta;
import java.util.List;
import javax.swing.table.DefaultTableModel;

//➢	Se necesita listar los pacientes que a la fecha de culminación, no han llegado al peso buscado. //Dieta

public class Gestor_Consultas extends javax.swing.JInternalFrame {

    DefaultTableModel mod = new DefaultTableModel();
    DefaultTableModel mod2 = new DefaultTableModel();
    DefaultTableModel mod3 = new DefaultTableModel();
    private Paciente_Data pdb;
    private Dieta_Data ddb;
    private Comida_Data cdb;

    public Gestor_Consultas(Paciente_Data pdb, Dieta_Data ddb, Comida_Data cdb) {
        initComponents();
        armarCabeceraVigentes();
        armarCabeceraVencidas();
        armarCabeceraBusqXcalorias();
        this.pdb = pdb;
        this.ddb = ddb;
        this.cdb = cdb;
        borrarFilas1();
        borrarFilas2();
        
        llenarVigentes();
        llenarVencidas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        TDietasVigentes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TdietasVencidas = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        TbusqXcalorias = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        TFcalorias = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Bbuscar = new javax.swing.JButton();
        BnuevaBusq = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TDietasVigentes.setModel(new javax.swing.table.DefaultTableModel(
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
        TDietasVigentes.setPreferredSize(new java.awt.Dimension(100, 64));
        jScrollPane1.setViewportView(TDietasVigentes);

        jTabbedPane2.addTab("Dietas Vigentes", jScrollPane1);

        TdietasVencidas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(TdietasVencidas);

        jTabbedPane2.addTab("Dietas Vencidas", jScrollPane2);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable1);

        jTabbedPane2.addTab("Dietas No Logradas", jScrollPane3);

        jInternalFrame1.setVisible(true);

        TbusqXcalorias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(TbusqXcalorias);

        jLabel1.setText("Calorias ");

        jLabel2.setText("grs");

        Bbuscar.setText("Buscar");
        Bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarActionPerformed(evt);
            }
        });

        BnuevaBusq.setText("Nueva Busqueda");
        BnuevaBusq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnuevaBusqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(TFcalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(42, 42, 42)
                        .addComponent(Bbuscar))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(BnuevaBusq)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TFcalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Bbuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BnuevaBusq)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Busqueda", jInternalFrame1);

        jTabbedPane1.addTab("Listados", jTabbedPane2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbuscarActionPerformed
       
       int cantCalorias = Integer.parseInt(TFcalorias.getText());
       List <Comida> xCalorias = cdb.busqXcalorias(cantCalorias);
       for(Comida com : xCalorias){
           mod3.addRow(new Object[]{com.getIdComida(), com.getNombre(), com.getCantCalorias(), com.isEstado()});
       }
    }//GEN-LAST:event_BbuscarActionPerformed

    private void BnuevaBusqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnuevaBusqActionPerformed
        borrarBusqXcalorias();
    }//GEN-LAST:event_BnuevaBusqActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bbuscar;
    private javax.swing.JButton BnuevaBusq;
    private javax.swing.JTable TDietasVigentes;
    private javax.swing.JTextField TFcalorias;
    private javax.swing.JTable TbusqXcalorias;
    private javax.swing.JTable TdietasVencidas;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void armarCabeceraVigentes() {
        mod.addColumn("ID Paciente");
        mod.addColumn("Nombre");
        mod.addColumn("Fecha de Inicio");
        mod.addColumn("Fecha Finalización");
        mod.addColumn("Estado");
        TDietasVigentes.setModel(mod);
    }

    private void borrarFilas1() {
        int f = TDietasVigentes.getRowCount() - 1;
        for (; f >= 0; f--) {
            mod.removeRow(f);
        }
    }

    private void llenarVigentes() {
        List<Dieta> vigentes = ddb.getDietasVigentes();

        for (Dieta dieta : vigentes) {
            mod.addRow(new Object[]{dieta.getIdPaciente(), dieta.getNombre(), dieta.getFechaInicial(), dieta.getFechaFinal(), dieta.isEstado()});
        }
    }

    private void armarCabeceraVencidas() {
        mod2.addColumn("ID Paciente");
        mod2.addColumn("Nombre");
        mod2.addColumn("Fecha de Inicio");
        mod2.addColumn("Fecha Finalización");
        mod2.addColumn("Estado");
        TdietasVencidas.setModel(mod2);
    }

    private void borrarFilas2() {
        int f = TdietasVencidas.getRowCount() - 1;
        for (; f >= 0; f--) {
            mod2.removeRow(f);
        }
    }

    private void llenarVencidas() {
        List<Dieta> vencidas = ddb.getDietasVencidas();
        for (Dieta dieta : vencidas) {
            mod2.addRow(new Object[]{dieta.getIdPaciente(), dieta.getNombre(), dieta.getFechaInicial(), dieta.getFechaFinal(), dieta.isEstado()});
        }
    }
    
    private void armarCabeceraBusqXcalorias(){
        mod3.addColumn("ID Comida");
        mod3.addColumn("Nombre");
        mod3.addColumn("Calorías");
        mod3.addColumn("Estado");
        TbusqXcalorias.setModel(mod3);
    }
    
   private void borrarBusqXcalorias(){
       int f = TbusqXcalorias.getRowCount()-1;
       for (; f >= 0; f--) {
            mod3.removeRow(f);
        }
   }  
}
