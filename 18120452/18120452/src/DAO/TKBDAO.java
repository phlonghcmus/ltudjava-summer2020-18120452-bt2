/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import entities.Tkb;
import entities.TkbId;
import java.io.Serializable;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Long
 */
public class TKBDAO {
     public static Tkb find(TkbId ID)
    {
        Tkb tkb=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try{
            tkb=(Tkb) session.get(Tkb.class, (Serializable) ID);
        } catch (HibernateException ex)
        {
            System.err.println(ex);
        } finally{
            session.close();
        }
        return tkb;
    }
    public boolean themTKB(Tkb tkb){
        Session session=HibernateUtil.getSessionFactory().openSession();
        if (TKBDAO.find(tkb.getId()) != null){
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(tkb);
            transaction.commit();
        } catch (HibernateException ex){
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
}
