package com.astontech.astonengineer.services;

import com.astontech.astonengineer.domain.Ent;
import com.astontech.astonengineer.repositories.EntRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Bipin on 10/15/2015.
 */
public class EntServiceImpl implements EntService {

    @Autowired
    private EntRepository entRepository;

    @Override
    public Iterable<Ent> listAllEnts() {
        return entRepository.findAll();
    }

    @Override
    public Ent getEntById(Integer id) {
        return entRepository.findOne(id);
    }

    @Override
    public Ent saveEnt(Ent ent) {
        return entRepository.save(ent);
    }

    @Override
    public void deleteEnt(Integer id) {
        entRepository.delete(id);
    }
}
