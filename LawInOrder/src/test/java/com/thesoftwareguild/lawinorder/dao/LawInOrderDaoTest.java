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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author apprentice
 */
public class LawInOrderDaoTest {

    private LawInOrderDao dao;

    private User u1;
    private User u2;
    private User u3;

    private Comment c1;
    private Comment c2;
    private Comment c3;

    private Role r1;
    private Role r2;
    private Role r3;

    private StaticPage sp1;

    private Tag t1;
    private Tag t2;
    private Tag t3;

    private Post p1;
    private Post p2;
    private Post p3;

    public LawInOrderDaoTest() {
    }

    @Before
    public void setUp() {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("test-applicationContext.xml");
        dao = ctx.getBean("dao", LawInOrderDao.class);

        u1 = new User();
        u1.setUsername("sampleUsernameOne");
        u1.setEmail("sampleUsernameOne@gmail.com");
        u1.setPassword("samplePasswordOne");

        u2 = new User();
        u2.setUsername("sampleUsernameTwo");
        u2.setEmail("sampleUsernameTwo@gmail.com");
        u2.setPassword("samplePasswordTwo");

        u3 = new User();
        u3.setUsername("sampleUsernameTwo");
        u3.setEmail("sampleUsernameTwo@gmail.com");
        u3.setPassword("samplePasswordTwo");

        c1 = new Comment();
        // c1.setUserIds(1);
        c1.setCommentBody("sampleCommentOne");
        c1.setCommentDate(LocalDate.now());
        c1.setPostId(1);

        c2 = new Comment();
        c2.setCommentBody("sampleCommentTwo");
        c2.setCommentDate(LocalDate.now());
        c2.setPostId(2);

        c3 = new Comment();
        c3.setCommentBody("sampleCommentThree");
        c3.setCommentDate(LocalDate.now());
        c3.setPostId(3);

        t1 = new Tag();
        t1.setTagName("sampleTagOne");

        t2 = new Tag();
        t2.setTagName("sampleTagTwo");

        t3 = new Tag();
        t3.setTagName("sampleTagThree");

        r1 = new Role();
        r1.setRoleName("sampleRoleOne");

        r2 = new Role();
        r2.setRoleName("sampleRoleTwo");

        r3 = new Role();
        r3.setRoleName("sampleRoleThree");

        p1 = new Post();
        p1.setTitle("samplePostTitleOne");
        p1.setPostBody("samplePostBodyOne");
        // p1.setPostDate("01/01/2001");
        p1.setPostExcerpt("samplePostExcerptOne");
        // p1.setLastEditDate("01/01/2001");

        p2 = new Post();
        p2.setTitle("samplePostTitleTwo");
        p2.setPostBody("samplePostBodyTwo");
        // p2.setPostDate("01/01/2001");
        p2.setPostExcerpt("samplePostExcerptTwo");
        // p2.setLastEditDate("01/01/2001");

        p3 = new Post();
        p3.setTitle("samplePostTitleThree");
        p3.setPostBody("samplePostBodyThree");
        // p3.setPostDate("01/01/2001");
        p3.setPostExcerpt("samplePostExcerptThree");
        // p3.setLastEditDate("01/01/2001");

        JdbcTemplate cleanup = ctx.getBean("jdbcTemplate", JdbcTemplate.class);
        cleanup.update("DELETE FROM comments");
        cleanup.update("DELETE FROM posts");
        cleanup.update("DELETE FROM roles");
        cleanup.update("DELETE FROM static_pages");
        cleanup.update("DELETE FROM tags");
        cleanup.update("DELETE FROM users");
        cleanup.update("DELETE FROM tags_posts");
        cleanup.update("DELETE FROM users_roles");
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {
    /**
     * Test of addUser method, of class LawInOrderDao.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");

        dao.addUser(u1);
        dao.addUser(u2);

        User u3 = dao.getUserById(u1.getUserId());
        User u4 = dao.getUserById(u2.getUserId());
       
        assertEquals(u1, u3);
        assertEquals(u2, u4);
    }

    /**
     * Test of deleteUser method, of class LawInOrderDao.
     */
    @Test
    public void testDeleteUser() {
        System.out.println("deleteUser");
        dao.addUser(u1);
        dao.addUser(u2);

        List<User> memUsers = new ArrayList<>();
        memUsers.add(u1);
        memUsers.add(u2);

        List<User> dbUsers = new ArrayList<>();
        memUsers.add(dao.getUserById(u1.getUserId()));
        memUsers.add(dao.getUserById(u2.getUserId()));

        dao.deleteUser(u1.getUserId());

        Assert.assertNotEquals(memUsers.size(), dbUsers.size());
        Assert.assertNull(dao.getUserById(u1.getUserId()));
    }

    /**
     * Test of updateUser method, of class LawInOrderDao.
     */
    @Test
    public void testUpdateUser() {
        dao.addUser(u1);
        dao.addUser(u2);

        u1.setUsername("sampleUsernameOne");

        dao.updateUser(u1);

        Assert.assertEquals(u1, dao.getUserById(u1.getUserId()));
    }

    /**
     * Test of getUserById method, of class LawInOrderDao.
     */
    @Test
    public void testGetUserById() {

        dao.addUser(u1);
        dao.addUser(u2);
        dao.addUser(u3);

        User u5 = dao.getUserById(u1.getUserId());
        User u4 = dao.getUserById(u3.getUserId());

        Assert.assertEquals(u1, u5);
        Assert.assertEquals(u4, u3);
    }

    /**
     * Test of getAllUsers method, of class LawInOrderDao.
     */
    @Test
    public void testGetAllUsers() {
        dao.addUser(u1);
        dao.addUser(u2);
        dao.addUser(u3);

        List<User> inMemUsers = new ArrayList<>();
        inMemUsers.add(u1);
        inMemUsers.add(u2);
        inMemUsers.add(u3);

        List<User> retrievedUsers = new ArrayList<>();
        retrievedUsers.add(dao.getUserById(u1.getUserId()));
        retrievedUsers.add(dao.getUserById(u2.getUserId()));
        retrievedUsers.add(dao.getUserById(u3.getUserId()));

        Assert.assertEquals(inMemUsers, retrievedUsers);
    }

    /**
     * Test of addComment method, of class LawInOrderDao.
     */
    @Test
    public void testAddComment() {
        System.out.println("addComment");

        dao.addComment(c1);
        dao.addComment(c2);

        Comment c3 = dao.getCommentById(c1.getCommentId());
        Comment c4 = dao.getCommentById(c2.getCommentId());

        assertEquals(c1, c3);
        assertEquals(c2, c4);
    }

    /**
     * Test of deleteComment method, of class LawInOrderDao.
     */
    @Test
    public void testDeleteComment() {
        System.out.println("deleteComment");

        dao.addComment(c1);
        dao.addComment(c2);

        List<Comment> memComments = new ArrayList<>();
        memComments.add(c1);
        memComments.add(c2);

        List<Comment> dbComments = new ArrayList<>();
        memComments.add(dao.getCommentById(c1.getCommentId()));
        memComments.add(dao.getCommentById(c2.getCommentId()));

        dao.deleteComment(c1.getCommentId());

        Assert.assertNotEquals(memComments.size(), dbComments.size());
        Assert.assertNull(dao.getCommentById(c1.getCommentId()));
    }

    /**
     * Test of updateComment method, of class LawInOrderDao.
     */
//////////    @Test
//////////    public void testUpdateComment() {
//////////        System.out.println("updateComment");
//////////        int commentId = 0;
//////////        LawInOrderDao instance = new LawInOrderDaoDbImpl();
//////////        Comment expResult = null;
//////////        Comment result = instance.updateComment(commentId);
//////////        assertEquals(expResult, result);
//////////        // TODO review the generated test code and remove the default call to fail.
//////////        fail("The test case is a prototype.");
//////////    }
    /**
     * Test of getCommentById method, of class LawInOrderDao.
     */
    @Test
    public void testGetCommentById() {
        System.out.println("getCommentById");
        int commentId = 0;
        LawInOrderDao instance = new LawInOrderDaoDbImpl();
        Comment expResult = null;
        Comment result = instance.getCommentById(commentId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCommentsByUserId method, of class LawInOrderDao.
     */
    @Test
    public void testGetCommentsByUserId() {
        System.out.println("getCommentsByUserId");
        int userId = 0;
        LawInOrderDao instance = new LawInOrderDaoDbImpl();
        List<Comment> expResult = null;
        List<Comment> result = instance.getCommentsByUserId(userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllComments method, of class LawInOrderDao.
     */
    @Test
    public void testGetAllComments() {
        System.out.println("getAllComments");
        LawInOrderDao instance = new LawInOrderDaoDbImpl();
        List<Comment> expResult = null;
        List<Comment> result = instance.getAllComments();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTag method, of class LawInOrderDao.
     */
    @Test
    public void testAddTag() {
        System.out.println("addTag");

        dao.addTag(t1);
        dao.addTag(t2);

        Tag tag3 = dao.getTagById(t1.getTagId());
        Tag tag4 = dao.getTagById(t2.getTagId());

        assertEquals(t1, tag3);
        assertEquals(t2, tag4);
    }

    /**
     * Test of deleteTag method, of class LawInOrderDao.
     */
    @Test
    public void testDeleteTag() {
        System.out.println("deleteTag");

        dao.addTag(t1);
        dao.addTag(t2);

        List<Tag> memTags = new ArrayList<>();
        memTags.add(t1);
        memTags.add(t2);

        List<Tag> retrievedTags = new ArrayList<>();
        memTags.add(dao.getTagById(t1.getTagId()));
        memTags.add(dao.getTagById(t2.getTagId()));

        dao.deleteTag(t1.getTagId());

        Assert.assertNotEquals(memTags.size(), retrievedTags.size());
        Assert.assertNull(dao.getTagById(t1.getTagId()));
    }

    /**
     * Test of updateTag method, of class LawInOrderDao.
     */
    @Test
    public void testUpdateTag() {
        System.out.println("updateTag");

        System.out.println("updateTag");

        dao.addTag(t1);
        dao.addTag(t2);

        t1.setTagName("SampleTag");

        dao.updateTag(t1);

        Assert.assertEquals(t1, dao.getTagById(t1.getTagId()));
    }

    /**
     * Test of getTagById method, of class LawInOrderDao.
     */
    @Test
    public void testGetTagById() {
        System.out.println("getTagById");

        dao.addTag(t1);
        dao.addTag(t2);

        Tag t5 = dao.getTagById(t1.getTagId());
        Tag t4 = dao.getTagById(t2.getTagId());

        Assert.assertEquals(t1, t5);
        Assert.assertEquals(t4, t2);
    }

    /**
     * Test of getAllTags method, of class LawInOrderDao.
     */
    @Test
    public void testGetAllTags() {
        System.out.println("getAllTags");

        dao.addTag(t1);
        dao.addTag(t2);
        dao.addTag(t3);

        List<Tag> inMemTags = new ArrayList<>();
        inMemTags.add(t1);
        inMemTags.add(t2);
        inMemTags.add(t3);

        List<Tag> retrievedTags = new ArrayList<>();
        retrievedTags.add(dao.getTagById(t1.getTagId()));
        retrievedTags.add(dao.getTagById(t2.getTagId()));
        retrievedTags.add(dao.getTagById(t3.getTagId()));

        Assert.assertEquals(inMemTags, retrievedTags);
    }

    /**
     * Test of getTagsFromPost method, of class LawInOrderDao.
     */
    @Test
    public void testGetTagsFromPost() {
        System.out.println("getTagsFromPost");
        int postId = 0;
        LawInOrderDao instance = new LawInOrderDaoDbImpl();
        List<Tag> expResult = null;
        List<Tag> result = instance.getTagsFromPost(postId);
        assertEquals(expResult, result);
        //TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addRole method, of class LawInOrderDao.
     */
    @Test
    public void testAddRole() {
        System.out.println("addRole");
        dao.addRole(r1);
        dao.addRole(r2);

        Role r3 = dao.getRoleById(r1.getRoleId());
        Role r4 = dao.getRoleById(r2.getRoleId());

        assertEquals(r1, r3);
        assertEquals(r2, r4);
    }

    /**
     * Test of deleteRole method, of class LawInOrderDao.
     */
    @Test
    public void testDeleteRole() {
        System.out.println("deleteRole");

        dao.addRole(r1);
        dao.addRole(r2);

        List<Role> userRoles = new ArrayList<>();
        userRoles.add(r1);
        userRoles.add(r2);

        List<Role> dbRoles = new ArrayList<>();
        userRoles.add(dao.getRoleById(r1.getRoleId()));
        userRoles.add(dao.getRoleById(r2.getRoleId()));

        dao.deleteRole(r1.getRoleId());

        Assert.assertNotEquals(userRoles.size(), dbRoles.size());
        Assert.assertNull(dao.getRoleById(r1.getRoleId()));
    }

    /**
     * Test of updateRole method, of class LawInOrderDao.
     */
    @Test
    public void testUpdateRole() {
        System.out.println("updateRole");

        dao.addRole(r1);
        dao.addRole(r2);

        r1.setRoleName("Editor");

        dao.updateRole(r1);

        Assert.assertEquals(r1, dao.getRoleById(r1.getRoleId()));
    }

    /**
     * Test of getRoleById method, of class LawInOrderDao.
     */
    @Test
    public void testGetRoleById() {
        System.out.println("getRoleById");

        dao.addRole(r1);
        dao.addRole(r2);

        Role r5 = dao.getRoleById(r1.getRoleId());
        Role r4 = dao.getRoleById(r2.getRoleId());

        Assert.assertEquals(r1, r5);
        Assert.assertEquals(r4, r2);
    }

    /**
     * Test of getAllRoles method, of class LawInOrderDao.
     */
    @Test
    public void testGetAllRoles() {
        System.out.println("getAllRoles");

        dao.addRole(r1);
        dao.addRole(r2);
        dao.addRole(r3);

        List<Role> inMemRoles = new ArrayList<>();
        inMemRoles.add(r1);
        inMemRoles.add(r2);
        inMemRoles.add(r3);

        List<Role> retrievedRoles = new ArrayList<>();
        retrievedRoles.add(dao.getRoleById(r1.getRoleId()));
        retrievedRoles.add(dao.getRoleById(r2.getRoleId()));
        retrievedRoles.add(dao.getRoleById(r3.getRoleId()));

        Assert.assertEquals(inMemRoles, retrievedRoles);
    }

    /**
     * Test of addPost method, of class LawInOrderDao.
     */
    @Test
    public void testAddPost() {
        System.out.println("addPost");

        dao.addPost(p1);
        dao.addPost(p2);

        Post post3 = dao.getPostById(p1.getPostId());
        Post post4 = dao.getPostById(p2.getPostId());

        assertEquals(p1, post3);
        assertEquals(p2, post4);
    }

    /**
     * Test of deletePost method, of class LawInOrderDao.
     */
    @Test
    public void testDeletePost() {
        dao.addPost(p1);
        dao.addPost(p2);

        List<Post> memPosts = new ArrayList<>();
        memPosts.add(p1);
        memPosts.add(p2);

        List<Post> dbRoles = new ArrayList<>();
        memPosts.add(dao.getPostById(p1.getPostId()));
        memPosts.add(dao.getPostById(p2.getPostId()));

        dao.deleteRole(r1.getRoleId());

        Assert.assertNotEquals(memPosts.size(), dbRoles.size());
        Assert.assertNull(dao.getRoleById(p1.getPostId()));
    }

    /**
     * Test of updatePost method, of class LawInOrderDao.
     */
//////////    @Test
//////////    public void testUpdatePost() {
//////////        System.out.println("updatePost");
//////////        int postId = 0;
//////////        LawInOrderDao instance = new LawInOrderDaoDbImpl();
//////////        Post expResult = null;
//////////        Post result = instance.updatePost(postId);
//////////        assertEquals(expResult, result);
//////////        // TODO review the generated test code and remove the default call to fail.
//////////        fail("The test case is a prototype.");
//////////    }
    /**
     * Test of getPostById method, of class LawInOrderDao.
     */
    @Test
    public void testGetPostById() {
        System.out.println("getPostById");
        int postId = 0;
        LawInOrderDao instance = new LawInOrderDaoDbImpl();
        Post expResult = null;
        Post result = instance.getPostById(postId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPostsByUserId method, of class LawInOrderDao.
     */
    @Test
    public void testGetPostsByUserId() {
        System.out.println("getPostsByUserId");
        int userId = 0;
        LawInOrderDao instance = new LawInOrderDaoDbImpl();
        List<Post> expResult = null;
        List<Post> result = instance.getPostsByUserId(userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllPosts method, of class LawInOrderDao.
     */
    @Test
    public void testGetAllPosts() {
        System.out.println("getAllPosts");
        LawInOrderDao instance = new LawInOrderDaoDbImpl();
        List<Post> expResult = null;
        List<Post> result = instance.getAllPosts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPostsByTag method, of class LawInOrderDao.
     */
    @Test
    public void testGetPostsByTag() {
        System.out.println("getPostsByTag");
        int tagId = 0;
        LawInOrderDao instance = new LawInOrderDaoDbImpl();
        List<Post> expResult = null;
        List<Post> result = instance.getPostsByTag(tagId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addStaticPage method, of class LawInOrderDao.
     */
    @Test
    public void testAddStaticPage() {
        System.out.println("addStaticPage");
        StaticPage staticPage = null;
        LawInOrderDao instance = new LawInOrderDaoDbImpl();
        instance.addStaticPage(staticPage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteStaticPage method, of class LawInOrderDao.
     */
    @Test
    public void testDeleteStaticPage() {
        System.out.println("deleteStaticPage");
        int postId = 0;
        LawInOrderDao instance = new LawInOrderDaoDbImpl();
        instance.deleteStaticPage(postId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateStaticPage method, of class LawInOrderDao.
     */
////////////    @Test
////////////    public void testUpdateStaticPage() {
////////////        System.out.println("updateStaticPage");
////////////        int postId = 0;
////////////        LawInOrderDao instance = new LawInOrderDaoDbImpl();
////////////        StaticPage expResult = null;
////////////        StaticPage result = instance.updateStaticPage(postId);
////////////        assertEquals(expResult, result);
////////////        // TODO review the generated test code and remove the default call to fail.
////////////        fail("The test case is a prototype.");
////////////    }
    /**
     * Test of getStaticPageByPostId method, of class LawInOrderDao.
     */
    @Test
    public void testGetStaticPageByPostId() {
        System.out.println("getStaticPageByPostId");
        int postId = 0;
        LawInOrderDao instance = new LawInOrderDaoDbImpl();
        StaticPage expResult = null;
        StaticPage result = instance.getStaticPageByPostId(postId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStaticPagesByUserId method, of class LawInOrderDao.
     */
    @Test
    public void testGetStaticPagesByUserId() {
        System.out.println("getStaticPagesByUserId");
        int userId = 0;
        LawInOrderDao instance = new LawInOrderDaoDbImpl();
        List<StaticPage> expResult = null;
        List<StaticPage> result = instance.getStaticPagesByUserId(userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class LawInOrderDaoDbImpl implements LawInOrderDao {

        public void addUser(User user) {
        }

        public void deleteUser(int userId) {
        }

        public User getUserById(int userId) {
            return null;
        }

        public List<User> getAllUsers() {
            return null;
        }

        public void addComment(Comment comment) {
        }

        public void deleteComment(int commentId) {
        }

        public Comment updateComment(int commentId) {
            return null;
        }

        public Comment getCommentById(int commentId) {
            return null;
        }

        public List<Comment> getCommentsByUserId(int userId) {
            return null;
        }

        public List<Comment> getAllComments() {
            return null;
        }

        public void addTag(Tag tag) {
        }

        public void deleteTag(int tagId) {
        }

        public Tag getTagById(int tagId) {
            return null;
        }

        public List<Tag> getAllTags() {
            return null;
        }

        public List<Tag> getTagsFromPost(int postId) {
            return null;
        }

        public void addRole(Role role) {
        }

        public void deleteRole(int roleId) {
        }

        public Role getRoleById(int roleId) {
            return null;
        }

        public List<Role> getAllRoles() {
            return null;
        }

        public void addPost(Post post) {
        }

        public void deletePost(int postId) {
        }

        public Post updatePost(int postId) {
            return null;
        }

        public Post getPostById(int postId) {
            return null;
        }

        public List<Post> getPostsByUserId(int userId) {
            return null;
        }

        public List<Post> getAllPosts() {
            return null;
        }

        public List<Post> getPostsByTag(int tagId) {
            return null;
        }

        public void addStaticPage(StaticPage staticPage) {
        }

        public void deleteStaticPage(int postId) {
        }

        public StaticPage getStaticPageByPostId(int postId) {
            return null;
        }

        public List<StaticPage> getStaticPagesByUserId(int userId) {
            return null;
        }

        @Override
        public void updateUser(User user) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void updateComment(Comment comment) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void updateTag(Tag tag) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void updateRole(Role role) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void updatePost(Post post) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void updateStaticPage(int postId) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
