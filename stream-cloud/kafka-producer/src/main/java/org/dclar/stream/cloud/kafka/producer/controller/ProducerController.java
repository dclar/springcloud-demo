package org.dclar.stream.cloud.kafka.producer.controller;

import lombok.extern.java.Log;
import org.dclar.stream.cloud.kafka.producer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author dclar
 */
@Log
@RestController
public class ProducerController {

    @Autowired
    private MessageChannel producerOutput;

    @GetMapping("/word/add/{content}")
    public ResponseEntity add(@PathVariable("content") String content) {

        log.info("content is " + content);
        // send message via channel
        producerOutput.send(MessageBuilder.withPayload(content).build());
        return ResponseEntity.accepted().body(User.newInstance("Tom", 18));
    }
}
