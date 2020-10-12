/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q6sockets;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class Servidor {
 
    public static void main(String[] args) {
 
        ServerSocket servidor = null;
        Socket sc = null;
        DataInputStream in;
        DataOutputStream out;
 
        //puerto de nuestro servidor
        final int PUERTO = 5000;
 
        try {
            //Creamos el socket del servidor
            servidor = new ServerSocket(PUERTO);
            String mensaje;
            System.out.println("Servidor iniciado, esperando al cliente...");
            
            while (true) {
 
                sc = servidor.accept();
                System.out.println("Cliente conectado");
                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());
                mensaje = in.readUTF();
                System.out.println(mensaje);
                
              
                //Cierro el socket
             
            }
             
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }
 
}