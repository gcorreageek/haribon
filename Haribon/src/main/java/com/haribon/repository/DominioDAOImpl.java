package com.haribon.repository;
 

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.haribon.model.Dominio;

 
@Repository
public class DominioDAOImpl  implements DominioDAO {
	  
	@PersistenceContext
	private EntityManager em;
	 

	@Override
	public Dominio insertar(Dominio a)throws Exception { 
		em.persist(a);    
		return a;
	}
	@Override
	public Dominio actualiza(Dominio a)throws Exception {   
		em.merge(a);  
		return a;
	} 
	@Override
	public List<Dominio> listar()throws Exception { 
		return em.createNamedQuery("Dominio.findAll",Dominio.class).getResultList();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Dominio> buscar(Dominio a)throws Exception {
		Query q =  em.createNamedQuery("Dominio.findId",Dominio.class);
		q.setParameter(1, a.getIdDominio()); 
        return q.getResultList();
	}

	 
	 
 
}
