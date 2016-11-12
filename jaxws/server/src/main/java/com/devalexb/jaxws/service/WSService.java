package com.devalexb.jaxws.service;

import com.devalexb.jaxws.domain.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author Alex Bogatikov
 *         Created on 12/11/2016.
 */
@Service("wsService")
@WebService(serviceName = "WSService", portName = "WSService")
public class WSService {


    @Autowired
    private HelloWorld helloWorld;


    @WebMethod
    public void insertHellowWorld(HelloWorld hw) {
        this.helloWorld = hw;
    }

    @WebMethod
    public HelloWorld geHelloWorld() {
        return helloWorld;
    }

}
