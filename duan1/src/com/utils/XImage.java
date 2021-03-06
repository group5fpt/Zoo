/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utils;

import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

/**
 *
 * @author hp
 */

public class XImage {
    /**
     * Ảnh biểu tượng của ứng dụng, xuất hiện trên mọi cửa sổ
     */
    public static Image getAppIcon(){
      URL url =  XImage.class.getResource("/com/Icon/hinhlogo.png");
      return new ImageIcon(url).getImage();
    }
    /**
     * Sao chép file logo chuyên đề vào thư mục logo
     * @param src là đối tượng file ảnh
     */
    public static void save(File src) {
        File dst = new File("logos",src.getName());
        //Tạo thư muc logo nếu chưa tồn tại
        if(!dst.getParentFile().exists()){
            dst.getParentFile().mkdirs();
        }
        try{
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            //copy file vào thư mục logos
            Files.copy(from,to,StandardCopyOption.REPLACE_EXISTING); 
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    /**
     * Đọc hình ảnh logo chuyên đề
     * @param fileName  là tên file logo
     * @return ảnh đọc được
     */ 
    public static ImageIcon read(String fileName){
        File path = new File("logos",fileName);
        return new ImageIcon(path.getAbsolutePath());
    }
}
