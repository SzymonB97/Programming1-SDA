package core.dataStructures.generic.stacksAndQueues;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueWithComparator<T> {
    private Queue<T> elements = new PriorityQueue<T>();

    public QueueWithComparator() {

    }

    public QueueWithComparator(Comparator comparator) {
        elements = new PriorityQueue<T>(comparator);
    }

    public void push(T element) {
        elements.add(element);
    }

    public T pop() {
        return elements.poll();
    }

    public T peek() {
        return elements.peek();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }

    public void clear() {
        while (!elements.isEmpty()) {
            T element = pop();
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        //ustawić żeby dodawało randomy
        QueueWithComparator<Integer> queue1 = new QueueWithComparator<>(getNumberComparator());
        queue1.push(1);
        queue1.push(20);
        queue1.push(15);
        queue1.push(16);
        queue1.clear();

    }

    private static Comparator<Integer> getNumberComparator() {
        return new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                if (o1 % 2 == o2 % 2) {
                    return o1 < o2 ? -1 : 1;
                }

                if (o1 % 2 == 0) {
                    return -1;
                }

                if (o2 % 2 == 0) {
                    return 1;
                }


                return 0;
            }
        };
    }
}