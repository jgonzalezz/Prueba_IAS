package com.test.ias.appaves.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tont_paises")
public class Pais implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8070375956934820430L;

	@Id
	@Column(name = "cdpais", length = 3)
	private String cdpais;
	
	@Column(name = "dsnombre", length = 100)
	private String nombrePais;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cdzona", referencedColumnName="cdzona")
	private Zona zona;

	public String getCdpais() {
		return cdpais;
	}

	public void setCdpais(String cdpais) {
		this.cdpais = cdpais;
	}

	public String getNombrePais() {
		return nombrePais;
	}

	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}

	

	

	
	
	

}
