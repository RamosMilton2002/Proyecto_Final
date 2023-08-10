/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto_final;

import Estacion_Expres.Conec;
import Estacion_Expres.Menu;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;

/**
 *
 * @author USUARIO
 */
public class Disponibilidad extends javax.swing.JFrame {

    public static int puesto;
    public static String matricula;
    public int disponibilidad;

    public void CambiaeImagenCarros(JToggleButton toggleButton) {
        if (!toggleButton.isSelected()) {
            try {
                ImageIcon wallpaper = new ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\coche-removebg-preview.png");
                Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(toggleButton.getWidth(), toggleButton.getHeight(), Image.SCALE_DEFAULT));
                toggleButton.setIcon(icono);
                this.repaint();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                ImageIcon wallpaper = new ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\coche (1).png");
                Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(toggleButton.getWidth(), toggleButton.getHeight(), Image.SCALE_DEFAULT));
                toggleButton.setIcon(icono);
                this.repaint();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
     public void CambiaeImagenMotos(JToggleButton toggleButton) {
        if (!toggleButton.isSelected()) {
            try {
                ImageIcon wallpaper = new ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\bicicleta_verde-removebg-preview.png");
                Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(toggleButton.getWidth(), toggleButton.getHeight(), Image.SCALE_DEFAULT));
                toggleButton.setIcon(icono);
                this.repaint();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                ImageIcon wallpaper = new ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\bicicleta.png");
                Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(toggleButton.getWidth(), toggleButton.getHeight(), Image.SCALE_DEFAULT));
                toggleButton.setIcon(icono);
                this.repaint();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public void ActualizarImagenes (){
        CambiaeImagenCarros(tbtn_Puesto_1);
        CambiaeImagenCarros(tbtn_Puesto_2);
        CambiaeImagenCarros(tbtn_Puesto_3);
        CambiaeImagenCarros(tbtn_Puesto_4);
        CambiaeImagenCarros(tbtn_Puesto_5);
        CambiaeImagenCarros(tbtn_Puesto_6);
        CambiaeImagenCarros(tbtn_Puesto_7);
        CambiaeImagenCarros(tbtn_Puesto_8);
        CambiaeImagenCarros(tbtn_Puesto_9);
        CambiaeImagenCarros(tbtn_Puesto_10);
        CambiaeImagenCarros(tbtn_Puesto_11);
        CambiaeImagenCarros(tbtn_Puesto_12);
        CambiaeImagenCarros(tbtn_Puesto_13);
        CambiaeImagenCarros(tbtn_Puesto_14);
        CambiaeImagenCarros(tbtn_Puesto_15);
        CambiaeImagenMotos(tbtn_Puesto_16);
        CambiaeImagenMotos(tbtn_Puesto_17);
        CambiaeImagenMotos(tbtn_Puesto_18);
        CambiaeImagenMotos(tbtn_Puesto_19);
        CambiaeImagenMotos(tbtn_Puesto_20);
        CambiaeImagenMotos(tbtn_Puesto_21);
        CambiaeImagenMotos(tbtn_Puesto_22);
        CambiaeImagenMotos(tbtn_Puesto_23);
        CambiaeImagenMotos(tbtn_Puesto_24);
        CambiaeImagenMotos(tbtn_Puesto_25);
        CambiaeImagenMotos(tbtn_Puesto_26);
        CambiaeImagenMotos(tbtn_Puesto_27);
        CambiaeImagenMotos(tbtn_Puesto_28);
        CambiaeImagenMotos(tbtn_Puesto_29);
        CambiaeImagenMotos(tbtn_Puesto_30);
    }

    public void ActualizarToggles() {
        ObtenerValoresToggles(tbtn_Puesto_1, 1);
        ObtenerValoresToggles(tbtn_Puesto_2, 2);
        ObtenerValoresToggles(tbtn_Puesto_3, 3);
        ObtenerValoresToggles(tbtn_Puesto_4, 4);
        ObtenerValoresToggles(tbtn_Puesto_5, 5);
        ObtenerValoresToggles(tbtn_Puesto_6, 6);
        ObtenerValoresToggles(tbtn_Puesto_7, 7);
        ObtenerValoresToggles(tbtn_Puesto_8, 8);
        ObtenerValoresToggles(tbtn_Puesto_9, 9);
        ObtenerValoresToggles(tbtn_Puesto_10, 10);
        ObtenerValoresToggles(tbtn_Puesto_11, 11);
        ObtenerValoresToggles(tbtn_Puesto_12, 12);
        ObtenerValoresToggles(tbtn_Puesto_13, 13);
        ObtenerValoresToggles(tbtn_Puesto_14, 14);
        ObtenerValoresToggles(tbtn_Puesto_15, 15);
        ObtenerValoresToggles(tbtn_Puesto_16, 16);
        ObtenerValoresToggles(tbtn_Puesto_17, 17);
        ObtenerValoresToggles(tbtn_Puesto_18, 18);
        ObtenerValoresToggles(tbtn_Puesto_19, 19);
        ObtenerValoresToggles(tbtn_Puesto_20, 20);
        ObtenerValoresToggles(tbtn_Puesto_21, 21);
        ObtenerValoresToggles(tbtn_Puesto_22, 22);
        ObtenerValoresToggles(tbtn_Puesto_23, 23);
        ObtenerValoresToggles(tbtn_Puesto_24, 24);
        ObtenerValoresToggles(tbtn_Puesto_25, 25);
        ObtenerValoresToggles(tbtn_Puesto_26, 26);
        ObtenerValoresToggles(tbtn_Puesto_27, 27);
        ObtenerValoresToggles(tbtn_Puesto_28, 28);
        ObtenerValoresToggles(tbtn_Puesto_29, 29);
        ObtenerValoresToggles(tbtn_Puesto_30, 30);
    }

    public void ObtenerValoresToggles(JToggleButton toggleButton, int i) {
        try {
            String consulta = "SELECT Est_Disponibilidad FROM estacionamiento WHERE Est_id = " + i;
            Conec cn = new Conec();
            ResultSet res = cn.EjecutaSQL(consulta);
            if (res.next()) {
                toggleButton.setSelected(res.getBoolean(1));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Disponibilidad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ObtenerMatricula() {
        String consulta = "call sistema_parqueadero.BUSCARREG(" + puesto + ")";
        Conec cn = new Conec();
        try {
            ResultSet res = cn.EjecutaSQL(consulta);
            if (res.next()) {
                matricula = res.getString(2);
            } else {
                matricula = null;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Disponibilidad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Disponibilidad() {
        initComponents();
        ActualizarToggles();
        ObtenerMatricula();
        ActualizarImagenes();
        this.dispose();
        setLocationRelativeTo(null);
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
        tbtn_Puesto_1 = new javax.swing.JToggleButton();
        tbtn_Puesto_2 = new javax.swing.JToggleButton();
        tbtn_Puesto_3 = new javax.swing.JToggleButton();
        tbtn_Puesto_4 = new javax.swing.JToggleButton();
        tbtn_Puesto_5 = new javax.swing.JToggleButton();
        tbtn_Puesto_6 = new javax.swing.JToggleButton();
        tbtn_Puesto_7 = new javax.swing.JToggleButton();
        tbtn_Puesto_8 = new javax.swing.JToggleButton();
        tbtn_Puesto_9 = new javax.swing.JToggleButton();
        tbtn_Puesto_10 = new javax.swing.JToggleButton();
        tbtn_Puesto_11 = new javax.swing.JToggleButton();
        tbtn_Puesto_12 = new javax.swing.JToggleButton();
        tbtn_Puesto_13 = new javax.swing.JToggleButton();
        tbtn_Puesto_14 = new javax.swing.JToggleButton();
        tbtn_Puesto_15 = new javax.swing.JToggleButton();
        btn_Salir = new javax.swing.JButton();
        tbtn_Puesto_16 = new javax.swing.JToggleButton();
        tbtn_Puesto_17 = new javax.swing.JToggleButton();
        tbtn_Puesto_18 = new javax.swing.JToggleButton();
        tbtn_Puesto_19 = new javax.swing.JToggleButton();
        tbtn_Puesto_20 = new javax.swing.JToggleButton();
        tbtn_Puesto_21 = new javax.swing.JToggleButton();
        tbtn_Puesto_22 = new javax.swing.JToggleButton();
        tbtn_Puesto_23 = new javax.swing.JToggleButton();
        tbtn_Puesto_24 = new javax.swing.JToggleButton();
        tbtn_Puesto_25 = new javax.swing.JToggleButton();
        tbtn_Puesto_26 = new javax.swing.JToggleButton();
        tbtn_Puesto_27 = new javax.swing.JToggleButton();
        tbtn_Puesto_28 = new javax.swing.JToggleButton();
        tbtn_Puesto_29 = new javax.swing.JToggleButton();
        tbtn_Puesto_30 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        tbtn_Puesto_1.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        tbtn_Puesto_1.setForeground(new java.awt.Color(87, 87, 87));
        tbtn_Puesto_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\coche (2).png")); // NOI18N
        tbtn_Puesto_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_1ActionPerformed(evt);
            }
        });

        tbtn_Puesto_2.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        tbtn_Puesto_2.setForeground(new java.awt.Color(87, 87, 87));
        tbtn_Puesto_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\coche (2).png")); // NOI18N
        tbtn_Puesto_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_2ActionPerformed(evt);
            }
        });

        tbtn_Puesto_3.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        tbtn_Puesto_3.setForeground(new java.awt.Color(87, 87, 87));
        tbtn_Puesto_3.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\coche (2).png")); // NOI18N
        tbtn_Puesto_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_3ActionPerformed(evt);
            }
        });

        tbtn_Puesto_4.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        tbtn_Puesto_4.setForeground(new java.awt.Color(87, 87, 87));
        tbtn_Puesto_4.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\coche (2).png")); // NOI18N
        tbtn_Puesto_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_4ActionPerformed(evt);
            }
        });

        tbtn_Puesto_5.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        tbtn_Puesto_5.setForeground(new java.awt.Color(87, 87, 87));
        tbtn_Puesto_5.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\coche (2).png")); // NOI18N
        tbtn_Puesto_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_5ActionPerformed(evt);
            }
        });

        tbtn_Puesto_6.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        tbtn_Puesto_6.setForeground(new java.awt.Color(87, 87, 87));
        tbtn_Puesto_6.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\coche (2).png")); // NOI18N
        tbtn_Puesto_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_6ActionPerformed(evt);
            }
        });

        tbtn_Puesto_7.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        tbtn_Puesto_7.setForeground(new java.awt.Color(87, 87, 87));
        tbtn_Puesto_7.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\coche (2).png")); // NOI18N
        tbtn_Puesto_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_7ActionPerformed(evt);
            }
        });

        tbtn_Puesto_8.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        tbtn_Puesto_8.setForeground(new java.awt.Color(87, 87, 87));
        tbtn_Puesto_8.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\coche (2).png")); // NOI18N
        tbtn_Puesto_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_8ActionPerformed(evt);
            }
        });

        tbtn_Puesto_9.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        tbtn_Puesto_9.setForeground(new java.awt.Color(87, 87, 87));
        tbtn_Puesto_9.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\coche (2).png")); // NOI18N
        tbtn_Puesto_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_9ActionPerformed(evt);
            }
        });

        tbtn_Puesto_10.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        tbtn_Puesto_10.setForeground(new java.awt.Color(87, 87, 87));
        tbtn_Puesto_10.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\coche (2).png")); // NOI18N
        tbtn_Puesto_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_10ActionPerformed(evt);
            }
        });

        tbtn_Puesto_11.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        tbtn_Puesto_11.setForeground(new java.awt.Color(87, 87, 87));
        tbtn_Puesto_11.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\coche (2).png")); // NOI18N
        tbtn_Puesto_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_11ActionPerformed(evt);
            }
        });

        tbtn_Puesto_12.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        tbtn_Puesto_12.setForeground(new java.awt.Color(87, 87, 87));
        tbtn_Puesto_12.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\coche (2).png")); // NOI18N
        tbtn_Puesto_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_12ActionPerformed(evt);
            }
        });

        tbtn_Puesto_13.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        tbtn_Puesto_13.setForeground(new java.awt.Color(87, 87, 87));
        tbtn_Puesto_13.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\coche (2).png")); // NOI18N
        tbtn_Puesto_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_13ActionPerformed(evt);
            }
        });

        tbtn_Puesto_14.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        tbtn_Puesto_14.setForeground(new java.awt.Color(87, 87, 87));
        tbtn_Puesto_14.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\coche (2).png")); // NOI18N
        tbtn_Puesto_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_14ActionPerformed(evt);
            }
        });

        tbtn_Puesto_15.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        tbtn_Puesto_15.setForeground(new java.awt.Color(87, 87, 87));
        tbtn_Puesto_15.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\coche (2).png")); // NOI18N
        tbtn_Puesto_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_15ActionPerformed(evt);
            }
        });

        btn_Salir.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        btn_Salir.setForeground(new java.awt.Color(87, 87, 87));
        btn_Salir.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\flecha-izquierda (1).png")); // NOI18N
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        tbtn_Puesto_16.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        tbtn_Puesto_16.setForeground(new java.awt.Color(87, 87, 87));
        tbtn_Puesto_16.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\bicicleta verde (1).png")); // NOI18N
        tbtn_Puesto_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_16ActionPerformed(evt);
            }
        });

        tbtn_Puesto_17.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        tbtn_Puesto_17.setForeground(new java.awt.Color(87, 87, 87));
        tbtn_Puesto_17.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\bicicleta verde (1).png")); // NOI18N
        tbtn_Puesto_17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_17ActionPerformed(evt);
            }
        });

        tbtn_Puesto_18.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        tbtn_Puesto_18.setForeground(new java.awt.Color(87, 87, 87));
        tbtn_Puesto_18.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\bicicleta verde (1).png")); // NOI18N
        tbtn_Puesto_18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_18ActionPerformed(evt);
            }
        });

        tbtn_Puesto_19.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        tbtn_Puesto_19.setForeground(new java.awt.Color(87, 87, 87));
        tbtn_Puesto_19.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\bicicleta verde (1).png")); // NOI18N
        tbtn_Puesto_19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_19ActionPerformed(evt);
            }
        });

        tbtn_Puesto_20.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        tbtn_Puesto_20.setForeground(new java.awt.Color(87, 87, 87));
        tbtn_Puesto_20.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\bicicleta verde (1).png")); // NOI18N
        tbtn_Puesto_20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_20ActionPerformed(evt);
            }
        });

        tbtn_Puesto_21.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        tbtn_Puesto_21.setForeground(new java.awt.Color(87, 87, 87));
        tbtn_Puesto_21.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\bicicleta verde (1).png")); // NOI18N
        tbtn_Puesto_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_21ActionPerformed(evt);
            }
        });

        tbtn_Puesto_22.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        tbtn_Puesto_22.setForeground(new java.awt.Color(87, 87, 87));
        tbtn_Puesto_22.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\bicicleta verde (1).png")); // NOI18N
        tbtn_Puesto_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_22ActionPerformed(evt);
            }
        });

        tbtn_Puesto_23.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        tbtn_Puesto_23.setForeground(new java.awt.Color(87, 87, 87));
        tbtn_Puesto_23.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\bicicleta verde (1).png")); // NOI18N
        tbtn_Puesto_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_23ActionPerformed(evt);
            }
        });

        tbtn_Puesto_24.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        tbtn_Puesto_24.setForeground(new java.awt.Color(87, 87, 87));
        tbtn_Puesto_24.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\bicicleta verde (1).png")); // NOI18N
        tbtn_Puesto_24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_24ActionPerformed(evt);
            }
        });

        tbtn_Puesto_25.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        tbtn_Puesto_25.setForeground(new java.awt.Color(87, 87, 87));
        tbtn_Puesto_25.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\bicicleta verde (1).png")); // NOI18N
        tbtn_Puesto_25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_25ActionPerformed(evt);
            }
        });

        tbtn_Puesto_26.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        tbtn_Puesto_26.setForeground(new java.awt.Color(87, 87, 87));
        tbtn_Puesto_26.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\bicicleta verde (1).png")); // NOI18N
        tbtn_Puesto_26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_26ActionPerformed(evt);
            }
        });

        tbtn_Puesto_27.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        tbtn_Puesto_27.setForeground(new java.awt.Color(87, 87, 87));
        tbtn_Puesto_27.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\bicicleta verde (1).png")); // NOI18N
        tbtn_Puesto_27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_27ActionPerformed(evt);
            }
        });

        tbtn_Puesto_28.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        tbtn_Puesto_28.setForeground(new java.awt.Color(87, 87, 87));
        tbtn_Puesto_28.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\bicicleta verde (1).png")); // NOI18N
        tbtn_Puesto_28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_28ActionPerformed(evt);
            }
        });

        tbtn_Puesto_29.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        tbtn_Puesto_29.setForeground(new java.awt.Color(87, 87, 87));
        tbtn_Puesto_29.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\bicicleta verde (1).png")); // NOI18N
        tbtn_Puesto_29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_29ActionPerformed(evt);
            }
        });

        tbtn_Puesto_30.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        tbtn_Puesto_30.setForeground(new java.awt.Color(87, 87, 87));
        tbtn_Puesto_30.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\bicicleta verde (1).png")); // NOI18N
        tbtn_Puesto_30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_30ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\icons8-indoor-parking-96.png")); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\line_96368.png")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\line_96368.png")); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\line_96368.png")); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\line_96368.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tbtn_Puesto_26)
                    .addComponent(tbtn_Puesto_6)
                    .addComponent(tbtn_Puesto_11)
                    .addComponent(tbtn_Puesto_1)
                    .addComponent(tbtn_Puesto_16)
                    .addComponent(tbtn_Puesto_21))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbtn_Puesto_2)
                    .addComponent(tbtn_Puesto_7)
                    .addComponent(tbtn_Puesto_12)
                    .addComponent(tbtn_Puesto_17)
                    .addComponent(tbtn_Puesto_22)
                    .addComponent(tbtn_Puesto_27))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbtn_Puesto_8)
                            .addComponent(tbtn_Puesto_13)
                            .addComponent(tbtn_Puesto_3)
                            .addComponent(tbtn_Puesto_18)
                            .addComponent(tbtn_Puesto_23))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tbtn_Puesto_19)
                            .addComponent(tbtn_Puesto_24)
                            .addComponent(tbtn_Puesto_4)
                            .addComponent(tbtn_Puesto_9)
                            .addComponent(tbtn_Puesto_14)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tbtn_Puesto_28)
                        .addGap(52, 52, 52)
                        .addComponent(tbtn_Puesto_29)))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tbtn_Puesto_5)
                    .addComponent(tbtn_Puesto_10)
                    .addComponent(tbtn_Puesto_30)
                    .addComponent(tbtn_Puesto_25)
                    .addComponent(tbtn_Puesto_15)
                    .addComponent(tbtn_Puesto_20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 292, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btn_Salir)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(117, 117, 117))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(btn_Salir))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel3)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tbtn_Puesto_4)
                            .addComponent(tbtn_Puesto_3)
                            .addComponent(tbtn_Puesto_5)
                            .addComponent(tbtn_Puesto_2)
                            .addComponent(tbtn_Puesto_1))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tbtn_Puesto_10)
                                    .addComponent(tbtn_Puesto_9))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tbtn_Puesto_14)
                                    .addComponent(tbtn_Puesto_15)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tbtn_Puesto_6)
                                    .addComponent(tbtn_Puesto_8)
                                    .addComponent(tbtn_Puesto_7))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tbtn_Puesto_12, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(tbtn_Puesto_11, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tbtn_Puesto_13)))))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbtn_Puesto_16)
                            .addComponent(tbtn_Puesto_17)
                            .addComponent(tbtn_Puesto_18)
                            .addComponent(tbtn_Puesto_19)
                            .addComponent(tbtn_Puesto_20))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbtn_Puesto_25)
                            .addComponent(tbtn_Puesto_21)
                            .addComponent(tbtn_Puesto_22)
                            .addComponent(tbtn_Puesto_23)
                            .addComponent(tbtn_Puesto_24))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbtn_Puesto_26)
                            .addComponent(tbtn_Puesto_27)
                            .addComponent(tbtn_Puesto_28)
                            .addComponent(tbtn_Puesto_29)
                            .addComponent(tbtn_Puesto_30))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(56, 56, 56))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbtn_Puesto_30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_30ActionPerformed
        puesto = 30;
        if (tbtn_Puesto_30.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_30ActionPerformed

    private void tbtn_Puesto_29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_29ActionPerformed
        puesto = 29;
        if (tbtn_Puesto_29.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_29ActionPerformed

    private void tbtn_Puesto_28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_28ActionPerformed
        puesto = 28;
        if (tbtn_Puesto_28.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_28ActionPerformed

    private void tbtn_Puesto_27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_27ActionPerformed
        puesto = 27;
        if (tbtn_Puesto_27.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_27ActionPerformed

    private void tbtn_Puesto_26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_26ActionPerformed
        puesto = 26;
        if (tbtn_Puesto_26.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_26ActionPerformed

    private void tbtn_Puesto_25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_25ActionPerformed
        puesto = 25;
        if (tbtn_Puesto_25.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_25ActionPerformed

    private void tbtn_Puesto_24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_24ActionPerformed
        puesto = 24;
        if (tbtn_Puesto_24.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_24ActionPerformed

    private void tbtn_Puesto_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_23ActionPerformed
        puesto = 23;
        if (tbtn_Puesto_23.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_23ActionPerformed

    private void tbtn_Puesto_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_22ActionPerformed
        puesto = 22;
        if (tbtn_Puesto_22.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_22ActionPerformed

    private void tbtn_Puesto_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_21ActionPerformed
        puesto = 21;
        if (tbtn_Puesto_21.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_21ActionPerformed

    private void tbtn_Puesto_20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_20ActionPerformed
        puesto = 20;
        if (tbtn_Puesto_20.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_20ActionPerformed

    private void tbtn_Puesto_19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_19ActionPerformed
        puesto = 19;
        if (tbtn_Puesto_19.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_19ActionPerformed

    private void tbtn_Puesto_18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_18ActionPerformed
        puesto = 18;
        if (tbtn_Puesto_18.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_18ActionPerformed

    private void tbtn_Puesto_17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_17ActionPerformed
        puesto = 17;
        if (tbtn_Puesto_17.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_17ActionPerformed

    private void tbtn_Puesto_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_16ActionPerformed
        puesto = 16;
        if (tbtn_Puesto_16.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_16ActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void tbtn_Puesto_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_15ActionPerformed
        puesto = 15;
        if (tbtn_Puesto_15.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_15ActionPerformed

    private void tbtn_Puesto_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_14ActionPerformed
        puesto = 14;
        if (tbtn_Puesto_14.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_14ActionPerformed

    private void tbtn_Puesto_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_13ActionPerformed
        puesto = 13;
        if (tbtn_Puesto_13.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_13ActionPerformed

    private void tbtn_Puesto_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_12ActionPerformed
        puesto = 12;
        if (tbtn_Puesto_12.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_12ActionPerformed

    private void tbtn_Puesto_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_11ActionPerformed
        puesto = 11;
        if (tbtn_Puesto_11.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_11ActionPerformed

    private void tbtn_Puesto_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_10ActionPerformed
        puesto = 10;
        if (tbtn_Puesto_10.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_10ActionPerformed

    private void tbtn_Puesto_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_9ActionPerformed
        puesto = 9;
        if (tbtn_Puesto_9.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_9ActionPerformed

    private void tbtn_Puesto_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_8ActionPerformed
        puesto = 8;
        if (tbtn_Puesto_8.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_8ActionPerformed

    private void tbtn_Puesto_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_7ActionPerformed
        puesto = 7;
        if (tbtn_Puesto_7.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_7ActionPerformed

    private void tbtn_Puesto_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_6ActionPerformed
        puesto = 6;
        if (tbtn_Puesto_6.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_6ActionPerformed

    private void tbtn_Puesto_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_5ActionPerformed
        puesto = 5;
        if (tbtn_Puesto_5.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_5ActionPerformed

    private void tbtn_Puesto_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_4ActionPerformed
        puesto = 4;
        if (tbtn_Puesto_4.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_4ActionPerformed

    private void tbtn_Puesto_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_3ActionPerformed
        puesto = 3;
        if (tbtn_Puesto_3.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_3ActionPerformed

    private void tbtn_Puesto_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_2ActionPerformed
        puesto = 2;
        if (tbtn_Puesto_2.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_2ActionPerformed

    private void tbtn_Puesto_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_1ActionPerformed
        puesto = 1;
        if (tbtn_Puesto_1.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_tbtn_Puesto_1ActionPerformed

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
            java.util.logging.Logger.getLogger(Disponibilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Disponibilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Disponibilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Disponibilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Disponibilidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton tbtn_Puesto_1;
    private javax.swing.JToggleButton tbtn_Puesto_10;
    private javax.swing.JToggleButton tbtn_Puesto_11;
    private javax.swing.JToggleButton tbtn_Puesto_12;
    private javax.swing.JToggleButton tbtn_Puesto_13;
    private javax.swing.JToggleButton tbtn_Puesto_14;
    private javax.swing.JToggleButton tbtn_Puesto_15;
    private javax.swing.JToggleButton tbtn_Puesto_16;
    private javax.swing.JToggleButton tbtn_Puesto_17;
    private javax.swing.JToggleButton tbtn_Puesto_18;
    private javax.swing.JToggleButton tbtn_Puesto_19;
    private javax.swing.JToggleButton tbtn_Puesto_2;
    private javax.swing.JToggleButton tbtn_Puesto_20;
    private javax.swing.JToggleButton tbtn_Puesto_21;
    private javax.swing.JToggleButton tbtn_Puesto_22;
    private javax.swing.JToggleButton tbtn_Puesto_23;
    private javax.swing.JToggleButton tbtn_Puesto_24;
    private javax.swing.JToggleButton tbtn_Puesto_25;
    private javax.swing.JToggleButton tbtn_Puesto_26;
    private javax.swing.JToggleButton tbtn_Puesto_27;
    private javax.swing.JToggleButton tbtn_Puesto_28;
    private javax.swing.JToggleButton tbtn_Puesto_29;
    private javax.swing.JToggleButton tbtn_Puesto_3;
    private javax.swing.JToggleButton tbtn_Puesto_30;
    private javax.swing.JToggleButton tbtn_Puesto_4;
    private javax.swing.JToggleButton tbtn_Puesto_5;
    private javax.swing.JToggleButton tbtn_Puesto_6;
    private javax.swing.JToggleButton tbtn_Puesto_7;
    private javax.swing.JToggleButton tbtn_Puesto_8;
    private javax.swing.JToggleButton tbtn_Puesto_9;
    // End of variables declaration//GEN-END:variables

}
