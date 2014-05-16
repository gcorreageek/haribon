package com.haribon.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the palabra database table.
 * 
 */
@Entity
@NamedQuery(name="Palabra.findAll", query="SELECT p FROM Palabra p")
public class Palabra implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPalabraPadre;

	private int confNombreTipo;

	private int confNombreTipoEstado;

	private String habilitado;

	private String nombre;

	private int orden;

	private int principal;

	//bi-directional many-to-one association to Palabra
	@ManyToOne
	@JoinColumn(name="idPalabraHijo")
	private Palabra palabra;

	//bi-directional many-to-one association to Palabra
	@OneToMany(mappedBy="palabra")
	private List<Palabra> palabras;

	//bi-directional many-to-one association to Ubicacion
	@OneToMany(mappedBy="palabra1")
	private List<Ubicacion> ubicacions1;

	//bi-directional many-to-one association to Ubicacion
	@OneToMany(mappedBy="palabra2")
	private List<Ubicacion> ubicacions2;

	public Palabra() {
	}

	public int getIdPalabraPadre() {
		return this.idPalabraPadre;
	}

	public void setIdPalabraPadre(int idPalabraPadre) {
		this.idPalabraPadre = idPalabraPadre;
	}

	public int getConfNombreTipo() {
		return this.confNombreTipo;
	}

	public void setConfNombreTipo(int confNombreTipo) {
		this.confNombreTipo = confNombreTipo;
	}

	public int getConfNombreTipoEstado() {
		return this.confNombreTipoEstado;
	}

	public void setConfNombreTipoEstado(int confNombreTipoEstado) {
		this.confNombreTipoEstado = confNombreTipoEstado;
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

	public int getOrden() {
		return this.orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public int getPrincipal() {
		return this.principal;
	}

	public void setPrincipal(int principal) {
		this.principal = principal;
	}

	public Palabra getPalabra() {
		return this.palabra;
	}

	public void setPalabra(Palabra palabra) {
		this.palabra = palabra;
	}

	public List<Palabra> getPalabras() {
		return this.palabras;
	}

	public void setPalabras(List<Palabra> palabras) {
		this.palabras = palabras;
	}

	public Palabra addPalabra(Palabra palabra) {
		getPalabras().add(palabra);
		palabra.setPalabra(this);

		return palabra;
	}

	public Palabra removePalabra(Palabra palabra) {
		getPalabras().remove(palabra);
		palabra.setPalabra(null);

		return palabra;
	}

	public List<Ubicacion> getUbicacions1() {
		return this.ubicacions1;
	}

	public void setUbicacions1(List<Ubicacion> ubicacions1) {
		this.ubicacions1 = ubicacions1;
	}

	public Ubicacion addUbicacions1(Ubicacion ubicacions1) {
		getUbicacions1().add(ubicacions1);
		ubicacions1.setPalabra1(this);

		return ubicacions1;
	}

	public Ubicacion removeUbicacions1(Ubicacion ubicacions1) {
		getUbicacions1().remove(ubicacions1);
		ubicacions1.setPalabra1(null);

		return ubicacions1;
	}

	public List<Ubicacion> getUbicacions2() {
		return this.ubicacions2;
	}

	public void setUbicacions2(List<Ubicacion> ubicacions2) {
		this.ubicacions2 = ubicacions2;
	}

	public Ubicacion addUbicacions2(Ubicacion ubicacions2) {
		getUbicacions2().add(ubicacions2);
		ubicacions2.setPalabra2(this);

		return ubicacions2;
	}

	public Ubicacion removeUbicacions2(Ubicacion ubicacions2) {
		getUbicacions2().remove(ubicacions2);
		ubicacions2.setPalabra2(null);

		return ubicacions2;
	}

}