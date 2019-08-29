package com.chibana.register.person.service;

import com.chibana.register.person.model.Person;
import org.springframework.stereotype.Service;

public interface PersonService {

    Person getPerson();
    Person savePerson();
    Person updatePerson();
    Person deletePerson();

}
