/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.vente.service.impl;

import com.poussin.vente.bean.Vente;
import com.poussin.vente.bean.VenteItem;
import com.poussin.vente.dao.VenteItemDao1;
import com.poussin.vente.service.VenteItemService1;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author siham
 */
@Service
public class VenteItemServiceImpl1 implements VenteItemService1{
    
    @Autowired
    private VenteItemDao1 venteItemDao1;
    
    public List<VenteItem> findByVente(Vente vente) {
        return venteItemDao1.findByVente(vente);
    }

    @Override
    public int creer(VenteItem venteItem) {
       venteItemDao1.save(venteItem);
        return 1;
    }

    public VenteItemDao1 getVenteItemDao1() {
        return venteItemDao1;
    }

    public void setVenteItemDao1(VenteItemDao1 venteItemDao1) {
        this.venteItemDao1 = venteItemDao1;
    }

    
   

    
    
    
    
    
}
