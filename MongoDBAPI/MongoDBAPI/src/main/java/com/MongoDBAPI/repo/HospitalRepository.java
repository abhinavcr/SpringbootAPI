package com.MongoDBAPI.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.MongoDBAPI.Hospital;

public interface HospitalRepository extends MongoRepository<Hospital, Integer> {

}

