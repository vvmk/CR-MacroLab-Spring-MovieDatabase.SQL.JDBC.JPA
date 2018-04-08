package io.zipcoder.persistenceapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * project: persistence-starter
 * package: io.zipcoder.persistenceapp.entity
 * author: https://github.com/vvmk
 * date: 4/8/18
 */

@Entity
public class Home {

    @Id
    @GeneratedValue
    @Column(name = "HOME_ID")
    private Long Id;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "HOMENUMBER")
    private String homeNumber;

    public Home() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }
}
