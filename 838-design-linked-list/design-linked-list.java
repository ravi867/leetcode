class MyLinkedList {
    Node head;
    int size;
    public class Node{
        Node next;
        int val;
        Node(int val){
            this.val = val;
        }
    }

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }
    
    public int get(int index) {
        Node node = head;
        if(index >= size) return -1;
        while(index != 0){
            node = node.next;
            index--;
        }
        return node.val;
    }
    
    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;
    }
    
    public void addAtTail(int val) {
        if(head == null) addAtHead(val);
        else{
            Node node = new Node(val);
            Node temp = head; 
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
            size++;
        }
    }
    
    public void addAtIndex(int index, int val) {
        if(index > size) return;
        if(index == 0) addAtHead(val);
        else{
            Node temp = head;
            Node prev = null;
            while(index > 0){
                prev = temp;
                temp = temp.next;
                index--;
            }
            Node node = new Node(val);
            prev.next = node;
            node.next = temp; 
            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index >= size) return;
        if(index == 0) {
        	head = head.next;
        	size--;
        }
        else {
            Node temp = head;
            Node prev = null;
            while(index > 0){
                prev = temp;
                temp = temp.next;
                index--;
            }
            prev.next = temp.next;
            size--;
        }
    }
}