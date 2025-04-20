package renu.gusain.linklist;

public class LeetCode86 {
    public ListNode partition(ListNode head, int x) {

            ListNode beforeHead = new ListNode(0); // Dummy node for less-than-x list
            ListNode afterHead = new ListNode(0);  // Dummy node for greater/equal list

            ListNode before = beforeHead;
            ListNode after = afterHead;

            while (head != null) {
                if (head.val < x) {
                    before.next = head;
                    before = before.next;
                } else {
                    after.next = head;
                    after = after.next;
                }
                head = head.next;
            }

            after.next = null;        // End of after list
            before.next = afterHead.next;  // Link two partitions

            return beforeHead.next;
        }

    }


