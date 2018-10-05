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
    private final RegionController rc;
    public CountryController(SessionFactory sessionFactory) {
//        this.type = type;
        idao = new GeneralDAO(sessionFactory, Country.class);
        rc = new RegionController(sessionFactory);
    }

  /**
   * Dok Save or update
   * @param object get object country
   * @return get save or update
   */
    public boolean saveOrUpdate(Object object) {
        return idao.saveOrUpdate(object);
    }

    /**
     * dok delete
     * @param object get object country
     * @return get hasil delete
     */
    public boolean delete(Object object) {
        return idao.delete(object);
    }
    
    /**
     * dok selectitem
     * @param cmb get combobok
     */
    public void loadCmbCountry(JComboBox cmb){
        List<Object> objects = (List<Object>) rc.getAll();
        for (Object object : objects) {
            Region region  = (Region) object;
            cmb.addItem(region.getRegionId()+" - "+region.getRegionName());
        }
    }

    /**
     * dok getAll
     * @return get hasil GetAll country
     */
    public List<Object> getAll() {
        return idao.getAll();
    }

    /**
     * dok search country
     * @param category berupa string
     * @param key berupa object
     * @return get hasil search
     */
    public List<Object> search(String category, Object key) {
        System.out.println(category+"-"+key);  
        if(category.equals("regionName")){
            return idao.search("regionId", (Region) rc.getByName(key+""));
        }else if (category.equals("regionId")){
            return idao.search(category, (Region) rc.getById(key+""));
        }
        else return idao.search(category, key);   
    }

    /**
     * dok getById Country
     * @param countryId berupa string
     * @return get hasil getById
     */
    public Object getById(String countryId) {
        return idao.getById(countryId);
    }
    
    
    
    



}

