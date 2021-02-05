package com.allinone.service;

import com.allinone.advice.ResourceNotFoundException;
import com.allinone.dao.DevelopersRepository;
import com.allinone.model.Developers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DevelopersService {

    @Autowired
    DevelopersRepository repository;

    public Developers saveDevelopers(Developers developers){

        return repository.save(developers);
    }
    public List<Developers> getAllDevelopers(){

        return repository.findAll();
    }

    public Developers getDeveloperById(int id){
        return repository.findById(id).orElseThrow(()->new ResourceNotFoundException("User not found with id :" + id));
    }

    public void deleteDeveloperById(int id){

        Developers existingUser = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id :" + id));

        repository.delete(existingUser);
    }
}
