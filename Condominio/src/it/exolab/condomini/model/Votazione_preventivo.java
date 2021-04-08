package it.exolab.condomini.model;

public class Votazione_preventivo {
	
	private int id;
	private Preventivo preventivo;
	private Rappresentante rappresentante;
	private int presenze_totali;
	private String votazione;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Preventivo getPreventivo() {
		return preventivo;
	}
	public void setPreventivo(Preventivo preventivo) {
		this.preventivo = preventivo;
	}
	public Rappresentante getRappresentante() {
		return rappresentante;
	}
	public void setRappresentante(Rappresentante rappresentante) {
		this.rappresentante = rappresentante;
	}
	public int getPresenze_totali() {
		return presenze_totali;
	}
	public void setPresenze_totali(int presenze_totali) {
		this.presenze_totali = presenze_totali;
	}
	public String getVotazione() {
		return votazione;
	}
	public void setVotazione(String votazione) {
		this.votazione = votazione;
	}
	
	public Votazione_preventivo(int id, Preventivo preventivo, Rappresentante rappresentante, int presenze_totali,
			String votazione) {

		this.id = id;
		this.preventivo = preventivo;
		this.rappresentante = rappresentante;
		this.presenze_totali = presenze_totali;
		this.votazione = votazione;
	}
	
	public Votazione_preventivo(Preventivo preventivo, Rappresentante rappresentante, int presenze_totali,
			String votazione) {

		this.preventivo = preventivo;
		this.rappresentante = rappresentante;
		this.presenze_totali = presenze_totali;
		this.votazione = votazione;
	}
	
	public Votazione_preventivo() {

	}
	
	@Override
	public String toString() {
		return "Votazione_preventivo [id=" + id + ", preventivo=" + preventivo + ", rappresentante=" + rappresentante
				+ ", presenze_totali=" + presenze_totali + ", votazione=" + votazione + "]";
	}
	
	

}

