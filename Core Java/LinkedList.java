
class Node {
  int data;
  Node next;
}

class LinkList {
  Node head;

  public void insert(int data) {
    Node node = new Node();
    node.data = data;
    node.next = null;

    if (head == null)
      head = node;
    else {
      Node n = head;
      while (n.next != null) {
        n = n.next;
      }
      n.next = node;
    }
  }

  public void insertAtStart(int data) {
    Node node = new Node();
    node.data = data;
    node.next = null;
    node.next = head;
    head = node;

  }

  public void insertAt(int index, int data) {
    Node node = new Node();
    node.data = data;
    node.next = null;
    if (index == 0)
      insertAtStart(data);
    else {
      Node n = head;
      for (int i = 0; i < index - 1; i++) {
        n = n.next;
      }
      node.next = n.next;
      n.next = node;
    }
  }

  public void deleteAt(int index) {
    if (index == 0)
      head = head.next;
    else {
      Node n = head;
      Node n1 = null;
      for (int i = 0; i < index - 1; i++)
        n = n.next;
      n1 = n.next;
      n.next = n1.next;
      // System.out.println("n1 " + n1.data);
      n1 = null;
    }
  }

  public void show() {
    Node node = head;
    while (node.next != null) {
      System.out.print(node.data + " ");
      node = node.next;
    }
    System.out.print(node.data);
  }
}

public class LinkedList {

  public static void main(String[] args) {
    LinkList list = new LinkList();
    list.insert(56);
    list.insert(65);
    list.insert(75);
    list.insert(35);
    list.insert(58);
    list.insertAtStart(99);
    list.insertAt(0, 111);

    list.deleteAt(3);

    list.show();

  }
}
