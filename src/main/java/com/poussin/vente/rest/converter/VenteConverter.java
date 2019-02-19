/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.vente.rest.converter;

import com.poussin.vente.bean.Client;
import com.poussin.vente.bean.Vente;
import com.poussin.vente.rest.vo.VenteVo;
import com.poussin.vente.util.NumberUtil;
import java.util.List;

/**
 *
 * @author hp
 */
public class VenteConverter extends AbstractConverter <Vente, VenteVo>{
    

    @Override
    public Vente toItem(VenteVo vo) {
        if(vo==null){
            return null;
        }
        else{
           Vente item=new Vente();
           item.setId(vo.getId());
           item.setNbreTotal(NumberUtil.toDouble(vo.getNbreTotal()));
           item.setReference(vo.getReference());
           //item.setDateVente(vo.getDateVente());
           item.setPrixTotal(NumberUtil.toDouble(vo.getPrixTotal()));
           //item.setVenteItems(new VenteItemsConverter().toItem(vo.getVenteItemsVo()));
           //item.setClient(new ClientConverter().toItem(vo.getClientVo()));
           
           return item;

           
            
         }
     }

    /*@Override
    public VenteVo toVo(Vente item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vente> toItem(List<VenteVo> vos) {
        return null;
    }

    @Override
    public List<Vente> toVo(List<Vente> items) {
        return null;
    }*/



    @Override
    public VenteVo toVo(Vente item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
