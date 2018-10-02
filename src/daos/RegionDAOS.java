/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Region;
import java.math.BigDecimal;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author Ignatius
 */
public class RegionDAOS implements InterfaceDAO{
    
    private final GeneralDAO gdao;
    private final Class type;
    
    public RegionDAOS(SessionFactory sessionFactory, Class type) {
        this.gdao = new GeneralDAO(sessionFactory);
        this.type = type;
    }

    @Override
    public boolean saveOrUpdate(Object object) {
        return (boolean) gdao.execute(0, object, type, null, null);
    }

    @Override
    public boolean delete(String id) {
        return (boolean) gdao.execute(1, new Region(new BigDecimal(id)), 
                type, null, null);
    }

    @Override
    public List<Object> getAll() {
        return (List<Object>) gdao.execute(4, null, type, null, null);
    }

    @Override
    public List<Object> search(String category, String key) {
        return (List<Object>) gdao.execute(3, null, type, category, key);
    }

    @Override
    public Object getById(String id) {
        return gdao.execute(2, null, type, "regionId", new BigDecimal(id));
    }

}
