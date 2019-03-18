/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.vente.service.impl;

import com.poussin.vente.bean.Vente;
import com.poussin.vente.bean.VenteItem;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.poussin.vente.service.VenteItemService;
import com.poussin.vente.dao.VenteItemDao;

/**
 *
 * @author siham
 */
@Service
public class VenteItemServiceImpl implements VenteItemService{
    
    @Autowired
    private VenteItemDao venteItemDao1;
    
    public List<VenteItem> findByVenteReference(String reference) {
        return venteItemDao1.findByVenteReference(reference);
    }

    @Override
    public int creer(VenteItem venteItem) {
       venteItemDao1.save(venteItem);
        return 1;
    }

    public VenteItemDao getVenteItemDao1() {
        return venteItemDao1;
    }

    public void setVenteItemDao1(VenteItemDao venteItemDao1) {
        this.venteItemDao1 = venteItemDao1;
    }

    
   

    
    
    
    
    
}
