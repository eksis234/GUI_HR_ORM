/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
public class EmployeeControllerTest {
    
    public EmployeeControllerTest() {
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
     * Test of getAll method, of class EmployeeController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        EmployeeController instance = new EmployeeController(tools.HibernateUtil.getSessionFactory());
        Object result = instance.getAll();
        assertNotNull(result);
    }

    /**
     * Test of getById method, of class EmployeeController.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        String employeeId = "100";
        EmployeeController instance = new EmployeeController(tools.HibernateUtil.getSessionFactory());
        Object result = instance.getById(employeeId);
        assertNotNull(result);
    }

    /**
     * Test of search method, of class EmployeeController.
     */
//    @Test
//    public void testSearch() {
//        System.out.println("search");
//        String category = "employeeId";
//        String value = "100";
//        EmployeeController instance = new EmployeeController(tools.HibernateUtil.getSessionFactory());
//        Object result = instance.search(category, value);
//        assertNotNull(result);
//    }

    /**
     * Test of delete method, of class EmployeeController.
     */
//    @Test
//    public void testDelete() {
//        System.out.println("delete");
//        EmployeeController instance = new EmployeeController(tools.HibernateUtil.getSessionFactory());
//        boolean result = instance.delete("207");
//        assertTrue(result);
//    }

    /**
     * Test of saveOrUpdate method, of class EmployeeController.
     */
    @Test
    public void testSaveOrUpdate() {
        System.out.println("saveOrUpdate");
        String employeeId = "207";
        String firstName = "leo";
        String lastName = "krisnoto";
        String email = "leo@krisnoto";
        String phoneNumber = "222180";
        String hireDate = "06/07/2002";
        String salary = "5300";
        String commissionPct = ".3";
        String departmentId = "110";
        String managerId = "100";
        String jobId = "AC_ACCOUNT";
        EmployeeController instance = new EmployeeController(tools.HibernateUtil.getSessionFactory());
        boolean result = instance.saveOrUpdate(employeeId, firstName, lastName, email, phoneNumber, hireDate, salary, commissionPct, departmentId, managerId, jobId);
        assertTrue(result);
    }

//    /**
//     * Test of getNewId method, of class EmployeeController.
//     */
    @Test
    public void testGetNewId() {
        System.out.println("getNewId");
        EmployeeController instance = new EmployeeController(tools.HibernateUtil.getSessionFactory());
        Object result = instance.getNewId();
        assertNotNull(result);
    }
    
}
