package com.example.gemfiredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person save(Person person) {
        return personRepository.save(person);
    }

    public Person getPerson(Long id) {
        return personRepository.findById(id).orElse(null);
    }
}
