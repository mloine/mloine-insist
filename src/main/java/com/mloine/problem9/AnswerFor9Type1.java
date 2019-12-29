package com.mloine.problem9;


import java.util.ArrayList;
import java.util.Arrays;

/*
 * @Author mloine
 * @Description //TODO
 *
 * @Date 11:00 下午 2019/12/29
 **/
public class AnswerFor9Type1 {
    public static int[] sumZero(int n) {
        if(n == 0){return new int[0];}
        if(n == 1){return new int[]{0};}
        //1.区分单数还是偶数
        ArrayList<Integer> list = new ArrayList<>();
        int num = n/2;
        boolean flag = n%2 == 1;
        if(flag){ list.add(0); }
        for (int i = 1; i <= num; i++) {
            list.add(i);
            list.add(-i);
        }
        int size = list.size();
        int[] ints = new int[size];
        for (int i = 0; i < size; i++) {
            ints[i] = list.get(i);
        }
        return ints;
    }

    public static void main(String[] args) {
        int[] ints = sumZero(1);
        Arrays.stream(ints).forEach(System.out::println);

    }

}
