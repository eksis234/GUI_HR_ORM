/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.List;

/**
 *
 * @author Ignatius
 */
public interface InterfaceDAO {
    public boolean saveOrUpdate(Object object);
    public boolean delete(String id);
    public List<Object> getAll();
    public List<Object> search(String category, String key);
    public Object getById(String id);
}
