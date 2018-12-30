package com.hms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hms.model.Appointment;

@RepositoryRestResource(collectionResourceRel = "appointments", path = "appointments")
public interface AppointmentRepository extends MongoRepository<Appointment, String> {

}
