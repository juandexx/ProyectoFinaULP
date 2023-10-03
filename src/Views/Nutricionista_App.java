package Views;

import AccesoDB.Coneccion_DB;
import AccesoDB.Paciente_DB;
import Entidades.Paciente;

public class Nutricionista_App extends javax.swing.JFrame {

    private Coneccion_DB con;
    private Paciente_DB pdb;
    private Paciente pac;

    public Nutricionista_App() {
        initComponents();
        pdb = new Paciente_DB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopMain = new javax.swing.JDesktopPane();
        SoyUnMenu = new javax.swing.JMenuBar();
        JMpaciente = new javax.swing.JMenu();
        infoPaciente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

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

        jMenu2.setText("Edit");
        SoyUnMenu.add(jMenu2);

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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nutricionista_App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopMain;
    private javax.swing.JMenu JMpaciente;
    private javax.swing.JMenuBar SoyUnMenu;
    private javax.swing.JMenuItem infoPaciente;
    private javax.swing.JMenu jMenu2;
    // End of variables declaration//GEN-END:variables
}
