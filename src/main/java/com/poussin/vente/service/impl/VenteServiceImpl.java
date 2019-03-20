/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.vente.service.impl;

import com.poussin.vente.bean.Vente;
import com.poussin.vente.bean.VenteItem;
import com.poussin.vente.dao.VenteDao;
import com.poussin.vente.rest.vo.VenteVo;
import com.poussin.vente.service.VenteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import com.poussin.vente.service.VenteItemService;
import java.util.Date;

/**
 *
 * @author siham
 */
@Service
public class VenteServiceImpl implements VenteService {

    @Autowired
    private VenteDao venteDao;

    @Autowired
    private VenteItemService venteItemService1;

    @Override
    public Vente findByReference(String reference) {
        return venteDao.findByReference(reference);
    }
    @Override
    public List<Vente> findAll() {
        return venteDao.findAll();
    }
    
   

    @Override
    public int creer(Vente vente) {

        Vente v = findByReference(vente.getReference());
        if (v != null) {
            return -1;
        } else if (vente.getVenteItems() == null) {
            return -2;
        } else {
            calculPrix(vente);
            vente.setDateVente(new Date());
            
            venteDao.save(vente);
            List<VenteItem> venteItems = vente.getVenteItems();
            for (VenteItem venteItem : venteItems) {
                venteItem.setVente(vente);
                venteItemService1.creer(venteItem);

            }
            return 1;
        }

    }
    
    

    public VenteDao getVenteDao() {
        return venteDao;
    }

    public void setVenteDao(VenteDao venteDao) {
        this.venteDao = venteDao;
    }

    public VenteItemService getVenteItemService1() {
        return venteItemService1;
    }

    public void setVenteItemService1(VenteItemService venteItemService1) {
        this.venteItemService1 = venteItemService1;
    }

    @Override
    public int calculPrix(Vente vente) {
        if (vente.getVenteItems() == null) {
            return -1;
        } else {
            List<VenteItem> venteItems = vente.getVenteItems();
            Double prix = 0D;
            Double prixTotal = 0D;

            for (VenteItem venteItem : venteItems) {
                prix = venteItem.getNbreTotal() * venteItem.getPrixUnitaire();
                venteItem.setPrix(prix);
                prixTotal += prix;
            }
            vente.setPrixTotal(prixTotal);
            return 1;
        }

    }



    @Override
    public Vente creer(VenteVo venteVo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
