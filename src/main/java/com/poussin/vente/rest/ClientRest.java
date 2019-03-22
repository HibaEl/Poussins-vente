/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.vente.rest;

import com.poussin.vente.bean.Client;
import com.poussin.vente.rest.converter.AbstractConverter;
import com.poussin.vente.rest.vo.ClientVo;
import com.poussin.vente.service.ClientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author SOUKAINA
 */
@RestController()
@CrossOrigin(origins = ("http://localhost:4200"))
@RequestMapping({"/vente/clients"})

public class ClientRest {
      @Autowired
     private ClientService clientService;

    public ClientService getClientService() {
        return clientService;
    }

    public void setClientService(ClientService clientService) {
        this.clientService = clientService;
    }
        @Autowired
    @Qualifier("clientConverter")
    private AbstractConverter<Client, ClientVo> clientConverter;

    public List<ClientVo> findAll() {
        return clientConverter.toVo(clientService.findAll());
    }
        
        
    
}
