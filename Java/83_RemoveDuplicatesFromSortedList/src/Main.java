package org.m3mpm;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Create a singly-linked list: 1 -> 2 -> 2 -> 3 -> 1
        ListNode node6 = new ListNode(3, null);
        ListNode node5 = new ListNode(3, node6);
        ListNode node4 = new ListNode(2, node5);
        ListNode node3 = new ListNode(2, node4);
        ListNode node2 = new ListNode(1, node3);
        ListNode head = new ListNode(1, node2);

        System.out.println("***Solution1***");
        System.out.println("Original list will be not changed");

        Solution1 solution1 = new Solution1();

        System.out.println("Original list:");
        solution1.printList(head);
        System.out.println("Result list:");
        solution1.printList(solution1.deleteDuplicates(head));
        System.out.println("Original list not changed:");
        solution1.printList(head);



        System.out.println("***Solution2***");
        System.out.println("Original list will be changed");

        Solution2 solution2 = new Solution2();

        System.out.println("Original list:");
        solution2.printList(head);
        System.out.println("Result list:");
        solution1.printList(solution2.deleteDuplicates(head));
        System.out.println("Original list changed:");
        solution2.printList(head);






    }
}