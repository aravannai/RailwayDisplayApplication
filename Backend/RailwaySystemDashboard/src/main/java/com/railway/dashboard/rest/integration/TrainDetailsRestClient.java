package com.railway.dashboard.rest.integration;

import java.util.List;

import com.railway.dashboard.entity.TrainDetails;

public interface TrainDetailsRestClient {

	public List<TrainDetails> getAllDetails();
	public TrainDetails findByTrainDetails(int trainNumber, String trainName);
}
