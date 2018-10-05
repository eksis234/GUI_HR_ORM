/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpersistance;

import controller.CountryController;
import controller.RegionController;
//import daos.CountryDAO;
//import daos.InterfaceDAO;
//import daos.RegionDAO;
//import daos.GeneralDAO;
//import daos.RegionDAO;
import entities.Country;
//import entities.Department;
//import entities.Employee;
//import entities.Location;
import entities.Region;
//import java.awt.BorderLayout;
import java.math.BigDecimal;
import java.util.Scanner;
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


//        RegionController rc = new RegionController(HibernateUtil.getSessionFactory());
//        CountryController cc =  new CountryController(HibernateUtil.getSessionFactory());
//        Scanner in = new Scanner(System.in);
//        Region region = new Region();
//        Country country = new Country();
//        System.out.println("Pilihan Menu sesuai Nama tabel di HR");
//        System.out.print("1. Regions \n2. Countries \n3. Locations \n4. Departments \n5. Jobs \n6. Employees \nPilihan Menu: ");
//        int pilihMenu = in.nextInt();
//        String inputId = ""; String inputIdnya = ""; String inputName = "";
//        String mn = "";
//        do{
//        switch(pilihMenu){
//            case 1: 
//                System.out.println("\nRegion Id - Region Name");
//                    for (Object object : rc.getAll()) {
//                        region = (Region) object;
//                        System.out.println(region.getRegionId()+" - "+region.getRegionName());
//                    }
//                System.out.print("\nPilihan Fungsi ada 1. SaveOrUpdate 2. Delete 3. GetAllData 4. Search 5.GetById \nPilihan Fungsi : ");
//                int fungsi = in.nextInt();
//                switch(fungsi){
//                    case 1: 
//                        System.out.print("\nAnda memilih fungsi Save or Update \nMasukan Region Id   : "); inputId = in.next();                
//                        System.out.print("Masukan Region Name : "); String regionName = in.next();
//                        region = new Region(new BigDecimal(inputId));
//                        region.setRegionName(regionName);
//                        rc.saveOrUpdate(region);
//                        System.out.println("Region Id - Region Name");
//                        for (Object object : rc.getAll()) {
//                            region = (Region) object;
//                            System.out.println(region.getRegionId()+" - "+region.getRegionName());}
//                        break;
//                    case 2: 
//                        System.out.print("\nAnda memilih fungsi Delete \nMasukkan Region Id : "); inputId = in.next();
//                        region = new Region(new BigDecimal(inputId));
//                        rc.delete(region);
//                        System.out.println("Region Id - Region Name");
//                        for (Object object : rc.getAll()) {
//                            region = (Region) object;
//                            System.out.println(region.getRegionId()+" - "+region.getRegionName());}
//                        break;
//                    case 3: 
//                        System.out.println("\nAnda meilih fungsi GetAllData \nRegion Id - Region Name");
//                        for (Object object : rc.getAll()) {
//                            region = (Region) object;
//                            System.out.println(region.getRegionId()+" - "+region.getRegionName());}
//                        break;
//                    case 4:
//                        System.out.print("\nAnda Memilih fungsi Search \nMasukkan Region Name : "); inputId = in.next();
//                        System.out.println("Region Id - Region Name");
//                        for (Object object : rc.search("regionName", inputId)) {
//                            region = (Region) object;
//                            System.out.println(region.getRegionId() + " - " + region.getRegionName());
//                        }               
//                        break;
//                    case 5:
//                        System.out.print("\nAnda Memilih fungsi GetById \nMasukkan Region Id : "); inputId = in.next();
//                        region = (Region) rc.getById(inputId);
//                        System.out.println(region.getRegionId() + " - " + region.getRegionName());
//                        break;
//                    default:break;
//                }
//                break;
//            case 2: 
//                System.out.println("Country Id - Country Name - Region Id - Region Name");
//                for (Object object : cc.getAll()) {
//                    country = (Country) object;
//                    System.out.println(country.getCountryId() + " - " + country.getCountryName() + " - "
//                            + country.getRegionId().getRegionId() + " - " + country.getRegionId().getRegionName()); //" - "+country.getLocationList().size()) dianjurkan memakai for 
//                }  
//                System.out.print("\nPilihan Fungsi ada 1. SaveOrUpdate 2. Delete 3. GetAllData 4. Search 5.GetById \nPilihan Fungsi : ");
//                fungsi = in.nextInt();
//                switch(fungsi){
//                    case 1: 
//                        System.out.print("\nAnda memilih fungsi Save or Update \nMasukan Country Id    : "); inputIdnya = in.next();
//                        country = new Country(inputIdnya);
//                        System.out.print("Masukkan Country Name :  "); inputName = in.next(); country.setCountryName(inputName);
//                        System.out.print("Masukkan Region Id    : "); inputId = in.next(); region = new Region(new BigDecimal(inputId));
//                        country.setRegionId(region);
//                        System.out.println(cc.saveOrUpdate(country));
//                        System.out.println("Country Id - Country Name - Region Id - Region Name");
//                        for (Object object : cc.getAll()) {
//                            country = (Country) object;
//                            System.out.println(country.getCountryId() + " - " + country.getCountryName() + " - "
//                                    + country.getRegionId().getRegionId() + " - " + country.getRegionId().getRegionName()); //" - "+country.getLocationList().size()) dianjurkan memakai for 
//                        }
//                        break;
//                    case 2: 
//                        System.out.print("\nAnda memilih fungsi Delete \nMasukkan Country Id : "); inputId = in.next();
//                        country = new Country(inputId);
//                        cc.delete(country);
//                        System.out.println("Country Id - Country Name - Region Id - Region Name");
//                        for (Object object : cc.getAll()) {
//                            country = (Country) object;
//                            System.out.println(country.getCountryId() + " - " + country.getCountryName() + " - "
//                                    + country.getRegionId().getRegionId() + " - " + country.getRegionId().getRegionName()); //" - "+country.getLocationList().size()) dianjurkan memakai for 
//                        }
//                        break;
//                    case 3: 
//                        System.out.println("\nAnda memilih fungsi GetAll \nCountry Id - Country Name - Region Id - Region Name");
//                        for (Object object : cc.getAll()) {
//                            country = (Country) object;
//                            System.out.println(country.getCountryId() + " - " + country.getCountryName() + " - "
//                                    + country.getRegionId().getRegionId() + " - " + country.getRegionId().getRegionName()); //" - "+country.getLocationList().size()) dianjurkan memakai for 
//                        }
//                        break;
//                    case 4: 
//                        System.out.print("\nAnda Memilih fungsi Search \nMasukkan Country Name : "); inputId = in.next();
//                        System.out.println("Country Id - Country Name - Region Id - Region Name");
//                        for (Object object : cc.search("countryName", inputId)) {
//                            country = (Country) object;
//                            System.out.println(country.getCountryId() + " - " + country.getCountryName() + " "
//                                    + "- " + country.getRegionId().getRegionId() + " - "
//                                    + country.getRegionId().getRegionName());
//                        }                      
//                        break;
//                    case 5: 
//                        System.out.print("\nAnda Memilih fungsi GetById \nMasukkan Country Id : "); inputId = in.next();
//                        System.out.println("Country Id - Country Name - Region Id - Region Name");
//                        country = (Country) cc.getById(inputId);
//                        System.out.println(country.getCountryId() + " - " + country.getCountryName() + ""
//                                + " - " + country.getRegionId().getRegionId() + " - " + country.getRegionId().getRegionName());
//                        break;    
//                }
//                break;
//            default: break;
//            
//        }
//        System.out.print("Kembali ke main menu(y/t): ");
//        mn = in.next();  
//        }while(mn.equalsIgnoreCase("y"));
    }
}
