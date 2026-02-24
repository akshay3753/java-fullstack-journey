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
        Node temp = head;
        if(temp == null){
            head = newNode;
            return;
        }
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

    public void delete(int val) {
        if (head == null) return;

        // If head needs to go
        if (head.data == val) {
            head = head.next;
            return;
        }

        Node temp = head;
        // Stop at the node BEFORE the one we want to delete
        while (temp.next != null && temp.next.data != val) {
            temp = temp.next;
        }

        // If we found the target, skip it
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -- > ");
            temp = temp.next;
        }
    }


    public static void main(String[] args) {
    LinkedListPrac list = new LinkedListPrac();
    list.insertAtHead(10);
    list.insertAtHead(20);
    list.insertAtHead(30);
    System.out.println("Is 20 there? " + list.search(20));
    list.delete(20);
    list.display();
//    list.insertAtTail(5);
//    list.insertAtTail(35);
//    list.display();
    }
}