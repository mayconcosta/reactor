package com.hotmart.reactor.reactor.model.repository;

import com.hotmart.reactor.reactor.model.entity.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface UserRepository extends ReactiveMongoRepository<User, Serializable> {

}
