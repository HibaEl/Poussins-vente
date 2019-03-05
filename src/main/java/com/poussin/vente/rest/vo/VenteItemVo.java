/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.vente.rest.vo;

/**
 *
 * @author hp
 */
public class VenteItemVo {

    private Long id;
    private String poids;
    private String nbreTotal;

    private VenteVo venteVo;
    private String prixUnitaire;
    private String prix;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPoids() {
        return poids;
    }

    public void setPoids(String poids) {
        this.poids = poids;
    }

    public String getNbreTotal() {
        return nbreTotal;
    }

    public void setNbreTotal(String nbreTotal) {
        this.nbreTotal = nbreTotal;
    }

    public VenteVo getVenteVo() {
        return venteVo;
    }

    public void setVenteVo(VenteVo venteVo) {
        this.venteVo = venteVo;
    }

    public String getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(String prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

}
