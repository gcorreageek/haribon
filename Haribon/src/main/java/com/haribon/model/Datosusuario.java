package com.haribon.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the datosusuario database table.
 * 
 */
@Entity
@NamedQuery(name="Datosusuario.findAll", query="SELECT d FROM Datosusuario d")
public class Datosusuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idDatosUsuario;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	private String habilitado;

	private int idDominioTipoDato;

	private String valorDato;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;

	public Datosusuario() {
	}

	public int getIdDatosUsuario() {
		return this.idDatosUsuario;
	}

	public void setIdDatosUsuario(int idDatosUsuario) {
		this.idDatosUsuario = idDatosUsuario;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getHabilitado() {
		return this.habilitado;
	}

	public void setHabilitado(String habilitado) {
		this.habilitado = habilitado;
	}

	public int getIdDominioTipoDato() {
		return this.idDominioTipoDato;
	}

	public void setIdDominioTipoDato(int idDominioTipoDato) {
		this.idDominioTipoDato = idDominioTipoDato;
	}

	public String getValorDato() {
		return this.valorDato;
	}

	public void setValorDato(String valorDato) {
		this.valorDato = valorDato;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}