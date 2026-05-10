class AQueue {
  int[] AQueue = new int[5];
  int size;
  int front;
  int rear;

  public void enQueue(int data) {
    if (!isFull()) {

      AQueue[rear] = data;
      rear = (rear + 1) % 5;
      size = size + 1;
    } else
      System.out.println("Queue is Full ");
  }

  public void show() {
    System.out.print("Elements : ");
    for (int i = 0; i < size; i++)
      System.out.print(AQueue[(front + i) % 5] + " ");
    System.out.println();

    for (int n : AQueue)
      System.out.print(n + " ");
    System.out.println();
  }

  public int deQueue() {
    int data = AQueue[front];
    if (!isEmpty()) {
      front = (front + 1) % 5;
      size = size - 1;
    } else
      System.out.println("Queue is Empty");
    return data;
  }

  public int getSize() {
    return size;
  }

  public boolean isEmpty() {
    return getSize() == 0;
  }

  public boolean isFull() {
    return getSize() == 5;
  }
}

public class QueueArray {
  public static void main(String[] args) {
    AQueue aQueue = new AQueue();
    aQueue.enQueue(5);
    aQueue.enQueue(2);
    aQueue.enQueue(7);
    aQueue.enQueue(9);
    aQueue.show();
    aQueue.deQueue();
    aQueue.deQueue();
    aQueue.enQueue(22);
    aQueue.enQueue(52);

    aQueue.show();
    System.out.println(aQueue.isEmpty());
    System.out.println(aQueue.isFull());
    System.out.println("Size : " + aQueue.getSize());
    aQueue.show();
  }
}
