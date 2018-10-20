package core.dataStructures.generic.stacksAndQueues;

import java.util.LinkedList;

class CustomQueue<T> {

    private LinkedList<T> elements = new LinkedList<>();

    //dodanie elementu
    public void push(T element) {
        elements.addLast(element);
    }

    //wypisanie i usunięcie elementu ze stosu
    public T pop() {
        return elements.removeFirst();
    }

    //wypisanie elementu
    public T front() {
        return elements.getFirst();
    }

    //wypisanie wszystkich elementów i wyczyszczenie stosu
    public void clear() {
        while (!elements.isEmpty()) {
            T element = elements.pop();
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
/*        System.out.println("--------------");
        exampleForString();*/
    }

    private static void exampleForString() {
        CustomQueue<String> queueString = new CustomQueue<>();
        queueString.push("Raz");
        queueString.push("Dwa");
        queueString.push("Trzy");
        System.out.println("size: " + queueString.size());
        System.out.println("front: " + queueString.front());
        System.out.println("pop: " + queueString.pop());
        System.out.println("size: " + queueString.size());
        System.out.println("clear: ");
        queueString.clear();
        System.out.println("isEmpty: " + queueString.isEmpty());
        System.out.println("size: " + queueString.size());
    }

    private static void exampleForInteger() {
        CustomQueue<Integer> queueInteger = new CustomQueue<>();
        queueInteger.push(1);
        queueInteger.push(2);
        queueInteger.push(3);
        System.out.println("size: " + queueInteger.size());
        System.out.println("front: " + queueInteger.front());
        System.out.println("pop: " + queueInteger.pop());
        System.out.println("size: " + queueInteger.size());
        System.out.println("clear: ");
        queueInteger.clear();
        System.out.println("isEmpty: " + queueInteger.isEmpty());
        System.out.println("size: " + queueInteger.size());
    }
}