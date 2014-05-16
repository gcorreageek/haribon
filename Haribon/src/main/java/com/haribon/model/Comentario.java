package com.haribon.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the comentario database table.
 * 
 */
@Entity
@NamedQuery(name="Comentario.findAll", query="SELECT c FROM Comentario c")
public class Comentario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idComentarioPadre;

	private int confBuenoMaloNadaEstado;

	private int confBuenoMaloNadaTipo;

	private int confCheckPublicoComentarEstado;

	private int confCheckPublicoComentarTipo;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	private String habilitado;

	@Lob
	private String mensaje;

	//bi-directional many-to-one association to Apoya
	@OneToMany(mappedBy="comentario")
	private List<Apoya> apoyas;

	//bi-directional many-to-one association to Comentario
	@ManyToOne
	@JoinColumn(name="idComentarioHijo")
	private Comentario comentario;

	//bi-directional many-to-one association to Comentario
	@OneToMany(mappedBy="comentario")
	private List<Comentario> comentarios;

	//bi-directional many-to-one association to Ubicacion
	@ManyToOne
	@JoinColumn(name="idUbicacion")
	private Ubicacion ubicacion;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;

	public Comentario() {
	}

	public int getIdComentarioPadre() {
		return this.idComentarioPadre;
	}

	public void setIdComentarioPadre(int idComentarioPadre) {
		this.idComentarioPadre = idComentarioPadre;
	}

	public int getConfBuenoMaloNadaEstado() {
		return this.confBuenoMaloNadaEstado;
	}

	public void setConfBuenoMaloNadaEstado(int confBuenoMaloNadaEstado) {
		this.confBuenoMaloNadaEstado = confBuenoMaloNadaEstado;
	}

	public int getConfBuenoMaloNadaTipo() {
		return this.confBuenoMaloNadaTipo;
	}

	public void setConfBuenoMaloNadaTipo(int confBuenoMaloNadaTipo) {
		this.confBuenoMaloNadaTipo = confBuenoMaloNadaTipo;
	}

	public int getConfCheckPublicoComentarEstado() {
		return this.confCheckPublicoComentarEstado;
	}

	public void setConfCheckPublicoComentarEstado(int confCheckPublicoComentarEstado) {
		this.confCheckPublicoComentarEstado = confCheckPublicoComentarEstado;
	}

	public int getConfCheckPublicoComentarTipo() {
		return this.confCheckPublicoComentarTipo;
	}

	public void setConfCheckPublicoComentarTipo(int confCheckPublicoComentarTipo) {
		this.confCheckPublicoComentarTipo = confCheckPublicoComentarTipo;
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

	public String getMensaje() {
		return this.mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public List<Apoya> getApoyas() {
		return this.apoyas;
	}

	public void setApoyas(List<Apoya> apoyas) {
		this.apoyas = apoyas;
	}

	public Apoya addApoya(Apoya apoya) {
		getApoyas().add(apoya);
		apoya.setComentario(this);

		return apoya;
	}

	public Apoya removeApoya(Apoya apoya) {
		getApoyas().remove(apoya);
		apoya.setComentario(null);

		return apoya;
	}

	public Comentario getComentario() {
		return this.comentario;
	}

	public void setComentario(Comentario comentario) {
		this.comentario = comentario;
	}

	public List<Comentario> getComentarios() {
		return this.comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public Comentario addComentario(Comentario comentario) {
		getComentarios().add(comentario);
		comentario.setComentario(this);

		return comentario;
	}

	public Comentario removeComentario(Comentario comentario) {
		getComentarios().remove(comentario);
		comentario.setComentario(null);

		return comentario;
	}

	public Ubicacion getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}