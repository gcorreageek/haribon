package com.haribon.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the datosubicacion database table.
 * 
 */
@Entity
@NamedQuery(name="Datosubicacion.findAll", query="SELECT d FROM Datosubicacion d")
public class Datosubicacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idDatosUbicacion;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	private String habilitado;

	private int idDominioTipoDato;

	private String valorDato;

	//bi-directional many-to-one association to Ubicacion
	@ManyToOne
	@JoinColumn(name="idUbicacion")
	private Ubicacion ubicacion;

	public Datosubicacion() {
	}

	public int getIdDatosUbicacion() {
		return this.idDatosUbicacion;
	}

	public void setIdDatosUbicacion(int idDatosUbicacion) {
		this.idDatosUbicacion = idDatosUbicacion;
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

	public int getIdDominioTipoDato() {
		return this.idDominioTipoDato;
	}

	public void setIdDominioTipoDato(int idDominioTipoDato) {
		this.idDominioTipoDato = idDominioTipoDato;
	}

	public String getValorDato() {
		return this.valorDato;
	}

	public void setValorDato(String valorDato) {
		this.valorDato = valorDato;
	}

	public Ubicacion getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

}