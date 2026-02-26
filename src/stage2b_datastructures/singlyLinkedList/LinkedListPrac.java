package stage2b_datastructures.singlyLinkedList;

public class LinkedListPrac {

    Node head;

    public void insertAtHead(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtTail(int val){
        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
            return;
        }
        Node temp  = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public boolean search(int target){
        Node temp = head;
        while (temp != null){
            if(temp.data == target){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void deleteByValue(int target) {
        // 1. Handle Empty List
        Node temp = head;
            if(head == null){
                return;
            }
        // 2. Handle Head being the target
            if(temp.data == target){

            }
        // 3. Handle Middle/End (The Loop)
        // Hint: while (curr.next != null) { ... }
        while (temp.next != null && temp.next.data != target){

        }
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " - - > ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LinkedListPrac list = new LinkedListPrac();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtTail(5);
        list.insertAtTail(15);
        list.deleteByValue(30);
        System.out.println(list.search(15));
        list.display();
    }
}