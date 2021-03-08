package com.example.demo.bean;

import javax.persistence.*;

@Entity
public class PaiementRedevable {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    @ManyToOne
    private  Redevable redevable;
    @ManyToOne
    private  Taxe taxe;
    private String dernierAnne ;
    private double montant;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
