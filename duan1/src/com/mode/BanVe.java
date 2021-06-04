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
public class BanVe {
    String khuvuc;
    Integer mave;
    String manv;
    float giave;
    boolean loaive;
    Date gioXuatVe = new Date();
    Integer soluong;
    float Tong;
    String gioTaoVe;

    public BanVe(String khuvuc, Integer mave, String manv, float giave, boolean loaive, Integer soluong, float Tong, String gioTaoVe) {
        this.khuvuc = khuvuc;
        this.mave = mave;
        this.manv = manv;
        this.giave = giave;
        this.loaive = loaive;
        this.soluong = soluong;
        this.Tong = Tong;
        this.gioTaoVe = gioTaoVe;
    }

    public BanVe() {
    }

    public String getKhuvuc() {
        return khuvuc;
    }

    public void setKhuvuc(String khuvuc) {
        this.khuvuc = khuvuc;
    }

    public Integer getMave() {
        return mave;
    }

    public void setMave(Integer mave) {
        this.mave = mave;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public float getGiave() {
        return giave;
    }

    public void setGiave(float giave) {
        this.giave = giave;
    }

    public boolean getLoaive() {
        return loaive;
    }

    public void setLoaive(boolean loaive) {
        this.loaive = loaive;
    }

    public Date getGioXuatVe() {
        return gioXuatVe;
    }

    public void setGioXuatVe(Date gioXuatVe) {
        this.gioXuatVe = gioXuatVe;
    }

    public Integer getSoluong() {
        return soluong;
    }

    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }

    public float getTong() {
        return Tong;
    }

    public void setTong(float Tong) {
        this.Tong = Tong;
    }

    public String getGioTaoVe() {
        return gioTaoVe;
    }

    public void setGioTaoVe(String gioTaoVe) {
        this.gioTaoVe = gioTaoVe;
    }
    
}
