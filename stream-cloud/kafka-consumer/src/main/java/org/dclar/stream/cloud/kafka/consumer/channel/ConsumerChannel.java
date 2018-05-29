package org.dclar.stream.cloud.kafka.consumer.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * Description:
 *
 * @author dclar
 */
public interface ConsumerChannel {

    String CONSUMER_INPUT = "consumerInput";

    @Input(CONSUMER_INPUT)
    SubscribableChannel consumerInput();
}
