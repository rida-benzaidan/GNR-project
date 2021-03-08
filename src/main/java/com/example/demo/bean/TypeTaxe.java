package com.example.demo.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class TypeTaxe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String refTypeTaxe;
	private String typeTaxe;
	@OneToMany(mappedBy = "typeTaxe")
	private List<Taxe> taxes;
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
