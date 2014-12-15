/**
 * @author Jorge Barata 2TL2
 */
package tcp;


import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import Parametres.Parametres;

public class ClientTCP {
    
    public static void main(String[] args) {
    	
        Socket socket;
        
        try {
             socket = new Socket(InetAddress.getLocalHost(),Parametres.NUM_PORT);
             socket.close();
        }catch (UnknownHostException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}