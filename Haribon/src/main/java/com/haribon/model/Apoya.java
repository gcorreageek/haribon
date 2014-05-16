package com.haribon.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the apoya database table.
 * 
 */
@Entity
@NamedQuery(name="Apoya.findAll", query="SELECT a FROM Apoya a")
public class Apoya implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idApoya;

	private int confApoyaNoApoyaNadaEstado;

	private int confApoyaNoApoyaNadaTipo;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	private String habilitado;

	//bi-directional many-to-one association to Comentario
	@ManyToOne
	@JoinColumn(name="idComentario")
	private Comentario comentario;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;

	//bi-directional many-to-one association to Ubicacion
	@ManyToOne
	@JoinColumn(name="idUbicacion")
	private Ubicacion ubicacion;

	public Apoya() {
	}

	public int getIdApoya() {
		return this.idApoya;
	}

	public void setIdApoya(int idApoya) {
		this.idApoya = idApoya;
	}

	public int getConfApoyaNoApoyaNadaEstado() {
		return this.confApoyaNoApoyaNadaEstado;
	}

	public void setConfApoyaNoApoyaNadaEstado(int confApoyaNoApoyaNadaEstado) {
		this.confApoyaNoApoyaNadaEstado = confApoyaNoApoyaNadaEstado;
	}

	public int getConfApoyaNoApoyaNadaTipo() {
		return this.confApoyaNoApoyaNadaTipo;
	}

	public void setConfApoyaNoApoyaNadaTipo(int confApoyaNoApoyaNadaTipo) {
		this.confApoyaNoApoyaNadaTipo = confApoyaNoApoyaNadaTipo;
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

	public Comentario getComentario() {
		return this.comentario;
	}

	public void setComentario(Comentario comentario) {
		this.comentario = comentario;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Ubicacion getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

}