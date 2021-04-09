package it.exolab.condomini.model;

public class Preventivo {
	
	private int id;
	private Riunione riunione;
	private String testo;
	private Rappresentante rappresentante;
	private int si_totali;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Riunione getRiunione() {
		return riunione;
	}
	public void setRiunione(Riunione riunione) {
		this.riunione = riunione;
	}
	public String getTesto() {
		return testo;
	}
	public void setTesto(String testo) {
		this.testo = testo;
	}
	public Rappresentante getRappresentante() {
		return rappresentante;
	}
	public void setRappresentante(Rappresentante rappresentante) {
		this.rappresentante = rappresentante;
	}
	public int getSi_totali() {
		return si_totali;
	}
	public void setSi_totali(int si_totali) {
		this.si_totali = si_totali;
	}
	@Override
	public String toString() {
		return "Preventivo [id=" + id + ", riunione=" + riunione + ", testo=" + testo + ", rappresentante="
				+ rappresentante + ", si_totali=" + si_totali + "]";
	}
	public Preventivo(Riunione riunione, String testo, Rappresentante rappresentante, int si_totali) {
		this.riunione = riunione;
		this.testo = testo;
		this.rappresentante = rappresentante;
		this.si_totali = si_totali;
	}
	public Preventivo() {
	}
	public Preventivo(int id, Riunione riunione, String testo, Rappresentante rappresentante, int si_totali) {
		this.id = id;
		this.riunione = riunione;
		this.testo = testo;
		this.rappresentante = rappresentante;
		this.si_totali = si_totali;
	}
	
	

}
