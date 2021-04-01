package com.example.demo.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class Taxe {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String refTaxe;
    @ManyToOne
    private TypeTaxe typeTaxe;
    @OneToMany(mappedBy = "taxe")
    private List<NotificationDgi> notificationDgis;
    @OneToMany(mappedBy = "taxe")
    private List<PaiementTaxe> paiementTaxes;
    @OneToMany(mappedBy = "taxe")
    private List<NotificationRedevable> notificationRedevables;

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
