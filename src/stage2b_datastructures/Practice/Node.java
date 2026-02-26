package stage2b_datastructures.Practice;

public class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

    public static class LinkedList{
        Node head;
        public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        }
        public void print(){

        }
    }
    public static void main(String[] args) {
        // Write your solution here
        LinkedList list = new LinkedList();
        list.add(10);;
        list.print();

    }
}
