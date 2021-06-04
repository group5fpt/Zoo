/*\
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mode;

/**
 *
 * @author DELL
 */
public class dongvat {
    String MaDV;
    String MaNV;
    String tenDV;
    String XuatSu;
    boolean gioitinh;
    String datDiem;
    String sinhThai;
    String sinhSan;
    String tinhTrang;
    String hinh;

    public dongvat(String MaDV, String MaNV, String tenDV, String XuatSu, boolean gioitinh, String datDiem, String sinhThai, String sinhSan, String tinhTrang, String hinh) {
        this.MaDV = MaDV;
        this.MaNV = MaNV;
        this.tenDV = tenDV;
        this.XuatSu = XuatSu;
        this.gioitinh = gioitinh;
        this.datDiem = datDiem;
        this.sinhThai = sinhThai;
        this.sinhSan = sinhSan;
        this.tinhTrang = tinhTrang;
        this.hinh = hinh;
    }

    public dongvat() {
    }

    public String getMaDV() {
        return MaDV;
    }

    public void setMaDV(String MaDV) {
        this.MaDV = MaDV;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public String getXuatSu() {
        return XuatSu;
    }

    public void setXuatSu(String XuatSu) {
        this.XuatSu = XuatSu;
    }

    public boolean getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDatDiem() {
        return datDiem;
    }

    public void setDatDiem(String datDiem) {
        this.datDiem = datDiem;
    }

    public String getSinhThai() {
        return sinhThai;
    }

    public void setSinhThai(String sinhThai) {
        this.sinhThai = sinhThai;
    }

    public String getSinhSan() {
        return sinhSan;
    }

    public void setSinhSan(String sinhSan) {
        this.sinhSan = sinhSan;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    
}
