/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.mode.ChiTieu;
import com.utils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class ChiTieuDAO extends theZooDAO<ChiTieu, String>{
    String SELECT_INSERT ="INSERT INTO ChiTieu (MaNV, LoaiCT, MaHD, NgayXuatHD, NgayNhapHD, SoTien, GhiChu, HinhHD) VALUES (?,?,?,?,?,?,?,?)";
    String SELECT_UPDATE = "UPDATE ChiTieu SET MaNV=?, LoaiCT=?, MaHD=?, NgayXuatHD=?, NgayNhapHD=?, SoTien=?, GhiChu=?, HinhHD=? WHERE MaCT = ?";
    String SELECT_DELETE ="Delete FROM ChiTieu WHERE MaCT=?";
    String SELECT_ALL="SELECT * FROM ChiTieu";
    String SELECT_ALL_ID="SELECT * FROM ChiTieu WHERE MaCT = ?";
    @Override
    public void insert(ChiTieu ct) {
        XJdbc.update(SELECT_INSERT, ct.getMaNV(),
                ct.getLoaiCT(),
                ct.getMaHD(),
                ct.getNgayXuatHD(),
                ct.getNgayNhapHD(),
                ct.getSoTien(),
                ct.getGhiChu(),
                ct.getHinh());
    }

    @Override
    public void update(ChiTieu ct) {
        XJdbc.update(SELECT_UPDATE, ct.getMaNV(),ct.getLoaiCT(),ct.getMaHD(),ct.getNgayXuatHD(),ct.getNgayNhapHD(),ct.getSoTien(),ct.getGhiChu(),ct.getHinh(),ct.getMaCT());
    }

    @Override
    public void delete(String id) {
        XJdbc.update(SELECT_DELETE, id);
    }

    public ChiTieu selectByIdclick(int id) {
       List<ChiTieu> list = this.selectBySql(SELECT_ALL_ID, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<ChiTieu> selectAll() {
        return this.selectBySql(SELECT_ALL);
    }

    @Override
    protected List<ChiTieu> selectBySql(String sql, Object... args) {
        List<ChiTieu> list = new ArrayList<ChiTieu>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                ChiTieu ct = new ChiTieu();
                ct.setMaCT(Integer.parseInt(rs.getString("MaCT")));
                ct.setMaNV(rs.getString("MaNV"));
                ct.setLoaiCT(rs.getString("LoaiCT"));
                ct.setMaHD(rs.getString("MaHD"));
                ct.setNgayXuatHD(rs.getDate("NgayXuatHD"));
                ct.setNgayNhapHD(rs.getDate("NgayNhapHD"));
                ct.setSoTien(Double.parseDouble(rs.getString("SoTien")));
                ct.setGhiChu(rs.getString("GhiChu"));
                ct.setHinh(rs.getString("HinhHD"));
                list.add(ct);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ChiTieu selectById(String id) {
        List<ChiTieu> list = this.selectBySql(SELECT_ALL_ID, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
    
}
