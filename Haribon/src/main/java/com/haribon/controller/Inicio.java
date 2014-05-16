package com.haribon.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.haribon.model.Area;
import com.haribon.service.AreaService;
 

//import org.hibernate.dialect.MySQL5Dialect;
@Controller
public class Inicio {
	private final Logger log = Logger.getLogger(getClass());
//	private final Log log = LogFactory.getLog(getClass());
	
	@Autowired
	private AreaService areaS;
	
	@RequestMapping("/inicio.html"  )
	@SuppressWarnings("unused") 
	public String inicio() { 
//		Pruebas pru = new Pruebas();
//		pru.setMensaje("este mensaje xD"); 
//		model.addAttribute("pruebas", pru); 
//		model.addAttribute("texto", "vvvv");
		//Spring uses InternalResourceViewResolver and return back index.jsp
//		/WEB-INF/views/plantilla/template.jsp
		log.info("prueba");
		log.error("prueba");
		return "plantilla/body"; 
	}
 
	@RequestMapping("/prueba")
	public String welcome2(Model model) {  
		log.info("prueba"); 
		Area a = new Area();
//		a.setCodArea(555);
		a.setDescArea("Bien =D !!!!");
		//Nota: La etiqueta @Repository, funcionara siempre y cuando se llame atraves de un @Autowired a una
		//instancia de esta clase, si se llama por medio de una instancia del tipo 'Clase a = new Clase()' no
		//funcionara.
//		AreaDAO daoArea = new MySqlJdbcAreaDAO();
		areaS.persistArea(a);
		
		
		 
		return "prueba/prueba";
 
	}

	 

 
	
	
}
