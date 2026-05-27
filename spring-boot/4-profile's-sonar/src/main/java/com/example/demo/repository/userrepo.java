package com.example.demo.repository;

import com.example.demo.model.user;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface userrepo extends MongoRepository<user, ObjectId> {

    static user findbyusername(String username) {
        return null;
    }

}
