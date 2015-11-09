package com.astontech.astonengineer.services;

import com.astontech.astonengineer.domain.Ent;

/**
 * Created by Bipin on 10/15/2015.
 */
public interface EntService {

    Iterable<Ent> listAllEnts();

    Ent getEntById(Integer id);

    Ent saveEnt(Ent ent);

    void deleteEnt(Integer id);
}
