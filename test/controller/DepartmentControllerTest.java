/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
public class DepartmentControllerTest {
    
    public DepartmentControllerTest() {
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
     * Test of saveOrUpdate method, of class DepartmentController.
     */
    @Test
    public void testSaveOrUpdate() {
        System.out.println("saveOrUpdate");
        String departmentId = "290";
        String departmentName = "leo";
        String managerId = "100";
        String locationId = "1700";
        DepartmentController instance = new DepartmentController(tools.HibernateUtil.getSessionFactory());
        boolean result = instance.saveOrUpdate(departmentId, departmentName, managerId, locationId);
        assertTrue(result);
    }

    /**
     * Test of delete method, of class DepartmentController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String departmentId = "290";
        DepartmentController instance = new DepartmentController(tools.HibernateUtil.getSessionFactory());
        boolean result = instance.delete(departmentId);
        assertTrue(result);
    }

    /**
     * Test of getById method, of class DepartmentController.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        String departmentId = "280";
        DepartmentController instance = new DepartmentController(tools.HibernateUtil.getSessionFactory());
        Object result = instance.getById(departmentId);
        assertNotNull(result);
    }

    /**
     * Test of search method, of class DepartmentController.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String category = "departmentId";
        Object key = new Short("290");
        DepartmentController instance = new DepartmentController(tools.HibernateUtil.getSessionFactory());
        List<Object> result = instance.search(category, key);
        assertNotNull(result);
    }

    /**
     * Test of getAll method, of class DepartmentController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        DepartmentController instance = new DepartmentController(tools.HibernateUtil.getSessionFactory());
        List<Object> result = instance.getAll();
        assertNotNull(result);
    }

    /**
     * Test of getNewId method, of class DepartmentController.
     */
    @Test
    public void testGetNewId() {
        System.out.println("getNewId");
        DepartmentController instance = new DepartmentController(tools.HibernateUtil.getSessionFactory());
        Object result = instance.getNewId();
        assertNotNull(result);
    }

    /**
     * Test of loadCmbDepartmentName method, of class DepartmentController.
     */
    @Test
    public void testLoadCmbDepartmentName() {
        System.out.println("loadCmbDepartmentName");
        JComboBox cmb = new JComboBox();
        DepartmentController instance = new DepartmentController(tools.HibernateUtil.getSessionFactory());
        instance.loadCmbDepartmentName(cmb);
        assertNotNull(instance);
    }

    /**
     * Test of loadCmbManagerId method, of class DepartmentController.
     */
    @Test
    public void testLoadCmbManagerId() {
        System.out.println("loadCmbManagerId");
        JComboBox cmb = new JComboBox();
        DepartmentController instance = new DepartmentController(tools.HibernateUtil.getSessionFactory());
        instance.loadCmbManagerId(cmb);
        assertNotNull(instance);
    }

    /**
     * Test of loadCmbLocationId method, of class DepartmentController.
     */
    @Test
    public void testLoadCmbLocationId() {
        System.out.println("loadCmbLocationId");
        JComboBox cmb = new JComboBox();
        DepartmentController instance = new DepartmentController(tools.HibernateUtil.getSessionFactory());
        instance.loadCmbLocationId(cmb);
        assertNotNull(instance);
    }
    
}
