package com.haribon.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



/**
 * The persistent class for the imagenpuntos database table.
 * 
 */
@Entity
@Table(name="imagenpuntos")
@NamedQuery(name="Imagenpunto.findAll", query="SELECT i FROM Imagenpunto i")
public class Imagenpunto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idImagenPuntos;

	//bi-directional many-to-one association to Ubicacion
	@ManyToOne
	@JoinColumn(name="idUbicacion")
	private Ubicacion ubicacion;

	//bi-directional many-to-one association to Imagen
	@ManyToOne
	@JoinColumn(name="idImagen")
	private Imagen imagen;

	public Imagenpunto() {
	}

	public int getIdImagenPuntos() {
		return this.idImagenPuntos;
	}

	public void setIdImagenPuntos(int idImagenPuntos) {
		this.idImagenPuntos = idImagenPuntos;
	}

	public Ubicacion getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Imagen getImagen() {
		return this.imagen;
	}

	public void setImagen(Imagen imagen) {
		this.imagen = imagen;
	}

}