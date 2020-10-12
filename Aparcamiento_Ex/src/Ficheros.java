/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.filechooser.*;

/**
 *
 * @author Carles
 */
public class Ficheros {

    private static FileOutputStream fs;
    private static OutputStreamWriter oos;

    public static int ExportaPagoResidentesTxt() throws SQLException {
        // Si iErr = 0 ha ido todo bien, no hay fallos.
        // Si iErr = -1 es porque ha fallado al guardar el TXT
        // Si iErr = -2 es porque no hay residentes en la base de datos
        int iErr = 0;
        String str = "";
        String ruta = "";
        Residente claRes;
        JFileChooser jF1 = new JFileChooser(System.getProperty("user.dir"));
        String salto = System.getProperty("line.separator"); //salto de linea para el archivo de texto
        FileNameExtensionFilter filtroExtension = new FileNameExtensionFilter("Archivo de texto *txt", "txt");

        ConectaBBDD con = new ConectaBBDD();
        con.conecta();
        con.crearSentencia();
        //Estos métodos los tengo en la clase ConectaBBDD
        /*la consulta que uso es la siguiente.
            public boolean qryVehiculosTipoClase() {
                String sql = "select * from vehiculos INNER JOIN tipos on vehiculos.tipo = tipos.codTipo INNER JOIN clase on vehiculos.clase = clase.codClase WHERE clase.descripcion = 'Residente'";
                return ejecutaSQL(sql);
            }
        
            public Residente dameResidenteActual() {
                // Esta clase es para usar SOLO si ejecutamos un select que incluya las tablas VEHICULOS y TIPOS con un INNER JOIN
                Residente vehi = null;
                String matricula, marca, modelo, tipo, color;
                Integer numPuertas;
                long tiempoAcumulado;

                try {
                    matricula = rs.getString("matricula");
                    marca = rs.getString("marca");
                    modelo = rs.getString("modelo");
                    color = rs.getString("color");
                    numPuertas = rs.getInt("numPuertas");
                    tiempoAcumulado = Long.parseLong(rs.getString("tiempoAcumulado"));
                    tipo = rs.getString("tipos.descripcion");
                    vehi = new Residente(marca, modelo, tipo, color, numPuertas, matricula, tiempoAcumulado);

                } catch (NumberFormatException | SQLException e) {
                    System.err.println(e.getMessage());
                }

                return vehi;
            }
         */

        con.qryVehiculosTipoClase();
        // Ahora en el ResultSet tengo los registros de todos los residentes.
        
        if (con.rs.next()) {
            try {
                if (jF1.showSaveDialog(null) == jF1.APPROVE_OPTION) {
                    jF1.setFileFilter(filtroExtension);
                    ruta = jF1.getSelectedFile().getAbsolutePath();
                    
                }

                fs = new FileOutputStream(ruta);
                oos = new OutputStreamWriter(fs, "UTF8");

                oos.write("MATRICULA \t TIPO \t MARCA \t MODELO \t TIEMPO \t PAGO MES \t" + salto);

                con.iralprimero();
                do {
                    claRes = con.dameResidenteActual();
                    str += claRes.getMatricula() + " \t ";
                    str += claRes.getTipo() + " \t ";
                    str += claRes.getMarca() + " \t ";
                    str += claRes.getModelo() + " \t ";
                    str += claRes.getTiempoAcumulado() + " \t ";
                    str += claRes.pagoMes() + " €" + salto;
                    con.iralsiguiente();
                } while (!con.rs.isAfterLast());

                con.cerrarConexion();
                oos.write(str);
                oos.close();
                fs.close();
                
            } catch (IOException e) {
                iErr = -1;
                
            }
            
        } else {
              iErr = -2;
        }
       
        return iErr;
    }

}
