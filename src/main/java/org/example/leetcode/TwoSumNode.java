package org.example.leetcode;

public class TwoSumNode {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;

        int buff = 0;

        while (l1 != null || l2 != null || buff != 0) {
            int sum = buff;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            buff = sum / 10;
            sum %= 10;
            cur.next = new ListNode(sum);
            cur = cur.next;
        }
        return dummy.next;
    }
}




