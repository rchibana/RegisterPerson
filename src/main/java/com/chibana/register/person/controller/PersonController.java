package com.chibana.register.person.controller;

import com.chibana.register.person.controller.response.PersonDTO;
import com.chibana.register.person.mapper.PersonMapper;
import com.chibana.register.person.model.Person;
import com.chibana.register.person.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public PersonDTO getPerson() {

        final Person person = personService.getPerson();

        return PersonMapper.INSTANCE.personToPersonDto(person);
    }

}
