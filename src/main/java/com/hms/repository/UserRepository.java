package com.hms.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hms.model.User;
/*
@CrossOrigin(origins = "http://localhost:4200",
methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE },
maxAge = 3600)
*/
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends MongoRepository<User, String> {
	
	List<User> findByFirstName(@Param("firstName") String firstName);
	
	List<User> findByLastName(@Param("lastName") String lastName);

	// http://localhost:8080/users/search/findByUserId?userId=ranjit
	Optional<User> findByUserId(@Param("userId") String userId);
}
