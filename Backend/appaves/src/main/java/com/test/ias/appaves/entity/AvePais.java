package com.test.ias.appaves.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tont_aves_pais")
public class AvePais implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3083258860095019422L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cdpais" , referencedColumnName= "cdpais",nullable= false)
	private Pais pais;
	
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cdave" , referencedColumnName= "cdave",nullable= false)
	private Ave ave;

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Ave getAve() {
		return ave;
	}

	public void setAve(Ave ave) {
		this.ave = ave;
	}
	
	

}
