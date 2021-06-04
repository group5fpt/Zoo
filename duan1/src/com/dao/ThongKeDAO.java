/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.utils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author hp
 */
public class ThongKeDAO {
    private List<Object[]> getListOfArray(String sql, String[] cols, Object...args){
        try {
            List<Object[]> list=new ArrayList<>();
            ResultSet rs = XJdbc.query(sql, args);
            while(rs.next()){
                Object[] vals = new Object[cols.length];
                for(int i=0; i<cols.length; i++){
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public List<Object[]> getThuNhap(String khuvuc){
        String sql = "sp_ThuNhap ?";
        String[] cols ={"KhuVuc","GiaVe","LoaiVe","Số Lượng","Tổng tiền"};
        return this.getListOfArray(sql, cols, khuvuc);
    }
    public List<Object[]> getThuNhapNgay(String ngay){
        String sql = "sp_ThuNhapTheoNgay ?";
        String[] cols ={"KhuVuc","Số Lượng","Tổng tiền","GioXuatVe"};
        return this.getListOfArray(sql, cols, ngay);
    }
    
    public List<Object[]> getChiTieuThang(Integer thang, Integer nam ){
        String sql = "sp_ChiTieuTheoThang ? , ?";
        String[] cols ={"LoaiCT","Số Lượng","Tổng tiền"};
        return this.getListOfArray(sql, cols, thang,nam);
    }
    
    public List<Object[]> getTongTienChiTieuThang(Integer thang, Integer nam ){
        String sql = "sp_tongTienChiTieu ? , ?";
        String[] cols ={"Tổng tiền"};
        return this.getListOfArray(sql, cols, thang,nam);
    }
    
    public List<Object[]> getTongNhanVien(){
        String sql = " sp_TongNhanVien";
        String[] cols ={"Nhân Viên"};
        return this.getListOfArray(sql, cols);
    }
    
    public List<Object[]> getTongDongVat(){
        String sql = " sp_TongDongVat";
        String[] cols ={"Động Vật"};
        return this.getListOfArray(sql, cols);
    }
 
    public List<Object[]> getGioiTinhNV(boolean gt){
        String sql = " sp_TongGioiTinh ?";
        String[] cols ={"GioiTinh","Tổng Nhân Viên"};
        return this.getListOfArray(sql, cols,gt);
    }
    
    public List<Object[]> getGioiTinhDV(boolean gt){
        String sql = "sp_TongGioiTinhDV  ?";
        String[] cols ={"GioiTinhDV","Tổng Động Vật"};
        return this.getListOfArray(sql, cols,gt);
    }
    
    public List<Object[]> getVaiTroNV(String gt){
        String sql = "sp_TongslVaiTro  ?";
        String[] cols ={"Vaitro","Chuc vu"};
        return this.getListOfArray(sql, cols,gt);
    }
}
