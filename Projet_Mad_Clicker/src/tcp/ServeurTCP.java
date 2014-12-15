/**
 * 
 */
package tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import Parametres.Parametres;
	
public class ServeurTCP extends ServerSocket implements Runnable {
	
	class SocketServeur{
		private Socket socket;
		public SocketServeur(Socket socket){
			this.socket = socket;
		}
	}
	private int port = Parametres.NUM_PORT;

	public ServeurTCP() throws IOException {
		super(Parametres.NUM_PORT);
		
		Thread t = new Thread(this);
		t.start();
		
	}
	
	public static void main(String[] args) {
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		SocketServeur SocketServeur = null;
		try {
		while (this.isBound()){
			SocketServeur = new SocketServeur(this.accept());
			
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}