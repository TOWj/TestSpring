package spring_introduction;

import java.util.Scanner;

public class ListNode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListNode head = new ListNode(1);
        while(sc.hasNext()) {
            ListNode insert = new ListNode(sc.nextInt());
            if (head == null){
                head = insert;
                break;
            }
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp = insert;
        }

    }
    int val;
    ListNode next;

    ListNode() {
    }
    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
