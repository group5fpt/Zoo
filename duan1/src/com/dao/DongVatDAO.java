/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.mode.*;
import com.utils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class DongVatDAO extends theZooDAO<dongvat, String>{
    String INSERT_SQL="INSERT INTO DongVat (MaDV, MaNV, TenDV, XuatSu, GioiTinhDV, DatDiem, SinhThai, SinhSan, TinhTrang, Hinh) VALUES (?,?,?,?,?,?,?,?,?,?)";
    String UPDATE_SQL="UPDATE DongVat SET MaNV=?, TenDV =?, XuatSu =?, GioiTinhDV =?, DatDiem =?, SinhThai =?, SinhSan =?, TinhTrang =?, Hinh=? WHERE MaDV=?";
    String DELETE_SQL="DELETE FROM DongVat WHERE MaDV=?";
    String SELECT_ALL_SQL="SELECT * FROM DongVat";
    String SELECT_BY_ID_SQL="SELECT * FROM DongVat where MaDV = ?";
    
   
    public void insert(dongvat entity) {
        XJdbc.update(INSERT_SQL, entity.getMaDV(),entity.getMaNV(),entity.getTenDV(),entity.getXuatSu(),entity.getGioitinh(),
                entity.getDatDiem(),entity.getSinhThai(),entity.getSinhSan(),entity.getTinhTrang(),entity.getHinh());
    }

    
    public void update(dongvat entity) {
        XJdbc.update(UPDATE_SQL, entity.getMaNV(), entity.getTenDV(),entity.getXuatSu(),entity.getGioitinh(),entity.getDatDiem(),entity.getSinhThai(),entity.getSinhSan(),entity.getTinhTrang(),entity.getHinh(),entity.getMaDV());
    }
    
    public void delete(String id) {
        XJdbc.update(DELETE_SQL, id);
    }

    public List<dongvat>  selectBytk(String id) {

        return this.selectBySql(SELECT_BY_ID_SQL, "%"+id+"%");
    
    }
   
    public List<dongvat> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

   
    protected List<dongvat> selectBySql(String sql, Object... args) {
        List<dongvat> list = new ArrayList<dongvat>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while(rs.next()){
                dongvat dv = new dongvat();
                dv.setMaDV(rs.getString("MaDV"));
                dv.setMaNV(rs.getString("MaNV"));
                dv.setTenDV(rs.getString("TenDV"));
                dv.setXuatSu(rs.getString("XuatSu"));
                dv.setGioitinh(rs.getBoolean("GioiTinhDV"));
                dv.setDatDiem(rs.getString("DatDiem"));
                dv.setSinhThai(rs.getString("SinhThai"));
                dv.setSinhSan(rs.getString("SinhSan"));
                dv.setTinhTrang(rs.getString("TinhTrang"));
                dv.setHinh(rs.getString("Hinh"));
                list.add(dv);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
    }

    @Override
    public dongvat selectById(String id) {
        List<dongvat> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

   
   
    
   
}
