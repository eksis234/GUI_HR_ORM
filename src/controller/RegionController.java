/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.GeneralDAO;
import daos.InterfaceDAO;
import entities.Region;
import java.math.BigDecimal;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author Ignatius
 */
public class RegionController{
//    private final Class type;
    private final InterfaceDAO iDAO;
    public RegionController(SessionFactory sessionFactory) {
//        this.type = type;
        iDAO = new GeneralDAO(sessionFactory, Region.class);
    }
    
    public boolean saveOrUpdate(Object object) {
        return iDAO.saveOrUpdate(object);
    }

    public boolean delete(Object object) {
        return iDAO.delete(object);
    }

    public List<Object> getAll() {
        return iDAO.getAll();
    }

    public List<Object> search(String category, Object key) {
        return iDAO.search(category, key);
    }

    public Object getById(String regionId) {
        return (Region) iDAO.getById(new BigDecimal(regionId));
    }
    
}
