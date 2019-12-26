package com.mloine.problem6;


import java.sql.SQLOutput;

/**
 *  @Author: XueYongKang
 *  @Description:      <<= 左移位运算
 *  @Data: 2019/12/26 15:02
 */
public class AnswerFor6Type1 {

    public int getDecimalValue(ListNode head) {
        ListNode next = head;
        StringBuffer bf = new StringBuffer();
        bf.append(head.val);
        while(next.next != null){
            //2.指向下一个节点
            next = next.next;
            //1.逻辑处理
            bf.append(next.val);
        }

        return Integer.parseInt(bf.toString(),2);
    }


    public static void main(String[] args) {
//        System.out.println(Integer.parseInt("1000",3));
        int i = 3;
        System.out.println(i <<= 1);//1     110  6
        i = 3;
        System.out.println(i <<= 2);//2    1100   12
        i = 3;
        System.out.println(i <<= 3);//4    11000
    }
}
