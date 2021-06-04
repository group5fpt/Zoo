package com.utils;

import java.awt.Component;
import javax.swing.JOptionPane;

public class MsgBox {
    //cửa sổ thông báo
    /**
     * Hiển thị thông báo cho người dùng
     * @param parent là cửa sổ chứa thông báo
     * @param message là thông báo
     */
    public static void alert(Component parent, String massage) {
        JOptionPane.showMessageDialog(parent, massage,
                "Hệ thống quản lý đào tạo", JOptionPane.INFORMATION_MESSAGE);
    }
    
    //cửa sổ xác định
    /**
     * Hiển thị thông báo và yêu cầu người dùng xác nhận
     * @param parent là cửa sổ chứa thông báo
     * @param message là câu hỏi yes/no
     * @return là kết quả nhận được true/false
     */ 
    public static boolean confirm(Component parent,String message){
        int result = JOptionPane.showConfirmDialog(parent, message,
                "Hệ thống quản lý đào tạo",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        return result==JOptionPane.YES_OPTION;
    }
    //cửa sổ nhập thông tin
    /**
     * Hiển thị thông báo yêu cầu nhập dữ liệu
     * @param parent là cửa sổ chứa thông báo
     * @param message là thông báo nhắc nhở nhập
     * @return là kết quả nhận được từ người sử dụng nhập vào
     */  
    public static String prompt(Component parent, String message){
        return JOptionPane.showInputDialog(parent,message,
                "Hệ thống quản lý đào tạo",JOptionPane.INFORMATION_MESSAGE);
    }
}