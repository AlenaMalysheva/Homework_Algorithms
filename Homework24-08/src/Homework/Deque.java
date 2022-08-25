package Homework;

public class Deque {

    private DequeItem head = null;

    private DequeItem tail = null;

    private static class DequeItem {
        int value;
        // указатель ссылка на следующий элемент
        DequeItem next;
        // указатель ссылка на предыдущий
        DequeItem previous;
    }

    public void addFirst(int item) {
        DequeItem temp = new DequeItem();
        temp.value = item;
        if (isEmpty()) {
            head = temp; // если дек пуст то добавленный эл он же и голова и хвост
            tail = temp;
        } else {
            //связать предыдущий эл с добавленым
            head.previous = temp;
            //связать добавленный эл с предыдущим
            temp.next = head;
            // head сместили на добавленный элемент
            head = temp;
        }
    }

    public void addLast(int item) {
        DequeItem temp = new DequeItem();
        temp.value = item;
        if (isEmpty()) {
            head = temp;
        } else {
            //связать следующий эл с добавленым
            tail.next =temp;
            temp.previous = tail;

        }
        tail = temp ;
    }

    public int deleteFirst() {
        int value = head.value;
        head = head.next; // сместили голову вправо после удаление старой гловы
        if (head == null) {
            tail = null;
        } else {
            head.previous = null;
        }
        return value;
    }

    public int deleteLast() {
        int value = tail.value;
        tail = tail.previous;
        if (tail == null) {
            head = null;
        } else {
            tail.next = null;
        }
        return value;
    }

    public boolean isEmpty() {
        return head == null;
    }
}

