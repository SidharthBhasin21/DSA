package LinkedList.RemoveDuplicatefromList;

public class RemoveDuplicatefromList {
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {

        ListNode origin = head;
        ListNode temp = head;
        ListNode newHead = null;
        
        while(origin != null){
            while(origin.next != null && origin.val == origin.next.val ){
               origin  = origin.next;
            }
            if(newHead == null) newHead = temp = origin;
            else {
                temp.next = origin;
                temp = origin;
            }
            origin = origin.next;
        }
        return newHead;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
            val = 0;
            next = null;
        }

        ListNode(int val) {
            this.val = val;
            next = null;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
