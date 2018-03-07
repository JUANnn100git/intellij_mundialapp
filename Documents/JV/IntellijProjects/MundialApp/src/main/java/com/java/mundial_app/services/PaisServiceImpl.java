package com.java.mundial_app.services;

import com.java.mundial_app.dao.IPaisDao;
import com.java.mundial_app.entities.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaisServiceImpl implements IPaisService {

    @Autowired
    IPaisDao paisDao;

    @Override
    public List<Pais> getPaises() {
        return paisDao.findAll();
    }
}
