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
public class Solution2 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode list = head;

        while (list != null){
            if (list.next != null && list.val == list.next.val){
                list.next = list.next.next;
            } else {
                list = list.next;
            }
        }

        return head;
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
