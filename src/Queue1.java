import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue=new ArrayDeque<>();
        queue.push(10);
        queue.offer(12);
        queue.offer(88);
        System.out.println(queue);
        Queue<Integer> queue1=new PriorityQueue<>();
        queue1.offer(10);
        queue1.offer(12);
        queue1.offer(88);
        System.out.println(queue1);

        Queue<Integer> queue2=new PriorityQueue<>();
        queue2.offer(10);
        queue2.offer(12);
        queue2.offer(88);
        System.out.println(queue2);
    }
}
