package practice;

public class FindMiddle {

    int getMiddle(Node head) {
        int middle;
        Node second = head;
        while (second !=  null && second.next != null) {
            head = head.next;
            second = second.next.next;
         }
        return head.data;
    }
}
