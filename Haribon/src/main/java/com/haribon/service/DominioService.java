package com.haribon.service;

import com.haribon.model.Dominio;

public interface DominioService {

//	public abstract Dominio ingresaDominio(Dominio d) throws Exception;

	Object[] insertar(Dominio a);
	Object[] actualiza(Dominio a);
	Object[] eliminar(Dominio a);
	Object[] listar();
	Object[] buscar(Dominio a);
}