

package DAO;

import ejemplobd.Ventana;
import entidad.Alumno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AlumnosDAO {
    
    public List consultar(Connection conn)throws Exception{
         String sql="SELECT * FROM damges.familias LIMIT 100;";
         Alumno alumno=null;
         
         List<Alumno> listaAlumnos=new ArrayList();
        try{
           PreparedStatement stm=conn.prepareStatement(sql);
           ResultSet rs=stm.executeQuery();
           while(rs.next()){
              alumno=new Alumno();
              alumno.setId(rs.getInt(1));
              alumno.setNombre(rs.getString(2));
              alumno.setIva(rs.getString(3));
              alumno.setImagen(rs.getString(4));
              
             listaAlumnos.add(alumno);
            }
        rs.close();
        stm.close();

  }catch(Exception ex){System.out.println("Exception Consultar");}
         return(listaAlumnos);
 }
    
    public void anyadir(Connection conn)throws Exception{
        String sql="INSERT INTO `damges`.`familias` (`idfamilia`, `nombre`, `iva`, `imagen`) VALUES (DEFAULT, 'Prueba', 'asad', 'asdasd.png')";
      
      
        // the mysql insert statement
    

      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = conn.prepareStatement(sql);
      preparedStmt.setString (2, "Barney");
      preparedStmt.setString (3, "asda");
  

      // execute the preparedstatement
      preparedStmt.execute();
      
      conn.close();
        
      
    }
    
    public void borrar(String sql) throws SQLException, Exception{
        Connexion_bd connexion=new Connexion_bd();
        Connection conn=connexion.AbrirConexion();
        
        
        
        Statement crStm = conn.createStatement();
        
        
        int confirm = JOptionPane.showConfirmDialog(null, "Desea borrar este registro?", "Vaciar lista", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (confirm==0) { 
        crStm.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Registro borrado");
        }
        
        connexion.CerrarConexion(conn);
     

    }
      
    
}





 



