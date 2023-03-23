package org.example.cw4;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

/**
public class Ex1 {
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode pred = null;
            ListNode current = head;
            while(current != null){
                ListNode nextElem = current.next;
                current.next = pred;
                pred=current;
                current=nextElem;
            }
            return pred;
        }
    }

}
*/