/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.InterfaceDAO;
import daos.GeneralDAO;
import entities.Department;
import entities.Employee;
import entities.Location;
import java.util.List;
import java.util.Vector;
import javax.swing.JComboBox;
import org.hibernate.SessionFactory;
import org.hibernate.jpa.criteria.expression.function.SubstringFunction;

/**
 *
 * @author Martin
 */
public class DepartmentController {
 
    private final InterfaceDAO iDAO;
    private final EmployeeController empController;
    private final LocationController locController;
    
    public DepartmentController(SessionFactory sessionFactory) {  
        iDAO = new GeneralDAO(sessionFactory, Department.class);
        empController = new EmployeeController(sessionFactory);
        locController = new LocationController(sessionFactory);
    }
    
    /**
     * melakukan save atau update
     * @param departmentId (String) Id dari department
     * @param departmentName (String) Nama dari department
     * @param managerId (String) Id dari manager
     * @param locationId (String) Id dari location
     * @return mengembalikan fungsi saveOrUpdate dari iDAO
     */
    public boolean saveOrUpdate(String departmentId, String departmentName, String managerId, String locationId){
        Employee manager = new Employee(new Integer(managerId.substring(0,3)));
        Location location = new Location(new Short(locationId.substring(0,4)));
        Department department = new Department(new Short(departmentId), departmentName, manager, location);
        return iDAO.saveOrUpdate(department);
    }
    
    /**
     * Melakukan delete atau menghapus
     * @param departmentId (String) Id dari department
     * @return mengembalikan fungsi delete dari iDAO
     */
    public boolean delete(String departmentId){
        Department department = (Department) getById(departmentId);
        return iDAO.delete(department);
    }
    
    /**
     * Mencari berdasarkan Id
     * @param departmentId (String) Id dari department
     * @return mengembalikan fungsi getById dari iDAO
     */
    public Object getById(String departmentId){
        return iDAO.getById(new Short(departmentId));
    }
    
    /**
     * Melakukan pencarian berdasarkan kategori
     * @param category (String) kategori yang ingin dicari
     * @param key (Object) kata kunci pencarian
     * @return mengembalikan fungsi search dari iDAO
     */
    public List<Object> search(String category, Object key){
        if(category.equals("departmentName")){
            return iDAO.search(category, key);
        }
        else if(category.equals("managerId")){
            return iDAO.search(category, (Employee) empController.getById((key+"")));
        }
        else if(category.equals("locationId")){
            return iDAO.search(category, (Location) locController.getById((key+"")));
        }
        else{
            return iDAO.search(category, new Short(key+""));
        }
    }
    
    /**
     * Mengambil seluruh data dari database
     * @return mengembalikan fungsi getAll dari iDAO
     */
    public List<Object> getAll(){
        return iDAO.getAll();
    }
    
    /**
     * mengambil Id yang paling baru atau terakhir
     * @return mengembalikan Id department yang sudah ditambah dengan 10
     */
    public Object getNewId(){
        Department department =  (Department) iDAO.getLastId();
        return department.getDepartmentId() + 10;
    }
    
    /**
     * memasukan data dari department name kedalam combobox
     * @param cmb (JComboBox) combobox
     */
    public void loadCmbDepartmentName(JComboBox cmb){
        List<Object> objects = this.getAll();
        for (Object object : objects) {
            Department department = (Department) object;
            cmb.addItem(department.getDepartmentName());
        }
    }
    
    /**
     * memasukan data dari employee id dan employee last name kedalam combobox
     * @param cmb (JComboBox) combobox
     */
    public  void loadCmbManagerId(JComboBox cmb){
        List<Object> objects = (List<Object>) empController.getAll();
        for (Object object : objects) {
            Employee employee = (Employee) object;
            cmb.addItem(employee.getEmployeeId() + " - " + employee.getLastName());
        }
    }
    
    /**
     * memasukan data dari location id dan city kedalam combobox
     * @param cmb (JComboBox) combobox
     */
    public  void loadCmbLocationId(JComboBox cmb){
        List<Location> objects = (List<Location>) locController.getAll();
        for (Object object : objects) {
            Location location = (Location) object;
            cmb.addItem(location.getLocationId() + " - " + location.getCity());
        }
    }
}
