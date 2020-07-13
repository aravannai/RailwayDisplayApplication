package com.railway.dashboard.user.service;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.railway.dashboard.user.entity.UserDetails;

@Repository
public interface UserDetailsRepository extends MongoRepository<UserDetails, Integer> {

}
