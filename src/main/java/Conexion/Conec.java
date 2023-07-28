/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MSI-THIN
 */
public class Conec {
    Connection co;

    private String url = "jdbc:mysql://localhost:3306/celus?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private String usuario = "root";
    private String clave = "2002";

    public ResultSet EjecutaSQL(String Sql) throws ClassNotFoundException{

    
        ResultSet resultado=null;
            try {
              Class.forName("com.mysql.cj.jdbc.Driver");
        Connection Co = DriverManager.getConnection(url, usuario, clave);
        PreparedStatement pst = Co.prepareStatement(Sql);
        resultado = pst.executeQuery();
        return resultado;

    }catch(SQLException e){
              return resultado;
    }
            }
    
    public void EjecutaSQLIUD(String Sql) throws ClassNotFoundException{
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Co= DriverManager.getConnection(url, usuario, clave);
            PreparedStatement pst = Co.prepareStatement(Sql);
            pst.execute();
        } catch (Exception e) {
        }
    }

    Connection EjecutaSQL() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    ResultSet EjecutaSql(String consulA) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void close() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    CallableStatement prepareCall(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
