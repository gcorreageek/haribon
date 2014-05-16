package com.haribon.util;

public enum MetodosDefault {
	VACIO(0), INSERT(1), UPDATE(2),DELETE(3),LIST(4),SEARCH(5)  ;

	private Integer tipoMetodo;
	private MetodosDefault(Integer s) {
		setTipoMetodo(s);
	}
	public Integer getTipoMetodo() {
		return tipoMetodo;
	}
	public void setTipoMetodo(Integer tipoMetodo) {
		this.tipoMetodo = tipoMetodo;
	}
	 
}
 