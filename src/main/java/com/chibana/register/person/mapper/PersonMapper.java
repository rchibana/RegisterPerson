package com.chibana.register.person.mapper;

import com.chibana.register.person.controller.response.PersonDTO;
import com.chibana.register.person.model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    PersonDTO personToPersonDto(Person person);

}
