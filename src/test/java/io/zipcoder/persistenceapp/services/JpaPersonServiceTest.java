package io.zipcoder.persistenceapp.services;

import io.zipcoder.persistenceapp.entity.Person;
import io.zipcoder.persistenceapp.repository.PersonRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collection;
import java.util.Optional;

import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;

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
    public void getAllPeople() {
    }

    @Test
    public void addPerson() {
    }

    @Test
    public void updatePerson() {
    }

    @Test
    public void removePerson() {
    }

    @Test(expected = UnsupportedOperationException.class)
    public void removeAll() {
        ps.removeAll(mock(Collection.class));
    }

    @Test
    public void findByFirstName() {
    }

    @Test
    public void getFirstNameStats() {
    }

    @Test
    public void findByLastName() {
    }

    @Test
    public void findByBirthdate() {
    }

    @Test
    public void reverseLookup() {
    }

    @Test
    public void findById() {
    }

    @Test
    public void getDirectorybySurname() {
    }

    @Test
    public void getFirstNameStats1() {
    }

    @Test
    public void getFirstNameFrequencyMap() {
    }
}