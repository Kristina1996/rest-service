/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.krist.restservice.server.controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.krist.restservice.server.entity.Client;
import com.krist.restservice.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 4200)
@RestController
public class UserController {
    
    @Autowired
    private UserService service;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public List<Client> getAllUsers() {
        return service.getAllUsers();
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Client getUser(@PathVariable("id") Integer id) {
        return service.getUserByID(id);
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @ResponseBody
    public Client createUser(@RequestBody Client user) {
        return service.create(user);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteUser(@PathVariable Integer id) {
        service.remove(id);
    }
    
}
