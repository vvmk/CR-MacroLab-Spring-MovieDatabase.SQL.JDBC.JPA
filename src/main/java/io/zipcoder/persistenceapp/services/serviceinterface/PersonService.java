package io.zipcoder.persistenceapp.services.serviceinterface;

import io.zipcoder.persistenceapp.entity.Person;
import org.springframework.http.ResponseEntity;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * project: persistence-starter
 * package: io.zipcoder.persistenceapp.services
 * author: https://github.com/vvmk
 * date: 4/8/18
 */

public interface PersonService {
    ResponseEntity<Iterable<Person>> getAllPeople();

    ResponseEntity<?> addPerson(Person person);

    ResponseEntity<?> updatePerson(Person person);

    ResponseEntity<?> removePerson(Long personId);

    ResponseEntity<?> removeAll(Collection<Person> people);

    ResponseEntity<Iterable<Person>> findByFirstName(String firstname);

    ResponseEntity<Iterable<Person>> findByLastName(String lastname);

    ResponseEntity<Iterable<Person>> findByBirthdate(Long birthdate);

    ResponseEntity<Person> reverseLookup(String mobile);

    ResponseEntity<Person> findById(Long id);

    ResponseEntity<Map<String, List<Person>>> getDirectorybySurname(String surname);

    ResponseEntity<Map<String, Integer>> getFirstNameStats();
}
