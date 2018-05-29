package org.dclar.cloud.stream.kafka.producer.rest.partitioned;

import org.dclar.cloud.stream.kafka.producer.rest.partitioned.channel.ProducerChannel;
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
