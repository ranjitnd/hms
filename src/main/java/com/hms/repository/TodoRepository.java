package com.hms.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hms.model.Todo;

@Repository
public interface TodoRepository extends MongoRepository<Todo, String> {
	
	List<Todo> findByTitle(@Param("title") String title); //http://localhost:8080/todos/search/findByTitle?title=first todo

}
