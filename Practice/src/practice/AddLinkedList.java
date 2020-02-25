package practice;

// { Driver Code Starts
import java.util.*;

class AddLinkedList {
    Node head;

    void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        // System.out.println("");
    }

    public void push(int new_data) {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n1 = sc.nextInt();
            AddLinkedList list1 = new AddLinkedList();
            for (int i = 1; i <= n1; i++) {
                int a = sc.nextInt();
                list1.push(a);
            }
            int n2 = sc.nextInt();
            AddLinkedList list2 = new AddLinkedList();
            for (int i = 0; i < n2; i++) {
                int b = sc.nextInt();
                list2.push(b);
            }
            AddLinkedList list3 = new AddLinkedList();
            Add g = new Add();
            Node rs = g.addTwoLists(list1.head, list2.head);
            list3.printList(rs);
            System.out.println();
            T--;
        }
    }
}// } Driver Code Ends
/*The Node is defined as
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
        Node(){}
    }
*/

class Add {

    // This function will add the numbers represented by two linked lists
    Node addTwoLists(Node first, Node second) {
        Node start = null;
        Node end = null;
        // Your code here
        if (first == null && second == null) {
            return null;
        }
        else if (first == null) {
            return second;
        } else if (second == null) {
            return first;
        }
        int carry = 0, sum;

        while (first != null || second != null) {
            int a = first!=null ? first.data : 0;
            int b = second != null ? second.data : 0;
            sum = carry + (a + b);
            carry = sum>=10 ? 1 : 0;
            sum = sum%10;
            if (start == null) {
                start = new Node(sum);
                end = start;
            } else {
                end.next = new Node(sum);
                end = end.next;
            }
            if(first != null) first = first.next;
            if(second != null) second = second.next;

        }
        if (carry>0) end.next = new Node(carry);
        return start;
    }
}