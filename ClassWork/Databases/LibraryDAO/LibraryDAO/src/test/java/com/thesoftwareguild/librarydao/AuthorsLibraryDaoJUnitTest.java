/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.librarydao;

import com.thesoftwareguild.librarydao.dao.LibraryDao;
import com.thesoftwareguild.librarydao.model.Author;
import com.thesoftwareguild.librarydao.model.Book;
import com.thesoftwareguild.librarydao.model.Publisher;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author apprentice
 */
public class AuthorsLibraryDaoJUnitTest {

    private LibraryDao dao;

    private Author a1;
    
    private Author a2;
    
    private Book b1;
    
    private Publisher p1;

    private String postfix;

    public AuthorsLibraryDaoJUnitTest() {
    }

    @Before
    public void setUp() {

        UUID rnd = UUID.randomUUID();
        postfix = rnd.toString().substring(0, 15);

        ApplicationContext ctx = new ClassPathXmlApplicationContext("test-applicationContext.xml");
        dao = ctx.getBean("libraryDao", LibraryDao.class);

                a1 = new Author();
                a1.setFirstName("Art");
                a1.setLastName("Thomas");
                a1.setStreet("123 Main Street");
                a1.setCity("Cleveland");
                a1.setState("OH");
                a1.setPhone("0987654321");
                a1.setZip("44118");
                
                a2 = new Author();
                a2.setFirstName("Art");
                a2.setLastName("Thomas");
                a2.setStreet("123 Main Street");
                a2.setCity("Cleveland");
                a2.setState("OH");
                a2.setPhone("0987654321");
                a2.setZip("44118");
               
                b1 = new Book();
                b1.setIsbn(postfix);
                b1.setPrice(BigDecimal.valueOf(25.95));
                b1.setPublishDate(LocalDate.now());
                b1.setTitle("Java Rulez!");
                
                p1 = new Publisher();
                p1.setCity("Cleveland");
                p1.setName("Great Lakes");
                p1.setPhone("21623495");
                p1.setState("OH");
                p1.setZip("44118");
                p1.setStreet("24 College Rd.");
                
                JdbcTemplate cleanup = ctx.getBean("jdbcTemplate",JdbcTemplate.class);
                cleanup.update("DELETE FROM books_authors");
                cleanup.update("DELETE FROM books");
                cleanup.update("DELETE FROM publishers");
                cleanup.update("DELETE FROM authors");
            
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void addGetDeleteAuthorTest() {
        dao.addAuthor(a1);
        Author result = dao.getAuthorById(a1.getAuthorId());
        assertEquals(a1, result);
        dao.deleteAuthor(a1.getAuthorId());
        assertNull(dao.getAuthorById(a1.getAuthorId()));

    }

    @Test
    public void updateAuthorTest() {
        dao.addAuthor(a1);
        Author expected = dao.getAuthorById(a1.getAuthorId());

        expected.setCity("city" + postfix);
        expected.setFirstName("fn" + postfix);
        expected.setLastName("ln" + postfix);
        expected.setState("CA");
        expected.setStreet("st" + postfix);
        expected.setPhone("0987654321");

        dao.updateAuthor(expected);
        Author result = dao.getAuthorById(expected.getAuthorId());

        assertEquals(expected, result);
    }
    
    @Test
    public void getAuthorsByBookId()
    {
        // Arrange 
        dao.addAuthor(a1);
        dao.addAuthor(a2);
        
        dao.addPublisher(p1);
        
        b1.setPublisherId(p1.getPublisherId());
        int[] authors = new int[]{a1.getAuthorId(), a2.getAuthorId()};
        
        b1.setAuthorIds(authors);
        
        dao.addBook(b1);
        
        List<Author> expected = new ArrayList<>();
        expected.add(a1);
        expected.add(a2);
        // Act
        List<Author> result = dao.getAuthorsByBookId(b1.getBookId());
        
        //assertTrue(expected.containsAll(result) && result.containsAll(expected));
        assertEquals(expected,result);
        
    }
    
    @Test
    public void getAllAuthorsTest()
    {
        // arrange 
        dao.addAuthor(a1);
        dao.addAuthor(a2);
        
        List<Author> expected = new ArrayList<>();
        expected.add(a1);
        expected.add(a2);
        
        // act
        List<Author> result = dao.getAllAuthors();
        
        //assert
        assertEquals(expected, result);
        
    }

}


// How to set up the database
// cleanup