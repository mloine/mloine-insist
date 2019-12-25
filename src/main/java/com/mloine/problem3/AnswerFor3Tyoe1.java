package com.mloine.problem3;


import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;

/**
 *  @Author: XueYongKang
 *  @Description:    
 *  @Data: 2019/12/25 17:32
 */
public class AnswerFor3Tyoe1 {

    public static int numJewelsInStones(String J, String S) {
        int sum = 0;
        String replacement = "";
        char[] chars = J.toCharArray();
        for(char x:chars){
            sum +=  S.length() - (S.replaceAll(String.valueOf(x), replacement).length());
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA","aAAbbbb"));
    }
}
