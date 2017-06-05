package com.zooshop.Staff;

/**
 * Created by RENT on 2017-06-05.
 */
public class Manager {
    String firstName;
    String surname;




    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Manager(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

}
