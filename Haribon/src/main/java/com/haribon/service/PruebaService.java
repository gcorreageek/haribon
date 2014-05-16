package com.haribon.service;

import com.pruebas.dto.Pruebas;

public class PruebaService {

	public Pruebas guardaPruebas(Pruebas p){
		System.out.println("mira:"+p.getUsuario());
		p.setMensaje("Este a");
		System.out.println("un Guardar!");
		
		return p;
	}
	
}
