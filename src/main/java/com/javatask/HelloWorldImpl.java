package com.javatask;

import javax.jws.WebService;

@WebService(endpointInterface = "com.javatask.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String sayHello(String name) {
        return "Hello World ";
    }
}
