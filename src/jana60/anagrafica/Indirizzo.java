package jana60.anagrafica;

public class Indirizzo {

	// Definisco gli attributi
	
	private String via;
	private String numeroCivico;
	private String citta;
	
	// Costruttori
	
	public Indirizzo(String via, String numeroCivico, String citta) {
		super();
		this.via = via;
		this.numeroCivico = numeroCivico;
		this.citta = citta;
	}

	// Costruttore copia
	
	public Indirizzo(Indirizzo indirizzo) {
		this(indirizzo.getVia(), indirizzo.getNumeroCivico(), indirizzo.getCitta());
	}
	
	// Imposto i getters e i setters

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getNumeroCivico() {
		return numeroCivico;
	}

	public void setNumeroCivico(String numeroCivico) {
		this.numeroCivico = numeroCivico;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}
	
	// Imposto i metodi
	public String toString() {
		return via + ", " + numeroCivico + ", " + citta; 
	}
	
	
	
	
	
	
}
