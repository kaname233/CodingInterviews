package jz03;

import com.ListNode;
import java.util.ArrayList;

/*
输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */

/*
思路： 递归
 */
public class JZ03 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode == null) return new ArrayList<Integer>();
        ArrayList<Integer> arr = printListFromTailToHead(listNode.next);
        arr.add(listNode.val);
        return arr;
    }

}
