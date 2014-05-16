package com.haribon.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the editarvisualizar database table.
 * 
 */
@Entity
@NamedQuery(name="Editarvisualizar.findAll", query="SELECT e FROM Editarvisualizar e")
public class Editarvisualizar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEditarVisualizar;

	private int confEditarVisualizarEstado;

	private int confEditarVisualizarTipo;

	private String habilitado;

	//bi-directional many-to-one association to Ubicacion
	@ManyToOne
	@JoinColumn(name="idUbicacion")
	private Ubicacion ubicacion;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;

	public Editarvisualizar() {
	}

	public int getIdEditarVisualizar() {
		return this.idEditarVisualizar;
	}

	public void setIdEditarVisualizar(int idEditarVisualizar) {
		this.idEditarVisualizar = idEditarVisualizar;
	}

	public int getConfEditarVisualizarEstado() {
		return this.confEditarVisualizarEstado;
	}

	public void setConfEditarVisualizarEstado(int confEditarVisualizarEstado) {
		this.confEditarVisualizarEstado = confEditarVisualizarEstado;
	}

	public int getConfEditarVisualizarTipo() {
		return this.confEditarVisualizarTipo;
	}

	public void setConfEditarVisualizarTipo(int confEditarVisualizarTipo) {
		this.confEditarVisualizarTipo = confEditarVisualizarTipo;
	}

	public String getHabilitado() {
		return this.habilitado;
	}

	public void setHabilitado(String habilitado) {
		this.habilitado = habilitado;
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