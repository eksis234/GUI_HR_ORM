/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpersistance;

import controller.CountryController;
import controller.RegionController;
import daos.CountryDAO;
import daos.InterfaceDAO;
//import daos.RegionDAO;
import daos.GeneralDAO;
import daos.RegionDAO;
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
//        Region region = new Region(new BigDecimal("13"));
//        region.setRegionName("coba saja lagi");
//        GeneralDAO dAOS = new GeneralDAO(HibernateUtil
//                .getSessionFactory(), Region.class);
//
//        InterfaceDAO iDAO = new GeneralDAO(HibernateUtil
//                .getSessionFactory(), Region.class);
//        System.out.println(dAOS.saveOrUpdate(region));
//        System.out.println(iDAO.saveOrUpdate(region));
//        System.out.println(iDAO.delete(region));
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
//        Region r = (Region) iDAO.getById("4");
//        System.out.println(r.getRegionName());


        
//    InterfaceDAO iDAO = new RegionDAO(HibernateUtil
//            .getSessionFactory(), Region.class);
RegionController rc = new RegionController(HibernateUtil.getSessionFactory(), Region.class);
        
    Region region = new Region(new BigDecimal("7"));
    region.setRegionName("Kirigakure");
//    System.out.println(rc.saveOrUpdate(region));

//    System.out.println(rc.delete(region));

//    region = (Region) rc.getById("regionId", new BigDecimal("6"));
//    System.out.println(region.getRegionId()+" - "+region.getRegionName());

//        System.out.println("Region Id - Region Name");
//        for (Object object : rc.search("regionId", new BigDecimal("4"))) {
//            region = (Region) object;
//            System.out.println(region.getRegionId()+" - "+region.getRegionName());
//        }

//        System.out.println("Region Id - Region Name");
//        for (Object object : rc.getAll()) {
//            region = (Region) object;
//            System.out.println(region.getRegionId()+" - "+region.getRegionName());
//        }

CountryController cc =  new CountryController(HibernateUtil.getSessionFactory(), Country.class);
        Country country = new Country("AF");
        country.setCountryName("AGAK_GARANG");
        country.setRegionId(region);
//        System.out.println(cc.saveOrUpdate(country));

//        System.out.println(cc.delete(country));

//        System.out.println("Country Id - Country Name - Region Id - Region Name");
//        country = (Country) cc.getById("countryId", "AD");
//        System.out.println(country.getCountryId() + " - " + country.getCountryName()+""
//                + " - "+country.getRegionId().getRegionId()+" - "+country.getRegionId().getRegionName());

//        System.out.println("Country Id - Country Name - Region Id - Region Name");
//        for (Object object : cc.search("regionId", region)) {
//             country = (Country) object;
//             System.out.println(country.getCountryId()+" - "+country.getCountryName()+" "
//                     + "- "+country.getRegionId().getRegionId()+" - "+
//                     country.getRegionId().getRegionName());              
//            }
//        
//        System.out.println("Country Id - Country Name - Region Id - Region Name");
//        for (Object object : cc.getAll()) {
//            country = (Country) object;
//            System.out.println(country.getCountryId()+" - "+country.getCountryName()+" - "+
//                    country.getRegionId().getRegionId()+" - "+country.getRegionId().getRegionName());
//            //" - "+country.getLocationList().size()) dianjurkan memakai for 
//        }
    }
}
