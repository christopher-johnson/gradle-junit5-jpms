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

import org.apache.kafka.clients.producer.MockProducer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test the Kafka publisher
 */
public class KafkaPublisherTest {

    private final MockProducer<String, String> producer = new MockProducer<>(true, new StringSerializer(),
            new StringSerializer());

    @BeforeEach
    public void setUp() {

    }

    @Test
    public void testKafka() {
        final KafkaPublisher svc = new KafkaPublisher(producer);
    }
}
