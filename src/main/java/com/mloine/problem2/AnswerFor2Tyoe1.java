package com.mloine.problem2;

import java.util.Arrays;

/**
 *  @Author: XueYongKang
 *  @Description:    
 *  @Data: 2019/12/25 17:32
 */
public class AnswerFor2Tyoe1 {

    public static int game(int[] guess, int[] answer) {
        int count = 0;
        for(int i=0;i<3;i++){
            if(guess[i] == answer[i]){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
       int[] guess =  {1,2,3};
       int[] answer =  {1,2,3};
        System.out.println(game(guess,answer));
    }
}
