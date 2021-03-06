/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui;

import com.dao.NhanVienDAO;
import com.mode.nhanvien;
import com.utils.Auth;
import com.utils.MsgBox;
import com.utils.XDate;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class QLNhanVienJDialog extends javax.swing.JDialog {

    /**
     * Creates new form QLNhanVien
     */
    public QLNhanVienJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlChucNangChinhSua = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        lblLuong = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        txtHoTenNV = new javax.swing.JTextField();
        txtLuong = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        lblQuanLyNhanVien = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        lblMaNV = new javax.swing.JLabel();
        rdoNu = new javax.swing.JRadioButton();
        pnlChucNangDieuHuong = new javax.swing.JPanel();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        lblHoTen = new javax.swing.JLabel();
        cboVaiTro = new javax.swing.JComboBox<>();
        lblNgaySinh = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQlNV = new javax.swing.JTable();
        lblGioiTinh = new javax.swing.JLabel();
        lblVaiTro = new javax.swing.JLabel();
        lblSoDT = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtSoDT = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        btnTrangChu = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        btnThoat1 = new javax.swing.JButton();
        lblBLMaNv = new javax.swing.JLabel();
        lblBLHoTen = new javax.swing.JLabel();
        lblBLNgaySinh = new javax.swing.JLabel();
        lblBLsdt = new javax.swing.JLabel();
        lblBLEmal = new javax.swing.JLabel();
        lblBLLuong = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Qu???n L?? Nh??n Vi??n");

        btnThem.setText("Th??m");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        pnlChucNangChinhSua.add(btnThem);

        btnSua.setText("S???a");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        pnlChucNangChinhSua.add(btnSua);

        btnXoa.setText("X??a");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        pnlChucNangChinhSua.add(btnXoa);

        btnMoi.setText("M???i");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });
        pnlChucNangChinhSua.add(btnMoi);

        lblLuong.setText("L????ng:");

        lblQuanLyNhanVien.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblQuanLyNhanVien.setForeground(new java.awt.Color(255, 0, 0));
        lblQuanLyNhanVien.setText("QU???N L?? NH??N VI??N");

        buttonGroup1.add(rdoNam);
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");

        lblMaNV.setText("M?? nh??n vi??n:");

        buttonGroup1.add(rdoNu);
        rdoNu.setText("N???");

        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        pnlChucNangDieuHuong.add(btnFirst);

        btnPrev.setText("<<");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        pnlChucNangDieuHuong.add(btnPrev);

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        pnlChucNangDieuHuong.add(btnNext);

        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        pnlChucNangDieuHuong.add(btnLast);

        lblHoTen.setText("H??? t??n Nh??n vi??n:");

        cboVaiTro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NV b??n v??", "NV Ch??m s??c", "Qu???n l??" }));

        lblNgaySinh.setText("Ng??y Sinh:");

        tblQlNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "M?? nh??n vi??n", "H??? v?? t??n", "Ng??y sinh", "Gi???i t??nh", "S??? ??T", "Email", "Vai tr??", "L????ng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblQlNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQlNVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblQlNV);

        lblGioiTinh.setText("Gi???i t??nh:");

        lblVaiTro.setText("Vai tr??:");

        lblSoDT.setText("S??? ??T:");

        lblEmail.setText("Email:");

        jToolBar1.setRollover(true);

        btnTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sticker/Brick house.png"))); // NOI18N
        btnTrangChu.setText("Trang Ch???");
        btnTrangChu.setFocusable(false);
        btnTrangChu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTrangChu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangChuActionPerformed(evt);
            }
        });
        jToolBar1.add(btnTrangChu);

        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sticker/Exit.png"))); // NOI18N
        btnDangXuat.setText("????ng Xu???t");
        btnDangXuat.setFocusable(false);
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setMargin(new java.awt.Insets(2, 16, 2, 16));
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDangXuat);

        btnThoat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sticker/Stop.png"))); // NOI18N
        btnThoat1.setText("Tho??t");
        btnThoat1.setFocusable(false);
        btnThoat1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThoat1.setMargin(new java.awt.Insets(2, 16, 2, 16));
        btnThoat1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThoat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoat1ActionPerformed(evt);
            }
        });
        jToolBar1.add(btnThoat1);

        lblBLMaNv.setForeground(new java.awt.Color(255, 0, 0));

        lblBLHoTen.setForeground(new java.awt.Color(255, 0, 0));

        lblBLNgaySinh.setForeground(new java.awt.Color(255, 0, 0));

        lblBLsdt.setForeground(new java.awt.Color(255, 0, 0));

        lblBLEmal.setForeground(new java.awt.Color(255, 0, 0));

        lblBLLuong.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pnlChucNangChinhSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlChucNangDieuHuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblGioiTinh)
                        .addGap(18, 18, 18)
                        .addComponent(rdoNam, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoNu, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 117, Short.MAX_VALUE)
                                .addComponent(lblQuanLyNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblHoTen)
                                            .addComponent(lblMaNV)
                                            .addComponent(lblNgaySinh))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                                            .addComponent(txtMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                                            .addComponent(txtHoTenNV, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                                            .addComponent(lblBLMaNv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblBLHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblBLNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblEmail)
                                            .addComponent(lblSoDT))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtSoDT, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                                            .addComponent(txtEmail)
                                            .addComponent(lblBLsdt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblVaiTro)
                                            .addComponent(lblLuong))
                                        .addGap(71, 71, 71)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cboVaiTro, 0, 272, Short.MAX_VALUE)
                                            .addComponent(txtLuong)
                                            .addComponent(lblBLEmal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblBLLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblQuanLyNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaNV)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBLMaNv, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoTen)
                    .addComponent(txtHoTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(lblBLHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgaySinh)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(lblBLNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu)
                    .addComponent(lblGioiTinh))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoDT)
                    .addComponent(txtSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(lblBLsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(lblBLEmal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVaiTro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLuong)
                    .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBLLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlChucNangChinhSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlChucNangDieuHuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        this.insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        this.update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        this.delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        this.clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        this.first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        this.prev();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        this.next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        this.last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void tblQlNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQlNVMouseClicked
        //n???u ng?????i d??ng nh???n ??up m???i xu???t hi???n l??n form
        if(evt.getClickCount()==2){
            this.row = tblQlNV.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblQlNVMouseClicked

    private void btnTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangChuActionPerformed
        this.openTrangChu();
    }//GEN-LAST:event_btnTrangChuActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        this.dangXuat();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnThoat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoat1ActionPerformed
        this.ketThuc();
    }//GEN-LAST:event_btnThoat1ActionPerformed

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
            java.util.logging.Logger.getLogger(QLNhanVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLNhanVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLNhanVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLNhanVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QLNhanVienJDialog dialog = new QLNhanVienJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat1;
    private javax.swing.JButton btnTrangChu;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboVaiTro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblBLEmal;
    private javax.swing.JLabel lblBLHoTen;
    private javax.swing.JLabel lblBLLuong;
    private javax.swing.JLabel lblBLMaNv;
    private javax.swing.JLabel lblBLNgaySinh;
    private javax.swing.JLabel lblBLsdt;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblLuong;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblQuanLyNhanVien;
    private javax.swing.JLabel lblSoDT;
    private javax.swing.JLabel lblVaiTro;
    private javax.swing.JPanel pnlChucNangChinhSua;
    private javax.swing.JPanel pnlChucNangDieuHuong;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblQlNV;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTenNV;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSoDT;
    // End of variables declaration//GEN-END:variables
NhanVienDAO dao = new NhanVienDAO();
    private void init(){
        this.setLocationRelativeTo(null);
        this.row=-1;
        this.updateStatus();
        this.fillTable();
    }
    int row=-1; //hang duoc chon tren bang
    void openTrangChu(){
        if(Auth.isLogin()){
            TrangchuJFrame tc = new TrangchuJFrame();
            tc.setVisible(true);
            this.dispose();
        }else{
            MsgBox.alert(this, "Vui l??ng ????ng nh???p!");
        }
    }
    private void dangXuat(){
        Auth.clear();
        this.dispose();
        new DangNhapJDialog(null, true).setVisible(true);
    }
    void batloi(){
        if(txtMaNV.getText().length()==0){
            lblBLMaNv.setText("* Vui l??ng nh???p M?? NV");
        }else if(txtHoTenNV.getText().length()==0){
            lblBLHoTen.setText("* Vui l??ng nh???p H??? t??n");
        }else if(txtNgaySinh.getText().length()==0){
            lblBLNgaySinh.setText("* Vui l??ng nh???p ng??y sinh");
        }else if(txtSoDT.getText().length()==0){
            lblBLNgaySinh.setText("* Vui l??ng nh???p S??T");
        }else if(txtEmail.getText().length()==0){
            lblBLEmal.setText("* Vui l??ng nh???p Email");
        }else if(txtLuong.getText().length()==0){
            lblBLLuong.setText("* Vui l??ng nh???p L????ng");
        }
    }
    void ketThuc(){
        if(MsgBox.confirm(this, "B???n mu???n k???t th??c l??m vi???c?")){
            System.exit(0);
        }
    }
    void insert(){
        //g???i n??t btnThem
        try {
            batloi();
            nhanvien nv = getForm();//l???y nh??n vi??n t??? form
            try {
                dao.insert(nv);
                //sau khi insert th??nh c??ng, c???p nh???t l???i b???ng
                this.fillTable();
                //x??a form
                this.clearForm();
                MsgBox.alert(this, "Th??m m???i th??nh c??ng!");
            } catch (Exception e) {
                MsgBox.alert(this, "Th??m m???i th???t b???i");
            }
        } catch (Exception e) {
        }

    }
    void update(){
        //cap nhat
        //btn s???a
        try {
            batloi();
            nhanvien nv = getForm();
            try {
                dao.update(nv);
                this.fillTable();
                MsgBox.alert(this, "C???p nh???t th??nh c??ng!!!");
            } catch (Exception e) {
                MsgBox.alert(this, "C???p nh???t th???t b???i!!!");
            }
        } catch (Exception e) {
        }

    }
    void delete() {
        // btn xoa
        try {
            batloi();
            if (MsgBox.confirm(this, "B???n th???c s??? mu???n x??a nh??n vi??n n??y?")) {
                String manv = txtMaNV.getText();
                try {
                    dao.delete(manv);
                    this.fillTable();
                    this.clearForm();
                    MsgBox.alert(this, "X??a th??nh c??ng");
                } catch (Exception e) {
                    MsgBox.alert(this, "X??a th???t b???i");
                }
            }
        } catch (Exception e) {
        }

    }
    void clearForm(){
        //l??m tr???ng form
        this.setForm(new nhanvien());
        this.row = -1;
        this.updateStatus();   
    }
    void edit(){
        String manv = (String) tblQlNV.getValueAt(this.row, 0);
        nhanvien nv = dao.selectById(manv);
        this.setForm(nv);
        this.updateStatus();
    }
    void first(){
        this.row=0;
        this.edit();
    }
    void prev(){
        if(this.row>0){
            this.row--;
            this.edit();
        }
    }
    void next(){
        if(this.row<tblQlNV.getRowCount()-1){
            this.row++;
            this.edit();
        }
    }
    void last(){
        this.row=tblQlNV.getRowCount()-1;
        this.edit();
    }
    void fillTable(){
        //????? d??? li???u l??n table
        DefaultTableModel model = (DefaultTableModel)tblQlNV.getModel();
        model.setRowCount(0);//x??a t???t c??? c??c h??ng tr??n JTable;
        try {
            List<nhanvien> list = dao.selectAll(); //?????c d??? li???u tr??n CSDL 
            for(nhanvien nv : list){
                Object[] row = {nv.getManv(),nv.getTennv(),nv.getNgaysinh(),nv.getGioitinh()?"Nam":"N???",nv.getSdt(),nv.getEmail(),nv.getVaitro(),nv.getLuong()};
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "L???i truy v???n d??? li???u");
        }
    }
    void setForm(nhanvien nv){
        //hi???m th??? nh??n vi??n l??n form
        txtMaNV.setText(nv.getManv());
        txtHoTenNV.setText(nv.getTennv());
        txtNgaySinh.setText(XDate.toString(nv.getNgaysinh(), "dd/MM/yyyy"));
        rdoNam.setSelected(nv.getGioitinh());
        rdoNu.setSelected(!nv.getGioitinh());
        txtSoDT.setText(nv.getSdt());
        txtEmail.setText(nv.getEmail());
        cboVaiTro.setSelectedItem(nv.getVaitro());
        txtLuong.setText(String.valueOf(nv.getLuong()));
        
    }
    nhanvien getForm(){
        //th??m nh??n vi??n t??? form
        nhanvien nv = new nhanvien();
        nv.setManv(txtMaNV.getText());
        nv.setTennv(txtHoTenNV.getText());
        nv.setNgaysinh(XDate.toDate(txtNgaySinh.getText(),"dd/mm/yyyy"));
        nv.setGioitinh(rdoNam.isSelected());
        nv.setSdt(txtSoDT.getText());
        nv.setEmail(txtEmail.getText());
        nv.setVaitro(String.valueOf(cboVaiTro.getSelectedItem()));
        nv.setLuong(Float.parseFloat(txtLuong.getText()));
        return nv;
    }
    
    void updateStatus(){
        //c???p nh???t tr???ng th??i c??c n??t
        boolean edit = (this.row>=0);
        boolean first = (this.row==0);
        boolean last = (this.row == tblQlNV.getRowCount()-1);
        
        //tr???ng th??i form
        txtMaNV.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);
        
        //Tr???ng th??i ??i???u h?????ng
        btnFirst.setEnabled(edit && !first);
        btnPrev.setEnabled(edit && !first);
        btnNext.setEnabled(edit && !last);
        btnLast.setEnabled(edit && !last);
    }


}
