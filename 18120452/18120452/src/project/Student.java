/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

import DAO.LOPDSSVDAO;
import entities.LopDssv;
import entities.LopDssvId;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Long
 */
public class Student extends javax.swing.JFrame {
    private String mssv;

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }
    
    /**
     * Creates new form Student
     */
    public Student(String MSSV) {
        initComponents();
        hello.setText("Xin Chào "+MSSV);
        this.setMssv(MSSV);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        XemDiem_Button = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        hello = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SINH VIÊN");

        XemDiem_Button.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        XemDiem_Button.setText("Xem Điểm");
        XemDiem_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XemDiem_ButtonMouseClicked(evt);
            }
        });

        Logout.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Logout.setText("Đăng Xuất");
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });

        hello.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hello.setText("Xin Chào");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(XemDiem_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addComponent(hello, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(hello)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(XemDiem_Button)
                    .addComponent(Logout))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        DangNhap login=new DangNhap();
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_LogoutMouseClicked

    private void XemDiem_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XemDiem_ButtonMouseClicked
        LopDssvId Id=new LopDssvId("","",this.getMssv());
        List<LopDssv> lopdssv=LOPDSSVDAO.layDSSV_MSSV(Id);
        ArrayList<String> dslop=new ArrayList<String>();
        Vector<String> dsmon=new Vector<String>();
        Vector<String> dsselection=new Vector<String>();
        for(LopDssv ds:lopdssv)
        {
            dslop.add(ds.getId().getMalop());
            dsmon.add(ds.getId().getMamon());
            dsselection.add(ds.getId().getMalop().trim()+"-"+ds.getId().getMamon().trim());
        }
        Object[] selections=dsselection.toArray();
        String choose= (String) JOptionPane.showInputDialog(this,"GIỚI TÍNH:","NHẬP SINH VIÊN",1,null,selections,selections[0]);
        String[] word=choose.split("-");
        for(LopDssv ds:lopdssv)
        {
            if (ds.getId().getMalop().contains(word[0])==true && ds.getId().getMamon().contains(word[1])==true)
            {
                JOptionPane.showMessageDialog(this,"Điểm GK: "+ds.getDgk()+". Điểm CK: "+ds.getDck()+". Điểm khác: "+ds.getDkhac()+". Điểm tổng: "+ds.getDtong()+".", "Điểm "+choose, 1);
            }
        }
    }//GEN-LAST:event_XemDiem_ButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Logout;
    private javax.swing.JButton XemDiem_Button;
    private javax.swing.JLabel hello;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
