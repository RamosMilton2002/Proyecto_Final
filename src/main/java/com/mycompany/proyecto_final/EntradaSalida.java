/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto_final;

import Estacion_Expres.Conec;
import Estacion_Expres.Vehiculo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class EntradaSalida extends javax.swing.JFrame {

    public int disponibilidad;

    public void VerDisponibilidad() {
        Disponibilidad dn = new Disponibilidad();
        String consulta = "call sistema_parqueadero.VerDisponibles('" + txt_matricula.getText() + "')";
        Conec cn = new Conec();
        try {
            ResultSet res = cn.EjecutaSQL(consulta);
            if (res.next()) {
                disponibilidad = res.getInt(3);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EntradaSalida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Hora() {
        String Consulta = "select date(now()), time(now())";
        Conec cn = new Conec();

        try {
            ResultSet res = cn.EjecutaSQL(Consulta);
            while (res.next()) {
                lbl_Fecha.setText(res.getString(1));
                lbl_hora.setText(res.getString(2));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EntradaSalida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void BuscarVehiculo() {
        String Consulta = "call sistema_parqueadero.BUSCARVEHI('" + txt_matricula.getText() + "')";
        Conec cn = new Conec();
        try {
            ResultSet res = cn.EjecutaSQL(Consulta);
            if (res.next()) {
                lbl_Marca.setText("Marca: " + res.getString("Veh_Marca"));
                lbl_Modelo.setText("Modelo: " + res.getString("Veh_Modelo"));
                lbl_Color.setText("Color: " + res.getString("Veh_Color"));
                lbl_Tipo.setText("Tipo: " + res.getString("Veh_Tipo"));
                txt_observaciones.setVisible(true);
                btn_RegistrarHora.setVisible(true);
                lbl_Observaciones.setVisible(true);
            } else {
                int opcion = JOptionPane.showConfirmDialog(null, "Desea Registrar un nuevo vehiculo?", "Registrar", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    Vehiculo vh = new Vehiculo();
                    vh.setVisible(true);
                } else if (opcion == JOptionPane.NO_OPTION) {
                    System.out.println("El usuario eligió 'No'");
                }
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EntradaSalida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public EntradaSalida() {
        initComponents();
        Hora();
        txt_observaciones.setVisible(false);
        btn_RegistrarHora.setVisible(false);
        lbl_Observaciones.setVisible(false);
        Disponibilidad dn = new Disponibilidad();
        txt_matricula.setText(dn.matricula);
        if (!txt_matricula.getText().isEmpty()) {
            BuscarVehiculo();
            txt_matricula.setEditable(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_matricula = new javax.swing.JTextField();
        lbl_Matricula = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        btn_RegistrarHora = new javax.swing.JButton();
        lbl_Modelo = new javax.swing.JLabel();
        lbl_Marca = new javax.swing.JLabel();
        lbl_Color = new javax.swing.JLabel();
        lbl_Tipo = new javax.swing.JLabel();
        lbl_hora = new javax.swing.JLabel();
        txt_observaciones = new javax.swing.JTextField();
        lbl_Fecha = new javax.swing.JLabel();
        lbl_Observaciones = new javax.swing.JLabel();

        txt_matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_matriculaActionPerformed(evt);
            }
        });

        lbl_Matricula.setText("Matricula");

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_RegistrarHora.setText("Registrar");
        btn_RegistrarHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarHoraActionPerformed(evt);
            }
        });

        lbl_Modelo.setText("Modelo: ");

        lbl_Marca.setText("Marca: ");

        lbl_Color.setText("Color: ");

        lbl_Tipo.setText("Tipo: ");

        lbl_hora.setText("Hora");

        lbl_Fecha.setText("Fecha");

        lbl_Observaciones.setText("Observaciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Observaciones)
                    .addComponent(lbl_Matricula))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_matricula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Marca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Modelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Color, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_observaciones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_Fecha)
                            .addComponent(lbl_hora)
                            .addComponent(btn_RegistrarHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_buscar)
                            .addComponent(lbl_Matricula))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_Marca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_Modelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_Color)
                        .addGap(2, 2, 2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Fecha)
                        .addGap(31, 31, 31)
                        .addComponent(lbl_hora)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Tipo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Observaciones)
                    .addComponent(btn_RegistrarHora))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        VerDisponibilidad();
        if (disponibilidad == 1) {
            JOptionPane.showMessageDialog(rootPane, "El vehiculo ya esta en un puesto");
            txt_matricula.setText(null);
        } else {
            BuscarVehiculo();
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_RegistrarHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarHoraActionPerformed
        Disponibilidad dn = new Disponibilidad();
        int puesto = Disponibilidad.puesto;
        String Consulta = "call sistema_parqueadero.Registros('" + txt_matricula.getText() + "', " + puesto + ", '" + txt_observaciones.getText() + "')";
        Conec cn = new Conec();
        try {
            ResultSet res = cn.EjecutaSQL(Consulta);
            while (res.next()) {
                if (res.getInt(1) == 1) {
                    JOptionPane.showMessageDialog(rootPane, "Salida Registrada exitosamente");
                } else if (res.getInt(1) == 2) {
                    JOptionPane.showMessageDialog(rootPane, "Entrada Registrada exitosamente");
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EntradaSalida.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        dn.ActualizarToggles();
    }//GEN-LAST:event_btn_RegistrarHoraActionPerformed

    private void txt_matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_matriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_matriculaActionPerformed

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
            java.util.logging.Logger.getLogger(EntradaSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntradaSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntradaSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntradaSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntradaSalida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_RegistrarHora;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JLabel lbl_Color;
    private javax.swing.JLabel lbl_Fecha;
    private javax.swing.JLabel lbl_Marca;
    private javax.swing.JLabel lbl_Matricula;
    private javax.swing.JLabel lbl_Modelo;
    private javax.swing.JLabel lbl_Observaciones;
    private javax.swing.JLabel lbl_Tipo;
    private javax.swing.JLabel lbl_hora;
    private javax.swing.JTextField txt_matricula;
    private javax.swing.JTextField txt_observaciones;
    // End of variables declaration//GEN-END:variables
}
