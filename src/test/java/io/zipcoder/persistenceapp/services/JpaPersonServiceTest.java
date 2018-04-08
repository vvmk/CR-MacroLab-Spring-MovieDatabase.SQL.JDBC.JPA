package io.zipcoder.persistenceapp.services;

import io.zipcoder.persistenceapp.entity.Person;
import io.zipcoder.persistenceapp.repository.PersonRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

/**
 * project: persistence-starter
 * package: io.zipcoder.persistenceapp.services
 * author: https://github.com/vvmk
 * date: 4/8/18
 */
public class JpaPersonServiceTest {

    @InjectMocks
    private JpaPersonService ps;

    @Mock
    private PersonRepository personRepo;

    private String mockString = "";
    private Long mockLong = 10L;

    @Before
    @SuppressWarnings("unchecked")
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        when(personRepo.findAll())
                .thenReturn(mock(Iterable.class));

        when(personRepo.findById(anyLong()))
                .thenReturn(Optional.of(mock(Person.class)));

        when(personRepo.save(any(Person.class)))
                .thenAnswer(invocation -> invocation.getArgument(0));
    }

    @Test
    public void getAllPeopleStatusOK() {
        ResponseEntity<Iterable<Person>> response = ps.getAllPeople();

        verify(personRepo).findAll();
        assertEquals(OK, response.getStatusCode());
    }

    @Test
    public void addPersonStatusCREATED() {
        ResponseEntity<?> response = ps.addPerson(mock(Person.class));

        verify(personRepo).save(any(Person.class));
        assertEquals(CREATED, response.getStatusCode());
    }

    @Test
    public void updatePersonStatusOK() {
        ResponseEntity<?> response = ps.updatePerson(mock(Person.class));

        verify(personRepo).save(any(Person.class));
        assertEquals(OK, response.getStatusCode());
    }

    @Test
    public void removePersonStatusOK() {
        ResponseEntity<?> response = ps.removePerson(mockLong);

        verify(personRepo).deleteById(anyLong());
        assertEquals(OK, response.getStatusCode());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void removeAllIsUnsupportedOp() {
        ps.removeAll(mock(Collection.class));
    }

    @Test
    public void findByFirstNameStatusOK() {
        ResponseEntity<Iterable<Person>> response = ps.findByFirstName(mockString);

        verify(personRepo).findAllByFirstname(anyString());
        assertEquals(OK, response.getStatusCode());
    }

    @Test
    public void getFirstNameStatsStatusOK() {
        ResponseEntity<Map<String, Integer>> response = ps.getFirstNameStats();

        //TODO: verify(personRepo).getFirstNameStats();
        assertEquals(OK, response.getStatusCode());
    }

    @Test
    public void findByLastNameStatusOK() {
        ResponseEntity<Iterable<Person>> response = ps.findByLastName("name");

        verify(personRepo).findAllByLastname(anyString());
        assertEquals(OK, response.getStatusCode());
    }

    @Test
    public void findByBirthdateStatusOK() {
        ResponseEntity<Iterable<Person>> response = ps.findByBirthday(mockString);

        verify(personRepo).findAllByBirthdate(anyString());
        assertEquals(OK, response.getStatusCode());
    }

    @Test
    public void reverseLookup() {
        ResponseEntity<Iterable<Person>> response = ps.reverseLookup(mockString);

        verify(personRepo).findAllByMobile(anyString());
        assertEquals(OK, response.getStatusCode());
    }

    @Test
    public void findById() {
        ResponseEntity<Person> response = ps.findById(mockLong);

        verify(personRepo).findById(anyLong());
        assertEquals(OK, response.getStatusCode());
    }

    @Test
    public void getDirectorybySurname() {
        ResponseEntity<Map<String, List<Person>>> response = ps.getDirectorybySurname(mockString);

        //TODO: verify(personRepo).getSurnameDirectory();
        assertEquals(OK, response.getStatusCode());
    }
}