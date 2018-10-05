/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Region;
import java.math.BigDecimal;
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
public class RegionControllerTest {
    
    public RegionControllerTest() {
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
     * Test of saveOrUpdate method, of class RegionController.
     */
    @Test
    public void testSaveOrUpdate() {
        System.out.println("saveOrUpdate");
        String regionId = "6";
        String regionName = "Sanggau";
        RegionController instance = new RegionController(tools.HibernateUtil.getSessionFactory());
        boolean result = instance.saveOrUpdate(regionId, regionName);
        assertTrue(result);
    }

    /**
     * Test of delete method, of class RegionController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String regionId = "6";
        RegionController instance = new RegionController(tools.HibernateUtil.getSessionFactory());
        boolean result = instance.delete(regionId);
        assertTrue(result);
    }

    /**
     * Test of getById method, of class RegionController.
     */
//    @Test
//    public void testGetById() {
//        System.out.println("getById");
//        String regionId = "6";
//        RegionController instance = new RegionController(tools.HibernateUtil.getSessionFactory());
//        Region result = instance.getById(regionId);
//        assertNotNull(result);
//    }
//
    /**
     * Test of getAll method, of class RegionController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        RegionController instance =  new RegionController(tools.HibernateUtil.getSessionFactory());
        List<Object> result = instance.getAll();
        assertNotNull(result);
    }

    /**
     * Test of search method, of class RegionController.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String category = "regionId";
        Object key = new BigDecimal("6");
        RegionController instance = new RegionController(tools.HibernateUtil.getSessionFactory());
        List<Object> result = instance.search(category, key);
        assertNotNull(result);
    }

    /**
     * Test of getAutoId method, of class RegionController.
     */
    @Test
    public void testGetAutoId() {
        System.out.println("getAutoId");
        RegionController instance = new RegionController(tools.HibernateUtil.getSessionFactory());
        Object result = instance.getAutoId();
        assertNotNull(result);
    }
    
}
