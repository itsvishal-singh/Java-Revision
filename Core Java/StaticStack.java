class Stack {
  int[] stack = new int[5];
  int top = 0;

  public void push(int data) {
    if (top == 5)
      System.out.println("Stack Is Full");
    else {
      stack[top] = data;
      top++;
    }
  }

  public int pop() {
    int data = 0;
    if (isEmpty())
      System.out.println("Stack is Empty");
    else {
      top--;
      data = stack[top];
      stack[top] = 0;
    }
    return data;

  }

  public int peek() {
    int data;
    data = stack[top - 1];
    return data;
  }

  public int size() {
    return top;
  }

  public boolean isEmpty() {
    return top <= 0;
  }

  public void show() {
    for (int n : stack)
      System.out.print(n + " ");
    System.out.println();
  }

}

public class StaticStack {
  public static void main(String[] args) {
    Stack nums = new Stack();
    nums.push(15);
    nums.show();
    nums.push(49);
    nums.show();
    // System.out.println(nums.peek());
    nums.push(67);
    nums.show();

    // System.out.println(nums.pop());
    // System.out.println("Size is : " + nums.size());
    // System.out.println("Empty : " + nums.isEmpty());
    nums.show();
    System.out.println(nums.pop());
    // System.out.println(nums.pop());
    // System.out.println(nums.pop());
    // System.out.println(nums.pop());
  }
}
