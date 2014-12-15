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
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import Parametres.Parametres;

public class ServeurTCP extends ServerSocket implements Runnable {

	public static void recupAdresse(String adresse){
		InetAddress adresseServeur;
		InetAddress adresseLocale;

		try {
			adresseLocale = InetAddress.getLocalHost();
			System.out.println("Adresse locale: " + adresseLocale);
		} catch (UnknownHostException e) {
			System.out.println("ERREUR: Adresse locale non identifiée");
			e.printStackTrace();
		}

	}

	protected InetAddress adresseServeur = InetAddress.getLocalHost();
	public final static int NB_LINK_MAX = 2;

	public ServeurTCP() throws IOException {
		super();
	}

	public static void main(String[] args) {
		ServerSocket socketServeur = new ServerSocket(Parametres.NUM_PORT, NB_LINK_MAX, adresseServeur);
		Socket soc = socketServeur.accept();
		BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(soc.getOutputStream())), true);
		
		System.out.println(adresseServeur);
		while (true){
			System.out.print(">");
			String msg = "TEST CLIENT";
			try {
				msg = in.readLine();				//Lecture du message entrant
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (msg.equals("END")) break;
			System.out.println("ECHO = " + msg);	//Trace locale
			out.println(msg);						//Renvoi d'un echo de confirmation
		}
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		out.close();
		try {
			soc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}