package lt.bit.java.day5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

class FIFOvsLIFO {

  public static void main(String[] args) {
    //FIFO
    System.out.println("FIFO");
    Queue<Integer> queue = new ArrayBlockingQueue<>(20);
    queue.add(100);
    queue.add(99);
    queue.add(125);
    queue.offer(125);
    System.out.println(queue);

    Integer peek = queue.peek();
    System.out.println("peek(): " + peek);
    System.out.println(queue);

    System.out.println("poll(): " + queue.poll());
    System.out.println(queue);

    //LIFO
    System.out.println("LIFO");
    Deque<Integer> stack = new ArrayDeque<>();
    stack.push(100);
    stack.push(99);
    stack.push(125);
    stack.push(125);
    System.out.println(stack);
    System.out.println("peek():" + stack.peek());
    System.out.println(stack);
    System.out.println("pop():" + stack.pop());
    System.out.println(stack);
  }
}
