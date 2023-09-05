package org.example;

class ListNode {
    int val;          // �������� (������) ����
    ListNode next;    // ������ �� ��������� ���� � ������

    ListNode(int val) {
        this.val = val;
    }
}

public class Task3 {
    public static void main(String[] args) {
        // ������� �������� ����������� ������
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.println("�������� ������:");
        printList(head);

        // ����������� ������
        ListNode reversedHead = reverseList(head);

        System.out.println("��������������� ������:");
        printList(reversedHead);
    }

    // ����� ��� �������� ������
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;   // ���������� ����, ���������� null
        ListNode current = head; // ������� ����, ���������� � ��������� ����

        // �������� �� ������, ����� ������ �����
        while (current != null) {
            ListNode nextTemp = current.next; // ��������� ���������� ��� �������� ���������� ����
            current.next = prev;              // ����������� ������ �������� ����
            prev = current;                   // ����������� prev �� ������� ����
            current = nextTemp;               // ����������� current �� ��������� ����
        }

        return prev; // ����� �������� ���� ������ (������ ��������� ����)
    }

    // ����� ��� ������ ������
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " "+(current.next == null ? "null":current.next.val) +"  "); // ������� �������� �������� ����
            current = current.next;                                                                     // ��������� � ���������� ����
        }
        System.out.println();
    }
}
