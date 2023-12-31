/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto_final;

import Estacion_Expres.Conec;
import Estacion_Expres.Menu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class MenuAdmin extends javax.swing.JFrame {

    int x = 0;
    int m = 0;
    String nombre = null;
    
    public void AgregarColor(){
        String Consulta = "call sistema_parqueadero.InsertCatalogo('"+txt_Color.getText()+"',4)";
        Conec cn = new Conec();
        try {
            cn.EjecutaSQL(Consulta);
            JOptionPane.showMessageDialog(rootPane, "Ingreso de Color correcto");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    public void AgregarTipo(){
        String Consulta = "call sistema_parqueadero.InsertCatalogo('"+txt_Tipo.getText()+"',1)";
        Conec cn = new Conec();
        try {
            cn.EjecutaSQL(Consulta);
            JOptionPane.showMessageDialog(rootPane, "Ingreso de Tipo correcto");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
}
 
    public void AgregarMarca(){
        Conec cn = new Conec();
        String Consulta = "call sistema_parqueadero.InsertCatalogo('"+txt_Marca.getText()+"', "+x+")";
        try {
            cn.EjecutaSQL(Consulta);
            JOptionPane.showMessageDialog(rootPane, "Ingreso de Marca correcto");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    public void AgregarModelo(){
        Conec cn = new Conec();
        String Consulta = "call sistema_parqueadero.InsertCatalogo('"+txt_Modelo.getText()+"', "+x+")";
        try {
            cn.EjecutaSQL(Consulta);
            JOptionPane.showMessageDialog(rootPane, "Ingreso de Modelo correcto");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    public void LlenarDatos(){
        Conec cn = new Conec();       
        String Consulta = "Select * from catalogo where cat_padre = " + x;
        try {
            ResultSet res = cn.EjecutaSQL(Consulta);
            DefaultTableModel model = new DefaultTableModel();
        
                model.addColumn(nombre);

                tbl_Catalogo.setModel(model);
                String[] datos = new String[1];
                while (res.next()) {
                    datos[0] = res.getString(2);
                    model.addRow(datos);
                }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void ObtenerDatos(){
       Conec cn =new Conec();
       String Consulta = "Select * from catalogo where cat_padre = 2";
       try {
           ResultSet res = cn.EjecutaSQL(Consulta);
           if (res.next()){
               txt_claveUsuario.setText(res.getString(2));
           }
           while (res.next()){
               txt_claveAdmin.setText(res.getString(2));
           }
       } catch (ClassNotFoundException | SQLException ex) {
           Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
    
    public void CambiarClave(){
        Conec cn = new Conec();
        String Consulta = "call sistema_parqueadero.actualizarClaves('"+txt_claveUsuario.getText()+"', '"+txt_claveAdmin.getText()+"')";
        try {
            cn.EjecutaSQL(Consulta);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public MenuAdmin() {
        initComponents();
        ObtenerDatos();
        LlenarDatos();
        txt_Marca.setEnabled(false);
        txt_Modelo.setEnabled(false);
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
        lbl_ClaveAdmin = new javax.swing.JLabel();
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
        btn_Salir = new javax.swing.JButton();
        txt_claveUsuario = new javax.swing.JPasswordField();
        txt_claveAdmin = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Catalogo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_ClaveUsu.setText("Clave Usuario");

        lbl_ClaveAdmin.setText("Clave Admin");

        lbl_Tarifa.setText("Tarifa x hora");

        lbl_Tipo.setText("Tipo");

        txt_Tipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_TipoMouseClicked(evt);
            }
        });
        txt_Tipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_TipoKeyTyped(evt);
            }
        });

        lbl_Marca.setText("Marca");

        txt_Marca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_MarcaMouseClicked(evt);
            }
        });
        txt_Marca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_MarcaKeyTyped(evt);
            }
        });

        lbl_Modelo.setText("Modelo");

        txt_Modelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_ModeloMouseClicked(evt);
            }
        });

        lbl_Color.setText("Color");

        txt_Color.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_ColorMouseClicked(evt);
            }
        });

        btn_Cambiar.setText("Cambiar");
        btn_Cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CambiarActionPerformed(evt);
            }
        });

        Chbox_ClaveUsu.setSelected(true);
        Chbox_ClaveUsu.setToolTipText("Visible la clave");
        Chbox_ClaveUsu.setBorderPaintedFlat(true);
        Chbox_ClaveUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Chbox_ClaveUsuActionPerformed(evt);
            }
        });

        Chbox_ClaveAdmin.setSelected(true);
        Chbox_ClaveAdmin.setToolTipText("Visible la clave");
        Chbox_ClaveAdmin.setBorderPaintedFlat(true);
        Chbox_ClaveAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Chbox_ClaveAdminActionPerformed(evt);
            }
        });

        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        tbl_Catalogo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Catalogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_CatalogoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Catalogo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ClaveUsu)
                            .addComponent(lbl_ClaveAdmin)
                            .addComponent(lbl_Tarifa))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_tarifa, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txt_claveUsuario)
                            .addComponent(txt_claveAdmin, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Chbox_ClaveUsu)
                            .addComponent(Chbox_ClaveAdmin)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btn_Cambiar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
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
                                .addComponent(lbl_ClaveAdmin)
                                .addComponent(txt_claveAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Chbox_ClaveAdmin))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_tarifa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Tarifa))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Cambiar)
                            .addComponent(btn_Salir)))
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
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CambiarActionPerformed
        CambiarClave();
        if (!txt_Color.getText().isEmpty()){
            AgregarColor();
        }
        if (!txt_Modelo.getText().isEmpty()){
            AgregarModelo();
        } else if (!txt_Marca.getText().isEmpty()){
            AgregarMarca();
        } else if (!txt_Tipo.getText().isEmpty()){
            AgregarTipo();
        }
        LlenarDatos();
    }//GEN-LAST:event_btn_CambiarActionPerformed

    private void Chbox_ClaveAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Chbox_ClaveAdminActionPerformed
        if(Chbox_ClaveAdmin.isSelected()){
            txt_claveAdmin.setRequestFocusEnabled(false);
            txt_claveAdmin.setEchoChar('*');
        } else {
            txt_claveAdmin.setRequestFocusEnabled(true);
            txt_claveAdmin.setEchoChar((char)0);
        }
    }//GEN-LAST:event_Chbox_ClaveAdminActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void Chbox_ClaveUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Chbox_ClaveUsuActionPerformed
        if(Chbox_ClaveUsu.isSelected()){
            txt_claveUsuario.setRequestFocusEnabled(false);
            txt_claveUsuario.setEchoChar('*');
        } else {
            txt_claveUsuario.setRequestFocusEnabled(true);
            txt_claveUsuario.setEchoChar((char)0);
        }
    }//GEN-LAST:event_Chbox_ClaveUsuActionPerformed

    private void txt_ColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_ColorMouseClicked
        x = 4;
        nombre = "Colores";
        LlenarDatos();
    }//GEN-LAST:event_txt_ColorMouseClicked

    private void txt_TipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_TipoMouseClicked
        x = 1;
        nombre = "Tipo";
        LlenarDatos();
    }//GEN-LAST:event_txt_TipoMouseClicked

    private void tbl_CatalogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_CatalogoMouseClicked
        if (x == 4){
            txt_Color.setText(tbl_Catalogo.getValueAt(tbl_Catalogo.getSelectedRow(), 0).toString());
        } else if (x == 1){
            txt_Tipo.setText(tbl_Catalogo.getValueAt(tbl_Catalogo.getSelectedRow(), 0).toString());
        } else if (x == m){
            txt_Marca.setText(tbl_Catalogo.getValueAt(tbl_Catalogo.getSelectedRow(), 0).toString());
        }
    }//GEN-LAST:event_tbl_CatalogoMouseClicked

    private void txt_MarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_MarcaMouseClicked
        String Consulta = "Select * from catalogo where cat_nombre = '"+txt_Tipo.getText()+"'";
        Conec cn = new Conec();
        try {
            ResultSet res = cn.EjecutaSQL(Consulta);
            if (res.next()){
                x = res.getInt(1);
                m = x;
                nombre= "Tipo: "+ txt_Tipo.getText();
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        LlenarDatos();
    }//GEN-LAST:event_txt_MarcaMouseClicked

    private void txt_ModeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_ModeloMouseClicked
        String Consulta = "Select * from catalogo where cat_nombre = '"+txt_Marca.getText()+"'";
        Conec cn = new Conec();
        try {
            ResultSet res = cn.EjecutaSQL(Consulta);
            if (res.next()){
                x = res.getInt(1);
                nombre ="Marca: "+ txt_Marca.getText();
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        LlenarDatos();
    }//GEN-LAST:event_txt_ModeloMouseClicked

    private void txt_TipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TipoKeyTyped
        if (txt_Tipo.getText().isEmpty()){
            txt_Marca.setEnabled(false);
        } else {
            txt_Marca.setEnabled(true);
        }
    }//GEN-LAST:event_txt_TipoKeyTyped

    private void txt_MarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_MarcaKeyTyped
        if (txt_Marca.getText().isEmpty()){
            txt_Modelo.setEnabled(false);
        } else {
            txt_Modelo.setEnabled(true);
        }
    }//GEN-LAST:event_txt_MarcaKeyTyped

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
    private javax.swing.JButton btn_Salir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_ClaveAdmin;
    private javax.swing.JLabel lbl_ClaveUsu;
    private javax.swing.JLabel lbl_Color;
    private javax.swing.JLabel lbl_Marca;
    private javax.swing.JLabel lbl_Modelo;
    private javax.swing.JLabel lbl_Tarifa;
    private javax.swing.JLabel lbl_Tipo;
    private javax.swing.JTable tbl_Catalogo;
    private javax.swing.JTextField txt_Color;
    private javax.swing.JTextField txt_Marca;
    private javax.swing.JTextField txt_Modelo;
    private javax.swing.JTextField txt_Tipo;
    private javax.swing.JPasswordField txt_claveAdmin;
    private javax.swing.JPasswordField txt_claveUsuario;
    private javax.swing.JTextField txt_tarifa;
    // End of variables declaration//GEN-END:variables
}
