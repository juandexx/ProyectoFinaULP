package Views;

import AccesoDB.Comida_Data;
import Entidades.Comida;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Gestor_Comida extends javax.swing.JInternalFrame {

    private Comida_Data cdb;

    public Gestor_Comida(Comida_Data cdb) {
        initComponents();
        this.cdb = cdb;
        validarNombre();
        validarCalorias();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAdescripcion = new javax.swing.JTextArea();
        TFid = new javax.swing.JTextField();
        TFnombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TFcalorias = new javax.swing.JTextField();
        RBestado = new javax.swing.JRadioButton();
        Bbuscar = new javax.swing.JButton();
        Bagregar = new javax.swing.JButton();
        Bmodificar = new javax.swing.JButton();
        Beliminar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COMIDA");

        jLabel2.setText("Nombre");

        jLabel3.setText("Identificación");

        jLabel4.setText("Descripcion");

        TAdescripcion.setColumns(20);
        TAdescripcion.setRows(5);
        jScrollPane1.setViewportView(TAdescripcion);

        jLabel5.setText("Calorías");

        RBestado.setText("Estado");

        Bbuscar.setText("Buscar");
        Bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarActionPerformed(evt);
            }
        });

        Bagregar.setBackground(new java.awt.Color(102, 255, 102));
        Bagregar.setText("Agregar");
        Bagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BagregarActionPerformed(evt);
            }
        });

        Bmodificar.setBackground(new java.awt.Color(255, 255, 51));
        Bmodificar.setText("Modificar");
        Bmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmodificarActionPerformed(evt);
            }
        });

        Beliminar.setBackground(new java.awt.Color(255, 102, 102));
        Beliminar.setText("Eliminar");
        Beliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Bagregar)
                                .addGap(46, 46, 46)
                                .addComponent(Bmodificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Beliminar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TFnombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TFcalorias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(TFid, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(55, 55, 55)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Bbuscar)
                                        .addComponent(RBestado))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bbuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(TFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFcalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(RBestado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bagregar)
                    .addComponent(Bmodificar)
                    .addComponent(Beliminar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmodificarActionPerformed
        try {
            int idComida = Integer.parseInt(TFid.getText());
            String nombre = TFnombre.getText();
            int cantCalorias = Integer.parseInt(TFcalorias.getText());
            String detalle = TAdescripcion.getText();
            boolean estado = RBestado.isSelected();
            Comida nuevo = new Comida(idComida,nombre, detalle, cantCalorias, estado);
            cdb.modificarComida(nuevo);
            limpiarCampos();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ha ingresado un parametro invalido, reintente");
        }
    }//GEN-LAST:event_BmodificarActionPerformed

    private void BagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BagregarActionPerformed
        try {
            String nombre = TFnombre.getText();
            int cantCalorias = Integer.parseInt(TFcalorias.getText());
            String detalle = TAdescripcion.getText();
            boolean estado = RBestado.isSelected();
            Comida nuevo = new Comida(nombre, detalle, cantCalorias, estado);
            cdb.agregarComida(nuevo);
            limpiarCampos();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ha ingresado un parametro invalido, reintente");
        }
    }//GEN-LAST:event_BagregarActionPerformed

    private void BeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeliminarActionPerformed
        int idComida = Integer.parseInt(TFid.getText());
        cdb.eliminarComida(idComida);
        limpiarCampos();
    }//GEN-LAST:event_BeliminarActionPerformed

    private void BbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbuscarActionPerformed
        //int idComida = Integer.parseInt(TFid.getText());
        
        String nombre = TFnombre.getText();
        Comida comida = cdb.buscarComida(nombre);
        TFnombre.setText(comida.getNombre());
        TFcalorias.setText(String.valueOf(comida.getCantCalorias()));
        TAdescripcion.setText(comida.getDetalle());
        RBestado.setSelected(comida.isEstado());
        TFid.setText(String.valueOf(comida.getIdComida()));
    }//GEN-LAST:event_BbuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bagregar;
    private javax.swing.JButton Bbuscar;
    private javax.swing.JButton Beliminar;
    private javax.swing.JButton Bmodificar;
    private javax.swing.JRadioButton RBestado;
    private javax.swing.JTextArea TAdescripcion;
    private javax.swing.JTextField TFcalorias;
    private javax.swing.JTextField TFid;
    private javax.swing.JTextField TFnombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private boolean validarNombre(String nombre) {
        return nombre.matches("[a-zA-Z ]+");
    }
    
    private void limpiarCampos() {
        TFid.setText("");
         TFnombre.setText("");
         TFcalorias.setText("");
         TAdescripcion.setText("");
         RBestado.setSelected(false);
    }
    
    private void validarNombre(){
        TFnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!(Character.isLetter(c) || (c == KeyEvent.VK_BACK_SPACE) )) {
                    evt.consume();
                }
            }
        });
    }
    
    private void validarCalorias() {
        TFcalorias.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) )) {
                    evt.consume();
                }
            }
        });
    }
    
    private void validarDescripcion(String detalle){
        
        /* 
            FALTA VALIDAR DESCRIPCION PARA QUE NO QUEDE VACIO
        */
        
    }
    
}
