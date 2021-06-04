/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;


import com.mode.taikhoan;
import com.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class taikhoandao extends theZooDAO<taikhoan, String>{
     public taikhoan selectById(String manv){
        String sql="SELECT * FROM TaiKhoan WHERE MaNV=?";
        List<taikhoan> list = this.selectBySql(sql, manv);
        return list.size() > 0 ? list.get(0) : null;
    }
    public void doimatkhau(taikhoan tk){
         String sql = "UPDATE TaiKhoan SET MatKhau=? Where MaNV=?";
         XJdbc.update(sql, 
                 tk.getMk(),
                 tk.getManv()
                 );
    }
    protected List<taikhoan> selectBySql(String sql, Object...args){
        List<taikhoan> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    taikhoan entity = new taikhoan();
                    entity.setManv(rs.getString("MaNV"));
                    entity.setMk(rs.getString("MatKhau"));        
                    entity.setVaitro(rs.getString("VaiTro"));
                    entity.setEmail(rs.getString("Email"));
                    list.add(entity);
                }
            } 
            finally{
                rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }

    @Override
    public void insert(taikhoan entity) {
        String sql = "INSERT INTO TaiKhoan (MaNV, MatKhau,VaiTro,Email) VALUES (?,?,?,?)";
        XJdbc.update(sql,entity.getManv(),entity.getMk(),entity.getVaitro(),entity.getEmail());
    }

    @Override
    public void update(taikhoan entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<taikhoan> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public taikhoan selectByEmail(String email,String manv){
        String sql="SELECT * FROM TaiKhoan where Email = ? and MaNV=?";
        List<taikhoan> list = this.selectBySql(sql, email,manv);
        return list.size() > 0 ? list.get(0) : null;
     }
}
