package com.haribon.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the red database table.
 * 
 */
@Entity
@NamedQuery(name="Red.findAll", query="SELECT r FROM Red r")
public class Red implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idRed;

	private int confComunidadDentroAledanosEstado;

	private int confComunidadDentroAledanosTipo;

	private String habilitado;

	private int orden;

	private byte principal;

	//bi-directional many-to-one association to Ubicacion
	@ManyToOne
	@JoinColumn(name="idUbicacionPadre")
	private Ubicacion ubicacion1;

	//bi-directional many-to-one association to Ubicacion
	@ManyToOne
	@JoinColumn(name="idUbicacionHijo")
	private Ubicacion ubicacion2;

	public Red() {
	}

	public int getIdRed() {
		return this.idRed;
	}

	public void setIdRed(int idRed) {
		this.idRed = idRed;
	}

	public int getConfComunidadDentroAledanosEstado() {
		return this.confComunidadDentroAledanosEstado;
	}

	public void setConfComunidadDentroAledanosEstado(int confComunidadDentroAledanosEstado) {
		this.confComunidadDentroAledanosEstado = confComunidadDentroAledanosEstado;
	}

	public int getConfComunidadDentroAledanosTipo() {
		return this.confComunidadDentroAledanosTipo;
	}

	public void setConfComunidadDentroAledanosTipo(int confComunidadDentroAledanosTipo) {
		this.confComunidadDentroAledanosTipo = confComunidadDentroAledanosTipo;
	}

	public String getHabilitado() {
		return this.habilitado;
	}

	public void setHabilitado(String habilitado) {
		this.habilitado = habilitado;
	}

	public int getOrden() {
		return this.orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public byte getPrincipal() {
		return this.principal;
	}

	public void setPrincipal(byte principal) {
		this.principal = principal;
	}

	public Ubicacion getUbicacion1() {
		return this.ubicacion1;
	}

	public void setUbicacion1(Ubicacion ubicacion1) {
		this.ubicacion1 = ubicacion1;
	}

	public Ubicacion getUbicacion2() {
		return this.ubicacion2;
	}

	public void setUbicacion2(Ubicacion ubicacion2) {
		this.ubicacion2 = ubicacion2;
	}

}