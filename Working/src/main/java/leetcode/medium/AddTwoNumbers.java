package leetcode.medium;

import leetcode.medium.support.ListNode;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer;
        int dec;
        int sum = l1.val + l2.val;
        dec = sum / 10;
        answer = new ListNode(sum % 10, addTwoNumbersRecursive(l1.next, l2.next, dec));
        return answer;
    }

    private ListNode addTwoNumbersRecursive(ListNode l1, ListNode l2, int dec) {
        if (l1 == null && l2 == null) {
            if (dec == 0) {
                return null;
            }
            return new ListNode(dec);
        }
        if (l1 == null) {
            int sum = (l2.val + dec);
            dec = sum / 10;
            return new ListNode(sum % 10, addTwoNumbersRecursive(null, l2.next, dec));
        }
        if (l2 == null) {
            int sum = (l1.val + dec);
            dec = sum / 10;
            return new ListNode(sum % 10, addTwoNumbersRecursive(l1.next, null, dec));
        }
        int sum = (l1.val + l2.val + dec);
        dec = sum / 10;
        return new ListNode(sum % 10, addTwoNumbersRecursive(l1.next, l2.next, dec));
    }
}
