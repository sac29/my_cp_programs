package practice;

// { Driver Code Starts
import java.util.*;




public class DeleteNode
{
    static Node head;
    static List<Integer> list = new ArrayList<>();

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            addToTheLast(head);
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                addToTheLast(new Node(a));
            }

            int k = sc.nextInt();
            compute(head);
            printList();
            System.out.println();
        }
    }

    public static void addToTheLast(Node node)
    {
        if(head == null)
        {
            head = node;
        }
        else
        {
            Node temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }
    /* Function to print linked list */
    static void printList()
    {
//        Node temp = head;
//        while (temp != null)
//        {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//        System.out.println();

        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.printf(listIterator.next() + " ");
        }
    }

    /* Drier program to test above functions */

    public static void compute(Node  head)
    {
        Node temp = head;
        if (temp == null) {
            return;
        }

        while (temp.next != null) {
            if (temp.data < temp.next.data) {
                list.add(temp.next.data);
            }
            temp = temp.next;
        }
    }
}

class LNode
{

    int data;
    Node next;

    LNode(int d)
    {
        data = d;
        next = null;
    }
}

