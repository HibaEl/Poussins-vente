/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.vente.rest;

import com.poussin.vente.bean.Vente;
import com.poussin.vente.service.VenteService;
import org.springframework.beans.factory.annotation.Autowired;
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


@RequestMapping({"/vente/ventes"})
public class VenteRest {
    
    @Autowired
     private VenteService venteService;


    
    @PostMapping("/")
    public int creer(@RequestBody Vente vente) {
        return venteService.creer(vente);
    }
    
    
   @GetMapping("/reference/{reference}")
   public Vente findByReference(@PathVariable String reference) {
        return venteService.findByReference( reference );
   }
   
   

    public VenteService getVenteService() {
        return venteService;
    }

    public void setVenteService(VenteService venteService) {
        this.venteService = venteService;
    }
    
    
}
