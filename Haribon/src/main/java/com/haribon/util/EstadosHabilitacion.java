package com.haribon.util;

public enum EstadosHabilitacion {
	VACIO(0), HABILITADO(1), DESABILITADO(2) ;

	private Integer estadoHabil;
	private EstadosHabilitacion(Integer s) {
		estadoHabil = s;
	}
	public Integer getEstadosHabil() {
		return estadoHabil;
	}
}
 