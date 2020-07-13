package com.message.activemq.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.message.activemq.model.TrainDetails;

@Component
public class JmsProducer {
  @Autowired
  JmsTemplate jmsTemplate;
  
  @Value("${jsa.activemq.queue}")
  String queue;
  
  public void send(TrainDetails trainDetails){
    jmsTemplate.convertAndSend(queue, trainDetails);
  }
}