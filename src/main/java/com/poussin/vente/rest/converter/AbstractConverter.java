/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.vente.rest.converter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public abstract class  AbstractConverter<V,VO> {
    
    public abstract V toItem(VO vo);
    public abstract VO toVo(V item);
    
    
    
    
    public List<V> toItem(List<VO> vos ){
        if(vos==null || vos.isEmpty()){
            return null;
        }else{
            List<V>items=new ArrayList();
            for (VO vo : vos) {
                items.add(toItem(vo));
                
            }
            return items;
        }
        
    }
    public List<VO> toVo(List<V> items ){
        
        if(items==null || items.isEmpty()){
            return null;
        }else{
            List<VO>vos=new ArrayList();
            for (V item : items) {
                vos.add(toVo(item));
                
            }
            return vos;
        
        
        
        
        
    }
}
}