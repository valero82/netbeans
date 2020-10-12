package q6sockets;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
 

public class Cliente {
 
    public static void main(String[] args) {
 
        //Host del servidor
        final String HOST = "127.0.0.1";
        //Puerto del servidor
        final int PUERTO = 5000;
        DataInputStream in;
        DataOutputStream out;
        String mensaje;
 
        try {
            try ( //Creo el socket para conectarme con el cliente
                    Socket sc = new Socket(HOST, PUERTO)) {
                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());

                    
                do {
                
                System.out.println("Escribe un mensaje:");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                out.writeUTF(br.readLine());
                mensaje = in.readUTF();
                System.out.println(mensaje);
                } while (mensaje.equalsIgnoreCase("exit"));
                    sc.close();
            }
 
        } catch (IOException ex) {
            System.out.println("Conexión cerrada");
        }
 
    }
 
}