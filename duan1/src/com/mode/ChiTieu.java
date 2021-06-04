/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mode;

import java.util.Date;

/**
 *
 * @author hp
 */
public class ChiTieu {
    Integer maCT;
    String maNV;
    String loaiCT;
    String maHD;
    Date ngayXuatHD = new Date();
    Date ngayNhapHD = new Date();
    double soTien;
    String ghiChu;
    String hinh;

    public Integer getMaCT() {
        return maCT;
    }

    public void setMaCT(Integer maCT) {
        this.maCT = maCT;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getLoaiCT() {
        return loaiCT;
    }

    public void setLoaiCT(String loaiCT) {
        this.loaiCT = loaiCT;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public Date getNgayXuatHD() {
        return ngayXuatHD;
    }

    public void setNgayXuatHD(Date ngayXuatHD) {
        this.ngayXuatHD = ngayXuatHD;
    }

    public Date getNgayNhapHD() {
        return ngayNhapHD;
    }

    public void setNgayNhapHD(Date ngayNhapHD) {
        this.ngayNhapHD = ngayNhapHD;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public ChiTieu() {
    }

    public ChiTieu(Integer maCT, String maNV, String loaiCT, String maHD, double soTien, String ghiChu, String hinh) {
        this.maCT = maCT;
        this.maNV = maNV;
        this.loaiCT = loaiCT;
        this.maHD = maHD;
        this.soTien = soTien;
        this.ghiChu = ghiChu;
        this.hinh = hinh;
    }

}
