/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estacion_Expres;


import Modelo.Login;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;




/**
 *
 * @author MSI-THIN
 */
public class Login_Con{
    
   
    
    public void Login_Conn(Login log){
     Conexion c1 = new Conexion();
     
     String user = log.getUsuario();
        String pass = log.getClave();
        String consulta = "call sistema_parqueadero.Validacion_Credenciales( '"+user+"', '"+pass+"' )";
        System.out.println(consulta);
        Conec cn = new Conec();
        

        try {
            ResultSet res = cn.EjecutaSQL(consulta);

            if (res.next()) {
                if (user.isBlank() || pass.isBlank()) {
                    JOptionPane.showMessageDialog(null, "Tiene campos en blanco", "Error", JOptionPane.ERROR_MESSAGE);

                } else {
//                    Principal ad = new Principal();
//                    ad.setVisible(true);
//                    this.dispose();
//                 
                    System.out.println("Se conecto correctamente a la bdd");

                    LocalDateTime horaIngreso = LocalDateTime.now();
                    System.out.println("Hora de ingreso: " + horaIngreso);

                    String registro = "Usuario: " + user + ", Hora de ingreso: " + horaIngreso;
                    guardarRegistro(registro);

                }

            } else {
                JOptionPane.showMessageDialog(null, "Usuario incorrecto");
                LocalDateTime horaFalla = LocalDateTime.now();
                System.out.println("Hora de falla: " + horaFalla);

                String registros = "Intento fallido de ingreso con usuario: " + user + ", Hora de falla: " + horaFalla;
              
                guardarRegistro(registros);
            }

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     private void guardarRegistro(String registro) {
        try {
            String rutaArchivo = "C:\\Users\\MSI-THIN\\OneDrive\\Documentos\\Login_Pro\\Usuario.txt";
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
                writer.write(registro);
                writer.newLine();
            }
        } catch (IOException e) {
        }
    }
}

