package jana60.anagrafica;

public class Persona {
	
 /* Creare una classe Persona con attributi nome e cognome e un attributo indirizzo di tipo Indirizzo, dove Indirizzo è un’altra classe caratterizzata dagli attributi: via, numero e città. */
	
	// Definisco gli attributi 
	
	private String nome;
	private String cognome;
	private Indirizzo indirizzo;
	
	// Costruttori
	
	public Persona(String nome, String cognome, Indirizzo indirizzo) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
	}

	// Imposto i getters e i setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}
	
	
	
	
	
	
	
}
