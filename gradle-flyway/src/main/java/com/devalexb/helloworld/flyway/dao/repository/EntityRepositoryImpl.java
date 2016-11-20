package com.devalexb.helloworld.flyway.dao.repository;

import com.devalexb.helloworld.flyway.dao.model.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Alex Bogatikov
 *         Created on 19/11/2016.
 */
@Repository
public class EntityRepositoryImpl implements EntityRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public EntityRepositoryImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    /*@Override
    public Entity getLast() {
        String sql = "SELECT * FROM GRADLE_FLYWAY order by ID DESC limit 1";
        return jdbcTemplate.queryForObject(sql, new RowMapper<Entity>() {
            @Override
            public Entity mapRow(ResultSet rs, int rowNum) throws SQLException {
                Entity entity = new Entity();
                entity.setId(rs.getLong(1));
                entity.setBlogName(rs.getString(2));
                return entity;
            }
        });
    }*/

    @Override
    public Entity getLast() {
        String sql = "SELECT * FROM GRADLE_FLYWAY order by ID DESC limit 1";
        return jdbcTemplate.queryForObject(sql, new RowMapper<Entity>() {
            @Override
            public Entity mapRow(ResultSet rs, int rowNum) throws SQLException {
                Entity entity = new Entity();
                entity.setId(rs.getLong(1));
                entity.setBlogName(rs.getString(2));
                entity.setAuthorName(rs.getString(3));
                return entity;
            }
        });
    }

    @Override
    public void insertBlogName(String name) {
        String sql = "INSERT INTO gradle_flyway (blog_name) VALUES (?)";
        jdbcTemplate.update(con -> {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, name);
            return ps;
        });
    }

    @Override
    public void insertBlogAndAuthorName(String blogName, String authorName) {
        String sql = "INSERT INTO gradle_flyway (blog_name, author_name) VALUES (?, ?)";
        jdbcTemplate.update(con -> {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, blogName);
            ps.setString(2, authorName);
            return ps;
        });
    }

}
