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

    public static void main(String[] args) {
        System.out.println(defangIPaddr("55.100.50.0"));

    }
}
