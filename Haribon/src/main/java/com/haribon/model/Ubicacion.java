package com.haribon.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ubicacion database table.
 * 
 */
@Entity
@NamedQuery(name="Ubicacion.findAll", query="SELECT u FROM Ubicacion u")
public class Ubicacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idUbicacion;

	private byte esunconjunto;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	private String habilitado;

	@Lob
	private String info;

	private String puntos;

	//bi-directional many-to-one association to Apoya
	@OneToMany(mappedBy="ubicacion")
	private List<Apoya> apoyas;

	//bi-directional many-to-one association to Comentario
	@OneToMany(mappedBy="ubicacion")
	private List<Comentario> comentarios;

	//bi-directional many-to-one association to Datosubicacion
	@OneToMany(mappedBy="ubicacion")
	private List<Datosubicacion> datosubicacions;

	//bi-directional many-to-one association to Editarvisualizar
	@OneToMany(mappedBy="ubicacion")
	private List<Editarvisualizar> editarvisualizars;

	//bi-directional many-to-one association to Imagenpunto
	@OneToMany(mappedBy="ubicacion")
	private List<Imagenpunto> imagenpuntos;

	//bi-directional many-to-one association to Red
	@OneToMany(mappedBy="ubicacion1")
	private List<Red> reds1;

	//bi-directional many-to-one association to Red
	@OneToMany(mappedBy="ubicacion2")
	private List<Red> reds2;

	//bi-directional many-to-one association to Palabra
	@ManyToOne
	@JoinColumn(name="idPalabraTipo")
	private Palabra palabra1;

	//bi-directional many-to-one association to Palabra
	@ManyToOne
	@JoinColumn(name="idPalabraNombre")
	private Palabra palabra2;

	//bi-directional many-to-one association to Ciudad
	@ManyToOne
	@JoinColumn(name="idCiudad")
	private Ciudad ciudad;

	public Ubicacion() {
	}

	public int getIdUbicacion() {
		return this.idUbicacion;
	}

	public void setIdUbicacion(int idUbicacion) {
		this.idUbicacion = idUbicacion;
	}

	public byte getEsunconjunto() {
		return this.esunconjunto;
	}

	public void setEsunconjunto(byte esunconjunto) {
		this.esunconjunto = esunconjunto;
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

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getPuntos() {
		return this.puntos;
	}

	public void setPuntos(String puntos) {
		this.puntos = puntos;
	}

	public List<Apoya> getApoyas() {
		return this.apoyas;
	}

	public void setApoyas(List<Apoya> apoyas) {
		this.apoyas = apoyas;
	}

	public Apoya addApoya(Apoya apoya) {
		getApoyas().add(apoya);
		apoya.setUbicacion(this);

		return apoya;
	}

	public Apoya removeApoya(Apoya apoya) {
		getApoyas().remove(apoya);
		apoya.setUbicacion(null);

		return apoya;
	}

	public List<Comentario> getComentarios() {
		return this.comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public Comentario addComentario(Comentario comentario) {
		getComentarios().add(comentario);
		comentario.setUbicacion(this);

		return comentario;
	}

	public Comentario removeComentario(Comentario comentario) {
		getComentarios().remove(comentario);
		comentario.setUbicacion(null);

		return comentario;
	}

	public List<Datosubicacion> getDatosubicacions() {
		return this.datosubicacions;
	}

	public void setDatosubicacions(List<Datosubicacion> datosubicacions) {
		this.datosubicacions = datosubicacions;
	}

	public Datosubicacion addDatosubicacion(Datosubicacion datosubicacion) {
		getDatosubicacions().add(datosubicacion);
		datosubicacion.setUbicacion(this);

		return datosubicacion;
	}

	public Datosubicacion removeDatosubicacion(Datosubicacion datosubicacion) {
		getDatosubicacions().remove(datosubicacion);
		datosubicacion.setUbicacion(null);

		return datosubicacion;
	}

	public List<Editarvisualizar> getEditarvisualizars() {
		return this.editarvisualizars;
	}

	public void setEditarvisualizars(List<Editarvisualizar> editarvisualizars) {
		this.editarvisualizars = editarvisualizars;
	}

	public Editarvisualizar addEditarvisualizar(Editarvisualizar editarvisualizar) {
		getEditarvisualizars().add(editarvisualizar);
		editarvisualizar.setUbicacion(this);

		return editarvisualizar;
	}

	public Editarvisualizar removeEditarvisualizar(Editarvisualizar editarvisualizar) {
		getEditarvisualizars().remove(editarvisualizar);
		editarvisualizar.setUbicacion(null);

		return editarvisualizar;
	}

	public List<Imagenpunto> getImagenpuntos() {
		return this.imagenpuntos;
	}

	public void setImagenpuntos(List<Imagenpunto> imagenpuntos) {
		this.imagenpuntos = imagenpuntos;
	}

	public Imagenpunto addImagenpunto(Imagenpunto imagenpunto) {
		getImagenpuntos().add(imagenpunto);
		imagenpunto.setUbicacion(this);

		return imagenpunto;
	}

	public Imagenpunto removeImagenpunto(Imagenpunto imagenpunto) {
		getImagenpuntos().remove(imagenpunto);
		imagenpunto.setUbicacion(null);

		return imagenpunto;
	}

	public List<Red> getReds1() {
		return this.reds1;
	}

	public void setReds1(List<Red> reds1) {
		this.reds1 = reds1;
	}

	public Red addReds1(Red reds1) {
		getReds1().add(reds1);
		reds1.setUbicacion1(this);

		return reds1;
	}

	public Red removeReds1(Red reds1) {
		getReds1().remove(reds1);
		reds1.setUbicacion1(null);

		return reds1;
	}

	public List<Red> getReds2() {
		return this.reds2;
	}

	public void setReds2(List<Red> reds2) {
		this.reds2 = reds2;
	}

	public Red addReds2(Red reds2) {
		getReds2().add(reds2);
		reds2.setUbicacion2(this);

		return reds2;
	}

	public Red removeReds2(Red reds2) {
		getReds2().remove(reds2);
		reds2.setUbicacion2(null);

		return reds2;
	}

	public Palabra getPalabra1() {
		return this.palabra1;
	}

	public void setPalabra1(Palabra palabra1) {
		this.palabra1 = palabra1;
	}

	public Palabra getPalabra2() {
		return this.palabra2;
	}

	public void setPalabra2(Palabra palabra2) {
		this.palabra2 = palabra2;
	}

	public Ciudad getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

}