package com.maicon.worlshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.maicon.worlshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	

}
