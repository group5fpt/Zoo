/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.mode.suckhoe;
import com.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class suckhoedao extends theZooDAO<suckhoe, String> {

    public static List<suckhoe> getList() {
        return null;
    }
    String insert_SQL = "INSERT into SucKhoe (MaDV, MaNV, NhietDoCoThe, NhipTim, BieuHien, NgayKham, SinhSan, GhiChu) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?)";

  
    public void insert(suckhoe thezoo){
       
        XJdbc.update(insert_SQL,
                thezoo.getMadv(),
                thezoo.getManv(),
                thezoo.getNhietdocothe(),
                thezoo.getNhieptim(),
                thezoo.getBieuhien(),
                thezoo.getNgaykham(),
                thezoo.getSinhsan(),
                thezoo.getGhiChu());
    }
    public void update(suckhoe thezoo){
        String sql="UPDATE SucKhoe SET MaNV=?, NhietDoCoThe=?, NhipTim=?, BieuHien=?, NgayKham=?, SinhSan=?, GhiChu=? Where MaDV=?";
        XJdbc.update(sql, 
                
                thezoo.getManv(),
                thezoo.getNhietdocothe(),
                thezoo.getNhieptim(),
                thezoo.getBieuhien(),
                thezoo.getNgaykham(),
                thezoo.getSinhsan(),
                thezoo.getGhiChu(),
                thezoo.getMadv());
    }
    public void delete(String MaDV){
        String sql="DELETE FROM SucKhoe Where MaDV=?";
        XJdbc.update(sql, MaDV);
    }
    public List<suckhoe> selectAll(){
        String sql="SELECT * FROM SucKhoe";
        return selectBySql(sql);
    }
       
    public suckhoe selectByTimKiem(String madv,String ngaykham){
        String sql="SELECT * FROM SucKhoe WHERE MaDV=? and NgayKham=?";
        List<suckhoe> list = selectBySql(sql, madv,ngaykham);
        return list.size() > 0 ? list.get(0) : null;
    }
    protected List<suckhoe> selectBySql(String sql, Object... args) {
        List<suckhoe> list = new ArrayList<suckhoe>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                suckhoe thezoo = new suckhoe();
                thezoo.setMadv(rs.getString("MaDV"));
                thezoo.setManv(rs.getString("MaNV"));
                thezoo.setNhietdocothe(rs.getFloat("NhietDoCoThe"));
                thezoo.setNhieptim(rs.getFloat("NhipTim"));
                thezoo.setBieuhien(rs.getString("BieuHien"));
                thezoo.setNgaykham(rs.getString("NgayKham"));
                thezoo.setSinhsan(rs.getString("SinhSan"));
                thezoo.setGhiChu(rs.getString("GhiChu"));
                list.add(thezoo);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

    }

    @Override
    public suckhoe selectById(String madv) {
        String sql="SELECT * FROM SucKhoe WHERE MaDV=?";
        List<suckhoe> list = selectBySql(sql, madv);
        return list.size() > 0 ? list.get(0) : null;
    }
    
     
    
   

}
