package com.railway.dashboard.rest.integration;

import java.util.List;

import com.railway.dashboard.entity.TrainDetails;

public interface TrainDetailsRestClient {

	public List<TrainDetails> getAllDetails();
	public TrainDetails getByTrainNumber(int trainNumber);
	public TrainDetails findByTrainName(String trainName);
}
