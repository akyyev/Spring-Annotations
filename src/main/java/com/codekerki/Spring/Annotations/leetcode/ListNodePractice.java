package com.codekerki.Spring.Annotations.leetcode;

import lombok.extern.slf4j.Slf4j;

public class ListNodePractice {
    
    public static void main(String[] args) {
        ListNode node = new ListNode(5, new ListNode(3, new ListNode(2, null)));
        // node.rotate(1);
        node.rotate(1);
        // System.out.println("Node Count: " + node.size());
        node.printListNode();
    }

}

@Slf4j
class ListNode {

    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {this.val = val;}
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    
    void printListNode() {
        ListNode curr = this;

        while(true) {
            log.info("{}", curr.val);
            curr = curr.next;
            if(curr == null) break;
        }
    }

    public int size() {

        int count = 0;
        ListNode curr = this;

        while(curr.next != null) {
            curr = curr.next;
            count++;
        }

        return count;
    }

    // 5, 3, 2, 
    public void rotate(int k) {

        if(this == null || this.next == null || k == 0) return;

        int length = 1;
        ListNode curr = this;
        while(curr.next != null) {
            curr = curr.next;
            length++;
        }

        log.info("Lenght: {}", length);
        curr.next = this;
        k = k % length;
        k = length - k;

        log.info("K: {}", k);

        while (k-- > 0) {
            curr = curr.next;
        }

        this.val = curr.next.val;
        this.next = curr.next.next;
        curr.next.next=null;
        curr.next = null;
    }

    public boolean isEmpty() {
        return this == null;
    }

    public int getValueAtIndex() {
        return 0;
    }
}