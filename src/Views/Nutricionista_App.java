package Views;

import AccesoDB.Comida_Data;
import AccesoDB.Coneccion_Data;
import AccesoDB.DietaComida_Data;
import AccesoDB.Dieta_Data;
import AccesoDB.Paciente_Data;
import Entidades.Paciente;

public class Nutricionista_App extends javax.swing.JFrame {

    private Coneccion_Data con;
    private Paciente_Data pdb;
    private Paciente pac;
    private Comida_Data cdb;
    private Dieta_Data ddb;
    private DietaComida_Data dcd;

    public Nutricionista_App() {

        initComponents();
        this.setLocationRelativeTo(null);// Aparece la pantalla centrada y no en la esquina superior izquierda
        pdb = new Paciente_Data();
        cdb = new Comida_Data();
        ddb = new Dieta_Data();
        dcd = new DietaComida_Data();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem11 = new javax.swing.JMenuItem();
        DesktopMain = new javax.swing.JDesktopPane();
        SoyUnMenu = new javax.swing.JMenuBar();
        MIdieta = new javax.swing.JMenu();
        MIpaciente = new javax.swing.JMenuItem();
        MIcomida = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jMenuItem11.setText("jMenuItem11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DesktopMain.setBackground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout DesktopMainLayout = new javax.swing.GroupLayout(DesktopMain);
        DesktopMain.setLayout(DesktopMainLayout);
        DesktopMainLayout.setHorizontalGroup(
            DesktopMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        DesktopMainLayout.setVerticalGroup(
            DesktopMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        MIdieta.setText("Administración");
        MIdieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIdietaActionPerformed(evt);
            }
        });

        MIpaciente.setText("Paciente");
        MIpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIpacienteActionPerformed(evt);
            }
        });
        MIdieta.add(MIpaciente);

        MIcomida.setText("Comidas");
        MIcomida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIcomidaActionPerformed(evt);
            }
        });
        MIdieta.add(MIcomida);

        jMenuItem2.setText("Dieta");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        MIdieta.add(jMenuItem2);

        jMenuItem1.setText("Consultas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MIdieta.add(jMenuItem1);

        SoyUnMenu.add(MIdieta);

        jMenu4.setText("Salir");
        SoyUnMenu.add(jMenu4);

        setJMenuBar(SoyUnMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopMain)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopMain)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MIpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIpacienteActionPerformed
       DesktopMain.removeAll();
        DesktopMain.repaint();
        Gestor_Paciente pd = new Gestor_Paciente(pdb);
        pd.setVisible(true);
        DesktopMain.add(pd);
        DesktopMain.moveToFront(pd);
    }//GEN-LAST:event_MIpacienteActionPerformed

    private void MIcomidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIcomidaActionPerformed
       DesktopMain.removeAll();
        DesktopMain.repaint();
        Gestor_Comida cd = new Gestor_Comida(cdb);
        cd.setVisible(true);
        DesktopMain.add(cd);
        DesktopMain.moveToFront(cd);
    }//GEN-LAST:event_MIcomidaActionPerformed

    private void MIdietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIdietaActionPerformed
        
    }//GEN-LAST:event_MIdietaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        DesktopMain.removeAll();
        DesktopMain.repaint();
        Gestor_Dieta gd = new Gestor_Dieta(ddb, pdb, cdb, dcd);
        gd.setVisible(true);
        DesktopMain.add(gd);
        DesktopMain.moveToFront(gd);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       DesktopMain.removeAll();
        DesktopMain.repaint();
        Gestor_Consultas cons = new Gestor_Consultas(pdb, ddb);
        cons.setVisible(true);
        DesktopMain.add(cons);
        DesktopMain.moveToFront(cons);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nutricionista_App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopMain;
    private javax.swing.JMenuItem MIcomida;
    private javax.swing.JMenu MIdieta;
    private javax.swing.JMenuItem MIpaciente;
    private javax.swing.JMenuBar SoyUnMenu;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
