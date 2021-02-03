package com.allinone.controller;

import com.allinone.model.Developers;
import com.allinone.service.DevelopersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("alien")
public class DevelopersController {


    @Autowired
    DevelopersService service;

    @GetMapping("/ping")
    public ResponseEntity ping() {
        return new ResponseEntity("pong", HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity saveAlien(@RequestBody Developers developers) {

        return new ResponseEntity(service.saveAlien(developers), HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity getAllAlien() {
        return new ResponseEntity(service.getAllAliens(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity getAlienById(@RequestParam Integer id) {
        return new ResponseEntity(service.getAlien(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteAlien(@RequestParam Integer id) {

        try {
            service.deleteById(id);
            return new ResponseEntity(1, HttpStatus.OK);
        } catch (Exception ex) {
            service.deleteById(id);
            return new ResponseEntity(ex, HttpStatus.OK);
        }
    }
}
