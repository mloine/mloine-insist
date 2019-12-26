package com.mloine.problem3;


import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

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

    public static int numJewelsInStones1(String J, String S) {
        int sum = 0;
        char[] chars = S.toCharArray();
        char[] chars1 = J.toCharArray();
        HashMap<String, Integer> values = new HashMap<>(65);
        for(char x :chars){
            Integer integer = values.get(String.valueOf(x));
            values.put(String.valueOf(x), integer == null ? 1:  integer + 1);
        }
        for(char x : chars1){
            Integer integer = values.get(String.valueOf(x));
            if(integer != null){sum += integer;}

        }
        return sum;
    }
    

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA","aAAbbbb"));
        System.out.println(numJewelsInStones1("aA","aAAbbbb"));
    }
}
