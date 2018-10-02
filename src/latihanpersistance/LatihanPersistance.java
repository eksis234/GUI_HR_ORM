/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpersistance;

import daos.InterfaceDAO;
import daos.RegionDAO;
import daos.RegionDAOS;
import entities.Country;
import entities.Department;
import entities.Employee;
import entities.Location;
import entities.Region;
import java.math.BigDecimal;
import tools.HibernateUtil;

/**
 *
 * @author Ignatius
 */
public class LatihanPersistance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Region region = new Region(new BigDecimal("13"));
        region.setRegionName("coba saja lagi");
//        RegionDAOS dAOS = new RegionDAOS(HibernateUtil
//                .getSessionFactory(), Region.class);
//        System.out.println(dAOS.saveOrUpdate(region));
        InterfaceDAO iDAO = new RegionDAOS(HibernateUtil
                .getSessionFactory(), Region.class);
//        System.out.println(iDAO.saveOrUpdate(region));
//        System.out.println(iDAO.delete("13"));
//        for (Object object : iDAO.getAll()) {
//            Region r = (Region) object;
//            System.out.println(r.getRegionId()+" - "
//                    +r.getRegionName()+" -  ");
//            for (Country country : r.getCountryList()) {
//                System.out.println(country.getCountryId()+" - "
//                        +country.getCountryName()+" : ");
//                for (Location location : country.getLocationList()) {
//                    System.out.print(location.getLocationId()+" - "
//                            +location.getCity()+", ");
//                    for (Department department : location.getDepartmentList()) {
//                        System.out.println(department.getDepartmentId()+" - "
//                                +department.getDepartmentName());
//                        for (Employee employee : department.getEmployeeList()) {
//                            System.out.println(employee.getLastName());
//                        }
//                        System.out.println("");
//                    }
//                    System.out.println("");
//                }
//                System.out.println("");
//            }
//            System.out.println("");
//        }
//        for (Object object : iDAO.search("regionName", "a")) {
//            Region r = (Region) object;
//            System.out.println(r.getRegionId()+" - "
//                    +r.getRegionName());
//        }
        Region r = (Region) iDAO.getById("4");
        System.out.println(r.getRegionName());
    }
}
