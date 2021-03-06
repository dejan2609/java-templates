package com.devalexb.helloworld.flyway.dao.service;

import com.devalexb.helloworld.flyway.dao.model.Entity;

/**
 * @author Alex Bogatikov
 *         Created on 19/11/2016.
 */
public interface EntityService {
    Entity getLast();

    void insertBlogName(String name);

    void insertBlogAndAuthorName(String blogName, String authorName);

}
