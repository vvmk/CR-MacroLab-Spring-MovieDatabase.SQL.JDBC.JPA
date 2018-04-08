package io.zipcoder.persistenceapp.services;

import io.zipcoder.persistenceapp.entity.Person;
import io.zipcoder.persistenceapp.repository.PersonRepository;
import io.zipcoder.persistenceapp.services.serviceinterface.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.OK;

/**
 * project: persistence-starter
 * package: io.zipcoder.persistenceapp
 * author: https://github.com/vvmk
 * date: 4/7/18
 */

@Service
public class JpaPersonService implements PersonService {
    //TODO: private static final Logger log = LoggerFactory.getLogger(JpaPersonService.class);

    private PersonRepository personRepo;

    @Autowired
    public JpaPersonService(PersonRepository personRepo) {
        this.personRepo = personRepo;
    }

    public ResponseEntity<Iterable<Person>> getAllPeople() {
        return new ResponseEntity<>(personRepo.findAll(), OK);
    }

    public ResponseEntity<Person> addPerson(Person person) {
        return new ResponseEntity<>(personRepo.save(person), CREATED);
    }

    public ResponseEntity<Person> updatePerson(Person person) {
        return new ResponseEntity<>(personRepo.save(person), OK);
    }

    public ResponseEntity removePerson(Long personId) {
        personRepo.deleteById(personId);
        return new ResponseEntity( OK);
    }

    public ResponseEntity removeAll(Collection<Person> people) {
        throw new UnsupportedOperationException();
    }

    public ResponseEntity<Iterable<Person>> findByFirstName(String firstname) {
        return new ResponseEntity<>(personRepo.findAllByFirstname(firstname), OK);
    }

    public ResponseEntity<Iterable<Person>> findByLastName(String lastname) {
        return new ResponseEntity<>(personRepo.findAllByLastname(lastname), OK);
    }

    public ResponseEntity<Iterable<Person>> findByBirthday(String birthdate) {
        return new ResponseEntity<>(personRepo.findAllByBirthdate(birthdate), OK);
    }

    public ResponseEntity<Iterable<Person>> reverseLookup(String mobile) {
        return new ResponseEntity<>(personRepo.findAllByMobile(mobile), OK);
    }

    public ResponseEntity<Person> findById(Long id) {
        Optional<Person> p = personRepo.findById(id);
        HttpStatus status = p.isPresent() ? OK : NOT_FOUND;
        return new ResponseEntity<>(p.orElse(new Person()), status);
    }

    public ResponseEntity<Map<String, List<Person>>> getDirectorybySurname(String surname) {
        return null;
    }

    public ResponseEntity<Map<String, Integer>> getFirstNameStats() {
        return null;
    }
}
