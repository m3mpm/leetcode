package org.m3mpm;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution1 {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode result = null;
        ListNode current = null;
        ListNode original = head;

        while (original != null){
            if (current == null || original.val != current.val){
                ListNode tmp = new ListNode(original.val,null);
                if (result == null) {
                    result = tmp;
                    current = tmp;
                } else {
                    current.next = tmp;
                    current = current.next;
                }
            }
            original = original.next;
        }

        return result;
    }

    public void printList(ListNode head) {
        ListNode current = head; // Начинаем с головы списка
        while (current != null) { // Пока текущий узел не равен null
            System.out.print(current.val + " "); // Выводим значение текущего узла
            current = current.next; // Переходим к следующему узлу
        }
        System.out.println(); // Переход на новую строку после вывода
    }
}
