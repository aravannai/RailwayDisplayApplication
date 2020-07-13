package com.train.details.respository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.train.details.entity.TrainDetails;

public interface TrainDetailsRepository extends MongoRepository<TrainDetails, Integer> {
	TrainDetails findByTrainName(String trainName);	
}
