package com.train.details;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.train.details.entity.TrainDetails;
import com.train.details.respository.TrainDetailsRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MongoDBTest {

    @Autowired
    private TrainDetailsRepository repository;

    private static final int NUMBER_OF_TRAINS = 3;

    @Before
    public void init() {

        repository.deleteAll();
        

        repository.insert(new TrainDetails(123,"Chennai Express", new Date(), new Date(), "MAS", "CBE", "SA"));
        repository.insert(new TrainDetails(456,"Kovai Express", new Date(), new Date(), "CBE", "MAS", "SA"));
        repository.insert(new TrainDetails(789,"Alleppey Express", new Date(), new Date(), "ALW", "MAS", "SA"));
        repository.insert(new TrainDetails(113,"Chennai Express", new Date(), new Date(), "MAS", "TRV", "SA"));
        
    }

    @Test
    public void listAllTrains() {
        assertEquals(NUMBER_OF_TRAINS, repository.findAll().size());
    }

    @Test
    public void searchByTrainNumber() {
    	assertEquals(1, repository.findById(456));
    }
    
    @Test
    public void searchByTrainName() {
    	assertEquals(1, repository.findByTrainNumberAndTrainName(12345, "Chennai Express"));
    }
}