package com.haribon.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table( name=  "tb_area")
@Entity
public class Area  implements Serializable  {
 
	private static final long serialVersionUID = -7784163343897390669L;
	@Id 
	@Column(name = "cod_area" )
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codArea;
	@Column(name = "desc_area" )
	private String descArea;
//	private Object objecto;
	public Integer getCodArea() {
		return codArea;
	}
	public void setCodArea(Integer codArea) {
		this.codArea = codArea;
	}
	public String getDescArea() {
		return descArea;
	}
	public void setDescArea(String descArea) {
		this.descArea = descArea;
	}
//	public Object getObjecto() {
//		return objecto;
//	}
//	public void setObjecto(Object objecto) {
//		this.objecto = objecto;
//	}
	
}
