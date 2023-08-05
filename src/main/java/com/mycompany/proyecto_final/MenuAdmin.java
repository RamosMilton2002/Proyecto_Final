/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto_final;


import Estacion_Expres.Conec;
import Estacion_Expres.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USUARIO
 */
public class MenuAdmin extends javax.swing.JFrame {

    public void CambiarClave(){
        Conec cn = new Conec();
        String Consulta = "drop procedure Validacion_Credenciales;";
        String Consulta2 = "CREATE PROCEDURE Validacion_Credenciales(in clave varchar(20))\n"
                + "BEGIN\n"
                + "    if clave = \"" + txt_claveUsuario.getText() + "\" then\n"
                + "    select 1;\n"
                + "    elseif clave = \"" + txt_claveadmin.getText() + "\" then\n"
                + "    select 2;\n"
                + "    else \n"
                + "    select 0;\n"
                + "    end if;\n"
                + "END";
        try {
            cn.EjecutaInstruccion(Consulta);
            cn.EjecutaInstruccion(Consulta2);
            System.out.println(Consulta);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public MenuAdmin() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_ClaveUsu = new javax.swing.JLabel();
        txt_claveUsuario = new javax.swing.JTextField();
        lbl_ClaveAdmin = new javax.swing.JLabel();
        txt_claveadmin = new javax.swing.JTextField();
        lbl_Tarifa = new javax.swing.JLabel();
        txt_tarifa = new javax.swing.JTextField();
        lbl_Tipo = new javax.swing.JLabel();
        txt_Tipo = new javax.swing.JTextField();
        lbl_Marca = new javax.swing.JLabel();
        txt_Marca = new javax.swing.JTextField();
        lbl_Modelo = new javax.swing.JLabel();
        txt_Modelo = new javax.swing.JTextField();
        lbl_Color = new javax.swing.JLabel();
        txt_Color = new javax.swing.JTextField();
        btn_Cambiar = new javax.swing.JButton();
        Chbox_ClaveUsu = new javax.swing.JCheckBox();
        Chbox_ClaveAdmin = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_ClaveUsu.setText("Clave Usuario");

        lbl_ClaveAdmin.setText("Clave Admin");

        lbl_Tarifa.setText("Tarifa x hora");

        lbl_Tipo.setText("Tipo");

        lbl_Marca.setText("Marca");

        lbl_Modelo.setText("Modelo");

        lbl_Color.setText("Color");

        btn_Cambiar.setText("Cambiar");
        btn_Cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CambiarActionPerformed(evt);
            }
        });

        Chbox_ClaveUsu.setSelected(true);
        Chbox_ClaveUsu.setToolTipText("Visible la clave");
        Chbox_ClaveUsu.setBorderPaintedFlat(true);

        Chbox_ClaveAdmin.setSelected(true);
        Chbox_ClaveAdmin.setToolTipText("Visible la clave");
        Chbox_ClaveAdmin.setBorderPaintedFlat(true);
        Chbox_ClaveAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Chbox_ClaveAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Tipo)
                    .addComponent(lbl_Marca)
                    .addComponent(lbl_Modelo)
                    .addComponent(lbl_Color))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_Tipo)
                    .addComponent(txt_Marca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_Modelo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_Color, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btn_Cambiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ClaveUsu)
                            .addComponent(lbl_ClaveAdmin)
                            .addComponent(lbl_Tarifa))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_claveUsuario)
                            .addComponent(txt_claveadmin)
                            .addComponent(txt_tarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Chbox_ClaveUsu)
                            .addComponent(Chbox_ClaveAdmin))))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Chbox_ClaveUsu)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_ClaveUsu)
                                .addComponent(txt_claveUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_claveadmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_ClaveAdmin))
                            .addComponent(Chbox_ClaveAdmin))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_tarifa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Tarifa))
                        .addGap(18, 18, 18)
                        .addComponent(btn_Cambiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Color))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Tipo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Marca))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Modelo))))
                .addContainerGap(177, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CambiarActionPerformed
        CambiarClave();
    }//GEN-LAST:event_btn_CambiarActionPerformed

    private void Chbox_ClaveAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Chbox_ClaveAdminActionPerformed
        if(Chbox_ClaveAdmin.isSelected()){
            
        }
    }//GEN-LAST:event_Chbox_ClaveAdminActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Chbox_ClaveAdmin;
    private javax.swing.JCheckBox Chbox_ClaveUsu;
    private javax.swing.JButton btn_Cambiar;
    private javax.swing.JLabel lbl_ClaveAdmin;
    private javax.swing.JLabel lbl_ClaveUsu;
    private javax.swing.JLabel lbl_Color;
    private javax.swing.JLabel lbl_Marca;
    private javax.swing.JLabel lbl_Modelo;
    private javax.swing.JLabel lbl_Tarifa;
    private javax.swing.JLabel lbl_Tipo;
    private javax.swing.JTextField txt_Color;
    private javax.swing.JTextField txt_Marca;
    private javax.swing.JTextField txt_Modelo;
    private javax.swing.JTextField txt_Tipo;
    private javax.swing.JTextField txt_claveUsuario;
    private javax.swing.JTextField txt_claveadmin;
    private javax.swing.JTextField txt_tarifa;
    // End of variables declaration//GEN-END:variables
}
