package org.dclar.cloud.stream.kafka.producer;

import org.dclar.cloud.stream.kafka.producer.channel.ProducerChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * Description:
 *
 * @author dclar
 */
@SpringBootApplication
@EnableBinding(ProducerChannel.class)
public class KafkaProducerApp {

    public static void main(String[] args) {
        SpringApplication.run(KafkaProducerApp.class, args);
    }
}
