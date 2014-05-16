package com.haribon.repository;
 

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.haribon.model.Area;

//Nota: La etiqueta @Repository, funcionara siempre y cuando se llame atraves de un @Autowired a una
//instancia de esta clase, si se llama por medio de una instancia del tipo 'Clase a = new Clase()' no
//funcionara.
@Repository
public class MySqlJdbcAreaDAO  implements AreaDAO {
	private final Log log = LogFactory.getLog(getClass()); 
	  
	@PersistenceContext
	private EntityManager entityManager;
	
//	@Autowired
//	private SessionFactory sessi;
	 
	 
	@Override
	public Area insertarArea(Area a) { 
		log.debug("here insert dao area"); 
		entityManager.persist(a); 
		log.debug("codigo:"+a.getCodArea());// no setea el codigo!
		return a;
	}

	 
	 
 
}
