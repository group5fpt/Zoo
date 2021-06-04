/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.mode.BanVe;
import com.utils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Amin
 */
public class BanVeDAO extends theZooDAO<BanVe, String>{
    String Insert = "INSERT INTO LoiNhuan (KhuVuc, MaNV, GiaVe, LoaiVe,GioXuatVe,SoLuong,Tong,GioTaoVe) VALUES(?,?,?,?,?,?,?,?)";
    String Update = "Update BanVe set (KhuVuc=?, MaNV=?, GiaVe=?, LoaiVe=?,NgayXuat=?,SoLuong=?,Tong=?,GioXuatVe) where MaVe = ?";
    String SELECT_BY_ID_SQL = "select * from LoiNhuan where MaVe LIKE ?";
    String SELECT_BY_ngay_SQL = "select * from LoiNhuan where NgayXuat = ?";
    @Override
    public void insert(BanVe entity) {
        XJdbc.update(Insert, entity.getKhuvuc(), entity.getManv(),entity.getGiave(),entity.getLoaive(),entity.getGioXuatVe(),entity.getSoluong(),entity.getTong(),entity.getGioTaoVe());
    }

    @Override
    public void update(BanVe entity) {
        XJdbc.update(Update, entity.getKhuvuc(), entity.getManv(),entity.getGiave(),entity.getLoaive(),entity.getGioXuatVe(),entity.getSoluong(),entity.getTong(),entity.getGioTaoVe());
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public BanVe selectByIdclick(int id) {
        String sql = "Select * from LoiNhuan Where MaVe=?";
        List<BanVe> list = this.selectBySql(sql, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<BanVe> selectAll() {
        String sql = "Select * from LoiNhuan";
        return this.selectBySql(sql);
    }
    public List<BanVe> selectAllKhuvuc() {
        String sql = "Select KhuVuc from LoiNhuan";
        return this.selectBySql(sql);
    }
    @Override
    protected List<BanVe> selectBySql(String sql, Object... args) {
        List<BanVe> list = new ArrayList<BanVe>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while(rs.next()){
                BanVe bv = new BanVe();
                bv.setMave(Integer.parseInt(rs.getString("MaVe")));
                bv.setKhuvuc(rs.getString("KhuVuc"));
                bv.setManv(rs.getString("MaNV"));
                bv.setGiave(Float.parseFloat(rs.getString("GiaVe")));
                bv.setLoaive(rs.getBoolean("LoaiVe"));
                bv.setGioXuatVe(rs.getDate("GioXuatVe"));
                bv.setSoluong(Integer.parseInt(rs.getString("SoLuong")));
                bv.setTong(Float.parseFloat(rs.getString("Tong")));
                bv.setGioTaoVe(rs.getString("GioTaoVe"));
                list.add(bv);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }  
    }
    public List<BanVe>  selectBytk(String id) {

        return this.selectBySql(SELECT_BY_ID_SQL, "%"+id+"%");
    
    }

    @Override
    //id = ngày
    public BanVe selectById(String id) {
        List<BanVe> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

 
}
