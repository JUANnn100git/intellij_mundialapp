package com.java.mundial_app.controllers;

import com.java.mundial_app.entities.Pais;
import com.java.mundial_app.services.IPaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class MundialController {

    @Autowired
    IPaisService paisService;

    @GetMapping("/paises")
    public List<Pais> getPaises(){
        return paisService.getPaises();
    }
}
