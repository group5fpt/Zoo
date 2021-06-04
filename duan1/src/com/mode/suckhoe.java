/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mode;

import java.util.Date;
import java.util.List;

/**
 *
 * @author DELL
 */
public class suckhoe {
    String madv;
    String manv;
    float nhietdocothe;
    float nhieptim;
    String bieuhien;
    String ngaykham;
    String sinhsan;
    String ghiChu;

    public String getMadv() {
        return madv;
    }

    public void setMadv(String madv) {
        this.madv = madv;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public float getNhietdocothe() {
        return nhietdocothe;
    }

    public void setNhietdocothe(float nhietdocothe) {
        this.nhietdocothe = nhietdocothe;
    }

    public float getNhieptim() {
        return nhieptim;
    }

    public void setNhieptim(float nhieptim) {
        this.nhieptim = nhieptim;
    }

    public String getBieuhien() {
        return bieuhien;
    }

    public void setBieuhien(String bieuhien) {
        this.bieuhien = bieuhien;
    }

    public String getNgaykham() {
        return ngaykham;
    }

    public void setNgaykham(String ngaykham) {
        this.ngaykham = ngaykham;
    }

    public String getSinhsan() {
        return sinhsan;
    }

    public void setSinhsan(String sinhsan) {
        this.sinhsan = sinhsan;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public suckhoe() {
    }

    public suckhoe(String madv, String manv, float nhietdocothe, float nhieptim, String bieuhien, String ngaykham, String sinhsan, String ghiChu) {
        this.madv = madv;
        this.manv = manv;
        this.nhietdocothe = nhietdocothe;
        this.nhieptim = nhieptim;
        this.bieuhien = bieuhien;
        this.ngaykham = ngaykham;
        this.sinhsan = sinhsan;
        this.ghiChu = ghiChu;
    }
    
}