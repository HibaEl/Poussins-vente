/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.vente.service;

import com.poussin.vente.bean.Vente;
import com.poussin.vente.rest.vo.VenteVo;
import java.util.List;

/**
 *
 * @author siham
 */
public interface VenteService {
    
public int creer(Vente vente);
public int calculPrix(Vente vente);


    public Vente findByReference(String reference);

    public Vente creer(VenteVo venteVo);
    
    public List<Vente>findAll();
    
    
}
