package com.hms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hms.model.FollowUp;

@RepositoryRestResource(collectionResourceRel = "followups", path = "followups")
public interface FollowUpRepository extends MongoRepository<FollowUp, String> {

}
