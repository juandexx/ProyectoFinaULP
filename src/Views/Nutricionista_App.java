package Views;

import AccesoDB.Comida_Data;
import AccesoDB.Coneccion_Data;
import AccesoDB.Dieta_Data;
import AccesoDB.Paciente_Data;
import Entidades.Paciente;

public class Nutricionista_App extends javax.swing.JFrame {

    private Coneccion_Data con;
    private Paciente_Data pdb;
    private Paciente pac;
    private Comida_Data cdb;
    private Dieta_Data ddb;

    public Nutricionista_App() {

        initComponents();
        this.setLocationRelativeTo(null);// Aparece la pantalla centrada y no en la esquina superior izquierda
        pdb = new Paciente_Data();
        cdb = new Comida_Data();
        ddb = new Dieta_Data();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem11 = new javax.swing.JMenuItem();
        DesktopMain = new javax.swing.JDesktopPane();
        SoyUnMenu = new javax.swing.JMenuBar();
        JMpaciente = new javax.swing.JMenu();
        infoPaciente = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        JMmenú = new javax.swing.JMenu();
        infoMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
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

        JMpaciente.setText("Paciente");

        infoPaciente.setText("Paciente Info");
        infoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoPacienteActionPerformed(evt);
            }
        });
        JMpaciente.add(infoPaciente);

        SoyUnMenu.add(JMpaciente);

        jMenu1.setText("Dieta");

        jMenuItem5.setText("Dieta...");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        SoyUnMenu.add(jMenu1);

        JMmenú.setText("Menú");

        infoMenu.setText("Menú Info");
        infoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoMenuActionPerformed(evt);
            }
        });
        JMmenú.add(infoMenu);

        SoyUnMenu.add(JMmenú);

        jMenu2.setText("Dieta-Menú");

        jMenuItem8.setText("EditarDietas");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        SoyUnMenu.add(jMenu2);

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

    private void infoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoPacienteActionPerformed
        DesktopMain.removeAll();
        DesktopMain.repaint();
        Gestor_Paciente pd = new Gestor_Paciente(pdb);
        pd.setVisible(true);
        DesktopMain.add(pd);
        DesktopMain.moveToFront(pd);
    }//GEN-LAST:event_infoPacienteActionPerformed

    private void infoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoMenuActionPerformed
        DesktopMain.removeAll();
        DesktopMain.repaint();
        Gestor_Comida cd = new Gestor_Comida(cdb);
        cd.setVisible(true);
        DesktopMain.add(cd);
        DesktopMain.moveToFront(cd);
    }//GEN-LAST:event_infoMenuActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        DesktopMain.removeAll();
        DesktopMain.repaint();
        Gestor_Dieta_Comida gdc = new Gestor_Dieta_Comida(cdb, ddb);
        gdc.setVisible(true);
        DesktopMain.add(gdc);
        DesktopMain.moveToFront(gdc);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        DesktopMain.removeAll();
        DesktopMain.repaint();
        Gestor_Dieta gd = new Gestor_Dieta(ddb, pdb, cdb);
        gd.setVisible(true);
        DesktopMain.add(gd);
        DesktopMain.moveToFront(gd);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nutricionista_App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopMain;
    private javax.swing.JMenu JMmenú;
    private javax.swing.JMenu JMpaciente;
    private javax.swing.JMenuBar SoyUnMenu;
    private javax.swing.JMenuItem infoMenu;
    private javax.swing.JMenuItem infoPaciente;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem8;
    // End of variables declaration//GEN-END:variables
}
