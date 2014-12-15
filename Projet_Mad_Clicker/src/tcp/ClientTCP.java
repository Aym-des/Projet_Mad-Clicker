/**
 * 
 */
package tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import Parametres.Parametres;

public class ClientTCP extends ServerSocket implements Runnable {

	public String adresseServeur;

	public ClientTCP() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static Socket soc;
	BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
	PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(soc.getOutputStream())), true);

	public static void creationsocket(String adresseServeur){
		try {
			soc = new Socket(adresseServeur, Parametres.NUM_PORT);
		} catch (UnknownHostException e) {
			System.out.println("ERREUR: Hôte introuvable. Vérifiez l'adresse IP introduite");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERREUR: Création du socket impossible");
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {

		String msg = "MAD CLICKER";
		for(int i = 0 ; i < 10; i++){
			out.println(msg);			//Trace locale
			try {
				msg = in.readLine();	//Renvoi d'un echo de confirmation
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Connexion établie");
		System.out.println("END");
		out.println("END");
		try {
			in.close();
		} catch (IOException e) {
			System.out.println("ERREUR: fermeture du buffer IN impossible");
			e.printStackTrace();
		}
		out.close();
		try {
			soc.close();
		} catch (IOException e) {
			System.out.println("ERREUR: fermeture du buffer OUT impossible");
			e.printStackTrace();
		}
	}
	
}