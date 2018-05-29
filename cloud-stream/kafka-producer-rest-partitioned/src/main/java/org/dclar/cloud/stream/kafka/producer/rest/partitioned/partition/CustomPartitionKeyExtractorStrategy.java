package org.dclar.cloud.stream.kafka.producer.rest.partitioned.partition;

import org.springframework.cloud.stream.binder.PartitionKeyExtractorStrategy;
import org.springframework.messaging.Message;

/**
 * Description:
 *
 * @author dclar
 */
public class CustomPartitionKeyExtractorStrategy implements PartitionKeyExtractorStrategy {
    @Override
    public Object extractKey(Message<?> message) {
        String msgString = message.getPayload().toString();
        if (msgString.startsWith("A")) return "A";
        if (msgString.startsWith("B")) return "B";
        return "C";
    }
}
