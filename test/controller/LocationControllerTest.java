/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Location;
import java.util.List;
import javax.swing.JComboBox;
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
public class LocationControllerTest {
    
    public LocationControllerTest() {
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
     * Test of saveOrUpdate method, of class LocationController.
     */
    @Test
    public void testSaveOrUpdate() {
        System.out.println("saveOrUpdate");
        String locationId = "3500";
        String streetAddress = "aw";
        String postalCode = "aw";
        String city = "aw";
        String stateProvince = "aw";
        String countryId = "AU";
        LocationController instance = new LocationController(tools.HibernateUtil.getSessionFactory());
        boolean result = instance.saveOrUpdate(locationId, streetAddress, postalCode, city, stateProvince, countryId);
        assertTrue(result);
    }

    /**
     * Test of delete method, of class LocationController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String locationId = "3500";
        LocationController instance = new LocationController(tools.HibernateUtil.getSessionFactory());
        boolean result = instance.delete(locationId);
        assertTrue(result);
    }

    /**
     * Test of getById method, of class LocationController.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        String locationId = "3500";
        LocationController instance = new LocationController(tools.HibernateUtil.getSessionFactory());
        Location result = instance.getById(locationId);
        assertNotNull(result);
    }

    /**
     * Test of getAll method, of class LocationController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        LocationController instance = new LocationController(tools.HibernateUtil.getSessionFactory());
        Object result = instance.getAll();
        assertNotNull(result);
    }

    /**
     * Test of searchLoc method, of class LocationController.
     */
    @Test
    public void testSearchLoc() {
        System.out.println("searchLoc");
        String Category = "locationId";
        Object key = new Short("3500");
        LocationController instance = new LocationController(tools.HibernateUtil.getSessionFactory());
        List<Object> result = instance.searchLoc(Category, key);
        assertNotNull(result);
    }

    /**
     * Test of loadMaxId method, of class LocationController.
     */
    @Test
    public void testLoadMaxId() {
        System.out.println("loadMaxId");
        LocationController instance = new LocationController(tools.HibernateUtil.getSessionFactory());
        Object result = instance.loadMaxId();
        assertNotNull(result);
    }

//    /**
//     * Test of loadCmb method, of class LocationController.
//     */
//    @Test
//    public void testLoadCmb() {
//        System.out.println("loadCmb");
//        JComboBox cmb = new JComboBox();
//        LocationController instance = new LocationController(tools.HibernateUtil.getSessionFactory());
//        instance.loadCmb(cmb);
//        assertNotNull(instance);
//    }   
}
