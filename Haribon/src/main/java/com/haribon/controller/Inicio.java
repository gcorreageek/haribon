package com.haribon.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.haribon.model.Dominio;
import com.haribon.service.DominioService;
import com.haribon.util.EstadosHabilitacion;
 

//import org.hibernate.dialect.MySQL5Dialect;
@Controller
public class Inicio {
	private final Logger log = Logger.getLogger(getClass());
//	private final Log log = LogFactory.getLog(getClass());
	
	@Autowired
	private DominioService dominioS;
	
	@RequestMapping("/inicio.html"  ) 
	public String inicio() {   
		log.debug("El inicio!");
		return "plantilla/template"; 
	}
	
	@RequestMapping("/ingresar.html"  ) 
	public String ingresar() {  
		log.debug("ingresastes al ingresar!");
		return "out/ingresar"; 
//		return "prueba/prueba"; 
	}
 
	@RequestMapping("/prueba")
	public String welcome2(Model model) {  
		log.info("prueba"); 
		Dominio a = new Dominio(); 
		a.setDominio("");
		a.setIdTabla(1);
		log.debug("INGRESA"); 
		dominioS.insertar(a);
		log.debug("K TAL:"+a.getIdDominio()); 
		
		log.debug("ACTUALIZA"); 
		Dominio b = new Dominio();
		b.setIdDominio(1); 
		b.setDominio("ESTADO CIVIL"); 
		dominioS.actualiza(b);
		
		
		log.debug("ELIMINA"); 
		Dominio c = new Dominio();
		c.setIdDominio(1); 
		c.setDominio("CASADO"); 
		c.setHabilitado(EstadosHabilitacion.DESABILITADO.toString()); 
		dominioS.eliminar(c);
		
		log.debug("LISTA");   
		List<Dominio>  l =(List<Dominio>) dominioS.listar()[0];
		for (Dominio dominio : l) {
			log.debug("mira:"+dominio.getIdDominio()+"|"+dominio.getIdTabla());
		}
		
		log.debug("BUSCA"+a.getIdDominio());   
		List<Dominio>  l2 =(List<Dominio>) dominioS.buscar(a)[0];
		for (Dominio dominio : l2) {
			log.debug("mira:"+dominio.getIdDominio()+"|"+dominio.getIdTabla()+"|"+dominio.getDominio());
		}
		
		
		
		return "prueba/prueba"; 
	}

	 

 
	
	
}
