/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.InterfaceDAO;
import daos.RegionDAO;
import entities.Region;
import java.math.BigDecimal;
import org.hibernate.SessionFactory;

/**
 *
 * @author Ignatius
 */
public class RegionController {
    private final Class type;
    private InterfaceDAO iDAO;
    public RegionController(SessionFactory sessionFactory, Class type) {
        this.type = type;
        iDAO = new RegionDAO(sessionFactory, Region.class);
    }
    
    public boolean saveOrUpdate(String regionId, String regionName){
        Region region = new Region(new BigDecimal(regionId), regionName);
        return iDAO.saveOrUpdate(region);
    }
    
    public boolean delete(String regionId){
        Region region = new Region(new BigDecimal(regionId));
        return iDAO.delete(region);
    }
    
}
