/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Region;
import java.math.BigDecimal;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Ignatius
 */
public class RegionDAO implements InterfaceDAO {

    private final SessionFactory factory;
    private Session session;
    private Transaction transaction;

    public RegionDAO(SessionFactory sessionFactory) {
        this.factory = sessionFactory;
    }

    @Override
    public boolean saveOrUpdate(Object object) {
        boolean flag = false;
        try {
            this.session = factory.openSession();
            this.transaction = session.beginTransaction();
            this.session.saveOrUpdate(object);
            flag = true;
            this.transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
        return flag;
    }

    @Override
    public boolean delete(String id) {
        boolean flag = false;
        try {
            this.session = factory.openSession();
            this.transaction = session.beginTransaction();
            Region region = new Region(new BigDecimal(id));
            this.session.delete(region);
            flag = true;
            this.transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
        return flag;
    }

    @Override
    public List<Object> getAll() {
        List<Object> datas = null;
        try {
            this.session = factory.openSession();
            this.transaction = session.beginTransaction();
            datas = session.createQuery("FROM Region").list();
            this.transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
        return datas;
    }

    @Override
    public List<Object> search(String category, String key) {
        List<Object> datas = null;
        try {
            this.session = factory.openSession();
            this.transaction = session.beginTransaction();
            Criteria criteria = session.createCriteria(Region.class)
                    .add(Restrictions.eq(category, key));
            datas = criteria.list();
            this.transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
        return datas;
    }

    @Override
    public Object getById(String id) {
        Object data = null;
        try {
            this.session = factory.openSession();
            this.transaction = session.beginTransaction();
            Criteria criteria = session.createCriteria(Region.class)
                    .add(Restrictions.eq("regionId", new BigDecimal(id)));
            data = criteria.uniqueResult();
            this.transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
        return data;
    }

    /**
     *
     * @param CRUD - 0 for Save/Update, 1 for delete, 2 for getById, 3 for
     * search, selain 0-3 for getAll
     * @param type
     * @param category
     * @param key
     * @return
     */
    public Object execute(int CRUD, Object object, Class type, String category, Object key) {
        Object obj = null;
        try {
            this.session = factory.openSession();
            this.transaction = session.beginTransaction();
            obj = this.getAction(session, CRUD, object, type, category, key);
            this.transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
        return obj;
    }

    private Object getAction(Session session, int crud, 
            Object object, Class type, String category, Object key) {
        switch (crud) {
            case 0: boolean flag = false;
                session.saveOrUpdate(object);
                flag = true;
                return flag;
            case 1: flag = false;
                session.delete(object);
                flag = true;
                return true;
            case 2:
                return session.createCriteria(type)
                        .add(Restrictions.eq(category, key))
                        .uniqueResult();
            case 3:
                return session.createCriteria(type)
                        .add(Restrictions.eq(category, key))
                        .list();
            default:
                return session.createQuery("FROM " + type
                        .getSimpleName() + " ORDER BY 1").list();
        }
    }

}
