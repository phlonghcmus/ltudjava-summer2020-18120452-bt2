package entities;
// Generated Jun 19, 2020 9:15:53 PM by Hibernate Tools 3.6.0


import java.io.Serializable;

/**
 * Tkb generated by hbm2java
 */
public class Tkb implements java.io.Serializable{


     private TkbId id;
     private String tenmon;
     private String phonghoc;

    public Tkb() {
    }

	
    public Tkb(TkbId id) {
        this.id = id;
    }
    public Tkb(TkbId id, String tenmon, String phonghoc) {
       this.id = id;
       this.tenmon = tenmon;
       this.phonghoc = phonghoc;
    }
   
    public TkbId getId() {
        return this.id;
    }
    
    public void setId(TkbId id) {
        this.id = id;
    }
    public String getTenmon() {
        return this.tenmon;
    }
    
    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }
    public String getPhonghoc() {
        return this.phonghoc;
    }
    
    public void setPhonghoc(String phonghoc) {
        this.phonghoc = phonghoc;
    }




}


