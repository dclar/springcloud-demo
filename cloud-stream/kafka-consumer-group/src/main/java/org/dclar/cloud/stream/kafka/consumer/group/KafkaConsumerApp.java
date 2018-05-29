package org.dclar.cloud.stream.kafka.consumer.group;


import org.dclar.cloud.stream.kafka.consumer.group.channel.ConsumerChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * Description:
 *
 * @author dclar
 */
@SpringBootApplication
@EnableBinding(ConsumerChannel.class)
public class KafkaConsumerApp {

    public static void main(String[] args) {
        SpringApplication.run(KafkaConsumerApp.class, args);
    }
}
