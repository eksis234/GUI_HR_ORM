/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import daos.GeneralDAO;
import daos.InterfaceDAO;
import entities.Country;
import entities.Region;
import java.util.List;
import javax.swing.JComboBox;
import org.hibernate.SessionFactory;

/**
 *
 * @author Lenovo no
 */
public class CountryController {
private final InterfaceDAO idao;
    private RegionController rc;
    public CountryController(SessionFactory sessionFactory) {
//        this.type = type;
        idao = new GeneralDAO(sessionFactory, Country.class);
        rc = new RegionController(sessionFactory);
    }

  
    public boolean saveOrUpdate(Object object) {
        return idao.saveOrUpdate(object);
    }


    public boolean delete(Object object) {
        return idao.delete(object);
    }
    
    public void loadCmbCountry(JComboBox cmb){
        List<Object> objects = (List<Object>) rc.getAll();
        for (Object object : objects) {
            Region region  = (Region) object;
            cmb.addItem(region.getRegionId()+" - "+region.getRegionName());
        }
    }


    public Object getAll() {
        return idao.getAll();
    }


    public Object search(String category, Object key) {
        if(category.equals("countryId")){
            return idao.search(category, key);
        }
        else if (category.equals("countryName")){
            return idao.search("countryName", key);
        }
        else if(category.equals("regionId")){
            return idao.search(category, (Region) rc.getById((key+"")));
        }
        //if(category.equals("RegionName"))
        else if(category.equals("regionName")){
            return idao.search("regionName", key);
        }
        else{
            return idao.search(category, new Short(key+""));
        }
    }


    public Object getById(String countryId) {
        return idao.getById(countryId);
    }
    
    
    
    



}

