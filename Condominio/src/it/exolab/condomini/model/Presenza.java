package it.exolab.condomini.model;

public class Presenza {
	
	private int id;
	private Comunicazione_riunione comunicazione_riunione;
	private Rappresentante rappresentante;
	private String presenza_rappresentante;
	private Delegato delegato;
	private String presenza_delegato;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Comunicazione_riunione getComunicazione_riunione() {
		return comunicazione_riunione;
	}
	public void setComunicazione_riunione(Comunicazione_riunione comunicazione_riunione) {
		this.comunicazione_riunione = comunicazione_riunione;
	}
	public Rappresentante getRappresentante() {
		return rappresentante;
	}
	public void setRappresentante(Rappresentante rappresentante) {
		this.rappresentante = rappresentante;
	}
	public String getPresenza_rappresentante() {
		return presenza_rappresentante;
	}
	public void setPresenza_rappresentante(String presenza_rappresentante) {
		this.presenza_rappresentante = presenza_rappresentante;
	}
	public Delegato getDelegato() {
		return delegato;
	}
	public void setDelegato(Delegato delegato) {
		this.delegato = delegato;
	}
	public String getPresenza_delegato() {
		return presenza_delegato;
	}
	public void setPresenza_delegato(String presenza_delegato) {
		this.presenza_delegato = presenza_delegato;
	}
	
	public Presenza(int id, Comunicazione_riunione comunicazione_riunione, Rappresentante rappresentante,
			String presenza_rappresentante, Delegato delegato, String presenza_delegato) {
		this.id = id;
		this.comunicazione_riunione = comunicazione_riunione;
		this.rappresentante = rappresentante;
		this.presenza_rappresentante = presenza_rappresentante;
		this.delegato = delegato;
		this.presenza_delegato = presenza_delegato;
	}
	
	public Presenza(Comunicazione_riunione comunicazione_riunione, Rappresentante rappresentante,
			String presenza_rappresentante, Delegato delegato, String presenza_delegato) {
		this.comunicazione_riunione = comunicazione_riunione;
		this.rappresentante = rappresentante;
		this.presenza_rappresentante = presenza_rappresentante;
		this.delegato = delegato;
		this.presenza_delegato = presenza_delegato;
	}
	
	public Presenza() {

	}
	
	@Override
	public String toString() {
		return "Presenza [id=" + id + ", comunicazione_riunione=" + comunicazione_riunione + ", rappresentante="
				+ rappresentante + ", presenza_rappresentante=" + presenza_rappresentante + ", delegato=" + delegato
				+ ", presenza_delegato=" + presenza_delegato + "]";
	}
	
	

}
