package com.haribon.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the imagen database table.
 * 
 */
@Entity
@NamedQuery(name="Imagen.findAll", query="SELECT i FROM Imagen i")
public class Imagen implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idImagen;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	private String habilitado;

	private String nombre;

	private String ruta;

	//bi-directional many-to-one association to Imagenpunto
	@OneToMany(mappedBy="imagen")
	private List<Imagenpunto> imagenpuntos;

	public Imagen() {
	}

	public int getIdImagen() {
		return this.idImagen;
	}

	public void setIdImagen(int idImagen) {
		this.idImagen = idImagen;
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

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRuta() {
		return this.ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public List<Imagenpunto> getImagenpuntos() {
		return this.imagenpuntos;
	}

	public void setImagenpuntos(List<Imagenpunto> imagenpuntos) {
		this.imagenpuntos = imagenpuntos;
	}

	public Imagenpunto addImagenpunto(Imagenpunto imagenpunto) {
		getImagenpuntos().add(imagenpunto);
		imagenpunto.setImagen(this);

		return imagenpunto;
	}

	public Imagenpunto removeImagenpunto(Imagenpunto imagenpunto) {
		getImagenpuntos().remove(imagenpunto);
		imagenpunto.setImagen(null);

		return imagenpunto;
	}

}