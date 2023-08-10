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

    public void ActualizarTarifa(double tarifa){
        Conec cn = new Conec();
        String Consulta = "update registros set Reg_coste = " + tarifa + " where veh_matricula = '" + txt_matricula.getText() + "' and Reg_coste is null";
        try {
            cn.EjecutaInstruccion(Consulta);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EntradaSalida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public double Tarifa (){
        double tarifa = 0;
        Conec cn = new Conec();
        String Consulta = "select sistema_parqueadero.CalcularTarifa('"+txt_matricula.getText()+"')";
        try {
            ResultSet res = cn.EjecutaSQL(Consulta);
            if (res.next()){
                tarifa = res.getDouble(1);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EntradaSalida.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tarifa;
    }
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

    public String Hora() {
        String Consulta = "select time(now())";
        Conec cn = new Conec();
        String hora = null;
        try {
            ResultSet res = cn.EjecutaSQL(Consulta);
            if (res.next()) {
                hora = res.getString(1);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EntradaSalida.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hora;
    }
    
    public String Fecha() {
        String Consulta = "SELECT DATE_FORMAT(now(), '%d de %M del %Y');";
        Conec cn = new Conec();
        String fecha = null;
        try {
            ResultSet res = cn.EjecutaSQL(Consulta);
            if (res.next()) {
                fecha = res.getString(1);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EntradaSalida.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fecha;
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
        lbl_Fecha.setText( Fecha());
        txt_observaciones.setVisible(false);
        btn_RegistrarHora.setVisible(false);
        lbl_Observaciones.setVisible(false);
        Disponibilidad dn = new Disponibilidad();
        setLocationRelativeTo(null);
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

        jPanel1 = new javax.swing.JPanel();
        txt_matricula = new javax.swing.JTextField();
        lbl_Matricula = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        btn_RegistrarHora = new javax.swing.JButton();
        lbl_Modelo = new javax.swing.JLabel();
        lbl_Marca = new javax.swing.JLabel();
        lbl_Color = new javax.swing.JLabel();
        lbl_Tipo = new javax.swing.JLabel();
        txt_observaciones = new javax.swing.JTextField();
        lbl_Fecha = new javax.swing.JLabel();
        lbl_Observaciones = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_Salir = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        txt_matricula.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        txt_matricula.setForeground(new java.awt.Color(87, 87, 87));

        lbl_Matricula.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        lbl_Matricula.setForeground(new java.awt.Color(87, 87, 87));
        lbl_Matricula.setText("Matricula");

        btn_buscar.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(87, 87, 87));
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_RegistrarHora.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        btn_RegistrarHora.setForeground(new java.awt.Color(87, 87, 87));
        btn_RegistrarHora.setText("Registrar");
        btn_RegistrarHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarHoraActionPerformed(evt);
            }
        });

        lbl_Modelo.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        lbl_Modelo.setForeground(new java.awt.Color(87, 87, 87));
        lbl_Modelo.setText("Modelo: ");

        lbl_Marca.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        lbl_Marca.setForeground(new java.awt.Color(87, 87, 87));
        lbl_Marca.setText("Marca: ");

        lbl_Color.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        lbl_Color.setForeground(new java.awt.Color(87, 87, 87));
        lbl_Color.setText("Color: ");

        lbl_Tipo.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        lbl_Tipo.setForeground(new java.awt.Color(87, 87, 87));
        lbl_Tipo.setText("Tipo: ");

        txt_observaciones.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        txt_observaciones.setForeground(new java.awt.Color(87, 87, 87));

        lbl_Fecha.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        lbl_Fecha.setForeground(new java.awt.Color(87, 87, 87));
        lbl_Fecha.setText("Fecha");

        lbl_Observaciones.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        lbl_Observaciones.setForeground(new java.awt.Color(87, 87, 87));
        lbl_Observaciones.setText("Observaciones");

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(87, 87, 87));
        jLabel1.setText("Registrar");

        btn_Salir.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\flecha-izquierda (1).png")); // NOI18N
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txt_matricula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl_Modelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl_Color, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_observaciones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btn_RegistrarHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_Salir)
                                        .addGap(14, 14, 14))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Observaciones)
                            .addComponent(lbl_Matricula)
                            .addComponent(lbl_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(273, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Salir, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Fecha)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar)
                    .addComponent(lbl_Matricula))
                .addGap(18, 18, 18)
                .addComponent(lbl_Tipo)
                .addGap(13, 13, 13)
                .addComponent(lbl_Marca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Modelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Color)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Observaciones)
                    .addComponent(btn_RegistrarHora))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        VerDisponibilidad();
        if (disponibilidad == 1) {
            JOptionPane.showMessageDialog(rootPane, "El vehiculo ya esta en un puesto");
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
            String hora = Hora();
            while (res.next()) {
                if (res.getInt(1) == 1) {    
                    double tarifa = Tarifa();
                    ActualizarTarifa(tarifa);
                    JOptionPane.showMessageDialog(rootPane, "Salida Registrada exitosamente \n Hora de Salida: " + hora + "\n Su Tarifa es: " + tarifa + " $");
                    
                } else if (res.getInt(1) == 2) {
                    JOptionPane.showMessageDialog(rootPane, "Entrada Registrada exitosamente \n Hora de Ingreso: "+ hora);
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EntradaSalida.class.getName()).log(Level.SEVERE, null, ex);
        }
        dn.ActualizarToggles();
        dn.ActualizarImagenes();
        dn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_RegistrarHoraActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        Disponibilidad dn = new Disponibilidad();
        dn.ActualizarToggles();
        dn.ActualizarImagenes();
        dn.setVisible(true);
        this.dispose();
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
    private javax.swing.JButton btn_Salir;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_Color;
    private javax.swing.JLabel lbl_Fecha;
    private javax.swing.JLabel lbl_Marca;
    private javax.swing.JLabel lbl_Matricula;
    private javax.swing.JLabel lbl_Modelo;
    private javax.swing.JLabel lbl_Observaciones;
    private javax.swing.JLabel lbl_Tipo;
    private javax.swing.JTextField txt_matricula;
    private javax.swing.JTextField txt_observaciones;
    // End of variables declaration//GEN-END:variables
}
