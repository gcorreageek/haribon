package com.haribon.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.haribon.model.Dominio;
import com.haribon.repository.DominioDAO;
import com.haribon.util.EstadosCodigo;
import com.haribon.util.MetodosDefault;

@Service
public class DominioServiceImpl implements DominioService  {
	private final Log log = LogFactory.getLog(getClass());
	 
	@Autowired
    DominioDAO dao; 
	
	private Object[] tipoCrud(Dominio a,MetodosDefault m){
		Object[] o = new Object[]{null,new Object[]{EstadosCodigo.VACIO,null}}; 
		try { 
			switch (m) {
			case INSERT:
				 dao.insertar(a);
				break;
			case UPDATE: 
			case DELETE:
				 dao.actualiza(a);
				break; 
			default: 
				log.fatal("No tiene que entrar aki VACIO");
				return o; 
			}
			o = new Object[]{a,new Object[]{EstadosCodigo.SIN_ERROR,null}};
		} catch (Exception e) { 
			log.error("error "+m.toString()+" E:",e);
			o = new Object[]{null,new Object[]{EstadosCodigo.CON_ERROR ,null}};
		} 
		return o;
	}
	private Object[] tipoLista(Dominio a,MetodosDefault m){
		Object[] o = new Object[]{null,new Object[]{EstadosCodigo.VACIO,null}}; 
		try {
			Object r = null;
			switch (m) { 
			case LIST:
				r = dao.listar();
				break;
			case SEARCH: 
				r = dao.buscar(a);
				break;
			default: 
				log.fatal("No tiene que entrar aki VACIO");
				return o;
			}
			o = new Object[]{r,new Object[]{EstadosCodigo.SIN_ERROR,null}};
		} catch (Exception e) { 
			log.error("error "+m.toString()+" E:",e);
			o = new Object[]{null,new Object[]{EstadosCodigo.CON_ERROR ,null}};
		} 
		return o;
	}
	  
	@Transactional
	@Override
	public  Object[] insertar(Dominio a) { 
		return tipoCrud(a, MetodosDefault.INSERT);
	}
	@Transactional
	@Override
	public Object[] actualiza(Dominio a) { 
		Dominio d = new Dominio();
		d.setIdDominio(a.getIdDominio());
		d.setHabilitado(a.getHabilitado()); 
		return tipoCrud(d,  MetodosDefault.UPDATE);
	}
	@Transactional
	@Override
	public Object[] eliminar(Dominio a) { 
		return tipoCrud(a,  MetodosDefault.UPDATE);
	}

	@Override
	public Object[] listar() { 
		return tipoLista(null, MetodosDefault.LIST);
	}

	@Override
	public Object[] buscar(Dominio a) { 
		return tipoLista(a, MetodosDefault.SEARCH);
	} 
	
}
