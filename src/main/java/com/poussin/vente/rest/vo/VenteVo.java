/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.vente.rest.vo;

import java.util.List;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author hp
 */
public class VenteVo {
    
    private Long id;
    private String reference;
    private String nbreTotal;
    private String dateVente;
    private ClientVo clientVo;
    private String prixTotal;
    private List<VenteItemVo> venteItems;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getNbreTotal() {
        return nbreTotal;
    }

    public void setNbreTotal(String nbreTotal) {
        this.nbreTotal = nbreTotal;
    }

    public String getDateVente() {
        return dateVente;
    }

    public void setDateVente(String dateVente) {
        this.dateVente = dateVente;
    }

    public ClientVo getClient() {
        return clientVo;
    }

    public void setClient(ClientVo clientVo) {
        this.clientVo = clientVo;
    }

    public String getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(String prixTotal) {
        this.prixTotal = prixTotal;
    }

    public List<VenteItemVo> getVenteItems() {
        return venteItems;
    }

    public void setVenteItems(List<VenteItemVo> venteItems) {
        this.venteItems = venteItems;
    }
    
    
    
}
