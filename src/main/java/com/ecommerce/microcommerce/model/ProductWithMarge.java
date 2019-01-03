package com.ecommerce.microcommerce.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

@Entity
public class ProductWithMarge {
    @Id
    @GeneratedValue
    private int id;
    @Length(min=3, max=20)
    private String nom;
    @Min(value = 1)
    private int prix;
    //information que nous ne souhaitons pas exposer
    private int marge;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getMarge() {
        return marge;
    }

    public void setMarge(int marge) {
        this.marge = marge;
    }


    public ProductWithMarge(int id, String nom, int prix, int marge){
        this.id=id;
        this.nom=nom;
        this.prix=prix;
        this.marge=marge;
    }
}
