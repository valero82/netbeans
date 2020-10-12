

package DAO;

import java.sql.*;

 public class Connexion_bd {

    public Connection AbrirConexion()throws Exception{
        Connection conn=null;
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/damges";
        String usuario = "root";
        String password = "";
        // Conectar con la BD
        conn = java.sql.DriverManager.getConnection(url, usuario, password);
        return(conn);
    }


    public void CerrarConexion(Connection conn)throws Exception{
        if(conn!=null){
        conn.close();
        }
    }

}
