/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estacion_Expres;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MSI-THIN
 */
public class Conexion {
      public static void main(String[] args) throws ClassNotFoundException {
        Conec conn = new Conec();
        ResultSet resultado = conn.EjecutaSQL("SELECT * FROM sistema_parqueadero.login;");
        try{
            while(resultado.next()){
                System.out.println(resultado.getString(1)+"  "+resultado.getString(2));
            }
        }catch(SQLException e)
        {
           System.out.println("error");
        }
    }
    
}
