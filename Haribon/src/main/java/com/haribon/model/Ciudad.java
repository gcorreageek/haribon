package com.haribon.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ciudad database table.
 * 
 */
@Entity
@NamedQuery(name="Ciudad.findAll", query="SELECT c FROM Ciudad c")
public class Ciudad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCiudad;

	private String campo1;

	private String campo2;

	private String campo3;

	private String campo4;

	private String campo5;

	private String habilitado;

	private int idCiudadPadre;

	private int idCiudadPadreParecida;

	private int idDominio;

	private String nombre;

	private String observaciones;

	private int orden;

	private int principales;

	private String soloUnoCiudad;

	//bi-directional many-to-one association to Ubicacion
	@OneToMany(mappedBy="ciudad")
	private List<Ubicacion> ubicacions;

	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="ciudad1")
	private List<Usuario> usuarios1;

	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="ciudad2")
	private List<Usuario> usuarios2;

	public Ciudad() {
	}

	public int getIdCiudad() {
		return this.idCiudad;
	}

	public void setIdCiudad(int idCiudad) {
		this.idCiudad = idCiudad;
	}

	public String getCampo1() {
		return this.campo1;
	}

	public void setCampo1(String campo1) {
		this.campo1 = campo1;
	}

	public String getCampo2() {
		return this.campo2;
	}

	public void setCampo2(String campo2) {
		this.campo2 = campo2;
	}

	public String getCampo3() {
		return this.campo3;
	}

	public void setCampo3(String campo3) {
		this.campo3 = campo3;
	}

	public String getCampo4() {
		return this.campo4;
	}

	public void setCampo4(String campo4) {
		this.campo4 = campo4;
	}

	public String getCampo5() {
		return this.campo5;
	}

	public void setCampo5(String campo5) {
		this.campo5 = campo5;
	}

	public String getHabilitado() {
		return this.habilitado;
	}

	public void setHabilitado(String habilitado) {
		this.habilitado = habilitado;
	}

	public int getIdCiudadPadre() {
		return this.idCiudadPadre;
	}

	public void setIdCiudadPadre(int idCiudadPadre) {
		this.idCiudadPadre = idCiudadPadre;
	}

	public int getIdCiudadPadreParecida() {
		return this.idCiudadPadreParecida;
	}

	public void setIdCiudadPadreParecida(int idCiudadPadreParecida) {
		this.idCiudadPadreParecida = idCiudadPadreParecida;
	}

	public int getIdDominio() {
		return this.idDominio;
	}

	public void setIdDominio(int idDominio) {
		this.idDominio = idDominio;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public int getOrden() {
		return this.orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public int getPrincipales() {
		return this.principales;
	}

	public void setPrincipales(int principales) {
		this.principales = principales;
	}

	public String getSoloUnoCiudad() {
		return this.soloUnoCiudad;
	}

	public void setSoloUnoCiudad(String soloUnoCiudad) {
		this.soloUnoCiudad = soloUnoCiudad;
	}

	public List<Ubicacion> getUbicacions() {
		return this.ubicacions;
	}

	public void setUbicacions(List<Ubicacion> ubicacions) {
		this.ubicacions = ubicacions;
	}

	public Ubicacion addUbicacion(Ubicacion ubicacion) {
		getUbicacions().add(ubicacion);
		ubicacion.setCiudad(this);

		return ubicacion;
	}

	public Ubicacion removeUbicacion(Ubicacion ubicacion) {
		getUbicacions().remove(ubicacion);
		ubicacion.setCiudad(null);

		return ubicacion;
	}

	public List<Usuario> getUsuarios1() {
		return this.usuarios1;
	}

	public void setUsuarios1(List<Usuario> usuarios1) {
		this.usuarios1 = usuarios1;
	}

	public Usuario addUsuarios1(Usuario usuarios1) {
		getUsuarios1().add(usuarios1);
		usuarios1.setCiudad1(this);

		return usuarios1;
	}

	public Usuario removeUsuarios1(Usuario usuarios1) {
		getUsuarios1().remove(usuarios1);
		usuarios1.setCiudad1(null);

		return usuarios1;
	}

	public List<Usuario> getUsuarios2() {
		return this.usuarios2;
	}

	public void setUsuarios2(List<Usuario> usuarios2) {
		this.usuarios2 = usuarios2;
	}

	public Usuario addUsuarios2(Usuario usuarios2) {
		getUsuarios2().add(usuarios2);
		usuarios2.setCiudad2(this);

		return usuarios2;
	}

	public Usuario removeUsuarios2(Usuario usuarios2) {
		getUsuarios2().remove(usuarios2);
		usuarios2.setCiudad2(null);

		return usuarios2;
	}

}