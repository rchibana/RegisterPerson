package com.chibana.register.person.service;

import com.chibana.register.person.model.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Override
    public Person getPerson() {

        final Person person = new Person();

        return person;
    }

    @Override
    public Person savePerson() {
        return null;
    }

    @Override
    public Person updatePerson() {
        return null;
    }

    @Override
    public Person deletePerson() {
        return null;
    }
}
