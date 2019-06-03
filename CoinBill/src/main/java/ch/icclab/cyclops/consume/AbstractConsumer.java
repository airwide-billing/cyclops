package ch.icclab.cyclops.consume;
/*
 * Copyright (c) 2017. Zuercher Hochschule fuer Angewandte Wissenschaften
 * All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;

import java.io.IOException;

/**
 * Author: Martin Skoviera (linkedin.com/in/skoviera)
 * Created on: 25/01/16
 * Description: Abstract consumer for our RabbitMQ
 */
public abstract class AbstractConsumer {
    protected abstract void consume(String message, ConsumerEntry consumer, Long deliveryTag);

    /**
     * This is the body of message processing
     * @param consumer reference to the consumer
     * @return consumer object
     */
    public Consumer handleDelivery(ConsumerEntry consumer) {
        return new DefaultConsumer(consumer.getChannel()) {
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {

                // make sure encoding is correct
                String message = new String(body, "UTF-8");

                // and let the message be consumed by client
                consume(message, consumer, envelope.getDeliveryTag());
            }
        };
    }
}
