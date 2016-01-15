/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.lawinorder.dao;

import com.thesoftwareguild.lawinorder.model.Comment;
import com.thesoftwareguild.lawinorder.model.Post;
import com.thesoftwareguild.lawinorder.model.Role;
import com.thesoftwareguild.lawinorder.model.StaticPage;
import com.thesoftwareguild.lawinorder.model.Tag;
import com.thesoftwareguild.lawinorder.model.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author apprentice
 */
public class LawInOrderDaoDbImpl implements LawInOrderDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

// USERS
    private static final String SQL_INSERT_USER
            = "insert into users (username, email, password) values (?, ?, ?)";
    private static final String SQL_DELETE_USER
            = "delete from users where user_id = ?";
    private static final String SQL_UPDATE_USER
            = "UPDATE users SET username=?, email=?, password=? "
            + " WHERE user_id=?";
    private static final String SQL_SELECT_USER
            = "select * from users where user_id = ?";
    private static final String SQL_SELECT_USERS_BY_POST_ID
            = "select users.user_id, us.username "
            + "from posts inner join users "
            + "on posts.user_id = users.user_id "
            + "where user_id = ?";
    private static final String SQL_SELECT_ALL_USERS
            = "select * from users";

// TAGS
    private static final String SQL_INSERT_TAG
            = "insert into tags (tag_name) values (?)";
    private static final String SQL_DELETE_TAG
            = "delete from tags where tag_id = ?";
    private static final String SQL_UPDATE_TAG
            = "update tags set tag_name = ? where tag_id = ? ";
    private static final String SQL_SELECT_TAG
            = "Select * from tags where tag_id = ?";
    private static final String SQL_SELECT_ALL_TAGS
            = "select * from tags";

// ROLES
    private static final String SQL_INSERT_ROLE
            = "insert into roles (role_name) values (?)";
    private static final String SQL_DELETE_ROLE
            = "delete from roles where role_id = ?";
    private static final String SQL_UPDATE_ROLE
            = "update roles set role_name = ? where role_id = ? ";
    private static final String SQL_SELECT_ROLE
            = "Select * from roles where role_id = ?";
    private static final String SQL_SELECT_ALL_ROLES
            = "select * from roles";

// POSTS
    private static final String SQL_INSERT_POST
            = "insert into posts (title, user_id, post_body, post_date, "
            + "post_excerpt, last_edit_date, is_private) values (?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_DELETE_POST
            = "delete from posts where post_id = ?";
    private static final String SQL_UPDATE_POST
            = "UPDATE posts SET title=?, user_id=?, post_body=?, post_date=?, "
            + "post_excerpt=?, last_edit_date=?, is_private=? "
            + " WHERE post_id=?";
    private static final String SQL_SELECT_POST
            = "select * from posts where post_id = ?";
    private static final String SQL_SELECT_POSTS_BY_USER_ID // Confirm
            = "select posts.user_id, posts.postBody "
            + "from users inner join posts "
            + "on users.user_id = posts.user_id "
            + "where user_id = ?";
    private static final String SQL_SELECT_ALL_POSTS
            = "select * from posts";

// COMMENTS
    private static final String SQL_INSERT_COMMENT
            = "insert into comments(user_id, comment_body, comment_date, post_id) "
            + "values(?, ?, ?, ?)";
    private static final String SQL_DELETE_COMMENT
            = "delete from comments where comment_id=?";
    private static final String SQL_UPDATE_COMMENT
            = "update comments set user_id=?, comment_body=?, comment_date=?, post_id=? "
            + "where comment_id=?";
    private static final String SQL_SELECT_COMMENT
            = "Select * from comments where comment_id=?";
    private static final String SQL_SELECT_ALL_COMMENTS
            = "select * from comments";
    
// STATIC PAGES
    private static final String SQL_INSERT_STATIC_PAGES
            = "insert into static_pages(title, user_id, post_body, post_date, "
            + "post_excerpt, last_edit_date, is_private"
            + "values(?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_DELETE_STATIC_PAGES
            = "delete from static_pages where post_id=?";
    private static final String SQL_UPDATE_STATIC_PAGES
            = "update static_pages title=?, user_id=?, post_body=?, post_date=?, "
            + "post_excerpt=?, last_edit_date=?, is_private=?"
            + "where post_id=?";
    private static final String SQL_SELECT_STATIC_PAGES
            = "Select * from static_pages where post_id=?";
    private static final String SQL_SELECT_ALL_STATIC_PAGES
            = "Select * from static_pages";
    
    
    
    
    
    
    
// USER METHODS
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void addUser(User user) {
        jdbcTemplate.update(SQL_INSERT_USER,
                user.getUsername(),
                user.getEmail(),
                user.getPassword());
        user.setUserId(jdbcTemplate.queryForObject("SELECT LAST_INSERT_ID()",
                Integer.class));
    }
    @Override
    public void deleteUser(int userId) {
        jdbcTemplate.update(SQL_DELETE_USER, userId);
    }
    @Override
    public void updateUser(User user) {
        jdbcTemplate.update(SQL_UPDATE_USER,
                user.getUsername(),
                user.getEmail(),
                user.getPassword(),
                user.getUserId());
    }
    @Override
    public User getUserById(int userId) {
        try {
            return jdbcTemplate.queryForObject(SQL_SELECT_USER, new LawInOrderDaoDbImpl.UserMapper(), userId);
        } catch (EmptyResultDataAccessException ex) {
            return null;
        }
    }
    @Override
    public List<User> getAllUsers() {
        return jdbcTemplate.query(SQL_SELECT_ALL_USERS, new LawInOrderDaoDbImpl.UserMapper());
    }

// COMMENT METHODS
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void addComment(Comment comment) {
        jdbcTemplate.update(SQL_INSERT_COMMENT,
                comment.getUserIds(),
                comment.getCommentBody(),
                comment.getCommentDate(),
                comment.getPostId());       
    }
    @Override
    public void deleteComment(int commentId) {
        jdbcTemplate.update(SQL_DELETE_COMMENT, commentId);
    }

    @Override
    public void updateComment(Comment comment) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public Comment getCommentById(int commentId) {
        try {
            return jdbcTemplate.
                    queryForObject(SQL_SELECT_COMMENT, new LawInOrderDaoDbImpl.CommentMapper(), commentId);
        } catch (EmptyResultDataAccessException ex) {
            return null;
        }
    }
    @Override
    public List<Comment> getCommentsByUserId(int userId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public List<Comment> getAllComments() {
        return jdbcTemplate.query(SQL_SELECT_ALL_COMMENTS, new LawInOrderDaoDbImpl.CommentMapper());
    }

// TAG METHODS
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void addTag(Tag tag) {
        jdbcTemplate.update(SQL_INSERT_TAG,
                tag.getTagName());

        tag.setTagId(jdbcTemplate.
                queryForObject("select LAST_INSERT_ID()", Integer.class));
    }
    @Override
    public void deleteTag(int tagId) {
        jdbcTemplate.update(SQL_DELETE_TAG, tagId);
    }
    @Override
    public void updateTag(Tag tag) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public Tag getTagById(int tagId) {
        try {
            return jdbcTemplate.
                    queryForObject(SQL_SELECT_TAG, new LawInOrderDaoDbImpl.TagMapper(), tagId);
        } catch (EmptyResultDataAccessException ex) {
            return null;
        }
    }
    @Override
    public List<Tag> getAllTags() {
        return jdbcTemplate.query(SQL_SELECT_ALL_TAGS, new LawInOrderDaoDbImpl.TagMapper());
    }
    @Override
    public List<Tag> getTagsFromPost(int postId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

// ROLE METHODS   
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void addRole(Role role) {
        jdbcTemplate.update(SQL_INSERT_ROLE,
                role.getRoleName());
        role.setRoleId(jdbcTemplate.
                queryForObject("select LAST_INSERT_ID()", Integer.class));
    }
    @Override
    public void deleteRole(int roleId) {
        jdbcTemplate.update(SQL_DELETE_ROLE, roleId);
    }
    @Override
    public void updateRole(Role role) {
        jdbcTemplate.update(SQL_UPDATE_USER,
                role.getRoleName());
    }
    @Override
    public Role getRoleById(int roleId) {
        try {
            return jdbcTemplate.
                    queryForObject(SQL_SELECT_ROLE, new RoleMapper(), roleId);
        } catch (EmptyResultDataAccessException ex) {
            return null;
        }
    }
    @Override
    public List<Role> getAllRoles() {
        return jdbcTemplate.query(SQL_SELECT_ALL_ROLES, new LawInOrderDaoDbImpl.RoleMapper());
    }

// POST METHODS
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void addPost(Post post) {
        jdbcTemplate.update(SQL_INSERT_POST,
                post.getTitle(),
                post.getUserIds(),
                post.getPostBody(),
                post.getPostDate(),
                post.getPostExcerpt(),
                post.getLastEditDate(),
                post.isIsPrivate());
        post.setPostId(jdbcTemplate.
                queryForObject("select LAST_INSERT_ID()", Integer.class));
    }
    @Override
    public void deletePost(int postId) {
        jdbcTemplate.update(SQL_DELETE_POST, postId);
    }

    @Override
    public void updatePost(Post post) {
        jdbcTemplate.update(SQL_UPDATE_STATIC_PAGES,
                post.getTitle(),
                post.getUserIds(),
                post.getPostBody(),
                post.getPostDate(),
                post.getPostExcerpt(),
                post.getLastEditDate(),
                post.isIsPrivate());
    }

    @Override
    public Post getPostById(int postId) {
        {
            try {
                return jdbcTemplate.
                        queryForObject(SQL_SELECT_POST, new PostMapper(), postId);
            } catch (EmptyResultDataAccessException ex) {
                return null;
            }
        }
    }

    @Override
    public List<Post> getPostsByUserId(int userId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Post> getAllPosts() {
        return jdbcTemplate.query(SQL_SELECT_ALL_POSTS, new PostMapper());
    }

    @Override
    public List<Post> getPostsByTag(int tagId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

// STATIC PAGE METHODS
    @Override
    public void addStaticPage(StaticPage staticPage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteStaticPage(int postId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateStaticPage(int postId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public StaticPage getStaticPageByPostId(int postId) {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates. 
    }

    @Override
    public List<StaticPage> getStaticPagesByUserId(int userId) {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates. 
    }

// HELPER CLASSES - MAPPERS
    private static class UserMapper implements RowMapper<User> {

        @Override
        public User mapRow(ResultSet rs, int i) throws SQLException {
            User user = new User();
            user.setUserId(rs.getInt("user_id"));
            user.setUsername(rs.getString("username"));
            user.setEmail(rs.getString("email"));
            user.setPassword(rs.getString("password"));
            return user;
        }
    }

    private static class TagMapper implements RowMapper<Tag> {

        @Override
        public Tag mapRow(ResultSet rs, int i) throws SQLException {
            Tag tag = new Tag();
            tag.setTagId(rs.getInt("tag_id"));
            tag.setTagName(rs.getString("tag_name"));
            return tag;
        }
    }

    private static class PostMapper implements RowMapper<Post> {

        @Override
        public Post mapRow(ResultSet rs, int i) throws SQLException {
            Post post = new Post();
            post.setPostId(rs.getInt("post_id"));
            post.setTitle(rs.getString("post_title"));
            post.setPostBody(rs.getString("post_body"));
            post.setPostDate(rs.getTimestamp("post_date").toLocalDateTime().toLocalDate());
            post.setPostExcerpt(rs.getString("post_excerpt"));
            post.setLastEditDate(rs.getTimestamp("last_edit_date").toLocalDateTime().toLocalDate());
            post.setIsPrivate(rs.getBoolean("is_private"));
            return post;
        }
    }

    private static class RoleMapper implements RowMapper<Role> {

        @Override
        public Role mapRow(ResultSet rs, int i) throws SQLException {
            Role role = new Role();
            role.setRoleId(rs.getInt("role_id"));
            role.setRoleName(rs.getString("role_name"));
            return role;
        }
    }

    private static class CommentMapper implements RowMapper<Comment> {

        @Override
        public Comment mapRow(ResultSet rs, int i) throws SQLException {
            Comment comment = new Comment();
            comment.setCommentId(rs.getInt("comment_id"));
            comment.setCommentBody(rs.getString("comment_body"));
            comment.setCommentDate(rs.getTimestamp("comment_date").toLocalDateTime().toLocalDate());
            comment.setPostId(rs.getInt("post_id"));
            return comment;
        }
    }
}
