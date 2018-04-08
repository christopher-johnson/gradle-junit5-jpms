/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.example.kafka;

import static java.util.Objects.requireNonNull;

import org.apache.kafka.clients.producer.Producer;

/**
 * A Kafka message producer capable of publishing messages to a Kafka cluster.
 */
public class KafkaPublisher {

    public static final String KAFKA_TOPIC = "trellis.kafka.topic";

    private final Producer<String, String> producer;
    private final String topicName;

    /**
     * Create a new Kafka Publisher.
     * @param producer the producer
     */
    public KafkaPublisher(final Producer<String, String> producer) {
        this(producer,KAFKA_TOPIC);
    }

    /**
     * Create a new Kafka Publisher.
     * @param producer the producer
     * @param topicName the name of the kafka topic
     */
    public KafkaPublisher(final Producer<String, String> producer, final String topicName) {
        requireNonNull(producer, "Kafka producer may not be null!");
        requireNonNull(topicName, "Kafka topic name may not be null!");

        this.producer = producer;
        this.topicName = topicName;
    }
}
