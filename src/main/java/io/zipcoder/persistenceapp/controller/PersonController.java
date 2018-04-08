package io.zipcoder.persistenceapp.controller;

import io.zipcoder.persistenceapp.entity.Person;
import io.zipcoder.persistenceapp.services.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * project: persistence-starter
 * package: io.zipcoder.persistenceapp.controller
 * author: https://github.com/vvmk
 * date: 4/7/18
 */

@RestController
public class PersonController {

    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping(value = "/people", method = GET)
    public ResponseEntity<Iterable<Person>> getAllPeople() {
        return null;
    }

    @RequestMapping(value = "/people", method = POST)
    public ResponseEntity<?> createPerson(@RequestBody Person person) {
        return null;
    }

    @RequestMapping(value = "/people/{id}", method = PUT)
    public ResponseEntity<?> updatePerson(@RequestBody Person person, @PathVariable Long id) {
        return null;
    }

    @RequestMapping(value = "/people/{id}", method = GET)
    public ResponseEntity<Person> getPerson(@PathVariable Long id) {
        return null;
    }

    @RequestMapping(value = "/people/{id}", method = DELETE)
    public ResponseEntity<?> deletePerson(@PathVariable Long id) {
        return null;
    }

    @RequestMapping(value="/people/reverselookup/{mobile}", method = GET)
    public ResponseEntity<Iterable<Person>> reverseLookup(@PathVariable String mobile) {
         return null;
    }

    @RequestMapping(value="/people/surname/{lastName}", method = GET)
    public ResponseEntity<Map<String, List<Person>>> surnameLookup(@PathVariable String lastName) {
        return null;
    }

    @RequestMapping(value="/people/firstname/stats", method = GET)
    public ResponseEntity<Map<String, Integer>> firstNameStats() {
        return null;
    }
}
