/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Estacion_Expres;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MSI-THIN
 */
public class Cliente extends javax.swing.JFrame {

    /**
     * Creates new form Cliente
     */
    public static String cedulaa;

    public Cliente() {
        initComponents();
        mostrarTabla();
    }
    
    private void limpiar(){
        txtCed.setText(null);
        txtNom.setText(null);
        txtApe.setText(null);
        txtTel.setText(null);
        txtDir.setText(null);
        txtCor.setText(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlC = new javax.swing.JPanel();
        lblCed = new javax.swing.JLabel();
        lblNom = new javax.swing.JLabel();
        LblAp = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        lblDi = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCli = new javax.swing.JTable();
        lblCor = new javax.swing.JLabel();
        txtCed = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        txtApe = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtDir = new javax.swing.JTextField();
        txtCor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btEl = new javax.swing.JButton();
        btnBus = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCed.setText("CEDULA:");

        lblNom.setText("NOMBRE:");

        LblAp.setText("APELLIDO: ");

        lblTel.setText("TELEFONO :");

        lblDi.setText("DIRECCION:");

        tblCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CEDULA", "NOMBRE", "APELLIDO", "TELEFONO", "DIRECCION", "CORREO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCliMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCli);

        lblCor.setText("CORREO: ");

        txtCed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedActionPerformed(evt);
            }
        });
        txtCed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedKeyTyped(evt);
            }
        });

        txtApe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApeActionPerformed(evt);
            }
        });

        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelKeyTyped(evt);
            }
        });

        jLabel7.setText("CLIENTE");

        jButton1.setText("REGISTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btEl.setText("ELIMINAR");
        btEl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btElActionPerformed(evt);
            }
        });

        btnBus.setText("BUSCAR");
        btnBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusActionPerformed(evt);
            }
        });

        jButton2.setText("SIGUIENTE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCLayout = new javax.swing.GroupLayout(pnlC);
        pnlC.setLayout(pnlCLayout);
        pnlCLayout.setHorizontalGroup(
            pnlCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCLayout.createSequentialGroup()
                        .addComponent(LblAp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCLayout.createSequentialGroup()
                        .addGroup(pnlCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDir, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDi, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(326, 341, Short.MAX_VALUE))
                    .addGroup(pnlCLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlCLayout.createSequentialGroup()
                        .addGroup(pnlCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCed, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlCLayout.createSequentialGroup()
                                .addComponent(lblCed, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(122, 122, 122)
                                .addGroup(pnlCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNom, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlCLayout.createSequentialGroup()
                                        .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(btnBus))
                                    .addComponent(lblTel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCor, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btEl, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(48, Short.MAX_VALUE))))
            .addGroup(pnlCLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(jButton2))
            .addGroup(pnlCLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlCLayout.setVerticalGroup(
            pnlCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jButton2))
                .addGap(35, 35, 35)
                .addGroup(pnlCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNom)
                    .addComponent(lblCed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblAp)
                    .addComponent(lblTel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDi)
                    .addComponent(lblCor))
                .addGap(10, 10, 10)
                .addGroup(pnlCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btEl))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCliMouseClicked
        // TODO add your handling code here:
        txtCed.setText(tblCli.getValueAt(tblCli.getSelectedRow(), 0).toString());
        txtNom.setText(tblCli.getValueAt(tblCli.getSelectedRow(), 1).toString());
        txtApe.setText(tblCli.getValueAt(tblCli.getSelectedRow(), 2).toString());
        txtTel.setText(tblCli.getValueAt(tblCli.getSelectedRow(), 3).toString());
        txtDir.setText(tblCli.getValueAt(tblCli.getSelectedRow(), 4).toString());
        txtCor.setText(tblCli.getValueAt(tblCli.getSelectedRow(), 5).toString());
    }//GEN-LAST:event_tblCliMouseClicked

    private void txtCedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedActionPerformed

    private void txtApeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Conec c1 = new Conec();
        if (txtCed.getText().isEmpty() || txtNom.getText().isEmpty() || txtApe.getText().isEmpty()
                || txtTel.getText().isEmpty() || txtDir.getText().isEmpty() || txtCor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int cedula;
        try {
            cedula = Integer.parseInt(txtCed.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El campo de cédula debe contener solo números.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int telefono;
        try {
            telefono = Integer.parseInt(txtTel.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El campo de telefono debe contener solo números.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!isLettersOnly(txtNom.getText())) {
            JOptionPane.showMessageDialog(this, "El campo de nombre  deben contener solo letras.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!isLettersOnly(txtApe.getText())) {
            JOptionPane.showMessageDialog(this, "El campo de  Apellido deben contener solo letras.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!isLettersAndSpacesOnly(txtDir.getText())) {
            JOptionPane.showMessageDialog(this, "El campo de Direccion  deben contener solo letras.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //"int cedula = Integer.parseInt(txtCed.getText());
        String nombre = txtNom.getText();
        String apellido = txtApe.getText();
        //String telefono = txtTel.getText();
        String direccion = txtDir.getText();
        String correo = txtCor.getText();
        String sql2 = "call sistema_parqueadero.BUSCARPERSONACED(" + cedula + ")";
        try {
            ResultSet re = c1.EjecutaSQL(sql2);
            if (re.next()) {
                int selectedRow = tblCli.getSelectedRow();
                if (selectedRow == -1) {
                    JOptionPane.showMessageDialog(this, "Por favor, seleccione un registro para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {

                }
                String sql3 = ("call sistema_parqueadero.MODIFICARPER('" + cedula + "','" + nombre + "','" + apellido + "','" + telefono + "','" + direccion + "','" + correo + "')");
                c1.EjecutaSQL(sql3);
            } else {
                String sql = ("call sistema_parqueadero.InsertarPers('" + cedula + "','" + nombre + "','" + apellido + "','" + telefono + "','" + direccion + "','" + correo + "')");

                System.out.println("´´´´" + sql);
                try {
                    c1.EjecutaSQLIUD(sql);
                } catch (ClassNotFoundException e) {
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        mostrarTabla();
        cedulaa = txtCed.getText();
        Vehiculo v = new Vehiculo();
        v.setVisible(true);
        limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private boolean isLettersOnly(String input) {
        return input.matches("[a-zA-Z]+");
    }
    private boolean isLettersAndSpacesOnly(String input) {
    return input.matches("[a-zA-Z ]+");
}


    private void btElActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btElActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCli.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un registro para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        var Per_Cedula = Integer.parseInt(tblCli.getValueAt(selectedRow, 0).toString());

        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_parqueadero?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "2002");

            // Llamar al procedimiento almacenado para eliminar el registro
            String sql = "call sistema_parqueadero.EliminarPerso(?)";
            CallableStatement statement = connection.prepareCall(sql);
            statement.setInt(1, Per_Cedula);
            statement.execute();

            statement.close();
            connection.close();
            // Eliminar la fila de la tabla
            DefaultTableModel model = (DefaultTableModel) tblCli.getModel();
            model.removeRow(selectedRow);

            JOptionPane.showMessageDialog(this, "Cliente eliminado correctamente.", "Eliminación Exitosa", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al eliminar el producto.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();

        }

    }//GEN-LAST:event_btElActionPerformed

    private void txtCedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') || (txtCed.getText().length() >= 10)) {
            evt.consume();
        
    }
    }//GEN-LAST:event_txtCedKeyTyped

    private void txtTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') || (txtTel.getText().length() >= 10)) {
            evt.consume();
        
    }
    }//GEN-LAST:event_txtTelKeyTyped

    private void btnBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusActionPerformed
        // TODO add your handling code here:
        Conec c = new Conec();
          int cedula;        
    try {
        cedula = Integer.parseInt(txtCed.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El campo de cédula debe contener solo números.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
        String sql = "call sistema_parqueadero.BUSCARPERSONAS("+ txtCed.getText()+");";
        try {
            ResultSet res = c.EjecutaSQL(sql);
        while(res.next()){
        txtCed.setText(res.getString(1));
        txtNom.setText(res.getString(2));
        txtApe.setText(res.getString(3));
        txtTel.setText(res.getString(4));
        txtDir.setText(res.getString(5));
        txtCor.setText(res.getString(6));
            
        }   
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        mostrarTabla();
    }//GEN-LAST:event_btnBusActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Vehiculo v = new Vehiculo();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void mostrarTabla() {
        String sql;
        if(txtCed.getText().isEmpty()){
            sql = ("call sistema_parqueadero.MostrarCli();");
        }else{
            sql = "call sistema_parqueadero.BUSCARPERSONAS("+ txtCed.getText()+");";
        }
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        modelo.addColumn("CEDULA");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDO");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("DIRECCION");
        modelo.addColumn("CORREO");

        tblCli.setModel(modelo);
        String[] datos = new String[6];
        try {
            Conec c1 = new Conec();
            ResultSet res = c1.EjecutaSQL(sql);
            while (res.next()) {
                datos[0] = res.getString(1);
                datos[1] = res.getString(2);
                datos[2] = res.getString(3);
                datos[3] = res.getString(4);
                datos[4] = res.getString(5);
                datos[5] = res.getString(6);
                modelo.addRow(datos);

            }
            res.close();
            tblCli.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(null, "error" + e.toString());
        }
//       txtCedCli.setText(txtCed.getText());
    }

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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblAp;
    private javax.swing.JButton btEl;
    private javax.swing.JButton btnBus;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCed;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblDi;
    private javax.swing.JLabel lblNom;
    private javax.swing.JLabel lblTel;
    private javax.swing.JPanel pnlC;
    private javax.swing.JTable tblCli;
    private javax.swing.JTextField txtApe;
    public javax.swing.JTextField txtCed;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}