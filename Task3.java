package org.example;

class ListNode {
    int val;          // Значение (данные) узла
    ListNode next;    // Ссылка на следующий узел в списке

    ListNode(int val) {
        this.val = val;
    }
}

public class Task3 {
    public static void main(String[] args) {
        // Создаем исходный односвязный список
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.println("Исходный список:");
        printList(head);

        // Инвертируем список
        ListNode reversedHead = reverseList(head);

        System.out.println("Инвертированный список:");
        printList(reversedHead);
    }

    // Метод для инверсии списка
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;   // Предыдущий узел, изначально null
        ListNode current = head; // Текущий узел, начинается с головного узла

        // Проходим по списку, меняя ссылки узлов
        while (current != null) {
            ListNode nextTemp = current.next; // Временная переменная для хранения следующего узла
            current.next = prev;              // Инвертируем ссылку текущего узла
            prev = current;                   // Передвигаем prev на текущий узел
            current = nextTemp;               // Передвигаем current на следующий узел
        }

        return prev; // Новый головной узел списка (бывший последний узел)
    }

    // Метод для вывода списка
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " "+(current.next == null ? "null":current.next.val) +"  "); // Выводим значение текущего узла
            current = current.next;                                                                     // Переходим к следующему узлу
        }
        System.out.println();
    }
}
