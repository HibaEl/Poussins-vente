/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.vente.rest.converter;

import com.poussin.vente.bean.VenteItem;
import com.poussin.vente.rest.vo.VenteItemVo;
import com.poussin.vente.util.NumberUtil;
import org.springframework.stereotype.Component;

/**
 *
 * @author hp
 */
@Component
public class VenteItemsConverter extends AbstractConverter<VenteItem, VenteItemVo> {

    public VenteItemsConverter() {
    }

    @Override
    public VenteItem toItem(VenteItemVo vo) {

        if (vo == null) {
            return null;
        } else {
            VenteItem item = new VenteItem();
            item.setId(vo.getId());
            item.setNbreTotal(NumberUtil.toDouble(vo.getNbreTotal()));
            item.setPoids(NumberUtil.toDouble(vo.getPoids()));
            item.setPrix(NumberUtil.toDouble(vo.getPrix()));
            item.setPrixUnitaire(NumberUtil.toDouble(vo.getPrixUnitaire()));
            item.setVente(new VenteConverter().toItem(vo.getVenteVo()));
            return item;

        }
    }

    @Override
    public VenteItemVo toVo(VenteItem item) {
        if (item == null) {
            return null;
        } else {
            VenteItemVo vo = new VenteItemVo();
            vo.setId(item.getId());
            vo.setNbreTotal(NumberUtil.toString(item.getNbreTotal()));
            vo.setPrixUnitaire(NumberUtil.toString(item.getPrixUnitaire()));
            vo.setPrix(NumberUtil.toString(item.getPrix()));
            vo.setVenteVo(new VenteConverter().toVo(item.getVente()));
            vo.setPoids(NumberUtil.toString(item.getPoids()));
            return vo;
        }

    }
}
