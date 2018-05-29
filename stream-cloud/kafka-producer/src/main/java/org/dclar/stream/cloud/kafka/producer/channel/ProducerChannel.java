package org.dclar.stream.cloud.kafka.producer.channel;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * Description:
 *
 * @author dclar
 */
public interface ProducerChannel {

    String PRODUCER_OUTPUT = "producerOutput";

    @Output(PRODUCER_OUTPUT)
    MessageChannel producerOutput();

}
