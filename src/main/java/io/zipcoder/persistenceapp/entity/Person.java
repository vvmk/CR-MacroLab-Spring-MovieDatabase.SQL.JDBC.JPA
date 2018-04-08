package io.zipcoder.persistenceapp.entity;

/**
 * project: persistence-starter
 * package: io.zipcoder.persistenceapp.entity
 * author: https://github.com/vvmk
 * date: 4/7/18
 */
public class Person {
    Long Id;
    String firstname;
    String lastname;
    String mobile;
    Long birthdate;

    public Person(Long id, String firstname, String lastname, String mobile, Long birthdate) {
        Id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
    }
    public Person() {
        // :x
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Long getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Long birthdate) {
        this.birthdate = birthdate;
    }

}
