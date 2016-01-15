/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.lawinorder.dao;

import com.thesoftwareguild.lawinorder.model.Comment;
import com.thesoftwareguild.lawinorder.model.Post;
import com.thesoftwareguild.lawinorder.model.Role;
import com.thesoftwareguild.lawinorder.model.Tag;
import com.thesoftwareguild.lawinorder.model.User;
import com.thesoftwareguild.lawinorder.model.StaticPage;
import java.util.List;

/**
 *
 * @author apprentice
 */
public interface LawInOrderDao {
    public void addUser (User user);
    public void deleteUser (int userId);
    public void updateUser (User user);
    public User getUserById (int userId);
    public List<User> getAllUsers();
    
    public void addComment (Comment comment);
    public void deleteComment (int commentId);
    public void updateComment (Comment comment);
    public Comment getCommentById (int commentId);
    public List<Comment> getCommentsByUserId (int userId);
    public List<Comment> getAllComments();
    
    public void addTag (Tag tag);
    public void deleteTag (int tagId);
    public void updateTag (Tag tag);
    public Tag getTagById (int tagId);
    public List<Tag> getAllTags(); 
    public List<Tag> getTagsFromPost(int postId);
    
    public void addRole (Role role);
    public void deleteRole (int roleId);
    public void updateRole (Role role);
    public Role getRoleById(int roleId);
    public List<Role> getAllRoles();
    
    public void addPost (Post post);
    public void deletePost (int postId);
    public void updatePost (Post post);
    public Post getPostById (int postId);
    public List<Post> getPostsByUserId (int userId);
    public List<Post> getAllPosts();
    public List<Post> getPostsByTag(int tagId);
    
    public void addStaticPage (StaticPage staticPage);
    public void deleteStaticPage (int postId);
    public void updateStaticPage  (int postId);
    public StaticPage getStaticPageByPostId (int postId);
    public List<StaticPage> getStaticPagesByUserId (int userId);
    
}