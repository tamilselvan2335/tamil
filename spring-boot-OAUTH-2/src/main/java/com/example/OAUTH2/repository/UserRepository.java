package com.example.OAUTH2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.OAUTH2.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	User findByName(String name);
}
