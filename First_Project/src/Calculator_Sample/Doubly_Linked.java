package Calculator_Sample;
class DLL_Node {
    DLL_Node next;
    DLL_Node prev;
    int data;

    public DLL_Node(int data) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}

public class Doubly_Linked {
    DLL_Node head = null; // the first node of the linked list
    DLL_Node tail = null; // the last node of the linked list

    public Doubly_Linked() {
        this.head = head;
        this.tail = tail;
    }

    public void Insert_at_Beginning(int data) {
        DLL_Node New_node = new DLL_Node(data);
        //check if head is null that is if  the list is empty
        if (head == null) {
            head = tail = New_node;
            head.prev = null;
            tail.next = null;
        } else {
            New_node.next = head;
            New_node.prev = null;
            head.prev = New_node;
            head = New_node;
        }
    }
    public void Insert_at_Last(int data)
    {
        DLL_Node New_node = new DLL_Node(data);
        DLL_Node temp = head;
        if (head == null)
        {
            head = tail = New_node;
            head.prev = null;
            tail.next = null;
        }
        else {
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = New_node;
            New_node.prev = temp;
        }
    }
    public void insert_After(DLL_Node PTR, int data)
    {
        DLL_Node Nd = new DLL_Node(data);
        if (PTR == null)
        {
            System.out.println("Previous node cannot be null");
            return;
        }
        Nd.prev = PTR;
        Nd.next = PTR.next;
        if (PTR.next != null) {
            PTR.next.prev = Nd;
        }
        PTR.next = Nd;
    }


    public void Print_DLL() {
        DLL_Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
            System.out.print(" ");
        }
        System.out.println();
    }
}
