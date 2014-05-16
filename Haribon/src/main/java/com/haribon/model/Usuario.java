package com.haribon.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario extends TodoObjeto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idUsuario;

	private String acercaDe;

	private int confPassword0;

	private int confTerminos0;

	private int confUbicacion0;

	private String correo;

	@Temporal(TemporalType.DATE)
	private Date fechaNac;

	private String habilitado;

	private int idIdioma;

	private String movil;

	private String nombres;

	private String password;

	private String usuario;

	//bi-directional many-to-one association to Amigo
	@OneToMany(mappedBy="usuario1")
	private List<Amigo> amigos1;

	//bi-directional many-to-one association to Amigo
	@OneToMany(mappedBy="usuario2")
	private List<Amigo> amigos2;

	//bi-directional many-to-one association to Apoya
	@OneToMany(mappedBy="usuario")
	private List<Apoya> apoyas;

	//bi-directional many-to-one association to Comentario
	@OneToMany(mappedBy="usuario")
	private List<Comentario> comentarios;

	//bi-directional many-to-one association to Datosusuario
	@OneToMany(mappedBy="usuario")
	private List<Datosusuario> datosusuarios;

	//bi-directional many-to-one association to Editarvisualizar
	@OneToMany(mappedBy="usuario")
	private List<Editarvisualizar> editarvisualizars;

	//bi-directional many-to-one association to Ciudad
	@ManyToOne
	@JoinColumn(name="idCiudadViveEn")
	private Ciudad ciudad1;

	//bi-directional many-to-one association to Ciudad
	@ManyToOne
	@JoinColumn(name="idCiudadEsDe")
	private Ciudad ciudad2;

	public Usuario() {
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getAcercaDe() {
		return this.acercaDe;
	}

	public void setAcercaDe(String acercaDe) {
		this.acercaDe = acercaDe;
	}

	public int getConfPassword0() {
		return this.confPassword0;
	}

	public void setConfPassword0(int confPassword0) {
		this.confPassword0 = confPassword0;
	}

	public int getConfTerminos0() {
		return this.confTerminos0;
	}

	public void setConfTerminos0(int confTerminos0) {
		this.confTerminos0 = confTerminos0;
	}

	public int getConfUbicacion0() {
		return this.confUbicacion0;
	}

	public void setConfUbicacion0(int confUbicacion0) {
		this.confUbicacion0 = confUbicacion0;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Date getFechaNac() {
		return this.fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getHabilitado() {
		return this.habilitado;
	}

	public void setHabilitado(String habilitado) {
		this.habilitado = habilitado;
	}

	public int getIdIdioma() {
		return this.idIdioma;
	}

	public void setIdIdioma(int idIdioma) {
		this.idIdioma = idIdioma;
	}

	public String getMovil() {
		return this.movil;
	}

	public void setMovil(String movil) {
		this.movil = movil;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public List<Amigo> getAmigos1() {
		return this.amigos1;
	}

	public void setAmigos1(List<Amigo> amigos1) {
		this.amigos1 = amigos1;
	}

	public Amigo addAmigos1(Amigo amigos1) {
		getAmigos1().add(amigos1);
		amigos1.setUsuario1(this);

		return amigos1;
	}

	public Amigo removeAmigos1(Amigo amigos1) {
		getAmigos1().remove(amigos1);
		amigos1.setUsuario1(null);

		return amigos1;
	}

	public List<Amigo> getAmigos2() {
		return this.amigos2;
	}

	public void setAmigos2(List<Amigo> amigos2) {
		this.amigos2 = amigos2;
	}

	public Amigo addAmigos2(Amigo amigos2) {
		getAmigos2().add(amigos2);
		amigos2.setUsuario2(this);

		return amigos2;
	}

	public Amigo removeAmigos2(Amigo amigos2) {
		getAmigos2().remove(amigos2);
		amigos2.setUsuario2(null);

		return amigos2;
	}

	public List<Apoya> getApoyas() {
		return this.apoyas;
	}

	public void setApoyas(List<Apoya> apoyas) {
		this.apoyas = apoyas;
	}

	public Apoya addApoya(Apoya apoya) {
		getApoyas().add(apoya);
		apoya.setUsuario(this);

		return apoya;
	}

	public Apoya removeApoya(Apoya apoya) {
		getApoyas().remove(apoya);
		apoya.setUsuario(null);

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
		comentario.setUsuario(this);

		return comentario;
	}

	public Comentario removeComentario(Comentario comentario) {
		getComentarios().remove(comentario);
		comentario.setUsuario(null);

		return comentario;
	}

	public List<Datosusuario> getDatosusuarios() {
		return this.datosusuarios;
	}

	public void setDatosusuarios(List<Datosusuario> datosusuarios) {
		this.datosusuarios = datosusuarios;
	}

	public Datosusuario addDatosusuario(Datosusuario datosusuario) {
		getDatosusuarios().add(datosusuario);
		datosusuario.setUsuario(this);

		return datosusuario;
	}

	public Datosusuario removeDatosusuario(Datosusuario datosusuario) {
		getDatosusuarios().remove(datosusuario);
		datosusuario.setUsuario(null);

		return datosusuario;
	}

	public List<Editarvisualizar> getEditarvisualizars() {
		return this.editarvisualizars;
	}

	public void setEditarvisualizars(List<Editarvisualizar> editarvisualizars) {
		this.editarvisualizars = editarvisualizars;
	}

	public Editarvisualizar addEditarvisualizar(Editarvisualizar editarvisualizar) {
		getEditarvisualizars().add(editarvisualizar);
		editarvisualizar.setUsuario(this);

		return editarvisualizar;
	}

	public Editarvisualizar removeEditarvisualizar(Editarvisualizar editarvisualizar) {
		getEditarvisualizars().remove(editarvisualizar);
		editarvisualizar.setUsuario(null);

		return editarvisualizar;
	}

	public Ciudad getCiudad1() {
		return this.ciudad1;
	}

	public void setCiudad1(Ciudad ciudad1) {
		this.ciudad1 = ciudad1;
	}

	public Ciudad getCiudad2() {
		return this.ciudad2;
	}

	public void setCiudad2(Ciudad ciudad2) {
		this.ciudad2 = ciudad2;
	}

}