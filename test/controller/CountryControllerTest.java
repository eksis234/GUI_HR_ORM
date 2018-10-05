/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Country;
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
public class CountryControllerTest {
    
    public CountryControllerTest() {
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
     * Test of saveOrUpdate method, of class CountryController.
     */
    @Test
    public void testSaveOrUpdate() {
        System.out.println("saveOrUpdate");
        Country country = new Country("AR");
        country.setCountryName("Sanggau");
        Region region = new Region(new BigDecimal(1));
        country.setRegionId(region);
        CountryController instance = new CountryController(tools.HibernateUtil.getSessionFactory());
        boolean result = instance.saveOrUpdate(country);
        assertTrue(result);
    }

    /**
     * Test of delete method, of class CountryController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Country c = new Country("AR");
        CountryController instance = new CountryController(tools.HibernateUtil.getSessionFactory());
        boolean result = instance.delete(c);
        assertTrue(result);
    }

    /**
     * Test of getAll method, of class CountryController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        CountryController instance = new CountryController(tools.HibernateUtil.getSessionFactory());
        List<Object> result = instance.getAll();
        assertNotNull(result);
    }

    /**
     * Test of search method, of class CountryController.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String category = "countryId";
        Object key = "AU";
        CountryController instance = new CountryController(tools.HibernateUtil.getSessionFactory());
        List<Object> result = instance.search(category, key);
        assertNotNull(result);
    }

    /**
     * Test of getById method, of class CountryController.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        String countryId = "AU";
        CountryController instance = new CountryController(tools.HibernateUtil.getSessionFactory());
        Object result = instance.getById(countryId);
        assertNotNull(result);
    }
    
}
