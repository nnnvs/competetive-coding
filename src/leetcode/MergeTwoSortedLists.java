package leetcode;

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode firstNode = new ListNode();
        ListNode nextNode = new ListNode();
        ListNode nextNode2 = new ListNode();
        int flag=0;

        if(l1==null  && l2==null){
            return l1;
        }

        while(l1!=null || l2!=null){

            if(flag==0) {
                if(l1!=null && l2!=null) {
                    if (l1.val <= l2.val) {
                        firstNode.val = l1.val;
                        l1 = l1.next;
                    } else {
                        firstNode.val = l2.val;
                        l2 = l2.next;
                    }
                    firstNode.next = nextNode;

                } else if(l1==null) {
                    firstNode.val = l2.val;
                    l2 = l2.next;
                    if(l2!=null){
                        firstNode.next = nextNode;
                    }
                } else if(l2==null) {
                    firstNode.val = l1.val;
                    l1 = l1.next;
                    if(l1!=null){
                        firstNode.next = nextNode;
                    }
                }


                flag++;
            } else {

                if(l1!=null && l2!=null) {

                    if (l1.val <= l2.val) {
                        nextNode.val = l1.val;
                        l1 = l1.next;
                    } else {
                        nextNode.val = l2.val;
                        l2 = l2.next;
                    }

                    nextNode2 = new ListNode();
                    nextNode.next = nextNode2;
                    nextNode = nextNode2;

                } else if(l1==null) {
                    nextNode.val = l2.val;
                    l2 = l2.next;

                    if(l2!=null){
                        nextNode2 = new ListNode();
                        nextNode.next = nextNode2;
                        nextNode = nextNode2;
                    }
                } else if(l2==null) {
                    nextNode.val = l1.val;
                    l1 = l1.next;
                    if(l1!=null){
                        nextNode2 = new ListNode();
                        nextNode.next = nextNode2;
                        nextNode = nextNode2;
                    }
                }
            }
        }

        return firstNode;
    }

    public static void main(String[] args) {

    }
}
