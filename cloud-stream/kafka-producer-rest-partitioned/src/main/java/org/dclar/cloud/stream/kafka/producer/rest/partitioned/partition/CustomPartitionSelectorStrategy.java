package org.dclar.cloud.stream.kafka.producer.rest.partitioned.partition;

import org.springframework.cloud.stream.binder.PartitionSelectorStrategy;

/**
 * Description:
 *
 * @author dclar
 */
public class CustomPartitionSelectorStrategy implements PartitionSelectorStrategy {
    /**
     * Determine the partition based on a key. The partitionCount is 1 greater than the
     * maximum value of a valid partition. Typical implementations will return
     * {@code someValue % partitionCount}. The caller will apply that same modulo
     * operation (as well as enforcing absolute value) if the value exceeds partitionCount
     * - 1.
     *
     * @param key            the key
     * @param partitionCount the number of partitions
     * @return the partition
     */
    @Override
    public int selectPartition(Object key, int partitionCount) {
        if (key.equals("A")) return 0;
        if (key.equals("B")) return 1;
        return 2;
    }
}
