/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.vente.dao;

import com.poussin.vente.bean.Vente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author siham
 */

@Repository
public interface VenteDao extends JpaRepository<Vente,Long>{
    
 

    public Vente findByReference(String reference);
    //public Vente findBy
}
