package com.message.activemq.db.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.message.activemq.db.model.TrainDetails;

public interface TrainDetailsRepository extends MongoRepository<TrainDetails, Integer> {
	
}
