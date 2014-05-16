package com.haribon.repository;

import java.util.List;

import com.haribon.model.Dominio;

public interface DominioDAO {

	Dominio insertar(Dominio a)throws Exception;
	Dominio actualiza(Dominio a)throws Exception; 
//	Dominio eliminar(Dominio a)throws Exception; 
	List<Dominio> listar()throws Exception;
	List<Dominio> buscar(Dominio a)throws Exception;
	
}
