public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode currentPoint = result;
        
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                currentPoint.next = list1;
                list1 = list1.next;
            } else {
                currentPoint.next = list2;
                list2 = list2.next;
            }
            currentPoint = currentPoint.next;
        }

        currentPoint.next = (list1 != null) ? list1 : list2;

        return result.next;


        // ver 2
        /*
        if(list1 != null && list2 != null) {
            return list1.val > list2.val ?
                    new ListNode(list2.val, mergeTwoLists(list1, list2.next)) :
                    new ListNode(list1.val, mergeTwoLists(list1.next, list2));
        } else {
            return list1 == null ? list2 : list1;
        }
        */
    }
}
