package com.springactuator.springactuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Service;

@Service
@Endpoint(id = "random")
public class RandomEndpoint {

    @ReadOperation
    public double random(){
        double temp = Math.random();
        return temp;
    }
}
