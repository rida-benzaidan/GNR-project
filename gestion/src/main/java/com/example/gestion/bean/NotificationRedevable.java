package com.example.gestion.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NotificationRedevable {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double montantEstimation;
    private String typeEstimation;
    private String ref;
    private String refTypeTaxe;
    private String refRedevable;
    private String refSujetTaxe;
    private String dateNotification;

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

    public String getRefTypeTaxe() {
        return refTypeTaxe;
    }

    public void setRefTypeTaxe(String refTypeTaxe) {
        this.refTypeTaxe = refTypeTaxe;
    }

    public String getRefRedevable() {
        return refRedevable;
    }

    public void setRefRedevable(String refRedevable) {
        this.refRedevable = refRedevable;
    }

    public String getRefSujetTaxe() {
        return refSujetTaxe;
    }

    public void setRefSujetTaxe(String refSujetTaxe) {
        this.refSujetTaxe = refSujetTaxe;
    }

    public String getDateNotification() {
        return dateNotification;
    }

    public void setDateNotification(String dateNotification) {
        this.dateNotification = dateNotification;
    }
}
