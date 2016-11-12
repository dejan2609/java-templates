package com.devalexb.domain;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Alex Bogatikov
 *         Created on 12/11/2016.
 */
@XmlRootElement
public class HelloWorld {

    
    public String getHelloWorld() {
        return "JAX-WS with SpringBoot and devalexb.com";
    }
}
