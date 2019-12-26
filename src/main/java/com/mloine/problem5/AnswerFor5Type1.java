package com.mloine.problem5;


import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *  @Author: XueYongKang
 *  @Description:    
 *  @Data: 2019/12/26 13:45
 */
public class AnswerFor5Type1 {

    public static String defangIPaddr(String address) {
        return address.replaceAll("\\.","[.]");
    }

    public static String defangIPaddr1(String address) {
        StringBuffer bf = new StringBuffer();
        for(int i=0;i<address.length();i++){
            char c = address.charAt(i);
            if(c != '.'){
                bf.append(c);
            }else{
                bf.append("["+c+"]");
            }
        }
        return bf.toString();
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("55.100.50.0"));
        System.out.println(defangIPaddr1("55.100.50.0"));
    }
}
