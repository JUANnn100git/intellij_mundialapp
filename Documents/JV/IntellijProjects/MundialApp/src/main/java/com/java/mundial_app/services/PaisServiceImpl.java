package com.java.mundial_app.services;

import com.java.mundial_app.entities.Pais;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaisServiceImpl implements IPaisService {

    List<Pais> lista = new ArrayList<>();

    public PaisServiceImpl() {
        Pais p1 = new Pais();
        p1.setId(1);
        p1.setNombre("Perú");
        p1.setContinente("Sudamérica");
        p1.setImagen("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ea/Flag_of_Peru_%281825-1950%29.svg/800px-Flag_of_Peru_%281825-1950%29.svg.png");

        lista.add(p1);
    }

    @Override
    public List<Pais> getPaises() {
        return lista;
    }
}
