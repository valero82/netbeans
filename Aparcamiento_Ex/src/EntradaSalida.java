/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


/**
 *
 * @author JaimeLap
 */
public class EntradaSalida extends javax.swing.JFrame {

    /**
     * Creates new form Panel
     */
    ListaEstancias listaEstancias;
    Estancia estancia;
    
    public EntradaSalida(int entradaSalida) { 
        initComponents(); 
        setLocationRelativeTo(null);
        llenaCombo();
        if (entradaSalida==1) jTmatriculaEntrada.requestFocus();
           else
            jComboSalida.requestFocus();
            
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCalculo = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTestancia = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTtotalAPagar = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTmuestraMatricula = new javax.swing.JTextField();
        jPentrada = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jBregistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTmatriculaEntrada = new javax.swing.JFormattedTextField();
        jPsalida = new java.awt.Panel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboSalida = new javax.swing.JComboBox<>();

        setSize(new java.awt.Dimension(0, 0));

        jPanelCalculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Total"));

        jLabel10.setText("Estancia en minutos");

        jTestancia.setEditable(false);

        jLabel11.setText("Total a pagar: ");

        jTtotalAPagar.setEditable(false);
        jTtotalAPagar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel14.setText("Matrícula");

        jTmuestraMatricula.setEditable(false);

        javax.swing.GroupLayout jPanelCalculoLayout = new javax.swing.GroupLayout(jPanelCalculo);
        jPanelCalculo.setLayout(jPanelCalculoLayout);
        jPanelCalculoLayout.setHorizontalGroup(
            jPanelCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCalculoLayout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addGroup(jPanelCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanelCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTestancia, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(jTmuestraMatricula)
                    .addComponent(jTtotalAPagar)))
        );
        jPanelCalculoLayout.setVerticalGroup(
            jPanelCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCalculoLayout.createSequentialGroup()
                .addGroup(jPanelCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTmuestraMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanelCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTestancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jTtotalAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel2.setText("Matrícula");

        Calendar calendario = new GregorianCalendar();
        jLabel12.setText(String.valueOf(calendario.get(calendario.HOUR)+":"+calendario.get(calendario.MINUTE)));

        jLabel13.setText("Hora actual");

        jBregistrar.setText("Registrar");
        jBregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBregistrarActionPerformed(evt);
            }
        });

        jLabel1.setText("ENTRADA DE VEHICULOS");

        try {
            jTmatriculaEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-UUU")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTmatriculaEntrada.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPentradaLayout = new javax.swing.GroupLayout(jPentrada);
        jPentrada.setLayout(jPentradaLayout);
        jPentradaLayout.setHorizontalGroup(
            jPentradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPentradaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPentradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPentradaLayout.createSequentialGroup()
                        .addGroup(jPentradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPentradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPentradaLayout.createSequentialGroup()
                                .addComponent(jTmatriculaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBregistrar))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPentradaLayout.setVerticalGroup(
            jPentradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPentradaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPentradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPentradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBregistrar)
                        .addComponent(jLabel2))
                    .addComponent(jTmatriculaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPentradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel18.setText("SALIDA ESTANCIAS");

        jLabel17.setText("Matrícula");

        jButton1.setText("Pagar y Borrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBpagarActionPerformed(evt);
            }
        });

        jComboSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboSalidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPsalidaLayout = new javax.swing.GroupLayout(jPsalida);
        jPsalida.setLayout(jPsalidaLayout);
        jPsalidaLayout.setHorizontalGroup(
            jPsalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPsalidaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPsalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPsalidaLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(48, 48, 48)
                        .addComponent(jComboSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPsalidaLayout.setVerticalGroup(
            jPsalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPsalidaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPsalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jComboSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jPentrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPsalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPentrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPsalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBregistrarActionPerformed
        // TODO add your handling code here:
       
        String matricula=jTmatriculaEntrada.getText(),fecha;
        Vehiculo vehiculo= new NoResidente(matricula);
        Estancia esta;
        String sql, fechaHora = Calendar.getInstance().getTime().toString();
        Calendar instante;
        int error;
        ConectaBBDD con = new ConectaBBDD();
        try {
            con.conecta(); 
            con.crearSentencia();
            instante = Calendar.getInstance();
            fecha = calendarToStringDate(instante);
            sql = "INSERT INTO vehiculos (matricula,tipo,fechaAlta,clase) VALUES ('"+matricula+"','01','"+fecha+"','02')";
            System.out.println(sql);
            error = con.updateSQL(sql);
            if (error==-1){
                 JOptionPane.showMessageDialog(this,"Entrada de Resisdente : "+matricula+", añadido con éxito","Entrada Residente",JOptionPane.INFORMATION_MESSAGE);
            }
            else
                 JOptionPane.showMessageDialog(this,"Entrada registrada: "+matricula+", añadido con éxito","Entrada No Residente",JOptionPane.INFORMATION_MESSAGE);
            instante = Calendar.getInstance();
            fechaHora = calendarToStringTime(instante);
            esta = new Estancia(matricula, instante);
            sql = "INSERT INTO estancias (matricula,horaEntrada) VALUES('"+esta.getMatricula()+"','"+fechaHora+"')";
            System.out.println(sql);
            error = con.updateSQL(sql);
            if (error != 1){
                JOptionPane.showMessageDialog(this,"ESTANCIA NO INSERTADA","ERROR",JOptionPane.ERROR_MESSAGE);    
                // DEBERÍA BORRAR LA ENTRADA EN VEHÍCULOS SI ES UN NO RESIDENTE
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"ERROR EN BBDD","ERROR",JOptionPane.ERROR_MESSAGE);
  
        }
        this.dispose();
    }//GEN-LAST:event_jBregistrarActionPerformed

    private void jBpagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpagarActionPerformed
        // TODO add your handling code here:
        
        String matricula=(String) jComboSalida.getSelectedItem();
        Vehiculo vehiculo;
        Estancia esta;
        String sql, fechaHora, tipo;
        Calendar instante, i1, i2;
        int error;
        long min;
        ConectaBBDD con = new ConectaBBDD();
        float precio;
        try {
            con.conecta(); 
            con.crearSentencia();
            sql = "Select * from vehiculos where matricula = '"+matricula+"'";
            System.out.println(sql);
            con.ejecutaSQL(sql);
            if (con.rs.next()){ 
                
                tipo = con.rs.getString("clase");
                
                sql = "select * from estancias where matricula ='"+matricula+"'";
                con.ejecutaSQL(sql);
                System.out.println(sql);
                if (con.rs.next()){
                   i1 = stringToCalendar(con.rs.getString("horaEntrada"));
                   i2 = Calendar.getInstance();
                   min = Estancia.difEnMinutos(i1,i2);
                   
                    System.out.println(i1.getTime());
                   if (tipo.equalsIgnoreCase("01")){
                   // actualizar el acumulado UPDATE
                   sql = "UPDATE vehiculos SET tiempoAcumulado = tiempoAcumulado +"+min+" WHERE matricula = '"+matricula+"'";
                   error = con.updateSQL(sql);
                   if (error!=1)
                        JOptionPane.showMessageDialog(this,"Error","ERROR",JOptionPane.ERROR_MESSAGE);
                   else{
                        JOptionPane.showMessageDialog(this,"Minutos acumulados","AVISO",JOptionPane.INFORMATION_MESSAGE);
                        // borrar estancia 
                        sql = "DELETE FROM estancias WHERE matricula='"+matricula+"'";
                        error = con.updateSQL(sql);
                        if(error == 1)
                            JOptionPane.showMessageDialog(this,"Borrado de estancia","AVISO",JOptionPane.INFORMATION_MESSAGE);
                   }
                   }
                   else if (tipo.equalsIgnoreCase("02")){
                
                      precio =(float) (min * NoResidente.getPrecioMinuto());
                      jTmuestraMatricula.setText(matricula);
                      jTestancia.setText(String.valueOf(min));
                      jTtotalAPagar.setText(String.valueOf(precio));
                      // borrar estancia 
                      sql = "DELETE FROM estancias WHERE matricula='"+matricula+"'";
                      error = con.updateSQL(sql);
                      if(error == 1){
                            JOptionPane.showMessageDialog(this,"Borrado de estancia","AVISO",JOptionPane.INFORMATION_MESSAGE);
                            sql = "DELETE FROM vehiculos WHERE matricula='"+matricula+"'";
                            error = con.updateSQL(sql);
                            if(error == 1)
                               JOptionPane.showMessageDialog(this,"Borrado de vehiculos","AVISO",JOptionPane.INFORMATION_MESSAGE);
                
                      }
                } else if (tipo.equalsIgnoreCase("03")){
                    
                
                   precio =(float) (min * Moto.getPrecioMinuto());
                      jTmuestraMatricula.setText(matricula);
                      jTestancia.setText(String.valueOf(min));
                      jTtotalAPagar.setText(String.valueOf(precio));
                      // borrar estancia 
                      sql = "DELETE FROM estancias WHERE matricula='"+matricula+"'";
                      error = con.updateSQL(sql);
                      if(error == 1){
                            JOptionPane.showMessageDialog(this,"Borrado de estancia","AVISO",JOptionPane.INFORMATION_MESSAGE);
                            sql = "DELETE FROM vehiculos WHERE matricula='"+matricula+"'";
                            error = con.updateSQL(sql);
                            if(error == 1)
                               JOptionPane.showMessageDialog(this,"Borrado de vehiculos","AVISO",JOptionPane.INFORMATION_MESSAGE);
                
                        }
                } 
                }
                else
                    JOptionPane.showMessageDialog(this,"ESTANCIA NO ENCONTRADA","ERROR",JOptionPane.ERROR_MESSAGE);
            }
              else
                JOptionPane.showMessageDialog(this,"MATRICULA NO ENCONTRADA","ERROR",JOptionPane.ERROR_MESSAGE);

        con.cerrarConexion();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(this,"ERROR EN BBDD","ERROR",JOptionPane.ERROR_MESSAGE);
  
        }
        this.dispose();
    }//GEN-LAST:event_jBpagarActionPerformed

    private void jComboSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboSalidaActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBregistrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanelCalculo;
    private java.awt.Panel jPentrada;
    private java.awt.Panel jPsalida;
    private javax.swing.JTextField jTestancia;
    private javax.swing.JFormattedTextField jTmatriculaEntrada;
    private javax.swing.JTextField jTmuestraMatricula;
    private javax.swing.JTextField jTtotalAPagar;
    // End of variables declaration//GEN-END:variables
 public static final String calendarToStringDate(Calendar cal) {
    StringBuilder ret = new StringBuilder();
    ret.append(cal.get(Calendar.YEAR));
    ret.append("-");
      
    String month = null;
    int mo = cal.get(Calendar.MONTH) + 1; /* Calendar month is zero indexed, string months are not */
    if(mo < 10) {
        month = "0" + mo;
    }
      else {
        month = "" + mo;
    }
    ret.append(month);      
    ret.append("-");
    String date = null;
    int dt = cal.get(Calendar.DATE);
    if(dt < 10) {
        date = "0" + dt;
    }
      else {
        date = "" + dt;
    }
    ret.append(date);

    return ret.toString();
  }
    
    public static final String calendarToStringTime(Calendar cal) {
    StringBuilder ret = new StringBuilder();    
    String date = null;
    String month = null, hora = null, mini=null, seg=null;
    
   int mo,dt,hh,mm,ss;
    
    ret = ret.append(calendarToStringDate(cal));

    ret.append(" ");
    hh = cal.get(Calendar.HOUR_OF_DAY);
    if(hh < 10) {
        hora = "0" + hh+":";
    }
      else {
        hora = "" + hh+":";
    }
    ret.append(hora);
    mm = cal.get(Calendar.MINUTE);
    if(hh < 10) {
        mini = "0" + mm+":";
    }
      else {
        mini = "" + mm+":";
    }
    ret.append(mini);
    ss = cal.get(Calendar.SECOND);
    if(ss < 10) {
        seg = "0" + ss;
    }
      else {
        seg = "" + ss;
    }
    ret.append(seg);

    return ret.toString();
  }
    
  public static Calendar stringToCalendar(String x){
      String  tiempo = x;
      int anyo,mes, dia, hh, mm,ss;
      Calendar fechHora = Calendar.getInstance();
      anyo = Integer.parseInt(tiempo.substring(0,4));
      mes = Integer.parseInt(tiempo.substring(5,7))-1;
      dia = Integer.parseInt(tiempo.substring(8,10));
      System.out.println(anyo+" "+mes+" "+dia);
      hh = Integer.parseInt(tiempo.substring(11,13));
      mm = Integer.parseInt(tiempo.substring(14,16));
      ss = Integer.parseInt(tiempo.substring(17,19));
      System.out.println(hh+" "+mm+" "+ss);
      fechHora.set(anyo,mes,dia,hh,mm,ss);
  
      return (fechHora);
}
  void ocultaTotal() {
      jPanelCalculo.setVisible(false);
  }
  void ocultaEntrada() {
      jPentrada.setVisible(false);
  }
  void ocultaSalida() {
      jPsalida.setVisible(false);
  }

    private void llenaCombo() {
        try {
            ConectaBBDD con = new ConectaBBDD();
            con.conecta();
            con.crearSentencia();
            String sql = "SELECT * FROM estancias";
            con.ejecutaSQL(sql);
            DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
    
            while (con.rs.next()){
            
            modeloCombo.addElement(con.rs.getString("matricula"));  
            }
            if (jComboSalida.getItemCount()==0)  {
               
            }   
            
             jComboSalida.setModel(modeloCombo);//con esto lo agregamos al objeto al jcombobox
             con.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(EntradaSalida.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
      
    
}
