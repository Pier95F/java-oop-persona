package jana60.anagrafica;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
	Scanner scan = new Scanner (System.in);
	
	Indirizzo indirizzo = new Indirizzo("Via Stendhal", "13", "Formia");
	Indirizzo indirizzoBis = new Indirizzo(indirizzo);
	
	Persona persona = new Persona ("Pierpaolo", "Forcina", indirizzo);
	Persona personaBis = new Persona ("Gennaro", "Esposito", indirizzoBis);
	
	System.out.println("Inserisci qui il tuo indirizzo: ");
	System.out.println("Inserisci la via: ");
	String via = scan.nextLine();
	System.out.println("Inserisci il tuo numero civico: ");
	String numero = scan.nextLine();
	System.out.println("Inserisci la citta': ");
	String citta = scan.nextLine();
	
	personaBis.getIndirizzo().setVia(via);
	personaBis.getIndirizzo().setNumeroCivico(numero);
	personaBis.getIndirizzo().setCitta(citta);
	
	System.out.println("Indirizzo numero 1: " + persona.getIndirizzo());
	System.out.println("Indirizzo numero 2: " + personaBis.getIndirizzo());
	
	System.out.println("Modifica l'indirizzo: ");
	System.out.println("Inserisci nuova via: ");
	String viaBis = scan.nextLine();
	System.out.println("Inserisci nuovo numero civico: ");
	String numeroBis = scan.nextLine();
	System.out.println("Inserisci nuova citta': ");
	String cittaBis = scan.nextLine();
	
	personaBis.getIndirizzo().setVia(viaBis);
	personaBis.getIndirizzo().setNumeroCivico(numeroBis);
	personaBis.getIndirizzo().setCitta(cittaBis);
	
	System.out.println("Indirizzo numero 1: " + persona.getIndirizzo());
	System.out.println("Indirizzo numero 2: " + personaBis.getIndirizzo());
	
	
	scan.close();
	}
}
