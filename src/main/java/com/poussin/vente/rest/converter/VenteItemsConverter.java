/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.vente.rest.converter;

import com.poussin.vente.bean.VenteItem;
import com.poussin.vente.rest.vo.VenteItemVo;
import com.poussin.vente.util.NumberUtil;
import java.util.List;

/**
 *
 * @author hp
 */
public class VenteItemsConverter extends AbstractConverter<VenteItem, VenteItemVo>{
    
    

    public VenteItemsConverter() {
    }

 

    @Override
    public VenteItem toItem(VenteItemVo vo) {
        
        if(vo==null){
            return null;
        }else{
            VenteItem item=new VenteItem();
            item.setId(vo.getId());
            item.setNbreTotal(NumberUtil.toDouble(vo.getNbreTotal()));
            item.setPoids(NumberUtil.toDouble(vo.getPoids()));
            item.setPrix(NumberUtil.toDouble(vo.getPrix()));
            item.setPrixUnitaire(NumberUtil.toDouble(vo.getPrixUnitaire()));
            return item;
            
        }
    }

    @Override
    public VenteItemVo toVo(VenteItem item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}
