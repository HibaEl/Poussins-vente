/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.vente.rest.converter;

import com.poussin.vente.bean.Vente;
import com.poussin.vente.rest.vo.VenteVo;
import com.poussin.vente.util.DateUtil;
import com.poussin.vente.util.NumberUtil;
import java.util.Date;
import org.springframework.stereotype.Component;

/**
 *
 * @author hp
 */
@Component
public class VenteConverter extends AbstractConverter<Vente, VenteVo> {

    @Override
    public Vente toItem(VenteVo vo) {
        if (vo == null) {
            return null;
        } else {
            Vente item = new Vente();
            item.setId(vo.getId());
            item.setNbreTotal(NumberUtil.toDouble(vo.getNbreTotal()));
            item.setReference(vo.getReference());
            if(vo.getDateVente()==null){
                item.setDateVente(new Date());
            }else{
                item.setDateVente(DateUtil.parse(vo.getDateVente()));
            }
            item.setPrixTotal(NumberUtil.toDouble(vo.getPrixTotal()));
            item.setVenteItems(new VenteItemsConverter().toItem(vo.getVenteItemsVo()));
            item.setClient(new ClientConverter().toItem(vo.getClient()));

            return item;

        }
    }

    @Override
    public VenteVo toVo(Vente item) {
        if (item == null) {
            return null;
        } else {
            VenteVo vo = new VenteVo();
            vo.setDateVente(DateUtil.formateDate("yyyy-MM-dd",item.getDateVente()));
            vo.setId(item.getId());
            vo.setNbreTotal(NumberUtil.toString(item.getNbreTotal()));
            vo.setReference(item.getReference());
            vo.setPrixTotal(NumberUtil.toString(item.getPrixTotal()));
            vo.setVenteItemsVo(new VenteItemsConverter().toVo(item.getVenteItems()));
            vo.setClient(new ClientConverter().toVo(item.getClient()));
            return vo;
        }

    }

}
