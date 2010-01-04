/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.soluvas.samples.eventfx.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * A Camel Router
 *
 * @version $
 */
public class MainRouteBuilder extends RouteBuilder {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) {
    	new ClassPathXmlApplicationContext("META-INF/spring/*.xml");
    }

    /**
     * Lets configure the Camel routing rules using Java code...
     */
    public void configure() {
    	from("seda:Sensor.SensorEventSync").beanRef("display1");
    	from("seda:Sensor.SensorEventAsync").delay(1200).beanRef("display2");
    	/* multicast example
    	ProcessorDefinition def = from("seda:Sensor.SensorEventAsync").multicast();
    	def.beanRef("display1");
    	def.delay(700).beanRef("display2");
    	*/
    }
}
