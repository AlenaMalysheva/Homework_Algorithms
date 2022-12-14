import Homework.Queue;

public class Main {

    private static final int count = 100;

    public static void main(String[] args) {
        // Начинается алгоритм решения задачи
        Queue queue1 = new Queue(); // [a, b]
        Queue queue2 = new Queue(); // > b
        int a = -20;
        int b = 30;
        for (int i = 0; i < count; i++) {
            //int number = getNumberFromNet();
            int number = (int) (200 * Math.random() - 100);
            if (number < a) {
                System.out.println(number);
            } else if (number >= a && number <= b) {
                queue1.add( number);
            } else {
                // > b
                queue2.add(number);
            }
        }
        // Выводим числа [a, b]
        while (!queue1.isEmpty()) {
            System.out.println(queue1.delete());
        }
        // Вывод чисел > b
        while (!queue2.isEmpty()) {
            System.out.println(queue2.delete());
        }

        // реализация второй задачи(deque)
        Queue queue = new Queue();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        while (!queue.isEmpty()) {
            System.out.println(queue.delete());
        }
        System.out.println(queue.isEmpty());
    }
}

