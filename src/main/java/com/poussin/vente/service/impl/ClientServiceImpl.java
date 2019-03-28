/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.vente.service.impl;
import com.poussin.vente.bean.Client;
import com.poussin.vente.dao.ClientDao;
import com.poussin.vente.service.ClientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author SOUKAINA
 */
@Service
public class ClientServiceImpl implements ClientService {

     @Autowired
     private ClientDao clientDao;

    @Override
    public List<Client> findAll() {
        return clientDao.findAll();
    }
}


