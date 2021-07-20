package com.gy.list;

public class LinkedListCycle {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        if (head.next != null && head.next.next == null) {
            return false;
        }
        ListNode next = head.next;
        ListNode cur = head;
        while (true) {
            if (next == null || next.next == null || next.next.next == null) {
                return false;
            }
            if (next == cur) {
                return true;
            }
            cur = cur.next;
            next = next.next.next;
        }
    }
}
