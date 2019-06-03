package ch.icclab.cyclops.load.model;
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

/**
 * Author: Martin Skoviera (linkedin.com/in/skoviera)
 * Created: 25/01/16
 * Description: Consumer (RabbitMQ) credentials
 */
public class ConsumerCredentials {

    // These fields correspond with the configuration file
    private String consumerUsername;
    private String consumerPassword;
    private String consumerHost;
    private int consumerPort;
    private String consumerVirtualHost;
    private String consumeFromQueue;

    //==== Getters and Setters
    public String getConsumerUsername() {
        return consumerUsername;
    }
    public void setConsumerUsername(String consumerUsername) {
        this.consumerUsername = consumerUsername;
    }

    public String getConsumerPassword() {
        return consumerPassword;
    }
    public void setConsumerPassword(String consumerPassword) {
        this.consumerPassword = consumerPassword;
    }

    public String getConsumerHost() {
        return consumerHost;
    }
    public void setConsumerHost(String consumerHost) {
        this.consumerHost = consumerHost;
    }

    public int getConsumerPort() {
        return consumerPort;
    }
    public void setConsumerPort(int consumerPort) {
        this.consumerPort = consumerPort;
    }

    public String getConsumerVirtualHost() {
        return consumerVirtualHost;
    }
    public void setConsumerVirtualHost(String consumerVirtualHost) {
        this.consumerVirtualHost = consumerVirtualHost;
    }

    public String getConsumeFromQueue() {
        return consumeFromQueue;
    }
    public void setConsumeFromQueue(String consumeFromQueue) {
        this.consumeFromQueue = consumeFromQueue;
    }
}
