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
import java.math.BigDecimal;
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


    public List<Object> getAll() {
        return idao.getAll();
    }


    public List<Object> search(String category, Object key) {
        System.out.println(category+"-"+key);  
        if(category.equals("regionId")){
            return idao.search(category, (Region) rc.getById((String) (key)));
        }
        else return idao.search(category, key);   
    }


    public Object getById(String countryId) {
        return idao.getById(countryId);
    }
    
    
    
    



}

