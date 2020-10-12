
package BLL;

import DAO.AlumnosDAO;
import DAO.Connexion_bd;
import java.sql.Connection;
import java.util.List;


public class AlumnoBLL {
  
    public List todosLosAlumnos() throws Exception{
        Connexion_bd connexion=new Connexion_bd();
        Connection conn=connexion.AbrirConexion();
        List _listaAlumno=new AlumnosDAO().consultar(conn);
        connexion.CerrarConexion(conn);
        return _listaAlumno;
    }
 
}
