/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.VendaProdutoVc;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author vivic
 */
public class VendaProdutoVc_DAO  extends DAOAbstract{

   @Override
    public void insert(Object object) {
       session.beginTransaction();
      session.save(object);
      session.beginTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
      session.flush();
      session.clear();
      session.update(object);
      session.beginTransaction().commit();
    }

    @Override
    public void delete(Object object) {
         session.beginTransaction();
          session.flush();
      session.clear();
      session.delete(object);
      session.beginTransaction().commit();
    }
    

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VendaProdutoVc.class);
        criteria.add(Restrictions.eq("vendaProdutoVcVC", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
       session.beginTransaction();
        Criteria criteria = session.createCriteria(VendaProdutoVc.class);
         List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
}
}

