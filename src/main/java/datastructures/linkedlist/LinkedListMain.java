package datastructures.linkedlist;

class LinkedList {

  public static void main(String[] args) {
    LinkedListOperations operations = new LinkedListOperations();
    try {
      operations.addNode(1);
      operations.addNode(2);
      operations.addNode(3);
      operations.addNode(4);
      operations.printList();
      operations.deleteNode(2);
      operations.printList();
    } catch (NullPointerException ex) {
      System.out.println("LinkedList is Empty ");
    }
  }
}

