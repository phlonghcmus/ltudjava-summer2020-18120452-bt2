/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import entities.LopDssv;
import entities.LopDssvId;
import java.io.Serializable;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Long
 */
public class LOPDSSVDAO {
     public static LopDssv find(LopDssvId ID)
    {
        LopDssv lopdssv=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try{
            lopdssv=(LopDssv) session.get(LopDssv.class, (Serializable) ID);
        } catch (HibernateException ex)
        {
            System.err.println(ex);
        } finally{
            session.close();
        }
        return lopdssv;
    }
    public boolean themLOPDSSV(LopDssv lopdssv){
        Session session=HibernateUtil.getSessionFactory().openSession();
        if (LOPDSSVDAO.find(lopdssv.getId()) != null){
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(lopdssv);
            transaction.commit();
        } catch (HibernateException ex){
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
    public boolean xoaLOPDSSV(LopDssvId ID){
        Session session=HibernateUtil.getSessionFactory().openSession();
        LopDssv lopdssv=LOPDSSVDAO.find(ID);
        if (lopdssv == null){
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(lopdssv);
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