package com.allinone.service;

import com.allinone.dao.DevelopersRepository;
import com.allinone.model.Developers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DevelopersService {

    @Autowired
    DevelopersRepository repository;

    public Developers saveAlien(Developers developers){

        return repository.save(developers);
    }
    public List<Developers> getAllAliens(){

        return repository.findAll();
    }

    public Optional<Developers> getAlien(int id){
        return repository.findById(id);
    }

    public void deleteById(int id){
       repository.deleteById(id);
    }
}
