package Views;

import AccesoDB.Comida_Data;
import AccesoDB.Dieta_Data;
import AccesoDB.Historial_Data;
import AccesoDB.Paciente_Data;
import Entidades.Comida;
import Entidades.Dieta;
import Entidades.Historial;
import Entidades.Paciente;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Gestor_Consultas extends javax.swing.JInternalFrame {

    DefaultTableModel mod = new DefaultTableModel();
    DefaultTableModel mod2 = new DefaultTableModel();
    DefaultTableModel mod3 = new DefaultTableModel();
    DefaultTableModel mod4 = new DefaultTableModel();
    private Paciente_Data pdb;
    private Dieta_Data ddb;
    private Comida_Data cdb;
    private Historial_Data hdb;
    
    public Gestor_Consultas(Paciente_Data pdb, Dieta_Data ddb, Comida_Data cdb, Historial_Data hdb) {
        initComponents();
        armarCabeceraVigentes();
        armarCabeceraVencidas();
        armarCabeceraBusqXcalorias();
        armarcabeceraBusqPesos();
        this.pdb = pdb;
        this.ddb = ddb;
        this.cdb = cdb;
        this.hdb = hdb;
        borrarFilas1();
        borrarFilas2();
        llenarVigentes();
        llenarVencidas();
        agregarValidacionDni();
        agregarValidacionCalorias();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        borrar = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        TDietasVigentes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TdietasVencidas = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        TFdni = new javax.swing.JTextField();
        BbuscarPaciente = new javax.swing.JButton();
        TFnombrePaciente = new javax.swing.JTextField();
        TFapellidoPaciente = new javax.swing.JTextField();
        TFidPaciente = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        TbusqPesos = new javax.swing.JTable();
        jInternalFrame4 = new javax.swing.JInternalFrame();
        jScrollPane5 = new javax.swing.JScrollPane();
        TbusqXcalorias = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        TFcalorias = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BbuscarXcalorias = new javax.swing.JButton();
        Breset = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(660, 477));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        borrar.setPreferredSize(new java.awt.Dimension(592, 434));

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

        borrar.addTab("Dietas Vigentes", jScrollPane1);

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

        borrar.addTab("Dietas Vencidas", jScrollPane2);

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

        borrar.addTab("Dietas No Logradas", jScrollPane3);

        jInternalFrame2.setVisible(true);

        jLabel1.setText("DNI:");

        BbuscarPaciente.setText("Buscar");
        BbuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarPacienteActionPerformed(evt);
            }
        });

        TFnombrePaciente.setEditable(false);

        TFapellidoPaciente.setEditable(false);

        TFidPaciente.setEditable(false);

        TbusqPesos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(TbusqPesos);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFdni, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BbuscarPaciente)
                        .addGap(21, 21, 21)
                        .addComponent(TFidPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TFnombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFapellidoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 43, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TFdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BbuscarPaciente)
                    .addComponent(TFnombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFapellidoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFidPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Historial Pesajes", jInternalFrame2);

        jInternalFrame4.setPreferredSize(new java.awt.Dimension(584, 178));
        jInternalFrame4.setVisible(true);

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
        jScrollPane5.setViewportView(TbusqXcalorias);

        jLabel3.setText("Calorias ");

        jLabel4.setText("grs");

        BbuscarXcalorias.setText("Buscar");
        BbuscarXcalorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarXcaloriasActionPerformed(evt);
            }
        });

        Breset.setText("Nueva Búsqueda");
        Breset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BresetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame4Layout = new javax.swing.GroupLayout(jInternalFrame4.getContentPane());
        jInternalFrame4.getContentPane().setLayout(jInternalFrame4Layout);
        jInternalFrame4Layout.setHorizontalGroup(
            jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(TFcalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(42, 42, 42)
                .addComponent(BbuscarXcalorias)
                .addGap(35, 35, 35)
                .addComponent(Breset)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame4Layout.setVerticalGroup(
            jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TFcalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(BbuscarXcalorias)
                    .addComponent(Breset))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Comida/Calorías", jInternalFrame4);

        borrar.addTab("Búsquedas", jTabbedPane3);

        jTabbedPane1.addTab("Listados", borrar);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BbuscarXcaloriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbuscarXcaloriasActionPerformed
        borrarBusqXcalorias();
        int cantCalorias = Integer.parseInt(TFcalorias.getText());
        List<Comida> busqXcalorias = cdb.busqXcalorias(cantCalorias);
        for (Comida com : busqXcalorias) {
            mod3.addRow(new Object[]{com.getIdComida(), com.getNombre(), com.getCantCalorias(), com.isEstado()});
        }

    }//GEN-LAST:event_BbuscarXcaloriasActionPerformed

    private void BbuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbuscarPacienteActionPerformed
        borrarBusqPesos();
        int dni = Integer.parseInt(TFdni.getText());
        Paciente paciente = pdb.buscarPaciente(dni);
        TFidPaciente.setText(String.valueOf(paciente.getIdPaciente()));
        TFnombrePaciente.setText(paciente.getNombre());
        TFapellidoPaciente.setText(paciente.getApellido());
        int idPaciente = Integer.parseInt(TFidPaciente.getText());
        List<Historial> busqDePesos = hdb.getPesos(idPaciente);
        for (Historial hist : busqDePesos) {
            mod4.addRow(new Object[]{hist.getIdPaciente(), hist.getFechaRegistro(), hist.getPeso()});
        }
    }//GEN-LAST:event_BbuscarPacienteActionPerformed

    private void BresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BresetActionPerformed
        borrarBusqXcalorias();
        TFcalorias.setText(" ");
    }//GEN-LAST:event_BresetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BbuscarPaciente;
    private javax.swing.JButton BbuscarXcalorias;
    private javax.swing.JButton Breset;
    private javax.swing.JTable TDietasVigentes;
    private javax.swing.JTextField TFapellidoPaciente;
    private javax.swing.JTextField TFcalorias;
    private javax.swing.JTextField TFdni;
    private javax.swing.JTextField TFidPaciente;
    private javax.swing.JTextField TFnombrePaciente;
    private javax.swing.JTable TbusqPesos;
    private javax.swing.JTable TbusqXcalorias;
    private javax.swing.JTable TdietasVencidas;
    private javax.swing.JTabbedPane borrar;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JInternalFrame jInternalFrame4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
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

    private void armarCabeceraBusqXcalorias() {
        mod3.addColumn("ID Comida");
        mod3.addColumn("Nombre");
        mod3.addColumn("Calorías");
        mod3.addColumn("Estado");
        TbusqXcalorias.setModel(mod3);
    }

    private void borrarBusqXcalorias() {
        int f = TbusqXcalorias.getRowCount() - 1;
        for (; f >= 0; f--) {
            mod3.removeRow(f);
        }
    }

    private void armarcabeceraBusqPesos() {
        mod4.addColumn("Id Paciente");
        mod4.addColumn("Fecha de Registro");
        mod4.addColumn("Peso");
        TbusqPesos.setModel(mod4);
    }

    private void borrarBusqPesos() {
        int f = TbusqPesos.getRowCount() - 1;
        for (; f >= 0; f--) {
            mod4.removeRow(f);
        }
    }
    private void agregarValidacionDni() {
        TFdni.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) )) {
                    evt.consume();                   
                }
            }
        });
    }
     private void agregarValidacionCalorias() {
        TFdni.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) )) {
                    evt.consume();                   
                }
            }
        });
    }

}
