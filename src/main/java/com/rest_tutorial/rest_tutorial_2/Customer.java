package com.rest_tutorial.rest_tutorial_2;
import org.springframework.data.annotation.Id;


public class Customer {


    @Id
    public String id;


    public String firstName;
    public String lastName;

    public Customer() {
    }


    public Customer(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return String.format("Customer [Id=%s , FirstName=%s, LastName=%s ]", id, firstName, lastName );
    }
}