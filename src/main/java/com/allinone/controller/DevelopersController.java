package com.allinone.controller;

import com.allinone.model.Developers;
import com.allinone.service.DevelopersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/developer")
public class DevelopersController {


    @Autowired
    DevelopersService service;

    @GetMapping("/ping")
    public ResponseEntity ping() {
        return new ResponseEntity("pong", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveDeveloper(@RequestBody Developers developers) {

        return new ResponseEntity(service.saveDevelopers(developers), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getAllDevelopers() {
        return new ResponseEntity(service.getAllDevelopers(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity getDeveloperById(@PathVariable Integer id) {
        return new ResponseEntity(service.getDeveloperById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteDeveloperById(@PathVariable Integer id) {
        service.deleteDeveloperById(id);
        return new ResponseEntity(1, HttpStatus.OK);
    }
}
