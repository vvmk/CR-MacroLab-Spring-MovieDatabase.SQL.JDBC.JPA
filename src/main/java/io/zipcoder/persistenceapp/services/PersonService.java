package io.zipcoder.persistenceapp.services;

import io.zipcoder.persistenceapp.entity.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
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
@Service
public class PersonService {
    private static final Logger log = LoggerFactory.getLogger(PersonService.class);

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public HttpStatus addPerson(Person person) {
        jdbcTemplate.execute("INSERT INTO PERSON(last_name, first_name, mobile, birthday) " +
                "VALUES(" +
                person.getLastname() + ", " +
                person.getFirstname() + ", " +
                person.getMobile() + ", " +
                person.getBirthdate() + ")"
        );
        return HttpStatus.CREATED;
    }

    public HttpStatus updatePerson(Person person) {
        return null;
    }

    public HttpStatus removePerson(Long personId) {
        return null;
    }

    public HttpStatus removeAll(Collection<Person> people) {
        return null;
    }

    public List<Person> findByFirstName(String firstname) {
        return null;
    }

    public List<Person> findByLastName(String lastname) {
        return null;
    }

    public List<Person> findByBirthdate(Long birthdate) {
        return null;
    }

    public Person findById(Long id) {
        return null;
    }

    public Map<String, List<Person>> getDirectorybySurname(String surname) {
        return null;
    }

    public Map<String, Integer> getFirstNameFrequencyMap(String name) {
        return null;
    }
}
