package com.mloine.problem7;


import com.mloine.problem7.ListNode;

/**
 *  @Author: XueYongKang
 *  @Description:      <<= 左移位运算
 *  @Data: 2019/12/26 15:02
 */
public class AnswerFor7Type1 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;

    }

}
