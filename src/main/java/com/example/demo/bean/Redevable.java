package com.example.demo.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class Redevable {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String ref;
    private String nom;
    private String prenom;
    @OneToMany(mappedBy = "redevable")
    private List <NotificationDgi> notificationDgis;
    @OneToMany(mappedBy = "redevable")
    private List <PaiementRedevable> paiementRedevables;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
