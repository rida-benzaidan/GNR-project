package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PaiementRedevable {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String refRedevable;
    private String refTaxe;
    private String dernierAnne ;
    private double montant;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRefRedevable() {
        return refRedevable;
    }

    public void setRefRedevable(String refRedevable) {
        this.refRedevable = refRedevable;
    }

    public String getRefTaxe() {
        return refTaxe;
    }

    public void setRefTaxe(String refTaxe) {
        this.refTaxe = refTaxe;
    }

    public String getDernierAnne() {
        return dernierAnne;
    }

    public void setDernierAnne(String dernierAnne) {
        this.dernierAnne = dernierAnne;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

}
