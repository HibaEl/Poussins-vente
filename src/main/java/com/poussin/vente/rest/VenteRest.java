/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.vente.rest;

import com.poussin.vente.bean.Vente;
import com.poussin.vente.rest.converter.VenteConverter;
import com.poussin.vente.rest.vo.VenteVo;
import com.poussin.vente.service.VenteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping({"/vente/ventes"})

public class VenteRest {
    
    @Autowired
     private VenteService venteService;
    private VenteConverter venteConverter;
    
     @GetMapping("/")
     public List<VenteVo> findAll() {
        return venteConverter.toVo( venteService.findAll());
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
   
   

    public VenteService getVenteService() {
        return venteService;
    }

    public void setVenteService(VenteService venteService) {
        this.venteService = venteService;
    }
    
    
}
