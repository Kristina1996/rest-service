
package com.krist.restservice.server.service;

import com.krist.restservice.server.entity.Client;
import com.krist.restservice.server.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserRepository repository;

    @Override
    public List<Client> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public Client getUserByID(Integer id) {
         return repository.getOne(id);
    }

    @Override
    public Client create(Client user) {
        return repository.saveAndFlush(user);
    }

    @Override
    public void remove(Integer id) {
        repository.deleteById(id);
    }
    
}
