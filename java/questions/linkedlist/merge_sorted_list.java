package questions.linkedlist;

public class merge_sorted_list {

    node head;

    static class node {

        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void append(int data) {

        node newnode = new node(data);

        if (head == null) {
            head = newnode;
            return;
        }

        node last = head;

        while (last.next != null) {
            last = last.next;
        }

        last.next = newnode;
    }

    public void display(node head) {

        node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public node merge(node l1, node l2) {

        // Fake starting node
        node dummy = new node(-1);

        // Points to last node of merged list
        node tail = dummy;

        while (l1 != null && l2 != null) {

            if (l1.data <= l2.data) {

                tail.next = l1;
                l1 = l1.next;

            } else {

                tail.next = l2;
                l2 = l2.next;
            }

            tail = tail.next;
        }

        // Attach remaining nodes
        if (l1 != null) {
            tail.next = l1;
        }

        if (l2 != null) {
            tail.next = l2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        merge_sorted_list list1 = new merge_sorted_list();

        list1.append(1);
        list1.append(3);
        list1.append(5);

        merge_sorted_list list2 = new merge_sorted_list();

        list2.append(2);
        list2.append(4);
        list2.append(6);

        node mergedHead = list1.merge(list1.head, list2.head);

        System.out.println("Merged List:");

        list1.display(mergedHead);
    }
}