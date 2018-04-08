package io.zipcoder.persistenceapp.services;

import io.zipcoder.persistenceapp.entity.Person;
import io.zipcoder.persistenceapp.repository.PersonRepository;
import io.zipcoder.persistenceapp.services.serviceinterface.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * project: persistence-starter
 * package: io.zipcoder.persistenceapp
 * author: https://github.com/vvmk
 * date: 4/7/18
 */

@Service()
public class JpaPersonService implements PersonService {
    private static final Logger log = LoggerFactory.getLogger(JpaPersonService.class);

    private PersonRepository personRepo;

    @Autowired
    public JpaPersonService(PersonRepository personRepo) {
        this.personRepo = personRepo;
    }

    public ResponseEntity<Iterable<Person>> getAllPeople() {
        return null;
    }

    public ResponseEntity<?> addPerson(Person person) {
        return null;
    }

    public ResponseEntity<?> updatePerson(Person person) {
        return null;
    }

    public ResponseEntity<?> removePerson(Long personId) {
        return null;
    }

    public ResponseEntity<?> removeAll(Collection<Person> people) {
        return null;
    }

    public ResponseEntity<Iterable<Person>> findByFirstName(String firstname) {
        return null;
    }

    public ResponseEntity<Iterable<Person>> getFirstNameStats(String firstname) {
        throw new UnsupportedOperationException();
    }

    public ResponseEntity<Iterable<Person>> findByLastName(String lastname) {
        return null;
    }

    public ResponseEntity<Iterable<Person>> findByBirthdate(Long birthdate) {
        return null;
    }

    public ResponseEntity<Person> reverseLookup(String mobile) {
        return null;
    }

    public ResponseEntity<Person> findById(Long id) {
        return null;
    }

    public ResponseEntity<Map<String, List<Person>>> getDirectorybySurname(String surname) {
        return null;
    }

    public ResponseEntity<Map<String, Integer>> getFirstNameStats() {
        return null;
    }

    public ResponseEntity<Map<String, Integer>> getFirstNameFrequencyMap() {
        throw new UnsupportedOperationException();
    }
}
