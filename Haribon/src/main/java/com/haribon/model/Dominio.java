package com.haribon.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the dominio database table.
 * 
 */
@Entity
@NamedQuery(name="Dominio.findAll", query="SELECT d FROM Dominio d") 
@NamedQueries({  
	@NamedQuery(name="Dominio.findId", query="SELECT d FROM Dominio d WHERE d.idDominio = ?1")
})
public class Dominio extends TodoObjeto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idDominio;

	private String dominio;

	private String habilitado;

	private int idTabla;

	private String masDatos;

	private String valor;

	public Dominio() {
	}

	public int getIdDominio() {
		return this.idDominio;
	}

	public void setIdDominio(int idDominio) {
		this.idDominio = idDominio;
	}

	public String getDominio() {
		return this.dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}

	public String getHabilitado() {
		return this.habilitado;
	}

	public void setHabilitado(String habilitado) {
		this.habilitado = habilitado;
	}

	public int getIdTabla() {
		return this.idTabla;
	}

	public void setIdTabla(int idTabla) {
		this.idTabla = idTabla;
	}

	public String getMasDatos() {
		return this.masDatos;
	}

	public void setMasDatos(String masDatos) {
		this.masDatos = masDatos;
	}

	public String getValor() {
		return this.valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}