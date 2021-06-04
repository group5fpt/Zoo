/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mode;

/**
 *
 * @author DELL
 */
public class taikhoan {
    String manv;
    String mk;
    String vaitro;
    String email;

    public taikhoan(String manv, String mk, String vaitro, String email) {
        this.manv = manv;
        this.mk = mk;
        this.vaitro = vaitro;
        this.email = email;
    }

    public taikhoan() {
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }

    public String getVaitro() {
        return vaitro;
    }

    public void setVaitro(String vaitro) {
        this.vaitro = vaitro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
