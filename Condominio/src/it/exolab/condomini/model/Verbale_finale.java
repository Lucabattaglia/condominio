package it.exolab.condomini.model;

public class Verbale_finale {
	private int id;
	private Riunione riunione;
	private String titolo;
	private String testo;
	private Preventivo preventivo;

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
	public Verbale_finale(Riunione riunione, String titolo, String testo, Preventivo preventivo) {
		this.riunione = riunione;
		this.titolo = titolo;
		this.testo = testo;
		this.preventivo = preventivo;
	}
	public Verbale_finale() {
	}
	public Verbale_finale(int id, Riunione riunione, String titolo, String testo, Preventivo preventivo) {
		this.id = id;
		this.riunione = riunione;
		this.titolo = titolo;
		this.testo = testo;
		this.preventivo = preventivo;
	}
	@Override
	public String toString() {
		return "Verbale_finale [id=" + id + ", riunione=" + riunione + ", titolo=" + titolo + ", testo=" + testo
				+ ", preventivo=" + preventivo + "]";
	}
	
	
	
	
}
