/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

import DAO.LOPDSSVDAO;
import DAO.SVDAO;
import DAO.TKBDAO;
import entities.CSV;
import entities.LopDssv;
import entities.LopDssvId;
import entities.SinhVien;
import entities.Tkb;
import entities.TkbId;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Long
 */
public class giaovu extends javax.swing.JFrame {

    /**
     * Creates new form giaovu
     */
    public giaovu() {
        initComponents();
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
        Import_DSSV = new javax.swing.JButton();
        addSV = new javax.swing.JButton();
        Import_TKB = new javax.swing.JButton();
        DK_Button = new javax.swing.JButton();
        Huy_Button = new javax.swing.JButton();
        DSLop_Button = new javax.swing.JButton();
        DS_LopMon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GIÁO VỤ");

        Import_DSSV.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Import_DSSV.setText("Import DSSV");
        Import_DSSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Import_DSSVMouseClicked(evt);
            }
        });

        addSV.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        addSV.setText("Thêm SV");
        addSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addSVMouseClicked(evt);
            }
        });

        Import_TKB.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Import_TKB.setText("Import TKB");
        Import_TKB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Import_TKBMouseClicked(evt);
            }
        });

        DK_Button.setText("Đăng Ký Môn");
        DK_Button.setToolTipText("");
        DK_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DK_ButtonMouseClicked(evt);
            }
        });

        Huy_Button.setText("Hủy Môn");
        Huy_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Huy_ButtonMouseClicked(evt);
            }
        });

        DSLop_Button.setText("Xem DS Lớp");
        DSLop_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DSLop_ButtonMouseClicked(evt);
            }
        });

        DS_LopMon.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        DS_LopMon.setText("DS Lớp-Môn");
        DS_LopMon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DS_LopMonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Import_DSSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Import_TKB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DK_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Huy_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DSLop_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DS_LopMon, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Import_DSSV)
                    .addComponent(DS_LopMon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addSV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Import_TKB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DK_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Huy_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DSLop_Button)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Import_DSSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Import_DSSVMouseClicked
       String Malop=JOptionPane.showInputDialog(this,"LỚP: ","NHẬP MÃ LỚP",1);
       String diachi=JOptionPane.showInputDialog(this,"File csv: ","NHẬP ĐỊA CHỈ FILE DSSV",1);
       
       Vector<SinhVien>  a=new Vector<SinhVien>();
       CSV csv =new CSV();
       if (Malop !=null && diachi !=null)
       {
            a=csv.readCsvFileDSSV(diachi);
            for (int i=0;i<a.size();i++)
            {
                a.get(i).setMalop(Malop);
                SVDAO svdao=new SVDAO();
                boolean kq = svdao.themSV(a.get(i));
            }
       }
    }//GEN-LAST:event_Import_DSSVMouseClicked

    private void addSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addSVMouseClicked
        String Malop=JOptionPane.showInputDialog(this,"LỚP: ","NHẬP SINH VIÊN",1);
        String Mssv=JOptionPane.showInputDialog(this,"MSSV: ","NHẬP SINH VIÊN",1);
        String Name=JOptionPane.showInputDialog(this,"TÊN: ","NHẬP SINH VIÊN",1);
        String Cmnd=JOptionPane.showInputDialog(this,"CMND: ","NHẬP SINH VIÊN",1);
        Object[] selections={"Nam","Nữ"};
        Object Sx=JOptionPane.showInputDialog(this,"GIỚI TÍNH:","NHẬP SINH VIÊN",1,null,selections,selections[0]);
        String Sex = null;
        if (Sx != null)
            Sex=Sx.toString();
        SinhVien st=new SinhVien();
        if (Malop !=null && Mssv !=null && Name !=null && Cmnd !=null && Sex!=null)
        {
            st.setMalop(Malop);
            st.setMssv(Mssv);
            st.setName(Name);
            st.setCmnd(Cmnd);
            st.setSex(Sex);
            SVDAO svdao=new SVDAO();
           boolean kq = svdao.themSV(st);
           JOptionPane.showMessageDialog(this, "THÊM SV THÀNH CÔNG");
        }
        else JOptionPane.showMessageDialog(this, "THÊM SV THẤT BẠI");
 
    }//GEN-LAST:event_addSVMouseClicked

    private void Import_TKBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Import_TKBMouseClicked
       String Malop=JOptionPane.showInputDialog(this,"LỚP: ","NHẬP MÃ LỚP TKB",1);
       String diachi=JOptionPane.showInputDialog(this,"File csv: ","NHẬP ĐỊA CHỈ FILE TKB",1);
       Vector<Tkb>  a=new Vector<Tkb>();
       CSV csv =new CSV();
       if (Malop !=null && diachi !=null)
       {
            a=csv.readCsvFileTKB(diachi);
            for (int i=0;i<a.size();i++)
            {
                a.get(i).getId().setMalop(Malop);
                TKBDAO tkbdao=new TKBDAO();
                boolean kq = tkbdao.themTKB(a.get(i));
            }
            SVDAO svdao=new SVDAO();
            List<SinhVien> dssv= svdao.layDSSV_MaLop(Malop);
            for (int i=0;i<a.size();i++)
            {
                for(int j=0;j<dssv.size();j++)
                {
                    LopDssvId id=new LopDssvId(Malop,a.get(i).getId().getMamon(),dssv.get(j).getMssv());
                    LopDssv lopdssv=new LopDssv(id);
                    LOPDSSVDAO lopdssvdao=new LOPDSSVDAO();
                    boolean kq= lopdssvdao.themLOPDSSV(lopdssv);
                }
            }
       }
    }//GEN-LAST:event_Import_TKBMouseClicked

    private void DK_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DK_ButtonMouseClicked
        String MSSV=JOptionPane.showInputDialog(this,"MSSV: ","NHẬP MSSV",1);
        if (SVDAO.find(MSSV)!=null)
        {
            String MaLop=JOptionPane.showInputDialog(this,"LỚP: ","NHẬP MÃ LỚP:",1);
            String MaMon=JOptionPane.showInputDialog(this,"MÔN: ","NHẬP MÃ MÔN:",1);
            TkbId id=new TkbId(MaLop,MaMon);
            if (TKBDAO.find(id)!=null)
            {
                LopDssvId lopdssvid=new LopDssvId(MaLop,MaMon,MSSV);
                LopDssv lopdssv=new LopDssv(lopdssvid);
                LOPDSSVDAO lopdssvdao=new LOPDSSVDAO();
                boolean kq= lopdssvdao.themLOPDSSV(lopdssv);
                JOptionPane.showMessageDialog(this, "Đăng ký thành công","THÔNG BÁO",1);
            }
            else
                JOptionPane.showMessageDialog(this, "Lớp không tồn tại","LỖI",2);
        }
        else
            JOptionPane.showMessageDialog(this, "MSSV không tồn tại","LỖI",2);

    }//GEN-LAST:event_DK_ButtonMouseClicked

    private void Huy_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Huy_ButtonMouseClicked
        String MSSV=JOptionPane.showInputDialog(this,"MSSV: ","NHẬP MSSV",1);
        if (SVDAO.find(MSSV)!=null)
        {
            String MaLop=JOptionPane.showInputDialog(this,"LỚP: ","NHẬP MÃ LỚP:",1);
            String MaMon=JOptionPane.showInputDialog(this,"MÔN: ","NHẬP MÃ MÔN:",1);
            LopDssvId lopdssvid=new LopDssvId(MaLop,MaMon,MSSV);
            if (LOPDSSVDAO.find(lopdssvid)!=null)
            {
                LOPDSSVDAO lopdssvdao=new LOPDSSVDAO();
                boolean kq= lopdssvdao.xoaLOPDSSV(lopdssvid);
                JOptionPane.showMessageDialog(this, "Hủy thành công","THÔNG BÁO",1);
            }
            else
                JOptionPane.showMessageDialog(this, "Sinh viên hiện không đăng ký lớp này","LỖI",2);
        }
        else
            JOptionPane.showMessageDialog(this, "MSSV không tồn tại","LỖI",2);
    }//GEN-LAST:event_Huy_ButtonMouseClicked

    private void DSLop_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DSLop_ButtonMouseClicked
        String MaLop=JOptionPane.showInputDialog(this,"LỚP: ","NHẬP MÃ LỚP:",1);
        DSLOP dslop=new DSLOP(MaLop);
        dslop.setVisible(true);
    }//GEN-LAST:event_DSLop_ButtonMouseClicked

    private void DS_LopMonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DS_LopMonMouseClicked
        String MaLop=JOptionPane.showInputDialog(this,"LỚP: ","NHẬP MÃ LỚP:",1);
        String MaMon=JOptionPane.showInputDialog(this,"MÃ MÔN: ","NHẬP MÃ MÔN:",1);
        TkbId id=new TkbId(MaLop,MaMon);
        if (TKBDAO.find(id)!=null)
        {
            DSLOP dslop=new DSLOP(MaLop,MaMon);
            dslop.setVisible(true);
        }
        else JOptionPane.showMessageDialog(this, "LỚP KHÔNG TỒN TẠI","LỖI",2);
         
    }//GEN-LAST:event_DS_LopMonMouseClicked

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
            java.util.logging.Logger.getLogger(giaovu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(giaovu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(giaovu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(giaovu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new giaovu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DK_Button;
    private javax.swing.JButton DSLop_Button;
    private javax.swing.JButton DS_LopMon;
    private javax.swing.JButton Huy_Button;
    private javax.swing.JButton Import_DSSV;
    private javax.swing.JButton Import_TKB;
    private javax.swing.JButton addSV;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
