package it.exolab.condomini.model;

import java.sql.Timestamp;

public class Riunione {
	
	private int id;
	private String titolo;
	private Timestamp data;
	private int presenze_totali;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public Timestamp getData() {
		return data;
	}
	public void setData(Timestamp data) {
		this.data = data;
	}
	public int getPresenze_totali() {
		return presenze_totali;
	}
	public void setPresenze_totali(int presenze_totali) {
		this.presenze_totali = presenze_totali;
	}
	
	public Riunione(int id, String titolo, Timestamp data, int presenze_totali) {
		this.id = id;
		this.titolo = titolo;
		this.data = data;
		this.presenze_totali = presenze_totali;
	}
	
	public Riunione(String titolo, Timestamp data, int presenze_totali) {
		this.titolo = titolo;
		this.data = data;
		this.presenze_totali = presenze_totali;
	}
	
	public Riunione() {

	}
	
	@Override
	public String toString() {
		return "Riunione [id=" + id + ", titolo=" + titolo + ", data=" + data + ", presenze_totali=" + presenze_totali
				+ "]";
	}
	

}