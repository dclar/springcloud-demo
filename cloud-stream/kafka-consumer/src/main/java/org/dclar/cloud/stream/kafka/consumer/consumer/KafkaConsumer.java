package org.dclar.cloud.stream.kafka.consumer.consumer;

import lombok.extern.java.Log;
import org.dclar.cloud.stream.kafka.consumer.channel.ConsumerChannel;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author dclar
 */
@Log
@Component
public class KafkaConsumer {

    @StreamListener(ConsumerChannel.CONSUMER_INPUT)
    public void process(String message) {
        log.info("Consume message is " + message);
    }

}
