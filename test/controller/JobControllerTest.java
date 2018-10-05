/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Job;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chochong
 */
public class JobControllerTest {
    
    public JobControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of saveOrUpdate method, of class JobController.
     */
    @Test
    public void testSaveOrUpdate() {
        System.out.println("saveOrUpdate");
        String jobId = "WA_MAN";
        String jobTitle = "Wakwaw";
        String minSalary = "5000";
        String MaxSalary = "6000";
        JobController instance = new JobController(tools.HibernateUtil.getSessionFactory());
        boolean result = instance.saveOrUpdate(jobId, jobTitle, minSalary, MaxSalary);
        assertTrue(result);
    }

    /**
     * Test of delete method, of class JobController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String jobId = "WA_MAN";
        JobController instance = new JobController(tools.HibernateUtil.getSessionFactory());
        boolean result = instance.delete(jobId);
        assertTrue(result);
    }

    /**
     * Test of getById method, of class JobController.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        String jobId = "WA_MAN";
        JobController instance = new JobController(tools.HibernateUtil.getSessionFactory());
        Job result = instance.getById(jobId);
        assertNotNull(result);
    }

    /**
     * Test of getAll method, of class JobController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        JobController instance = new JobController(tools.HibernateUtil.getSessionFactory());
        List<Object> result = instance.getAll();
        assertNotNull(result);
    }

    /**
     * Test of search method, of class JobController.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String category = "jobId";
        String key = "WA_MAN";
        JobController instance = new JobController(tools.HibernateUtil.getSessionFactory());
        List<Object> result = instance.search(category, key);
        assertNotNull(result);
    }
    
}
