package com.javatask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.ws.Endpoint;

@SpringBootApplication
public class SoapServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SoapServiceApplication.class, args);
        Endpoint.publish("http://localhost:8080/ws/hello", new HelloWorldImpl());
    }
}
