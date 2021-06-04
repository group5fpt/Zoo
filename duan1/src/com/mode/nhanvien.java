/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mode;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class nhanvien {
    String manv;
    String tennv;
    Date ngaysinh=new Date();
    boolean gioitinh;
    String sdt;
    String Email;
    String vaitro;
    float luong;

    public nhanvien(String manv, String tennv, boolean gioitinh, String sdt, String Email, String vaitro, float luong) {
        this.manv = manv;
        this.tennv = tennv;
        this.gioitinh = gioitinh;
        this.sdt = sdt;
        this.Email = Email;
        this.vaitro = vaitro;
        this.luong = luong;
    }

    public nhanvien() {
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public boolean getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getVaitro() {
        return vaitro;
    }

    public void setVaitro(String vaitro) {
        this.vaitro = vaitro;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }
    
}
