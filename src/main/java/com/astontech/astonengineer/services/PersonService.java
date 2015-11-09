package com.astontech.astonengineer.services;

import com.astontech.astonengineer.domain.Person;

/**
 * Created by Bipin on 10/6/2015.
 */
public interface PersonService {

    Iterable<Person> listAllPersons();

    Person getPersonById(Integer id);

    Person savePerson(Person person);

    void deletePerson(Integer id);
}
