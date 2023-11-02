/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aplicação;
import java.sql.*;
/**
 *
 * @author vitor
 */
public class BD {
    protected Connection  con;
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/consulta hospitalar";
    private String user = "root";
    private String password = "";
    //variaveis de manipulação
    Statement stm;

    public BD() {
        try {
            abrirConexao();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
    
    public void abrirConexao()throws Exception{
        Class.forName(driver);
        con = DriverManager.getConnection(url,user,password);
        stm = con.createStatement();
    }
    
    public ResultSet consulta(String consulta)throws Exception{
        return stm.executeQuery(consulta);
    }
    public void fecharConexao() throws Exception{
        con.close();
    }
}
 
