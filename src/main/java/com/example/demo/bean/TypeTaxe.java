package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TypeTaxe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String refTypeTaxe;
	private String typeTaxe;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRefTypeTaxe() {
		return refTypeTaxe;
	}
	public void setRefTypeTaxe(String refTypeTaxe) {
		this.refTypeTaxe = refTypeTaxe;
	}
	public String getTypeTaxe() {
		return typeTaxe;
	}
	public void setTypeTaxe(String typeTaxe) {
		this.typeTaxe = typeTaxe;
	}
	
}
