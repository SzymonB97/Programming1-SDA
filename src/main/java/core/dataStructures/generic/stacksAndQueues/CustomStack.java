package core.dataStructures.generic.stacksAndQueues;

import java.util.LinkedList;

class CustomStack<T> {

    private LinkedList<T> elements = new LinkedList<>();

    //dodanie elementu
    public void push(T element) {
        elements.addFirst(element);
    }

    //wypisanie i usunięcie elementu ze stosu
    public T pop() {
        return elements.removeFirst();
    }

    //wypisanie elementu
    public T pick() {
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
        System.out.println("--------------");
        exampleForString();
    }

    private static void exampleForString() {
        CustomStack<String> stackString = new CustomStack<>();
        stackString.push("Raz");
        stackString.push("Dwa");
        stackString.push("Trzy");
        System.out.println("size: " + stackString.size());
        System.out.println("pick: " + stackString.pick());
        System.out.println("pop: " + stackString.pop());
        System.out.println("size: " + stackString.size());
        System.out.println("clear: ");
        stackString.clear();
        System.out.println("isEmpty: " + stackString.isEmpty());
        System.out.println("size: " + stackString.size());
    }

    private static void exampleForInteger() {
        CustomStack<Integer> stackInteger = new CustomStack<>();
        stackInteger.push(1);
        stackInteger.push(2);
        stackInteger.push(3);
        System.out.println("size: " + stackInteger.size());
        System.out.println("pick: " + stackInteger.pick());
        System.out.println("pop: " + stackInteger.pop());
        System.out.println("size: " + stackInteger.size());
        System.out.println("clear: ");
        stackInteger.clear();
        System.out.println("isEmpty: " + stackInteger.isEmpty());
        System.out.println("size: " + stackInteger.size());
    }
}
