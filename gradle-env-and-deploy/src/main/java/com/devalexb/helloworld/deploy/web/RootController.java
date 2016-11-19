package com.devalexb.helloworld.deploy.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Alex Bogatikov
 *         Created on 18/11/2016.
 */
@Controller
public class RootController {

    @Value("${config.blog.address}")
    private String blogName;

    @RequestMapping(
            path = "/**",
            method = {RequestMethod.GET}
    )
    public ResponseEntity<?> get(){
        return ResponseEntity.ok("Hello World! With devalexb.com developer blog!");
    }

}
