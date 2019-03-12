/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.vente.rest;

import com.poussin.vente.bean.Vente;
import com.poussin.vente.bean.VenteItem;
import com.poussin.vente.rest.converter.AbstractConverter;
import com.poussin.vente.rest.converter.VenteConverter;
import com.poussin.vente.rest.vo.VenteItemVo;
import com.poussin.vente.rest.vo.VenteVo;
import com.poussin.vente.service.VenteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author siham
 */
@RestController()
@CrossOrigin(origins=("http://localhost:4200"))
@RequestMapping({"/vente/vente-items"})

public class VenteItemRest1 {
    
    @Autowired
     private VenteItemService venteItemService;
  
    
    @Autowired
    @Qualifier("venteItemConverter")
    private AbstractConverter<VenteItem,VenteItemVo>venteItemConverter;
    
    @Autowired
    @Qualifier("venteConverter")
    private AbstractConverter <Vente,VenteVo> venteConverter;
    
    
     @GetMapping("/")
     public List<VenteItemVo> findAll(VenteVo venteVo) {
       final List<VenteItem>venteItems= venteItemService.findByVente(venteConverter.toItem(venteVo));
        return venteItemConverter.toVo(venteItems);
    }
     
     @PostMapping("/")
    public int creer(@RequestBody VenteVo venteVo) {
        VenteConverter venteConverter=new VenteConverter();
      Vente vente=new VenteConverter().toItem(venteVo);  
      return  venteService.creer(vente);
    }
    
    
   @GetMapping("/reference/{reference}")
   public VenteVo findByReference(@PathVariable("reference") String reference) {
       
        return new VenteConverter().toVo(venteService.findByReference( reference ));
   }

    public VenteItemService getVenteItemService() {
        return venteItemService;
    }

    public void setVenteItemService(VenteItemService venteItemService) {
        this.venteItemService = venteItemService;
    }
   
   

    

  
 
    
    
}
