package com.haribon.model;

import java.io.Serializable;
import java.util.List;

public class TodoObjeto  implements Serializable{
 
	private static final long serialVersionUID = 6497575972982015078L;
	Object objeto;
	List<Object> listaObjeto;
	public Object getObjeto() {
		return objeto;
	}
	public void setObjeto(Object objeto) {
		this.objeto = objeto;
	}
	public List<Object> getListaObjeto() {
		return listaObjeto;
	}
	public void setListaObjeto(List<Object> listaObjeto) {
		this.listaObjeto = listaObjeto;
	}
	
	
}
