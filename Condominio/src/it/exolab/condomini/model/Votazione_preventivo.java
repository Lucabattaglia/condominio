package it.exolab.condomini.model;

public class Votazione_preventivo {
	
	private int id;
	private Preventivo preventivo;
	private Rappresentante rappresentante;
	private Riunione riunione;
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
	
	public Riunione getRiunione() {
		return riunione;
	}
	public void setRiunione(Riunione riunione) {
		this.riunione = riunione;
	}
	public String getVotazione() {
		return votazione;
	}
	public void setVotazione(String votazione) {
		this.votazione = votazione;
	}
	
	public Votazione_preventivo(Preventivo preventivo, Rappresentante rappresentante, Riunione riunione,
			String votazione) {
		this.preventivo = preventivo;
		this.rappresentante = rappresentante;
		this.riunione = riunione;
		this.votazione = votazione;
	}
	
	public Votazione_preventivo(int id, Preventivo preventivo, Rappresentante rappresentante, Riunione riunione,
			String votazione) {
		this.id = id;
		this.preventivo = preventivo;
		this.rappresentante = rappresentante;
		this.riunione = riunione;
		this.votazione = votazione;
	}
	public Votazione_preventivo() {

	}
	@Override
	public String toString() {
		return "Votazione_preventivo [id=" + id + ", preventivo=" + preventivo + ", rappresentante=" + rappresentante
				+ ", riunione=" + riunione + ", votazione=" + votazione + "]";
	}
}
//<insert id="insert"
//parameterType="it.exolab.condomini.model.Rappresentante" useGeneratedKeys="true"
//keyProperty="id" keyColumn="id">
//insert into rappresentante(nome, cognome,email,password, numero_appartamento,
//codice_fiscale, ruolo, id_palazzina) values (#{nome}
//, #{cognome}
//, #{email}
//, #{password}
//, #{numero_appartamento}
//, #{codice_fiscale}
//, "rappresentante"
//, #{id_palazzina}
//)
//
//</insert>
