package com.test.model;


import javax.persistence.*;

/**
 * Created by joona_000 on 18.11.2015.
 */


@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String firstName;

    private String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
