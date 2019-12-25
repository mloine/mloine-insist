package com.mloine.problem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *  @Author: XueYongKang
 *  @Description:    
 *  @Data: 2019/12/25 9:46
 */
public class AnswerFor1Type1 {

    public static int findNumbers(int[] nums) {
        //1.准备响应数字
        int num = 0;
        int length = 1;
        for(int x :nums){
            length = new Integer(x).toString().length();
            if((length)%2 == 0){ num++; }
        }
        return num;
    }  
    
    public static int findNumbers1(int[] nums) {
        //1.准备响应数字
        long count = Arrays.stream(nums).map((x)-> Integer.toString(x).length()).filter((x) -> (x % 2 == 0)).count();
        return new Integer(new String(Long.toString(count)));
    }


    public int findNumbers2(int[] nums) {
        return (int)Arrays.stream(nums).filter(x -> (int)(Math.log10(x) + 1) % 2 == 0).count();
    }

    /**
     * 取巧的方式
     * @param nums
     * @return
     */
    public int findNumbers3(int[] nums) {
        return (int)Arrays.stream(nums).filter(x -> (
                (x >= 10 && x <= 99) ||
                (x >= 1000 && x <= 9999)
                )).count();
    }



    public static void main(String[] args) {
        int numbers = findNumbers1(new int[]{12, 345, 2, 6, 7896});
        System.out.println(numbers);
    }

}
