package com.example.demo.bean;

import javax.persistence.*;

@Entity
public class NotificationRedevable {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String ref;
    private double montantEstimation;
    private String typeEstimation;
    private int numero;
    private String dateNotification;
    @ManyToOne
    private Taxe taxe;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getMontantEstimation() {
        return montantEstimation;
    }

    public void setMontantEstimation(double montantEstimation) {
        this.montantEstimation = montantEstimation;
    }

    public String getTypeEstimation() {
        return typeEstimation;
    }

    public void setTypeEstimation(String typeEstimation) {
        this.typeEstimation = typeEstimation;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getDateNotification() {
        return dateNotification;
    }

    public void setDateNotification(String dateNotification) {
        this.dateNotification = dateNotification;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
