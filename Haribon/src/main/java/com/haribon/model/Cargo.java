package com.haribon.model;

import java.io.Serializable;

public class Cargo  extends TodoObjeto implements Serializable {
 
	private static final long serialVersionUID = -6429233081961626572L;
	private Integer codCargo;
	private String descCargo;
	private Area area;
	public Integer getCodCargo() {
		return codCargo;
	}
	public void setCodCargo(Integer codCargo) {
		this.codCargo = codCargo;
	}
	public String getDescCargo() {
		return descCargo;
	}
	public void setDescCargo(String descCargo) {
		this.descCargo = descCargo;
	}
	public Area getArea() {
		return area;
	}
	public void setArea(Area area) {
		this.area = area;
	}
	
	
	
	
	
}
