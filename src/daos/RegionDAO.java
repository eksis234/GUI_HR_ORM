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

}
