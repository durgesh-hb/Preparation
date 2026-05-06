package com.example.demo.repository;

import com.example.demo.model.student;
import org.springframework.data.mongodb.repository.MongoRepository;


// repository layer talks to DB but should be extended

public interface entryrepo extends MongoRepository<student, Integer> {
     /*
        Spring automatically gives:

        save()
        findAll()
        findById()
        deleteById()


        no need to write manually query
    */

}