/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.vente.service;

import com.poussin.vente.bean.Vente;
import com.poussin.vente.bean.VenteItem;
import java.util.List;

/**
 *
 * @author siham
 */
public interface VenteItemService {
    
    public List<VenteItem> findByVenteReference(String reference);
    public int creer(VenteItem venteItem);
}    

