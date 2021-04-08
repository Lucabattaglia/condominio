package it.exolab.condomini.model;

public class Verbale_finale {
	private int id;
	private Riunione riunione;
	private String titolo;
	private String testo;
	private Preventivo preventivo;
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
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getTesto() {
		return testo;
	}
	public void setTesto(String testo) {
		this.testo = testo;
	}
	public Preventivo getPreventivo() {
		return preventivo;
	}
	public void setPreventivo(Preventivo preventivo) {
		this.preventivo = preventivo;
	}
	public int getSi_totali() {
		return si_totali;
	}
	public void setSi_totali(int si_totali) {
		this.si_totali = si_totali;
	}
	
	
	
}
