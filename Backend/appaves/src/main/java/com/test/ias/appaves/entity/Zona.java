package com.test.ias.appaves.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tont_zonas")
public class Zona implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2014369822164467411L;

	@Id
	@Column(name = "cdzona", length = 3)
	private String cdzona;

	@Column(name = "dsnombre", length = 45)
	private String nombreZona;

	public String getCdzona() {
		return cdzona;
	}

	public void setCdzona(String cdzona) {
		this.cdzona = cdzona;
	}

	public String getNombreZona() {
		return nombreZona;
	}

	public void setNombreZona(String nombreZona) {
		this.nombreZona = nombreZona;
	}

	

}
