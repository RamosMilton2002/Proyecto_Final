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

    int x = 4;
    int m = 0;
    String nombre = "Colores";

    public void obtenerTarifa() {
        String Consulta = "Select * from catalogo where cat_id = 3";
        Conec cn = new Conec();
        try {
            ResultSet res = cn.EjecutaSQL(Consulta);
            if (res.next()) {
                Spn_Tarifa.setValue(res.getDouble(2));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cambiarTarifa() {
        String Consulta = "update catalogo set Cat_nombre = " + Spn_Tarifa.getValue() + " where cat_id = 3";
        Conec cn = new Conec();
        try {
            cn.EjecutaInstruccion(Consulta);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void AgregarColor() {
        String Consulta = "call sistema_parqueadero.InsertCatalogo('" + txt_Color.getText() + "',4)";
        Conec cn = new Conec();
        try {
            cn.EjecutaSQL(Consulta);
            JOptionPane.showMessageDialog(rootPane, "Ingreso de Color correcto");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AgregarTipo() {
        String Consulta = "call sistema_parqueadero.InsertCatalogo('" + txt_Tipo.getText() + "',1)";
        Conec cn = new Conec();
        try {
            cn.EjecutaSQL(Consulta);
            JOptionPane.showMessageDialog(rootPane, "Ingreso de Tipo correcto");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AgregarMarca() {
        Conec cn = new Conec();
        String Consulta = "call sistema_parqueadero.InsertCatalogo('" + txt_Marca.getText() + "', " + x + ")";
        try {
            cn.EjecutaSQL(Consulta);
            JOptionPane.showMessageDialog(rootPane, "Ingreso de Marca correcto");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AgregarModelo() {
        Conec cn = new Conec();
        String Consulta = "call sistema_parqueadero.InsertCatalogo('" + txt_Modelo.getText() + "', " + x + ")";
        try {
            cn.EjecutaSQL(Consulta);
            JOptionPane.showMessageDialog(rootPane, "Ingreso de Modelo correcto");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void LlenarDatos() {
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

    public void ObtenerDatos() {
        Conec cn = new Conec();
        String Consulta = "Select * from catalogo where cat_padre = 2";
        try {
            ResultSet res = cn.EjecutaSQL(Consulta);
            if (res.next()) {
                txt_claveUsuario.setText(res.getString(2));
            }
            while (res.next()) {
                txt_claveAdmin.setText(res.getString(2));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void CambiarClave() {
        Conec cn = new Conec();
        String Consulta = "call sistema_parqueadero.actualizarClaves('" + txt_claveUsuario.getText() + "', '" + txt_claveAdmin.getText() + "')";
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
        obtenerTarifa();
        txt_Marca.setEnabled(false);
        txt_Modelo.setEnabled(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_ClaveUsu = new javax.swing.JLabel();
        lbl_ClaveAdmin = new javax.swing.JLabel();
        lbl_Tarifa = new javax.swing.JLabel();
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
        Spn_Tarifa = new javax.swing.JSpinner();
        lbl_Dolar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_Agregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        lbl_ClaveUsu.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        lbl_ClaveUsu.setForeground(new java.awt.Color(87, 87, 87));
        lbl_ClaveUsu.setText("Clave Usuario");

        lbl_ClaveAdmin.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        lbl_ClaveAdmin.setForeground(new java.awt.Color(87, 87, 87));
        lbl_ClaveAdmin.setText("Clave Admin");

        lbl_Tarifa.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        lbl_Tarifa.setForeground(new java.awt.Color(87, 87, 87));
        lbl_Tarifa.setText("Tarifa x hora");

        lbl_Tipo.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        lbl_Tipo.setForeground(new java.awt.Color(87, 87, 87));
        lbl_Tipo.setText("Tipo");

        txt_Tipo.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
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

        lbl_Marca.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        lbl_Marca.setForeground(new java.awt.Color(87, 87, 87));
        lbl_Marca.setText("Marca");

        txt_Marca.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
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

        lbl_Modelo.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        lbl_Modelo.setForeground(new java.awt.Color(87, 87, 87));
        lbl_Modelo.setText("Modelo");

        txt_Modelo.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        txt_Modelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_ModeloMouseClicked(evt);
            }
        });

        lbl_Color.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        lbl_Color.setForeground(new java.awt.Color(87, 87, 87));
        lbl_Color.setText("Color");

        txt_Color.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        txt_Color.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_ColorMouseClicked(evt);
            }
        });

        btn_Cambiar.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        btn_Cambiar.setForeground(new java.awt.Color(87, 87, 87));
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

        btn_Salir.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        btn_Salir.setForeground(new java.awt.Color(87, 87, 87));
        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        txt_claveUsuario.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N

        txt_claveAdmin.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N

        tbl_Catalogo.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
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

        Spn_Tarifa.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        Spn_Tarifa.setModel(new javax.swing.SpinnerNumberModel(0.5d, 0.0d, 100.0d, 0.05d));
        Spn_Tarifa.setToolTipText("");

        lbl_Dolar.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        lbl_Dolar.setForeground(new java.awt.Color(87, 87, 87));
        lbl_Dolar.setText("$");

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(87, 87, 87));
        jLabel1.setText("Menu Admin");

        btn_Agregar.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        btn_Agregar.setForeground(new java.awt.Color(87, 87, 87));
        btn_Agregar.setText("Agregar");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(229, 229, 229))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(btn_Agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Cambiar)
                .addGap(22, 22, 22)
                .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Tipo)
                    .addComponent(lbl_Marca)
                    .addComponent(lbl_Modelo)
                    .addComponent(lbl_Color))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_Tipo)
                    .addComponent(txt_Marca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_Modelo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_Color, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_ClaveUsu)
                    .addComponent(lbl_ClaveAdmin)
                    .addComponent(lbl_Tarifa))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_claveUsuario)
                    .addComponent(txt_claveAdmin, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Spn_Tarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Chbox_ClaveUsu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Chbox_ClaveAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Dolar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Color))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Tipo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Marca))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Modelo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Chbox_ClaveUsu)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_ClaveUsu)
                                .addComponent(txt_claveUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_ClaveAdmin)
                                .addComponent(txt_claveAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Chbox_ClaveAdmin))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Tarifa)
                            .addComponent(Spn_Tarifa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Dolar))))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Agregar)
                    .addComponent(btn_Cambiar)
                    .addComponent(btn_Salir))
                .addGap(142, 142, 142))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CambiarActionPerformed
        try {
            CambiarClave();
            cambiarTarifa();
            JOptionPane.showMessageDialog(rootPane, "Cambios aplicados correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Hubo un error al aplicar los cambios");
        }


    }//GEN-LAST:event_btn_CambiarActionPerformed

    private void Chbox_ClaveAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Chbox_ClaveAdminActionPerformed
        if (Chbox_ClaveAdmin.isSelected()) {
            txt_claveAdmin.setRequestFocusEnabled(false);
            txt_claveAdmin.setEchoChar('*');
        } else {
            txt_claveAdmin.setRequestFocusEnabled(true);
            txt_claveAdmin.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_Chbox_ClaveAdminActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void Chbox_ClaveUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Chbox_ClaveUsuActionPerformed
        if (Chbox_ClaveUsu.isSelected()) {
            txt_claveUsuario.setRequestFocusEnabled(false);
            txt_claveUsuario.setEchoChar('*');
        } else {
            txt_claveUsuario.setRequestFocusEnabled(true);
            txt_claveUsuario.setEchoChar((char) 0);
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
        if (x == 4) {
            txt_Color.setText(tbl_Catalogo.getValueAt(tbl_Catalogo.getSelectedRow(), 0).toString());
        } else if (x == 1) {
            txt_Tipo.setText(tbl_Catalogo.getValueAt(tbl_Catalogo.getSelectedRow(), 0).toString());
            txt_Marca.setText(null);
            txt_Marca.setEnabled(true);
            txt_Modelo.setText(null);
            txt_Modelo.setEnabled(false);
        } else if (x == m) {
            txt_Marca.setText(tbl_Catalogo.getValueAt(tbl_Catalogo.getSelectedRow(), 0).toString());
            txt_Modelo.setEnabled(true);
        }
    }//GEN-LAST:event_tbl_CatalogoMouseClicked

    private void txt_MarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_MarcaMouseClicked
        String Consulta = "Select * from catalogo where cat_nombre = '" + txt_Tipo.getText() + "'";
        Conec cn = new Conec();
        try {
            ResultSet res = cn.EjecutaSQL(Consulta);
            if (res.next()) {
                x = res.getInt(1);
                m = x;
                nombre = "Tipo: " + txt_Tipo.getText();
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        LlenarDatos();
    }//GEN-LAST:event_txt_MarcaMouseClicked

    private void txt_ModeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_ModeloMouseClicked
        String Consulta = "Select * from catalogo where cat_nombre = '" + txt_Marca.getText() + "'";
        Conec cn = new Conec();
        try {
            ResultSet res = cn.EjecutaSQL(Consulta);
            if (res.next()) {
                x = res.getInt(1);
                nombre = "Marca: " + txt_Marca.getText();
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        LlenarDatos();
    }//GEN-LAST:event_txt_ModeloMouseClicked

    private void txt_TipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TipoKeyTyped
        if (txt_Tipo.getText().isEmpty()) {
            txt_Marca.setEnabled(false);
        } else {
            txt_Marca.setEnabled(true);
        }
    }//GEN-LAST:event_txt_TipoKeyTyped

    private void txt_MarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_MarcaKeyTyped
        if (txt_Marca.getText().isEmpty()) {
            txt_Modelo.setEnabled(false);
        } else {
            txt_Modelo.setEnabled(true);
        }
    }//GEN-LAST:event_txt_MarcaKeyTyped

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        try {
            if (!txt_Color.getText().isEmpty()) {
                AgregarColor();
            }
            if (!txt_Modelo.getText().isEmpty()) {
                AgregarModelo();
            } else if (!txt_Marca.getText().isEmpty()) {
                AgregarMarca();
            } else if (!txt_Tipo.getText().isEmpty()) {
                AgregarTipo();
            }
            JOptionPane.showMessageDialog(rootPane, "Se ingreso Correctamente");
        } catch (Exception e) {
            System.out.println("Hubo en error al ingresar");
        }
        LlenarDatos();
    }//GEN-LAST:event_btn_AgregarActionPerformed

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
    private javax.swing.JSpinner Spn_Tarifa;
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Cambiar;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_ClaveAdmin;
    private javax.swing.JLabel lbl_ClaveUsu;
    private javax.swing.JLabel lbl_Color;
    private javax.swing.JLabel lbl_Dolar;
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
    // End of variables declaration//GEN-END:variables
}
