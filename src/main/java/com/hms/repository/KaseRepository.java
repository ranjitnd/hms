package com.hms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hms.model.Kase;

@RepositoryRestResource(collectionResourceRel = "cases", path = "cases")
public interface KaseRepository extends MongoRepository<Kase, String> {

}
