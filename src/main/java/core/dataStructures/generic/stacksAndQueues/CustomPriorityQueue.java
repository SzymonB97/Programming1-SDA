package core.dataStructures.generic.stacksAndQueues;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class CustomPriorityQueue<T> {

    private Queue<T> elements = new PriorityQueue<>();

    //dodanie elementu
    public void push(T element) {
        elements.add(element);
    }

    //wypisanie i usunięcie elementu ze stosu
    public T poll() {
        return elements.poll();
    }

    //wypisanie elementu
    public T peek() {
        return elements.peek();
    }

    //wypisanie wszystkich elementów i wyczyszczenie stosu
    public void clear() {
        while (!elements.isEmpty()) {
            T element = elements.poll();
            System.out.println(element);
        }
    }

    //sprawdzenie czy stos jest pusty
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    //podanie rozmiaru stosu
    public int size() {
        return elements.size();
    }

    public static void main(String[] args) {
        exampleForInteger();
        System.out.println("--------------");
        exampleForString();
    }

    private static void exampleForString() {
        CustomPriorityQueue<String> PriorityqueueString = new CustomPriorityQueue<>();
        PriorityqueueString.push("Raz");
        PriorityqueueString.push("Osiem");
        PriorityqueueString.push("Trzy");
        PriorityqueueString.push("Dziesięć");
        PriorityqueueString.push("Sto cztery");
        PriorityqueueString.push("Osiemnaście");
        System.out.println("size: " + PriorityqueueString.size());
        System.out.println("front: " + PriorityqueueString.peek());
        System.out.println("pop: " + PriorityqueueString.poll());
        System.out.println("size: " + PriorityqueueString.size());
        System.out.println("clear: ");
        PriorityqueueString.clear();
        System.out.println("isEmpty: " + PriorityqueueString.isEmpty());
        System.out.println("size: " + PriorityqueueString.size());
    }

    private static void exampleForInteger() {
        CustomPriorityQueue<Integer> PriorityQueueInteger = new CustomPriorityQueue<>();
        PriorityQueueInteger.push(1);
        PriorityQueueInteger.push(4);
        PriorityQueueInteger.push(3);
        PriorityQueueInteger.push(12);
        PriorityQueueInteger.push(8);
        PriorityQueueInteger.push(30);
        PriorityQueueInteger.push(24);
        PriorityQueueInteger.push(58);
        PriorityQueueInteger.push(100);
        PriorityQueueInteger.push(20);
        System.out.println("size: " + PriorityQueueInteger.size());
        System.out.println("front: " + PriorityQueueInteger.peek());
        System.out.println("pop: " + PriorityQueueInteger.poll());
        System.out.println("size: " + PriorityQueueInteger.size());
        System.out.println("clear: ");
        PriorityQueueInteger.clear();
        System.out.println("isEmpty: " + PriorityQueueInteger.isEmpty());
        System.out.println("size: " + PriorityQueueInteger.size());
    }
}