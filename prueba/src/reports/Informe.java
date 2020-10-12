/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package reports;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author sbl
 */
public class Informe {
    
    private Connection conn;
    private final String login = "root"; //usuario
    private final String password = ""; //contrase�a de usuario
    private String url = "jdbc:mysql//localhost:3306/damges";
    private Integer familia;


    public Informe() throws SQLException, ClassNotFoundException
    {
            Class.forName("com.mysql.jdbc.Driver"); //se carga el driver
            conn = DriverManager.getConnection(url,login,password);
     }



    public void ejecutarInforme(Integer familia)
    {
        
        try{
            String master = "src\\reports\\report_articulos.jasper";
            if (master == null)
            {
                JOptionPane.showMessageDialog(null, "No encuentro el archivo del informe maestro.");
                System.exit(2);
            }

            JasperReport masterReport = null;
            try
            {
                masterReport = (JasperReport) JRLoader.loadObjectFromFile(master);
            }
            catch (JRException e){
                System.out.println("Error cargando el informe maestro: " + e.getMessage());
                System.exit(3);
            }

            //Definir el par�metro que recibe. 
            //Podemos agregar m�s par�metros a�adiendo m�s l�neas parametro.put
            Map parametro = new HashMap();
            parametro.put("Id_Fam",25);

            //Informe dise�ado y compilado con iReport
            JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport,parametro,conn);
            
            // comprobamos si el infrome tiene p�ginas 
            if(jasperPrint.getPages().size() > 0)
            {
                //Se lanza el Viewer de Jaser, no termina la aplicaci�n al salir
                JasperViewer jviewer = new JasperViewer(jasperPrint, false);
                jviewer.setTitle("Listado de Art�culos por Familia");
                jviewer.setVisible(true);
            }
            else
                JOptionPane.showMessageDialog(null,"No hay art�culos de la familia "+
                familia,"Informaci�n",JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/warning.png")));
                
        }
        catch (Exception j){
            System.out.println("Mensaje de Error:"+j.getMessage());
        }

    }

    public void cerrar() {
        try 
        {
            conn.close();
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
    }
}

