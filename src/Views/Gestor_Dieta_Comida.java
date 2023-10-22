package Views;

import AccesoDB.Comida_Data;
import AccesoDB.Dieta_Data;
import Entidades.Comida;
import Entidades.Horario;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Gestor_Dieta_Comida extends javax.swing.JInternalFrame {

    private Comida_Data cdb;
    private Dieta_Data ddb;
    private DefaultTableModel modelo = new DefaultTableModel();

    public Gestor_Dieta_Comida(Comida_Data cdb, Dieta_Data ddb) {
        initComponents();
        cargarCombo();
        armarCabecera();
        
        this.cdb = cdb;
        this.ddb = ddb;
        cargarComidas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        CBhorario = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tcomidas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TFnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

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
        jScrollPane2.setViewportView(jTable1);

        CBhorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBhorarioActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar ");

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
        jScrollPane3.setViewportView(Tcomidas);

        jLabel1.setText("Busqueda Menú por nombre");

        jLabel2.setText("Horario");

        TFnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TFnombreKeyReleased(evt);
            }
        });

        jLabel3.setText("Nombre de Dieta");

        jMenu1.setText("Administración");

        jMenuItem2.setText("Buscar Dieta");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jMenuItem3.setText("Agregar Dieta");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Eliminar Dieta");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(33, 33, 33)
                                .addComponent(TFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CBhorario, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CBhorario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBhorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBhorarioActionPerformed

    }//GEN-LAST:event_CBhorarioActionPerformed

    private void TFnombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFnombreKeyReleased
        if (TFnombre.getText().startsWith("nombre")) {

        }
    }//GEN-LAST:event_TFnombreKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Horario> CBhorario;
    private javax.swing.JTextField TFnombre;
    private javax.swing.JTable Tcomidas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
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

//    private void cargarComidas() {
//        ArrayList<Comida> comidas = cdb.getComidas();
//        for (Comida comida : comidas) {
//            Object[] fila = {
//                comida.getIdComida(),
//                comida.getNombre(),
//                comida.getCantCalorias(),
//                comida.isEstado() ? "Activo" : "Inactivo"
//            };
//            modelo.addRow(fila);
//        }
//    }
    private void cargarComidas() {
        ArrayList<Comida> listarComidas = new ArrayList<>();
        listarComidas = cdb.getComidas();
        Tcomidas.removeAll();
        for (Comida comida : listarComidas) {
            modelo.addRow(new Object[]{
                comida.getIdComida(),
                comida.getNombre(),
                comida.getCantCalorias(),
                comida.isEstado(),});
        }
    }

}
