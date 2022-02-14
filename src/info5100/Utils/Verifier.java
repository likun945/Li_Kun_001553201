/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.Utils;

import javax.swing.*;

/**
 *
 * @author Administrator
 */
public class Verifier {
    public boolean verify(JComponent input) {
        if (!(input instanceof JTextField)) return true;
        return verifyEmpty((JTextField) input);
    }
    public boolean verifyEmpty(JTextField field) {
        return field.getText() != null &&
                !field.getText().trim().isEmpty();
    }
    public boolean verifyNumber(JTextField field) {
        return field.getText().matches("[0-9.]+");
    }
    public boolean verifyEmail(JTextField field) {
        /*
         * " \w"：匹配字母、数字、下划线。等价于'[A-Za-z0-9_]'。
         * "|"  : 或的意思，就是二选一
         * "*" : 出现0次或者多次
         * "+" : 出现1次或者多次
         * "{n,m}" : 至少出现n个，最多出现m个
         * "$" : 以前面的字符结束
         */
        String REGEX="^\\w+((-\\w+)|(\\.\\w+))*@\\w+(\\.\\w{2,3}){1,3}$";
        return field.getText().matches(REGEX);
    }
}