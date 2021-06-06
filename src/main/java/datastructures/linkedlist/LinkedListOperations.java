package datastructures.linkedlist;

public class LinkedListOperations {
  Node head;

  void printMiddle() {
    Node slowPointer = head;
    Node fastPointer = head;

    if (head != null) {
      while (fastPointer != null && fastPointer.next != null) {
        fastPointer = fastPointer.next.next;
        slowPointer = slowPointer.next;
      }
      System.out.println("Middle Element is : " + slowPointer.data);
    }
  }

  void addNode(int data) {
    if (head == null) {
      head = new Node(data, null);
    } else {
      Node temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = new Node(data, null);
    }
  }

  void deleteNode(int index) throws NullPointerException {
    Node temp = head;
    int i = 0;
    if (head != null) {
      while (i < index - 1) {
        temp = temp.next;
        i++;
      }
      temp.next = temp.next.next;
    } else if(head == null) {
      throw new NullPointerException();
    }
    else {
      head = null;
    }
  }

  void push(int newData) {
    head = new Node(newData, head);
  }

  void printList() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " => ");
      temp = temp.next;
    }
    System.out.println("NULL");
  }
}
