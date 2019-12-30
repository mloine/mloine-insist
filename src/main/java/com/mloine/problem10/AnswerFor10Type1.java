package com.mloine.problem10;


import java.util.ArrayList;
import java.util.Arrays;

/*
 * @Author mloine
 * @Description //TODO
 *
 * @Date 11:00 下午 2019/12/29
 **/
public class AnswerFor10Type1 {
    public static int balancedStringSplit(String s) {
        int rNum = 0;
        int lNum =0;
        int number = 0;
        char r = 'R';
        char l = 'L';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == r){
                rNum++;
            }else if(c == l){
                lNum++;
            }
            if(rNum == lNum ){number++; }

        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
    }

}
