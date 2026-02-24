package stage2b_datastructures.singlyLinkedList;

class LinkedList{
    Node head;
    Node tail;
    public void insertAtHead(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
   }

   public void insertAtTail(int val){
        Node newNode = new Node(val);

        if(head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
   }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtTail(15);
        list.insertAtTail(1);

        list.display();


    }
}