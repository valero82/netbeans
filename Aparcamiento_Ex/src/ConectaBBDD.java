import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConectaBBDD {
    Connection conn = null;
    Statement sentenciaSQL = null;
    ResultSet rs = null;
    boolean nuevoRegistro = false;
    
    public ConectaBBDD() {
    }
    public void conecta() throws SQLException {
        try {
            //Registrando el Driver
           String driver = "com.mysql.cj.jdbc.Driver";
           // String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver).newInstance();
            System.out.println("Driver "+driver+" Registrado correctamente");
            //Abrir la conexión con la Base de Datos
            System.out.println("Conectando con la Base de datos...");
            String jdbcUrl = "jdbc:mysql://localhost:3306/aparcamiento?serverTimezone=UTC";
            conn = DriverManager.getConnection(jdbcUrl,"root","");
            System.out.println("Conexión establecida con la Base de datos...");
        } catch(SQLException se) {
           //Errores de JDBC
           se.printStackTrace();
        } catch(Exception e) {
           //Errores de Class.forName
           e.printStackTrace();
        }
    }
    public void crearSentencia() throws java.sql.SQLException    {      
        // Crear una sentencia para enviar consultas a la base de datos
        sentenciaSQL = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        System.out.println("\nSentencia creada con éxito.");
    }
    public void cerrarConexion() throws java.sql.SQLException    {     
        // se cerrará la conexión a la BBDD.
        if (rs != null) 
                rs.close();
        if (sentenciaSQL != null) 
                sentenciaSQL.close();
        if (conn != null) 
                conn.close();
        System.out.println("\nConexión cerrada con éxito.");
    }
    public void ejecutaSQL(String sql) throws java.sql.SQLException  {
        // realiza la consulta y devuelve resultados
        rs = sentenciaSQL.executeQuery(sql);
    }
    public int updateSQL(String sql) throws java.sql.SQLException  {
        // actualiza la BBDD
        int upd = -1;
        try {
             upd = sentenciaSQL.executeUpdate(sql);
             System.out.println("Valor "+upd);     
        } 
        catch (SQLException e ) {
            
            System.out.println(e.getMessage());
            upd = -1;
        }
        return upd;
    }    
    
     public void iralfinal() throws java.sql.SQLException  {
        try {
            rs.last();
        } catch (Exception e ) {
            e.printStackTrace();
        }
    }
    public void iralsiguiente() throws java.sql.SQLException  {
        try {
            rs.next();
        } catch (Exception e ) {
            e.printStackTrace();
        }
    }
    public void iralanterior() throws java.sql.SQLException  {
        try {
            rs.previous();
        } catch (Exception e ) {
            e.printStackTrace();
        }
    }
    public void iralprimero() throws java.sql.SQLException  {
        try {
            rs.first();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
  /*
    public int grabaRegistro(Ordenadores ord) throws java.sql.SQLException  {
        int ok = -1;
        String sql = "INSERT INTO articulos(nombre,precio,codigo,grupo) VALUES "
         + "('"+art.getNombre()+"',"+art.getPrecio()+",'"+art.getCodigo()+"',"+art.getGrupo()+")";
        ok = this.updateSQL(sql);
        
        return (ok);
    }
    
    public int modiRegistro(Articulos art) throws java.sql.SQLException  {
        int ok = -1;
        String sql ="UPDATE articulos SET nombre = '"+art.getNombre()+"', precio ="+art.getPrecio()
                +", codigo ='"+art.getCodigo()+"', grupo = "+art.getGrupo()+" WHERE id = "+art.getId();

        ok = this.updateSQL(sql);
        return (ok);
    }
    
    */
    public int tamanyo() throws java.sql.SQLException  {
        int tam=0, origen=0;
        origen = rs.getRow();
        rs.last();
        tam = rs.getRow();
        rs.absolute(origen);
        return tam;
    }
  public void qryVehiculosTipoClase() {
                String sql = "select * from vehiculos where clase = '01'";
        try {
            ejecutaSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConectaBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
        public Residente dameResidenteActual() {
                // Esta clase es para usar SOLO si ejecutamos un select que incluya las tablas VEHICULOS y TIPOS con un INNER JOIN
                Residente vehi = null;
                String matricula, marca, modelo, tipo, color;
                Integer numPuertas;
                int tiempoAcumulado;

                try {
                    matricula = rs.getString("matricula");
                    marca = rs.getString("marca");
                    modelo = rs.getString("modelo");
                    color = rs.getString("color");
                    numPuertas = rs.getInt("numPuertas");
                    tiempoAcumulado = Integer.parseInt(rs.getString("tiempoAcumulado"));
                    tipo = rs.getString("tipo");
                    vehi = new Residente(marca, modelo, tipo, color, numPuertas, matricula, tiempoAcumulado);

                } catch (NumberFormatException | SQLException e) {
                    System.err.println(e.getMessage());
                }

                return vehi;
            }
        
     /*       public Residente dameResidenteActual() {
                // Esta clase es para usar SOLO si ejecutamos un select que incluya las tablas VEHICULOS y TIPOS con un INNER JOIN
                Residente vehi = null;
                String matricula, marca, modelo, tipo, color;
                Integer numPuertas;
                int tiempoAcumulado;

                try {
                    matricula = rs.getString("matricula");
                    marca = rs.getString("marca");
                    modelo = rs.getString("modelo");
                    color = rs.getString("color");
                    numPuertas = rs.getInt("numPuertas");
                    tiempoAcumulado = Integer.parseInt(rs.getString("tiempoAcumulado"));
                    tipo = rs.getString("tipo");
                    vehi = new Residente(marca, modelo, tipo, color, numPuertas, matricula, tiempoAcumulado);

                } catch (NumberFormatException | SQLException e) {
                    System.err.println(e.getMessage());
                }

                return vehi;
            }
*/
            
public boolean esElUltimo() {
         boolean es = false;
                  try {
                           if (rs.isLast()) {
                           es = true;
                  }
         } catch (SQLException e) {
                  System.err.println(e.getMessage());
         }
         return es;
}

}
