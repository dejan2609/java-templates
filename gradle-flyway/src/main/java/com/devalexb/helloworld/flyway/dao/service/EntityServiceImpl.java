package com.devalexb.helloworld.flyway.dao.service;

import com.devalexb.helloworld.flyway.dao.model.Entity;
import com.devalexb.helloworld.flyway.dao.repository.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Alex Bogatikov
 *         Created on 19/11/2016.
 */
@Service
@Transactional
public class EntityServiceImpl implements EntityService {


    private EntityRepository repository;

    @Autowired
    public EntityServiceImpl(EntityRepository repository) {
        this.repository = repository;
    }

    @Override
    public Entity getLast() {
        return repository.getLast();
    }

    @Override
    public void insertBlogName(String name) {
        repository.insertBlogName(name);
    }

    @Override
    public void insertBlogAndAuthorName(String blogName, String authorName) {
        repository.insertBlogAndAuthorName(blogName, authorName);
    }
}
