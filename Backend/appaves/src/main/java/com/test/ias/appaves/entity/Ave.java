package com.test.ias.appaves.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tont_aves")
public class Ave implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3044954831173127473L;

	@Id
	@Column(name="cdave",length=5)
	private String cdave;
	
	@Column(name="dsnombre_comun",length=100)
	private String nombreComun;
	
	@Column(name="dsnombre_cientifico",length=200)
	private String nombreCientifico;

	public Ave() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ave(String cdave, String nombreComun, String nombreCientifico) {
		super();
		this.cdave = cdave;
		this.nombreComun = nombreComun;
		this.nombreCientifico = nombreCientifico;
	}

	public String getCdave() {
		return cdave;
	}

	public void setCdave(String cdave) {
		this.cdave = cdave;
	}

	public String getNombreComun() {
		return nombreComun;
	}

	public void setNombreComun(String nombreComun) {
		this.nombreComun = nombreComun;
	}

	public String getNombreCientifico() {
		return nombreCientifico;
	}

	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}

	
	




	



	
	

	
}
