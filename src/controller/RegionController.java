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
 * Deklarasi kelas RegionController
 * @author 680183
 */
public class RegionController {
     private InterfaceDAO iDAO;
    /**
     * Method konstruktor dari kelas RegionController
     * @param sessionFactory dengan mengimport SessionFactory
     */
    public RegionController(SessionFactory sessionFactory) {
        iDAO = new GeneralDAO(sessionFactory, Region.class);
    }
    /**
     * Method untuk melakukan penyimpanan data baru atau update data
     * @param regionId dengan tipe data String
     * @param regionName dengan tipe data String
     * @return iDAO
     */
    public boolean saveOrUpdate(String regionId, String regionName){
        Region region = new Region(new BigDecimal(regionId), regionName);
        return iDAO.saveOrUpdate(region);
    }
    /**
     * Method untuk melakukan penghapusan data Region
     * @param regionId dengan tipe data String
     * @return iDAO
     */
    public boolean delete(String regionId){
        Region region = new Region(new BigDecimal (regionId));
        return iDAO.delete(region);
    }
    /**
     * Method untuk menampilkan data Region berdasarkan IDnya
     * @param regionId dengan tipe data String
     * @return iDAO
     */
    public Region getById (String regionId){
        return (Region) iDAO.getById(regionId);
    }
    /**
     * Method untuk mengambil semua data yang ada pada tabel Region
     * @return iDAO
     */
    public List<Object> getAll(){
        return iDAO.getAll();
    }
    /**
     * Method untuk melakukan pencarian data Region berdasarkan kategori dan kata kunci
     * @param category dengan tipe data String, terdapat 2 kategori yaitu regionId dan regionName
     * @param key dengan tipe data key
     * @return iDAO
     */
    public Object search(String category, String key){
        return iDAO.search(category, key);
    }
    /**
     * Method untuk membuat id baru secara increment
     * @return iDAO
     */
    public Object getAutoId(){
        Region region =  (Region) iDAO.getLastId();
        return region.getRegionId();
    }
}