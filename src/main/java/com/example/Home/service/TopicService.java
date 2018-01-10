package com.example.Home.service;

import com.example.Home.entity.Topic;
import com.example.Home.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;
    public List<Topic> getAllTopic() //made a method
    {
        List<Topic> topics =new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;
    }
    public void addTopic(Topic topic)
    {
        topicRepository.save(topic);}
    public Topic getTopic(String id){return topicRepository.findOne(id);}
    public void updateTopic(String id ,Topic topic){
        topicRepository.save(topic);
    }
    public void deleteTopic(String id){
        topicRepository.delete(id);}
}
