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
//<?xml version="1.0" encoding="UTF-8" ?>
//<!DOCTYPE mapper
//  PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
//  "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
//
//<mapper namespace="it.exolab.condomini.mapper.RappresentanteMapper">
//
//	<insert id="insert"
//		parameterType="it.exolab.condomini.model.Rappresentante" useGeneratedKeys="true"
//		keyProperty="id" keyColumn="id">
//		insert into rappresentante(nome, cognome,email,password, numero_appartamento,
//		codice_fiscale, ruolo, id_palazzina) values (#{nome}
//		, #{cognome}
//		, #{email}
//		, #{password}
//		, #{numero_appartamento}
//		, #{codice_fiscale}
//		, "rappresentante"
//		, #{id_palazzina}
//		)
//
//	</insert>
//
//
//
//<!-- 	<update id="update" -->
//<!-- 		parameterType="it.exolab.ecommerce.model.User"> -->
//<!-- 		update user set nome=#{nome} -->
//<!-- 		,cognome= #{cognome} -->
//<!-- 		,email=#{email} -->
//<!-- 		,password=#{password} where id = #{id} -->
//
//<!-- 	</update> -->
//
//
//
//
//	<delete id="delete" parameterType="int">
//		delete from rappresentante where id = #{id}
//	</delete>
//
//
//	<!-- <select id = "findByEmailAndPassword" resultType = "it.exolab.ecommerce.model.User" -->
//	<!-- parameterType="it.exolab.ecommerce.model.User"> -->
//	<!-- SELECT * FROM user where email = #{email} and password = #{password} -->
//	<!-- </select> -->
//
//
//	<select id="find" resultType="it.exolab.condomini.model.Rappresentante"
//		parameterType="int">
//		SELECT * FROM rappresentante where id = #{id}
//	</select>
//
//
//	<select id="findAll" resultType="it.exolab.condomini.model.Rappresentante">
//		SELECT * FROM rappresentante
//	</select>
//
//
//	<select id="findByEmailAndPassword" resultType="it.exolab.condomini.model.Rappresentante" parameterType="it.exolab.condomini.model.Rappresentante">
//		SELECT * FROM rappresentante where email = #{email} and password = #{password}
//	</select>
//	<select id="findByEmail" resultType="it.exolab.condomini.model.Rappresentante" parameterType="String">
//		SELECT * FROM rappresentante where email = #{email}
//	</select>
//	
//	
//
//
//
//
//<!-- 	<resultMap id = "findByEmailAndPasswordmap" type = "it.exolab.ecommerce.model.User"> -->
//<!-- 	<result property = "email" column = "email"/> -->
//<!-- 	<result property = "password" column = "password"/> -->
//<!-- 	</resultMap> -->
//
//	<!-- <select id = "findByEmailAndPassword" parameterType="map" resultMap 
//		= "findByEmailAndPasswordmap"> -->
//	<!-- SELECT * FROM user where email = #{email} and password = #{password} -->
//	<!-- </select> -->
//
//
//	<!-- <resultMap id = "findAllWithStats" type = "it.exolab.ecommerce.model.User"> -->
//	<!-- <result property = "id" column = "id"/> -->
//	<!-- <result property = "email" column = "email"/> -->
//	<!-- <result property = "countArticles" column = "articles"/> -->
//	<!-- <result property = "countComments" column = "comments"/> -->
//	<!-- </resultMap> -->
//
//	<!-- <select id = "findAllWithStats" resultMap = "findAllWithStats"> -->
//	<!-- SELECT u.* -->
//	<!-- ,(select count(*) from comment c where c.uid=u.id) as comments -->
//	<!-- ,(select count(*) from article a where a.uid=u.id) as articles -->
//	<!-- FROM user u order by u.id desc -->
//	<!-- </select> -->
//
//
//
//
//</mapper>
// ciao ciao