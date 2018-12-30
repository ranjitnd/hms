package com.hms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hms.model.Patient;

@RepositoryRestResource(collectionResourceRel = "patients", path = "patients")
public interface PatientRepository extends MongoRepository<Patient, String> {

}
