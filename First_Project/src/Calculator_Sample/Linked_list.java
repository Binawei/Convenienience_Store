
package Calculator_Sample;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Linked_list {
    Node head;

    public Linked_list() {
        this.head = null;
    }
    public void Beg_add(int data)
    {
        Node new_Node = new Node(data);
        new_Node.next = head;
        head = new_Node;
    }

    public void Add_end(int data)
    {
        Node new_node = new Node(data);
        if (head == null)
        {
            head = new_node;
        }
        Node temp = head;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = new_node;
    }

    public void Add_idx(int x, int data) {
        Node new_Node = new Node(data);
        Node temp = head;
        if (x < 0) {
            return;
        } else if (x == 0) {
            new_Node.next = head;
            head = new_Node;
            return;
        }
        for (int count = 0; count < x - 1; count++) {
            temp = temp.next;
        }
        new_Node.next = temp.next;
        temp.next = new_Node;
    }

    public void Print_list() {
        Node temp = head;
        while (temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println();

    }
    public static void  main(String[] args)
    {
        Linked_list new_Node = new Linked_list();
        new_Node.Beg_add(9);
        new_Node.Beg_add(8);
        new_Node.Beg_add(6);
        new_Node.Add_end(45);
        new_Node.Add_idx(4, 89);
        new_Node.Add_end(76);
        new_Node.Add_end(32);
        new_Node.Print_list();
        System.out.println("Migrating into DOUBLY_LINKED_LIST");
        System.out.println();
        Doubly_Linked my_node = new Doubly_Linked();
        DLL_Node MB = new DLL_Node(56);
        my_node.Insert_at_Beginning(56);
        my_node.Insert_at_Beginning(67);
        my_node.Insert_at_Beginning(74);
        my_node.Insert_at_Beginning(45);
        my_node.Insert_at_Last(657);
        //my_node.insert_After(89);
        my_node.Print_DLL();
    }
}

