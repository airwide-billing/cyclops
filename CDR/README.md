<a href="http://icclab.github.io/cyclops" target="_blank"><img align="middle" src="http://icclab.github.io/cyclops/assets/images/logo_big.png"></img></a>

## CDR micro service
[![Reliability Rating](http://kafka.cloudlab.zhaw.ch:9000/api/project_badges/measure?project=ch.icclab.cyclops.cdr%3Acyclops-cdr&metric=reliability_rating)](http://kafka.cloudlab.zhaw.ch:9000/dashboard?id=ch.icclab.cyclops.cdr%3Acyclops-cdr)
[![Maintainability Rating](http://kafka.cloudlab.zhaw.ch:9000/api/project_badges/measure?project=ch.icclab.cyclops.cdr%3Acyclops-cdr&metric=sqale_rating)](http://kafka.cloudlab.zhaw.ch:9000/dashboard?id=ch.icclab.cyclops.cdr%3Acyclops-cdr)

Charge Data Records micro service as part of RCB Cyclops.

### Configuration
For CDR micro service to function properly you will need to edit <code>config/cdr.conf</code> file and specify PostgreSQL and RabbitMQ credentials, both of which can be accessed remotely. You can also specify on which port server should be listening by either changing the configuration or by providing port selection as the second console parameter.

### Logging
To have the logging system enabled you need to run the following:

    ./scripts/logging.sh

Then all cdr micro service logs will be stored in <code>/var/log/cyclops/cdr/</code> directory.

### Run the JAR file
In order to run CDR micro service as embedded JAR you need to have Java 8 installed and execute:

    java -jar bin/cdr.jar config/cdr.conf [port]

If you don't want to use the default port from configuration file, you can optionally specify one by adding it as parameter.

### Compile from the source code
If you want to compile the code on your own and your environment already has Java 8 and Maven 3 present, simply execute the following commands:

    cd scripts
    ./compile.sh

You will find the compiled JAR embedded file in the <code>bin</code> subdirectory.

### Documentation
You can find the API reference and developer's guide, as well as troubleshooting page in the Wiki section.

### License

      Licensed under the Apache License, Version 2.0 (the "License"); you may
      not use this file except in compliance with the License. You may obtain
      a copy of the License at

           http://www.apache.org/licenses/LICENSE-2.0

      Unless required by applicable law or agreed to in writing, software
      distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
      WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
      License for the specific language governing permissions and limitations
      under the License.
