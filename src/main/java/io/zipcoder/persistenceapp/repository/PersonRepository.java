package io.zipcoder.persistenceapp.repository;

import io.zipcoder.persistenceapp.entity.Person;
import org.springframework.data.repository.CrudRepository;

/**
 * project: persistence-starter
 * package: io.zipcoder.persistenceapp.repository
 * author: https://github.com/vvmk
 * date: 4/7/18
 */
public interface PersonRepository extends CrudRepository<Person, Long> {
    Iterable<Person> findAllByFirstname(String firstname);

    Iterable<Person> findAllByLastname(String lastname);

    Iterable<Person> findAllByBirthdate(String birthdate);

    Iterable<Person> findAllByMobile(String mobile);
    /*
    @Query("SELECT COUNT(DISTINCT Firstname) AS NameFrequency FROM People")
    Iterable<String> findDistinctBy();*/
}
