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
        String sqlInsert = buildInsertFromPerson(person);
        jdbcTemplate.execute(sqlInsert);
        return HttpStatus.CREATED;
    }

    public HttpStatus updatePerson(Person person) {
        String sqlUpdate = buildInsertFromPerson(person);
        jdbcTemplate.update(sqlUpdate);
        return HttpStatus.OK;
    }

    public HttpStatus removePerson(Long personId) {
        jdbcTemplate.execute("DELETE FROM PERSON WHERE ID = " + personId);
        return HttpStatus.OK;
    }

    public HttpStatus removeAll(Collection<Person> people) {
        return null;
    }

    public List<Person> findByFirstName(String firstname) {
        //jdbcTemplate.query("SELECT * FROM PERSON WHERE " +
        //      "first_name = " + firstname +")", new BeanPropertyRowMapper(Person.class));
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

    private String buildInsertFromPerson(Person person) {
        return "INSERT INTO PERSON(last_name, first_name, mobile, birthday) " +
                "VALUES(" +
                person.getLastname() + ", " +
                person.getFirstname() + ", " +
                person.getMobile() + ", " +
                person.getBirthdate() + ")";
    }
}
