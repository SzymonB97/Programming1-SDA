package core.dataStructures.generic.lists;

public class CustomLinkedList<T> {

    private CustomLinkedList<T> next;
    private CustomLinkedList<T> prev;

    private T value;
    private int size;

    public CustomLinkedList(T value) {
        this.value = value;
        size = 0;
        next = prev = null;
    }

    public void add(CustomLinkedList<T> newElement) {
        CustomLinkedList last = this; //this - pierwszy element
        while (last.next != null) {
            last = last.next;
        }

        last.next = newElement;
        newElement.prev = last;
        size++;
    }

    public void add(CustomLinkedList<T> newElement, int index) {
        CustomLinkedList last = this;
        int listIndex = 0;
        while (last.next != null) {
            if(listIndex == index + 1){
                break;
            }
            last = last.next;
            listIndex++;
        }

        newElement.prev = last;
        newElement.next = last.next;
        last.next.prev = newElement;
        last.next = newElement;
        size++;
    }

    public CustomLinkedList<T> remove(T valueToRemove) {
        size--;
        if (this.value == valueToRemove) {
            return this.next;
        }

        CustomLinkedList toRemove = this.next;
        while (toRemove != null) {
            if (toRemove.value == valueToRemove) {
                toRemove.prev.next = toRemove.next;
                if (toRemove.next != null) {
                    toRemove.next.prev = toRemove.prev;
                }

                return this;
            }
            toRemove = toRemove.next;
        }

        return this;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void print() {
        CustomLinkedList temp = this;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public CustomLinkedList get(int index) {
        CustomLinkedList temp = this;
        int listIndex = 0;
        while (temp != null) {
            if (listIndex == index) {
                return temp;
            }
            temp = temp.next;
            listIndex++;
        }
        return null;
    }

    public static void main(String[] args) {

        CustomLinkedList<Integer> head = new CustomLinkedList<>(1);

        head.add(new CustomLinkedList<>(2));
        head.add(new CustomLinkedList<>(3));
        head.add(new CustomLinkedList<>(4));

        head = head.remove(2);
        head = head.remove(3);

        head.print();
    }
}