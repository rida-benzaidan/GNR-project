package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Taxe {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String refTaxe;
    private String refTypeTaxe;
    private String libelle;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRefTaxe() {
        return refTaxe;
    }

    public void setRefTaxe(String refTaxe) {
        this.refTaxe = refTaxe;
    }

    public String getRefTypeTaxe() {
        return refTypeTaxe;
    }

    public void setRefTypeTaxe(String refTypeTaxe) {
        this.refTypeTaxe = refTypeTaxe;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getPeriodicite() {
        return periodicite;
    }

    public void setPeriodicite(String periodicite) {
        this.periodicite = periodicite;
    }

    private String periodicite;


}
