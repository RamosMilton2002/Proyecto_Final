/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Estacion_Expres;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MSI-THIN
 */
public class Ver_Registros extends javax.swing.JFrame {

    /**
     * Creates new form Ver_Registros
     */
    public void buscarDato(String valor) {
        Conec c1 = new Conec();
        String[] titulos = {"Nro Registro", "Matricula", "Nombre", "Apellido", "Hora de Entrada", "Hora de Salida", "Total", "Observaciones"};
        String[] registros = new String[8];



        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String sentenciaSQL = "Select * From verregistros where Matricula like '%" + valor + "%' OR Nombre like '%" + valor + "%' OR Apellido like '%" + valor + "%'";
        

        try {

            ResultSet rs = c1.EjecutaSQL(sentenciaSQL);
            
            if (rs != null) {
            while (rs.next()) {

                registros[0] = rs.getString("Nro_Registro");
                registros[1] = rs.getString("Matricula");
                registros[2] = rs.getString("Nombre");
                registros[3] = rs.getString("Apellido");
                registros[4] = rs.getString("Hora_de_Entrada");
                registros[5] = rs.getString("Hora_de_Salida");
                registros[6] = rs.getString("Total");
                registros[7] = rs.getString("Observaciones");

                modelo.addRow(registros);

            }
            } else {
    System.out.println("El ResultSet es nulo. Puede haber un problema con la consulta.");
}
            Tabl_Registros.setModel(modelo);
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error de muestra de datos" + e.getMessage());
}       catch (ClassNotFoundException ex) {
            Logger.getLogger(Ver_Registros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void MostrarRegistros() {
        Conec c1 = new Conec();
        String[] titulos = {"Nro Registro", "Matricula", "Nombre", "Apellido", "Hora de Entrada", "Hora de Salida", "Total", "Observaciones"};
        String[] registros = new String[8];

        DefaultTableModel model = new DefaultTableModel(null, titulos);

        String sentenciaSQL = "Select * From verregistros";

        try {

            ResultSet rs = c1.EjecutaSQL(sentenciaSQL);

            while (rs.next()) {

                registros[0] = rs.getString("Nro_Registro");
                registros[1] = rs.getString("Matricula");
                registros[2] = rs.getString("Nombre");
                registros[3] = rs.getString("Apellido");
                registros[4] = rs.getString("Hora_de_Entrada");
                registros[5] = rs.getString("Hora_de_Salida");
                registros[6] = rs.getString("Total");
                registros[7] = rs.getString("Observaciones");

                model.addRow(registros);

            }
            Tabl_Registros.setModel(model);
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error de muestra de datos" + e.getMessage());
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(Ver_Registros.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public Ver_Registros() {
        initComponents();
        MostrarRegistros();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBusc = new javax.swing.JTextField();
        btn_Regre = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabl_Registros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtBusc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscKeyReleased(evt);
            }
        });

        btn_Regre.setText("REGRESAR");
        btn_Regre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegreActionPerformed(evt);
            }
        });

        Tabl_Registros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabl_Registros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabl_RegistrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabl_Registros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(txtBusc, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(btn_Regre)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Regre))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscKeyReleased
        // TODO add your handling code here:
        buscarDato(txtBusc.getText());
    }//GEN-LAST:event_txtBuscKeyReleased

    private void Tabl_RegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabl_RegistrosMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_Tabl_RegistrosMouseClicked

    private void btn_RegreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegreActionPerformed
        // TODO add your handling code here:
        Menu m = new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_btn_RegreActionPerformed

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
            java.util.logging.Logger.getLogger(Ver_Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ver_Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ver_Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ver_Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ver_Registros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabl_Registros;
    private javax.swing.JButton btn_Regre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBusc;
    // End of variables declaration//GEN-END:variables
}
