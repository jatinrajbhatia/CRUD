package com.example.Home.controller;

import com.example.Home.entity.Topic;
import com.example.Home.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topic")
    public List<Topic> getAllTopic(){
        return topicService.getAllTopic();
    }

    @RequestMapping("/topic/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topic")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topic/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(id, topic);

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topic/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }

}
