/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.vente.rest.converter;

import com.poussin.vente.bean.Client;
import com.poussin.vente.rest.vo.ClientVo;

/**
 *
 * @author hp
 */
public class ClientConverter extends AbstractConverter <Client, ClientVo>{

    @Override
    public Client toItem(ClientVo vo) {
        if(vo==null){
            return null;
        }else{
            Client item=new Client();
            item.setAdr(vo.getAdr());
            item.setId(vo.getId());
            item.setNom(vo.getNom());
            item.setPrenom(vo.getPrenom());
                    return item;
            
        }
    }

    @Override
    public ClientVo toVo(Client item) {
        if(item==null){
            return null;
        }else{
            ClientVo vo=new ClientVo();
            vo.setAdr(item.getAdr());
            vo.setId(item.getId());
            vo.setNom(item.getNom());
            vo.setPrenom(item.getPrenom());
            return vo;
        }
    }
    
}
