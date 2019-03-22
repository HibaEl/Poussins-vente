/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.vente.dao;

import com.poussin.vente.bean.Client;
import com.poussin.vente.bean.Vente;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author SOUKAINA
 */
@Repository
public interface ClientDao extends JpaRepository<Client,Long> {
       public List<Client> findAll();
}
