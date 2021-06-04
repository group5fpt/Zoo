/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui;

import com.dao.ChiTieuDAO;
import com.mode.ChiTieu;
import static com.ui.DongVatJDialog.read;
import static com.ui.DongVatJDialog.resize;
import com.utils.Auth;
import com.utils.MsgBox;
import com.utils.XDate;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class ChiTieuJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ChiTieuJFrame
     */
    public ChiTieuJFrame() {
        initComponents();
        this.init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        lblChiTieu = new javax.swing.JLabel();
        lblLoaiChiTieu = new javax.swing.JLabel();
        txtLoaiCT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();
        txtNgayNHD = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSoTien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        lblAnh = new javax.swing.JLabel();
        btnThemAnh = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblChiTieu = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnMoi = new javax.swing.JButton();
        btnthem = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnlChucNangDieuHuong = new javax.swing.JPanel();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblMaCT = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btnTrangChu = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        btnThoat1 = new javax.swing.JButton();
        lblBLLoaiCT = new javax.swing.JLabel();
        lblBlMaHD = new javax.swing.JLabel();
        lblBlNgay = new javax.swing.JLabel();
        lblBlTen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chi tiêu");

        lblChiTieu.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblChiTieu.setForeground(new java.awt.Color(255, 0, 0));
        lblChiTieu.setText("Chi Tiêu");

        lblLoaiChiTieu.setText("Loại Chi Tiêu:");

        jLabel1.setText("Mã Hóa Đơn:");

        jLabel2.setText("Số Tiền: ");

        jLabel3.setText("Ghi Chú:");

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(5);
        jScrollPane1.setViewportView(txtGhiChu);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblAnh, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 263, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblAnh, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
        );

        btnThemAnh.setText("Thêm Ảnh Hóa Đơn");
        btnThemAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemAnhActionPerformed(evt);
            }
        });

        tblChiTieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Chi Tiêu", "Loại Chi Tiêu", "Nhân Viên Nhập HD", "Mã Hóa Đơn", "Ngày Xuất Hóa Đơn", "Ngày Nhập Hóa Đơn", "Số Tiền", "Ghi Chú", "Hình"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblChiTieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChiTieuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblChiTieu);

        btnMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sticker/Add.png"))); // NOI18N
        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });
        jPanel2.add(btnMoi);

        btnthem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sticker/Add to basket.png"))); // NOI18N
        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });
        jPanel2.add(btnthem);

        btnxoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sticker/Delete.png"))); // NOI18N
        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });
        jPanel2.add(btnxoa);

        btnsua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sticker/Edit.png"))); // NOI18N
        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });
        jPanel2.add(btnsua);

        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sticker/No.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        jPanel2.add(btnThoat);

        jLabel4.setText("Tìm Kiếm:");

        jLabel5.setText("Danh sách chi tiêu");

        jLabel6.setText("Ngày Xuất Trên Hóa Đơn:");

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

        jLabel7.setText("Mã Chi Tiêu:");

        lblMaCT.setForeground(new java.awt.Color(255, 0, 0));

        jToolBar1.setRollover(true);

        btnTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sticker/Brick house.png"))); // NOI18N
        btnTrangChu.setText("Trang Chủ");
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
        btnDangXuat.setText("Đăng Xuất");
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
        btnThoat1.setText("Thoát");
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

        lblBLLoaiCT.setForeground(new java.awt.Color(255, 0, 51));

        lblBlMaHD.setForeground(new java.awt.Color(255, 0, 51));

        lblBlNgay.setForeground(new java.awt.Color(255, 0, 51));

        lblBlTen.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(lblChiTieu)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMaCT, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(348, 348, 348))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(12, 12, 12)
                                .addComponent(txtNgayNHD, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLoaiChiTieu)
                                    .addComponent(jLabel1))
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBLLoaiCT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMaHD)
                                    .addComponent(txtLoaiCT)
                                    .addComponent(lblBlMaHD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtSoTien)
                                    .addComponent(lblBlNgay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblBlTen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnThemAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(pnlChucNangDieuHuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblChiTieu, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblLoaiChiTieu)
                                    .addComponent(txtLoaiCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addComponent(lblBLLoaiCT, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addComponent(lblBlMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(txtNgayNHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addGap(3, 3, 3)
                        .addComponent(lblBlNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSoTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(lblBlTen, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThemAnh)
                    .addComponent(lblMaCT, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlChucNangDieuHuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        this.clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        this.insert();
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        this.delete();
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        this.update();
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnThemAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemAnhActionPerformed
        this.themAnh();
    }//GEN-LAST:event_btnThemAnhActionPerformed

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

    private void tblChiTieuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChiTieuMouseClicked
        if(evt.getClickCount()==2){
            this.row = tblChiTieu.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblChiTieuMouseClicked

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
            java.util.logging.Logger.getLogger(ChiTieuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiTieuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiTieuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiTieuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChiTieuJFrame().setVisible(true);
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
    private javax.swing.JButton btnThemAnh;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnThoat1;
    private javax.swing.JButton btnTrangChu;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnxoa;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblAnh;
    private javax.swing.JLabel lblBLLoaiCT;
    private javax.swing.JLabel lblBlMaHD;
    private javax.swing.JLabel lblBlNgay;
    private javax.swing.JLabel lblBlTen;
    private javax.swing.JLabel lblChiTieu;
    private javax.swing.JLabel lblLoaiChiTieu;
    private javax.swing.JLabel lblMaCT;
    private javax.swing.JPanel pnlChucNangDieuHuong;
    private javax.swing.JTable tblChiTieu;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtLoaiCT;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtNgayNHD;
    private javax.swing.JTextField txtSoTien;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
    ChiTieuDAO dao = new ChiTieuDAO();
    void init(){
        this.setLocationRelativeTo(null);
        this.row =-1;
        this.fillTable();
    }
    int row=-1;
    void openTrangChu(){
        if(Auth.isLogin()){
            TrangchuJFrame tc = new TrangchuJFrame();
            tc.setVisible(true);
            this.dispose();
        }else{
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }
    private void dangXuat(){
        Auth.clear();
        this.dispose();
        new DangNhapJDialog(this, true).setVisible(true);
    }
    void ketThuc(){
        if(MsgBox.confirm(this, "Bạn muốn kết thúc làm việc?")){
            System.exit(0);
        }
    }
    void Batloi(){
        if(txtLoaiCT.getText().length()==0){
            lblBLLoaiCT.setText("* Nhập loại Chi tiêu");
        }else if(txtMaHD.getText().length()==0){
            lblBlMaHD.setText("*  Mã hóa đơn không được để trống");
        }else if(txtNgayNHD.getText().length()==0){
            lblBlNgay.setText("* Ngày không được để trống");
        }else if(txtSoTien.getText().length()==0){
            lblBlTen.setText("* Số tiền không được để trống");
        }
    }
    void insert() {
        try {
            Batloi();
            ChiTieu ct = getForm(); //lấy Bán vé từ Form
            dao.insert(ct);
            //sau khi insert thành công, cập nhật lại bảng
            this.fillTable();
            //xóa form
            this.clearForm();
            MsgBox.alert(this, "Thêm vé thành công");
        } catch (Exception e) {
            MsgBox.alert(this, "Thêm vé thất bại");
        }
    }
    void update(){
        //cap nhat
        //btn sửa
        
        try {
            Batloi();
            ChiTieu ct = getForm();
            dao.update(ct);
            this.fillTable();
            MsgBox.alert(this, "Cập nhật thành công!!!");
        } catch (Exception e) {
            MsgBox.alert(this, "Cập nhật thất bại!!!");
        }
    }
    void delete(){
        if(MsgBox.confirm(this, "Bạn thực sự muốn xóa Hóa Đơn này?")){
            String mact = lblMaCT.getText();
            try {
                Batloi();
                dao.delete(mact);
                this.fillTable();
                this.clearForm();
                MsgBox.alert(this, "Xóa thành công");
            } catch (Exception e) {
                MsgBox.alert(this, "Xóa thất bại");
            }
        }
    }
    void fillTable(){
        DefaultTableModel model = (DefaultTableModel)tblChiTieu.getModel();
        model.setRowCount(0);
        try {
            List<ChiTieu> list = dao.selectAll();
            for(ChiTieu ct : list){
                Object[] row = {
                    ct.getMaCT(),ct.getLoaiCT(),ct.getMaNV(),ct.getMaHD(),ct.getNgayXuatHD(),
                    ct.getNgayNhapHD(),ct.getSoTien(),ct.getGhiChu(),ct.getHinh()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }
    void setForm(ChiTieu ct){
        lblMaCT.setText(String.valueOf(ct.getMaCT()));
        txtLoaiCT.setText(ct.getLoaiCT());
        txtMaHD.setText(ct.getMaHD());
        txtNgayNHD.setText(XDate.toString(ct.getNgayXuatHD(),"dd/MM/yyyy"));
        txtSoTien.setText(String.valueOf(ct.getSoTien()));
        txtGhiChu.setText(ct.getGhiChu());
        if(ct.getHinh()!=null){
            lblAnh.setToolTipText(ct.getHinh());
            ImageIcon resizedImage = resize(read(ct.getHinh()),214,263);
            lblAnh.setIcon(resizedImage);
        }else{
            lblAnh.setIcon(null);
        }
    }
    ChiTieu getForm(){
        ChiTieu ct = new ChiTieu();
        ct.setMaNV(Auth.user.getManv());
        ct.setLoaiCT(txtLoaiCT.getText());
        ct.setMaHD(txtMaHD.getText());
        ct.setNgayXuatHD(XDate.toDate(txtNgayNHD.getText(),"dd/MM/yyyy"));
        ct.setNgayNhapHD(new Date());
        ct.setSoTien(Double.parseDouble(txtSoTien.getText()));
        ct.setGhiChu(txtGhiChu.getText());
        ct.setHinh(lblAnh.getToolTipText());
        return ct;
    }
    void edit(){
        int mact = (int) tblChiTieu.getValueAt(this.row, 0);
        ChiTieu ct = dao.selectByIdclick(mact);
        this.setForm(ct);
        this.updateStatus();
    }
    void clearForm(){
        this.setForm(new ChiTieu());
        this.row=-1;
        this.updateStatus();
    }
    void updateStatus(){
        //cập nhật trạng thái các nút
        boolean edit = (this.row>=0);
        boolean first = (this.row==0);
        boolean last = (this.row == tblChiTieu.getRowCount()-1);
        
        //trạng thái form
        btnthem.setEnabled(!edit);
        btnsua.setEnabled(edit);
        btnxoa.setEnabled(edit);
        
        //Trạng thái điều hướng
        btnFirst.setEnabled(edit && !first);
        btnPrev.setEnabled(edit && !first);
        btnNext.setEnabled(edit && !last);
        btnLast.setEnabled(edit && !last);
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
        if(this.row<tblChiTieu.getRowCount()-1){
            this.row++;
            this.edit();
        }
    }
    void last(){
        this.row=tblChiTieu.getRowCount()-1;
        this.edit();
    }
public static ImageIcon read(String fileName){
        File path = new File("hinhHD",fileName);
        return new ImageIcon(path.getAbsolutePath());
    }
    public void  UpHinh(File src){
        File dst = new File("hinhHD",src.getName());
        //Tạo thư muc logo nếu chưa tồn tại
        if(!dst.getParentFile().exists()){
            dst.getParentFile().mkdirs();
        }
        try{
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            //copy file vào thư mục logos
            Files.copy(from,to,StandardCopyOption.REPLACE_EXISTING); 
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    public static ImageIcon resize(ImageIcon img, int width, int height){
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
        Graphics2D g2d = (Graphics2D) bi.createGraphics();
        g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
        g2d.drawImage(img.getImage(), 0, 0, width, height, null);
        g2d.dispose();
        return new ImageIcon(bi);
    }
    void themAnh(){
        if(jFileChooser1.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
            File file = jFileChooser1.getSelectedFile();
            UpHinh(file);//lưu hình vào thư mục Logos
            ImageIcon resizedImage = resize(read(file.getName()),214,263);//đọc hình tư logos và định dạng kích thước
            lblAnh.setIcon(resizedImage);//hiểm thị ảnh lên form
            lblAnh.setToolTipText(file.getName());// giữ ghi nhớ tên hình trong tooltip
        }
    }
}