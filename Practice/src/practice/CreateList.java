package practice;

import java.util.Scanner;

public class CreateList
{
    Node head;  // head of list
    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = node;
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        while(t>0)
        {
            int n = sc.nextInt();
            CreateList llist = new CreateList();
            //int n=Integer.parseInt(br.readLine());
            int a1=sc.nextInt();
            Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }

            FindMiddle gfgobj = new FindMiddle();
            //llist.head = new GFG().Middle(llist.head);
            System.out.println(gfgobj.getMiddle(llist.head));

            //llist.printList();

            t--;
        }
    }
}
