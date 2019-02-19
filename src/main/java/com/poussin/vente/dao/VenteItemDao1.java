/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.vente.dao;

import com.poussin.vente.bean.VenteItem;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author siham
 */
@Repository
public interface VenteItemDao1 extends JpaRepository<VenteItem,Long>{
    

    public List<VenteItem> findByVenteReference(String reference);
}
