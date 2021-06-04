/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.mode.nhanvien;
import com.utils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class NhanVienDAO extends theZooDAO<nhanvien, String>{
    String INSERT_SQL="INSERT INTO NhanVien(MaNV, TenNV, NgaySinh, GioiTinh, SoDT, Email, VaiTro, Luong) VALUES(?,?,?,?,?,?,?,?)";
    String UPDATE_SQL="UPDATE NhanVien SET TenNV=?, NgaySinh=?, GioiTinh=?,SoDT=?, Email=?, VaiTro=?, Luong=? WHERE MaNV=?";
    String DELETE_SQL="DELETE FROM NhanVien WHERE MaNV=?";
    String SELECT_ALL_SQL="SELECT * FROM NhanVien";
    String SELECT_BY_ID_SQL="SELECT * FROM NhanVien WHERE MaNV=?";
    @Override
    public void insert(nhanvien entity) {
        XJdbc.update(INSERT_SQL, entity.getManv(),entity.getTennv(),entity.getNgaysinh(),entity.getGioitinh(),entity.getSdt(),entity.getEmail(),entity.getVaitro(),entity.getLuong());
    }

    @Override
    public void update(nhanvien entity) {
        XJdbc.update(UPDATE_SQL,entity.getTennv(),entity.getNgaysinh(),entity.getGioitinh(),entity.getSdt(),entity.getEmail(),entity.getVaitro(),entity.getLuong(), entity.getManv());
    }

    @Override
    public void delete(String id) {
        XJdbc.update(DELETE_SQL, id);
    }

    @Override
    public nhanvien selectById(String id) {
        List<nhanvien> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<nhanvien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<nhanvien> selectBySql(String sql, Object... args) {
        List<nhanvien> list = new ArrayList<nhanvien>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while(rs.next()){
                nhanvien nv = new nhanvien();
                nv.setManv(rs.getString("MaNV"));
                nv.setTennv(rs.getString("TenNV"));
                nv.setNgaysinh(rs.getDate("NgaySinh"));
                nv.setGioitinh(rs.getBoolean("GioiTinh"));
                nv.setSdt(rs.getString("SoDT"));
                nv.setEmail(rs.getString("Email"));
                nv.setVaitro(rs.getString("VaiTro"));
                nv.setLuong(rs.getFloat("Luong"));
                list.add(nv);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }  
    }
}
