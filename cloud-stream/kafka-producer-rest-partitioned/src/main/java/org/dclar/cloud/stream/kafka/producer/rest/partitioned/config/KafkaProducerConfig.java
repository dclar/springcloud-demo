package org.dclar.cloud.stream.kafka.producer.rest.partitioned.config;

import org.dclar.cloud.stream.kafka.producer.rest.partitioned.partition.CustomPartitionKeyExtractorStrategy;
import org.dclar.cloud.stream.kafka.producer.rest.partitioned.partition.CustomPartitionSelectorStrategy;
import org.springframework.cloud.stream.binder.PartitionKeyExtractorStrategy;
import org.springframework.cloud.stream.binder.PartitionSelectorStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 *
 * @author dclar
 */
@Configuration
public class KafkaProducerConfig {

    @Bean
    public PartitionKeyExtractorStrategy customPartitionKeyExtractorStrategy() {
        return new CustomPartitionKeyExtractorStrategy();
    }

    @Bean
    public PartitionSelectorStrategy customPartitionSelectorStrategy() {
        return new CustomPartitionSelectorStrategy();
    }
}
