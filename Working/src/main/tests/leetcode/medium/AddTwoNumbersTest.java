package leetcode.medium;

import leetcode.medium.support.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

class AddTwoNumbersTest {
    @Test
    void addTwoNumbers() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode l1 = new ListNode(5);
        l1.next = new ListNode(6);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(3);
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        ListNode answer = new ListNode(7);
        answer.next = new ListNode(0);
        answer.next.next = new ListNode(8);

        while (result != null && answer != null) {
            assertEquals(answer.val, result.val);
            answer = answer.next;
            result = result.next;
        }
        assertNull(result);
    }

    @Test
    void addTwoNumbersZero() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        ListNode answer = new ListNode(0);

        while (result != null && answer != null) {
            assertEquals(answer.val, result.val);
            answer = answer.next;
            result = result.next;
        }
        assertNull(result);
    }

    @Test
    void addTwoNumbersNines() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(6);
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        ListNode answer = new ListNode(8);
        answer.next = new ListNode(7);

        while (result != null && answer != null) {
            assertEquals(answer.val, result.val);
            answer = answer.next;
            result = result.next;
        }
        assertNull(result);
    }
}
