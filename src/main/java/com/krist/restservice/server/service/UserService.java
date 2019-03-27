/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.krist.restservice.server.service;

import com.krist.restservice.server.entity.Client;
import java.util.List;

/**
 *
 * @author krist
 */
public interface UserService {
    
    List<Client> getAllUsers();
    
    Client getUserByID(Integer id);
    
    Client create(Client user);
    
    void remove(Integer id);
    
}
