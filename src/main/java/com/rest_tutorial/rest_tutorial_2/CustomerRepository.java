package com.rest_tutorial.rest_tutorial_2;

import java.util.List;

        import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);

    public List<Customer> findByLastName(String lastName);

    public List<Customer> findAll();
    public List<Customer> save(String id);


}