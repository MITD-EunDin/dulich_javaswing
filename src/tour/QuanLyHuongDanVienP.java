/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package tour;

import Control.DAO_HuongDanVien;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Object.HuongDanVien;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import Controller.hdvlogic;

/**
 * /**
 *
 * @author MYLAP.VN
 */
public class QuanLyHuongDanVienP extends javax.swing.JInternalFrame {

    /**
     * Creates new form QuanLyHuongDanVienP
     */
    private DefaultTableModel model;
    private java.util.List<HuongDanVien> ListHdv;

    public QuanLyHuongDanVienP() {
        initComponents();
        ListHdv = new DAO_HuongDanVien().getAllHuongDanVien();
        model = (DefaultTableModel) TableHdv.getModel();
//        model.setColumnIdentifiers(new Object[]{"Mã hướng dẫn viên", "Tên hướng dẫn viên", "SĐT", "Địa chỉ"});
        loadData();

        TableHdv.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                tableHdvMouseClicked(evt);
            }
        });
    }

    private void loadData() {
        model.setRowCount(0);
        ListHdv= new DAO_HuongDanVien().getAllHuongDanVien();
        for (HuongDanVien hdv : ListHdv) {
            model.addRow(new Object[]{hdv.getMaHdv(), hdv.getFullname(), hdv.getCccd(), hdv.getSdt(), hdv.getDiachi()});
        }
    }

    private void tableHdvMouseClicked(MouseEvent evt) {
        int selectedRow = TableHdv.getSelectedRow();
        txtMaHdv.setText(model.getValueAt(selectedRow, 0).toString());
        txtTenHdv.setText(model.getValueAt(selectedRow, 1).toString());
        txtCccd.setText(model.getValueAt(selectedRow, 2).toString());
        txtSdt.setText(model.getValueAt(selectedRow, 3).toString());
        txtDiachi.setText(model.getValueAt(selectedRow, 4).toString());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frame_nav = new javax.swing.JPanel();
        EnterSearchHdv = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_searchHDV = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        frame_tbdata = new javax.swing.JScrollPane();
        TableHdv = new javax.swing.JTable();
        frame_input = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtMaHdv = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTenHdv = new javax.swing.JTextField();
        txtCccd = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtSdt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDiachi = new javax.swing.JTextField();
        frame_btnfunction = new javax.swing.JPanel();
        btnAddHdv = new javax.swing.JButton();
        btnUpdateHdv = new javax.swing.JButton();
        btnXoaHdv = new javax.swing.JButton();
        RefreshHdv = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(715, 542));

        frame_nav.setBackground(new java.awt.Color(76, 148, 189));
        frame_nav.setPreferredSize(new java.awt.Dimension(700, 60));

        EnterSearchHdv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EnterSearchHdv.setBorder(null);
        EnterSearchHdv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterSearchHdvActionPerformed(evt);
            }
        });

        btn_searchHDV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Search_btn.png"))); // NOI18N
        btn_searchHDV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_searchHDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_searchHDVMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Hướng Dẫn Viên");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout frame_navLayout = new javax.swing.GroupLayout(frame_nav);
        frame_nav.setLayout(frame_navLayout);
        frame_navLayout.setHorizontalGroup(
            frame_navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frame_navLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EnterSearchHdv, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(frame_navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frame_navLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel7))
                    .addGroup(frame_navLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_searchHDV)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(69, 69, 69))
        );
        frame_navLayout.setVerticalGroup(
            frame_navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frame_navLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(frame_navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addGroup(frame_navLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(frame_navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EnterSearchHdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_searchHDV))))
                .addGap(10, 10, 10))
        );

        frame_tbdata.setPreferredSize(new java.awt.Dimension(693, 281));

        TableHdv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã HDV", "Họ Và Tên", "Căn Cước Công Dân", "SĐT", "Địa Chỉ"
            }
        ));
        frame_tbdata.setViewportView(TableHdv);

        frame_input.setBackground(new java.awt.Color(204, 204, 204));
        frame_input.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        frame_input.setPreferredSize(new java.awt.Dimension(695, 90));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Mã HDV");

        txtMaHdv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Họ Và Tên");

        txtTenHdv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtCccd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Cccd");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("SĐT");

        txtSdt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Địa Chỉ");

        txtDiachi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout frame_inputLayout = new javax.swing.GroupLayout(frame_input);
        frame_input.setLayout(frame_inputLayout);
        frame_inputLayout.setHorizontalGroup(
            frame_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frame_inputLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(frame_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frame_inputLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenHdv, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frame_inputLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaHdv, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frame_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCccd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSdt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frame_inputLayout.setVerticalGroup(
            frame_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frame_inputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frame_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtMaHdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtCccd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(frame_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTenHdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        frame_btnfunction.setBackground(new java.awt.Color(204, 204, 204));
        frame_btnfunction.setPreferredSize(new java.awt.Dimension(695, 50));

        btnAddHdv.setBackground(new java.awt.Color(52, 103, 113));
        btnAddHdv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAddHdv.setForeground(new java.awt.Color(255, 255, 255));
        btnAddHdv.setText("Thêm");
        btnAddHdv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddHdv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddHdvActionPerformed(evt);
            }
        });

        btnUpdateHdv.setBackground(new java.awt.Color(52, 103, 113));
        btnUpdateHdv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdateHdv.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateHdv.setText("Câp nhật");
        btnUpdateHdv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateHdv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateHdvActionPerformed(evt);
            }
        });

        btnXoaHdv.setBackground(new java.awt.Color(52, 103, 113));
        btnXoaHdv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoaHdv.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaHdv.setText("Xóa");
        btnXoaHdv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaHdv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaHdvActionPerformed(evt);
            }
        });

        RefreshHdv.setBackground(new java.awt.Color(52, 103, 113));
        RefreshHdv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RefreshHdv.setForeground(new java.awt.Color(255, 255, 255));
        RefreshHdv.setText("làm mới");
        RefreshHdv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RefreshHdv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshHdvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frame_btnfunctionLayout = new javax.swing.GroupLayout(frame_btnfunction);
        frame_btnfunction.setLayout(frame_btnfunctionLayout);
        frame_btnfunctionLayout.setHorizontalGroup(
            frame_btnfunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frame_btnfunctionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddHdv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdateHdv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXoaHdv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RefreshHdv)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frame_btnfunctionLayout.setVerticalGroup(
            frame_btnfunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frame_btnfunctionLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(frame_btnfunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateHdv)
                    .addComponent(btnXoaHdv)
                    .addComponent(RefreshHdv)
                    .addComponent(btnAddHdv))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frame_nav, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
            .addComponent(frame_btnfunction, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
            .addComponent(frame_input, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
            .addComponent(frame_tbdata, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(frame_nav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frame_tbdata, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frame_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frame_btnfunction, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RefreshHdvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshHdvActionPerformed
        hdvlogic logic = new hdvlogic(EnterSearchHdv, txtCccd, txtMaHdv, txtSdt, txtDiachi, txtTenHdv, TableHdv, model);
        logic.refresh_hdv();
    }//GEN-LAST:event_RefreshHdvActionPerformed

    private void btnXoaHdvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaHdvActionPerformed
        hdvlogic logic  = new hdvlogic(EnterSearchHdv, txtCccd, txtMaHdv, txtSdt, txtDiachi, txtTenHdv, TableHdv, model);
        logic.delete_hdv_logic();
    }//GEN-LAST:event_btnXoaHdvActionPerformed

    private void btnUpdateHdvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateHdvActionPerformed
       hdvlogic logic  = new hdvlogic(EnterSearchHdv, txtCccd, txtMaHdv, txtSdt, txtDiachi, txtTenHdv, TableHdv, model);
       logic.update_hdv_logic();
    }//GEN-LAST:event_btnUpdateHdvActionPerformed

    private void btnAddHdvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddHdvActionPerformed
        hdvlogic logic  = new hdvlogic(EnterSearchHdv, txtCccd, txtMaHdv, txtSdt, txtDiachi, txtTenHdv, TableHdv, model);
        logic.add_hdv_logic();
    }//GEN-LAST:event_btnAddHdvActionPerformed

    private void EnterSearchHdvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterSearchHdvActionPerformed
        hdvlogic logic  = new hdvlogic(EnterSearchHdv, txtCccd, txtMaHdv, txtSdt, txtDiachi, txtTenHdv, TableHdv, model);
        logic.PerformSearchGuides();
    }//GEN-LAST:event_EnterSearchHdvActionPerformed

    private void btn_searchHDVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_searchHDVMouseClicked
        hdvlogic logic  = new hdvlogic(EnterSearchHdv, txtCccd, txtMaHdv, txtSdt, txtDiachi, txtTenHdv, TableHdv, model);
        logic.PerformSearchGuides();
    }//GEN-LAST:event_btn_searchHDVMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EnterSearchHdv;
    private javax.swing.JButton RefreshHdv;
    private javax.swing.JTable TableHdv;
    private javax.swing.JButton btnAddHdv;
    private javax.swing.JButton btnUpdateHdv;
    private javax.swing.JButton btnXoaHdv;
    private javax.swing.JLabel btn_searchHDV;
    private javax.swing.JPanel frame_btnfunction;
    private javax.swing.JPanel frame_input;
    private javax.swing.JPanel frame_nav;
    private javax.swing.JScrollPane frame_tbdata;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCccd;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtMaHdv;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtTenHdv;
    // End of variables declaration//GEN-END:variables
}
