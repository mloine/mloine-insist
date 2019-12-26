package com.mloine.problem4;


import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *  @Author: XueYongKang
 *  @Description:    
 *  @Data: 2019/12/26 13:45
 */
public class AnswerFor4Type1 {
    /**
     *  1<= n <= 10^5
     * @param n
     * @return
     */
    public int subtractProductAndSum(int n) {
        //1.如果是个位数直接返回0
        int zero = 0;
        int ten = 10;
        if(n< ten && n>=zero){ return zero;}
        ArrayList<Integer> objects = new ArrayList<>();
        //2.非个位数 提取个位数值
        while(n != 0){
            int number = n%10;
            n = n/10;
            objects.add(number);
        }
        AtomicInteger sum = new AtomicInteger();
        AtomicInteger xsum = new AtomicInteger(1);
        objects.stream().forEach((x) -> {
            sum.addAndGet(x);
            xsum.set(xsum.get() * x);});
        return xsum.get() - sum.get();
    }

    public int subtractProductAndSum1(int n) {
        int sum = 0;
        int xsum = 1;
        char[] chars = new Integer(n).toString().toCharArray();
        for(char x : chars){
            Integer num = Integer.valueOf(String.valueOf(x));
            sum += num;
            xsum *= num;
        }
        return xsum - sum;
    }

    public static void main(String[] args) {
        System.out.println(121/10);
        System.out.println(12%10);
    }
}
