

package DAO;

import entidad.Alumno;
import entidad.Familia;
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
         String sql="SELECT * FROM damges.articulos LIMIT 100;";
         Alumno alumno=null;
         
         List<Alumno> listaAlumnos=new ArrayList();
        try{
           PreparedStatement stm=conn.prepareStatement(sql);
           ResultSet rs=stm.executeQuery();
           while(rs.next()){
              alumno=new Alumno();
              alumno.setId(rs.getInt(1));
              alumno.setNombre(rs.getString(2));
              alumno.setDescripcion(rs.getString(3));
              alumno.setPrecio(rs.getFloat(4));
              alumno.setDto(rs.getInt(5));
              alumno.setStock(rs.getInt(6));
              
             listaAlumnos.add(alumno);
            }
        rs.close();
        stm.close();

  }catch(Exception ex){System.out.println("Exception Consultar");}
         return(listaAlumnos);
 }
   
    
    public void anyadir(String sql)throws SQLException, Exception{
        
        Connexion_bd connexion=new Connexion_bd();
        Connection conn=connexion.AbrirConexion();
        
        Statement crStm = conn.createStatement();
        crStm.getResultSet();        
        crStm.executeUpdate(sql);
        
        
        JOptionPane.showMessageDialog(null, "Registro añadido");
      
    }
        public void muestra(String sql)throws SQLException, Exception{
        
        Connexion_bd connexion=new Connexion_bd();
        Connection conn=connexion.AbrirConexion();
        
        Statement crStm = conn.createStatement();
        crStm.getResultSet();        
        crStm.executeQuery(sql);
        
        
        JOptionPane.showMessageDialog(null, "Registro añadido");
      
    }
        
        public void modificar(String sql, int id)throws Exception{
        
        Connexion_bd connexion=new Connexion_bd();
        Connection conn=connexion.AbrirConexion();
        
        Statement crStm = conn.createStatement();
        crStm.getResultSet();
        int confirm = JOptionPane.showConfirmDialog(null, "Desea modificar el registro con id "+id+"?", "Vaciar lista", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (confirm==0) {     
            crStm.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Registro modificado");
        }
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





 



