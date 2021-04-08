package it.exolab.condomini.model;

public class Delegato {
	
	private int id;
	private String nome;
	private String cognome;
	private String codice_fiscale;
	private String numero_appartamento;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getCodice_fiscale() {
		return codice_fiscale;
	}
	public void setCodice_fiscale(String codice_fiscale) {
		this.codice_fiscale = codice_fiscale;
	}
	public String getNumero_appartamento() {
		return numero_appartamento;
	}
	public void setNumero_appartamento(String numero_appartamento) {
		this.numero_appartamento = numero_appartamento;
	}
	
	public Delegato(int id, String nome, String cognome, String codice_fiscale, String numero_appartamento) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.codice_fiscale = codice_fiscale;
		this.numero_appartamento = numero_appartamento;
	}
	
	public Delegato(String nome, String cognome, String codice_fiscale, String numero_appartamento) {
		this.nome = nome;
		this.cognome = cognome;
		this.codice_fiscale = codice_fiscale;
		this.numero_appartamento = numero_appartamento;
	}
	
	public Delegato() {
		
	}
	
	@Override
	public String toString() {
		return "Delegato [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", codice_fiscale=" + codice_fiscale
				+ ", numero_appartamento=" + numero_appartamento + "]";
	}
	
	

}
