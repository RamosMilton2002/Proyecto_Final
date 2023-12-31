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
import javax.swing.JToggleButton;

/**
 *
 * @author USUARIO
 */
public class Disponibilidad extends javax.swing.JFrame {

    public static int puesto;
    public static String matricula;
    public int disponibilidad;

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
                System.out.println(matricula);
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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbtn_Puesto_1.setText("Disponible");
        tbtn_Puesto_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_1ActionPerformed(evt);
            }
        });

        tbtn_Puesto_2.setText("Disponible");
        tbtn_Puesto_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_2ActionPerformed(evt);
            }
        });

        tbtn_Puesto_3.setText("Disponible");
        tbtn_Puesto_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_3ActionPerformed(evt);
            }
        });

        tbtn_Puesto_4.setText("Disponible");
        tbtn_Puesto_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_4ActionPerformed(evt);
            }
        });

        tbtn_Puesto_5.setText("Disponible");
        tbtn_Puesto_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_5ActionPerformed(evt);
            }
        });

        tbtn_Puesto_6.setText("Disponible");
        tbtn_Puesto_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_6ActionPerformed(evt);
            }
        });

        tbtn_Puesto_7.setText("Disponible");
        tbtn_Puesto_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_7ActionPerformed(evt);
            }
        });

        tbtn_Puesto_8.setText("Disponible");
        tbtn_Puesto_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_8ActionPerformed(evt);
            }
        });

        tbtn_Puesto_9.setText("Disponible");
        tbtn_Puesto_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_9ActionPerformed(evt);
            }
        });

        tbtn_Puesto_10.setText("Disponible");
        tbtn_Puesto_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_10ActionPerformed(evt);
            }
        });

        tbtn_Puesto_11.setText("Disponible");
        tbtn_Puesto_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_11ActionPerformed(evt);
            }
        });

        tbtn_Puesto_12.setText("Disponible");
        tbtn_Puesto_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_12ActionPerformed(evt);
            }
        });

        tbtn_Puesto_13.setText("Disponible");
        tbtn_Puesto_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_13ActionPerformed(evt);
            }
        });

        tbtn_Puesto_14.setText("Disponible");
        tbtn_Puesto_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_14ActionPerformed(evt);
            }
        });

        tbtn_Puesto_15.setText("Disponible");
        tbtn_Puesto_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_Puesto_15ActionPerformed(evt);
            }
        });

        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tbtn_Puesto_6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tbtn_Puesto_7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tbtn_Puesto_8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tbtn_Puesto_9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tbtn_Puesto_10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tbtn_Puesto_11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tbtn_Puesto_12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tbtn_Puesto_13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tbtn_Puesto_14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tbtn_Puesto_15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(132, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tbtn_Puesto_1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tbtn_Puesto_2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tbtn_Puesto_3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tbtn_Puesto_4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tbtn_Puesto_5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Salir)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbtn_Puesto_1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtn_Puesto_2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtn_Puesto_3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtn_Puesto_4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtn_Puesto_5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Salir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbtn_Puesto_7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtn_Puesto_8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtn_Puesto_9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtn_Puesto_10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtn_Puesto_6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tbtn_Puesto_11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tbtn_Puesto_12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tbtn_Puesto_13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tbtn_Puesto_14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tbtn_Puesto_15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbtn_Puesto_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_1ActionPerformed
        puesto = 1;
        if (tbtn_Puesto_1.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_1ActionPerformed

    private void tbtn_Puesto_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_2ActionPerformed
        puesto = 2;
        if (tbtn_Puesto_2.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_2ActionPerformed

    private void tbtn_Puesto_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_3ActionPerformed
        puesto = 3;
        if (tbtn_Puesto_3.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_3ActionPerformed

    private void tbtn_Puesto_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_4ActionPerformed
        puesto = 4;
        if (tbtn_Puesto_4.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_4ActionPerformed

    private void tbtn_Puesto_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_5ActionPerformed
        puesto = 5;
        if (tbtn_Puesto_5.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_5ActionPerformed

    private void tbtn_Puesto_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_6ActionPerformed
        puesto = 6;
        if (tbtn_Puesto_6.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_6ActionPerformed

    private void tbtn_Puesto_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_7ActionPerformed
        puesto = 7;
        if (tbtn_Puesto_7.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_7ActionPerformed

    private void tbtn_Puesto_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_8ActionPerformed
        puesto = 8;
        if (tbtn_Puesto_8.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_8ActionPerformed

    private void tbtn_Puesto_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_9ActionPerformed
        puesto = 9;
        if (tbtn_Puesto_9.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_9ActionPerformed

    private void tbtn_Puesto_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_10ActionPerformed
        puesto = 10;
        if (tbtn_Puesto_10.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_10ActionPerformed

    private void tbtn_Puesto_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_11ActionPerformed
        puesto = 11;
        if (tbtn_Puesto_11.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_11ActionPerformed

    private void tbtn_Puesto_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_12ActionPerformed
        puesto = 12;
        if (tbtn_Puesto_11.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_12ActionPerformed

    private void tbtn_Puesto_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_13ActionPerformed
        puesto = 13;
        if (tbtn_Puesto_13.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_13ActionPerformed

    private void tbtn_Puesto_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_14ActionPerformed
        puesto = 14;
        if (tbtn_Puesto_14.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_14ActionPerformed

    private void tbtn_Puesto_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_Puesto_15ActionPerformed
        puesto = 15;
        if (tbtn_Puesto_15.isSelected()) {
            ObtenerMatricula();
        }
        EntradaSalida es = new EntradaSalida();
        es.setVisible(true);
    }//GEN-LAST:event_tbtn_Puesto_15ActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_SalirActionPerformed

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
    private javax.swing.JToggleButton tbtn_Puesto_1;
    private javax.swing.JToggleButton tbtn_Puesto_10;
    private javax.swing.JToggleButton tbtn_Puesto_11;
    private javax.swing.JToggleButton tbtn_Puesto_12;
    private javax.swing.JToggleButton tbtn_Puesto_13;
    private javax.swing.JToggleButton tbtn_Puesto_14;
    private javax.swing.JToggleButton tbtn_Puesto_15;
    private javax.swing.JToggleButton tbtn_Puesto_2;
    private javax.swing.JToggleButton tbtn_Puesto_3;
    private javax.swing.JToggleButton tbtn_Puesto_4;
    private javax.swing.JToggleButton tbtn_Puesto_5;
    private javax.swing.JToggleButton tbtn_Puesto_6;
    private javax.swing.JToggleButton tbtn_Puesto_7;
    private javax.swing.JToggleButton tbtn_Puesto_8;
    private javax.swing.JToggleButton tbtn_Puesto_9;
    // End of variables declaration//GEN-END:variables

}
