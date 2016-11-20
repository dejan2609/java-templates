package com.devalexb.helloworld.flyway.dao.model;

/**
 * @author Alex Bogatikov
 *         Created on 19/11/2016.
 */
public class Entity {
    private Long id;
    private String blogName;
    private String authorName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
