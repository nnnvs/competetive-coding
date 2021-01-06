package leetcode;

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode l4 = new ListNode(5);
        ListNode l3 = new ListNode(4,l4);
        ListNode l2 = new ListNode(3,l3);
        ListNode l1 = new ListNode(2,l2);
        ListNode head = new ListNode(1,l1);

        System.out.println(reverseList(head).val);
    }
}
