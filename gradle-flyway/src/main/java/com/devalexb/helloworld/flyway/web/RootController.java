package com.devalexb.helloworld.flyway.web;

import com.devalexb.helloworld.flyway.dao.model.Entity;
import com.devalexb.helloworld.flyway.dao.service.EntityService;
import com.sun.javafx.binding.StringFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @author Alex Bogatikov
 *         Created on 19/11/2016.
 */
@Controller
public class RootController {

    private final static String RESPONSE_TEMPLATE = "Hello World! With %s developer blog!";

    private final static String NEW_RESPONSE_TEMPLATE =  "Hello World! With %s developer blog! My name is %s!";

    private EntityService entityService;

    @Autowired
    public RootController(EntityService entityService) {
        this.entityService = entityService;
    }


    /*@RequestMapping(
            method = RequestMethod.GET,
            path = "/get",
            produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}
    )
    public ResponseEntity<?> getName() {
        return ResponseEntity.ok(
                StringFormatter.format(
                        RESPONSE_TEMPLATE,
                        entityService.getLast().getBlogName()
                ).getValue()
        );
    }*/

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/get",
            produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}
    )
    public ResponseEntity<?> getName() {
        Entity entity = entityService.getLast();
        if (entity.getAuthorName() != null) {
            return ResponseEntity.ok(
                    StringFormatter.format(
                            NEW_RESPONSE_TEMPLATE,
                            entity.getBlogName(),
                            entity.getAuthorName()
                    ).getValue()
            );
        } else {
            return ResponseEntity.ok(
                    StringFormatter.format(
                            RESPONSE_TEMPLATE,
                            entity.getBlogName()
                    ).getValue()
            );
        }
    }

    /*@RequestMapping(
            method = RequestMethod.GET,
            path = "/add",
            produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}
    )
    public ResponseEntity<?> setName(
            @RequestParam(name = "blogName") String blogName
    ) {
        try {
            entityService.insertBlogName(blogName);
        } catch (Exception ex) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(ex.getMessage());
        }
        return ResponseEntity.ok("success!");
    }*/

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/add",
            produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}
    )
    public ResponseEntity<?> setName(
            @RequestParam(name = "blogName") String blogName,
            @RequestParam(name = "authorName", required = false) String authorName
    ) {
        try {
            if (authorName != null) {
                entityService.insertBlogAndAuthorName(blogName, authorName);
            } else {
                entityService.insertBlogName(blogName);
            }
        } catch (Exception ex) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(ex.getMessage());
        }
        return ResponseEntity.ok("success!");
    }
}
