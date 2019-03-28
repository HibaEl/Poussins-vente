/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.vente.rest.vo;

import java.util.List;

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
    private List<VenteItemVo> venteItemsVo;

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

    public ClientVo getClientVo() {
        return clientVo;
    }

    public void setClientVo(ClientVo clientVo) {
        this.clientVo = clientVo;
    }

    public List<VenteItemVo> getVenteItemsVo() {
        return venteItemsVo;
    }

    public void setVenteItemsVo(List<VenteItemVo> venteItemsVo) {
        this.venteItemsVo = venteItemsVo;
    }

  
    
    
    
}
