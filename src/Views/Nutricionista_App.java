package Views;

import AccesoDB.Comida_Data;
import AccesoDB.Coneccion_Data;
import AccesoDB.Paciente_Data;
import Entidades.Paciente;

public class Nutricionista_App extends javax.swing.JFrame {

    private Coneccion_Data con;
    private Paciente_Data pdb;
    private Paciente pac;
    private Comida_Data cdb;

    public Nutricionista_App() {
        initComponents();
        pdb = new Paciente_Data();
        cdb = new Comida_Data();
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
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        JMmenú = new javax.swing.JMenu();
        infoMenu = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jMenuItem11.setText("jMenuItem11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DesktopMain.setBackground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout DesktopMainLayout = new javax.swing.GroupLayout(DesktopMain);
        DesktopMain.setLayout(DesktopMainLayout);
        DesktopMainLayout.setHorizontalGroup(
            DesktopMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        DesktopMainLayout.setVerticalGroup(
            DesktopMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
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
        jMenu1.add(jMenuItem5);

        jMenuItem1.setText("Dieta Nueva");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Modificar Dieta");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Eliminar Dieta");
        jMenu1.add(jMenuItem3);

        SoyUnMenu.add(jMenu1);

        JMmenú.setText("Menú");

        infoMenu.setText("Menú Info");
        infoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoMenuActionPerformed(evt);
            }
        });
        JMmenú.add(infoMenu);

        jMenuItem4.setText("Crear Menú");
        JMmenú.add(jMenuItem4);

        jMenuItem6.setText("Modificar Menú");
        JMmenú.add(jMenuItem6);

        jMenuItem7.setText("Eliminar Menú");
        JMmenú.add(jMenuItem7);

        SoyUnMenu.add(JMmenú);

        jMenu2.setText("Dieta-Menú");

        jMenuItem8.setText("Paciente-Dieta");
        jMenu2.add(jMenuItem8);

        jMenuItem9.setText("Dietas Activas");
        jMenu2.add(jMenuItem9);

        jMenuItem10.setText("Dietas Finalizadas");
        jMenu2.add(jMenuItem10);

        SoyUnMenu.add(jMenu2);

        jMenu3.setText("HELP!!!!!!!!!!");
        SoyUnMenu.add(jMenu3);

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

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Nutricionista_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nutricionista_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nutricionista_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nutricionista_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

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
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
