/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao_bd_diegor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {


    public static void main(String[] args) {
        conecta();
    }
    
    
    public static Connection conecta(){
        Connection conn=null;
        String url = "jdbc:mysql://localhost:3306/diegor_2022";
        String user = "root";
        String senha = "";
        
        try {
            conn = DriverManager.getConnection(url, user, senha);
            //JOptionPane.showMessageDialog(null, "Conexão bem sucedida!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com BD:\n"+ex.getMessage());
        }
        return conn;
    }
}
