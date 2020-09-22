package Data_structure;
import java.util.*;
// single linked-list in java
public class linked_list {
// use class and treat class like struct
    private class element { // node structure
        int data;
        element next;
    }

    private class list {// list structure
        int n;
        element head, tail;
    }

    private list createList() {
        /* create list by letting n = 0 and both head and tail are all null*/
        list ls = new list();

        ls.n = 0;
        ls.head = null;
        ls.tail = null;

        return ls;
    }

    private void insert_begin(list ls, int newData) {
        // insert the element at the node 1 
        element e;
        e = new element(); // allocated a new node
        e.data = newData;

        e.next = ls.head;
        ls.head = e;//point the head to e
        if (ls.n == 0) {
            ls.tail = e;
        }
        ls.n = ls.n + 1; // increase the number of node when add more element or data
    }

    private void insert_end(list ls, int newData) {
        element e;
        if (ls.n == 0) {
            insert_begin(ls, newData);
        } else {
            e = new element();
            e.data = newData;
            e.next = null;

            ls.tail.next = e;
            ls.tail = e;
            ls.n = ls.n + 1;
        }
    }

    private void delete_begin(list ls) {
        ls.head = ls.head.next;
        if (ls.n == 1) {
            ls.tail = null;
        }
        ls.n = ls.n - 1;
    }

    private void delete_end(list ls) {
        element tmp;
        if (ls.n == 1) {
            delete_begin(ls);
        } else {
            tmp = ls.head;
            for (int i = 1; i <= ls.n - 2; i++) {
                tmp = tmp.next;
            }
            ls.tail = tmp;

            tmp = tmp.next;
            ls.tail.next = null;
            tmp = null;
            ls.n = ls.n - 1;
        }
    }

    private void displayList(list ls) {
        element e;
        e = ls.head;
        while (e != null) {
            System.out.printf("%d ", e.data);
            e = e.next;
        }
        System.out.println();
    }

    private static Scanner in; // for user input
// main driver
    public static void main(String[] args) {
        linked_list ling = new linked_list();
        list ls = ling.createList();
        in = new Scanner(System.in);
        int newData, size, i = 1, n;
        while (i != 0) {
            System.out.println("1.Enter the number at the beginning of the list.");
            System.out.println("2.Enter the number at the ending of the list.");
            System.out.println("3.Delete the number at the beginning of the list.");
            System.out.println("4.Delete the number at the ending of the list.");
            System.out.print("Enter the option: ");
            n = in.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Enter the size of the list: ");
                    size = in.nextInt();
                    for (int j = 0; j < size; j++) {
                        System.out.print("Enter the number: ");
                        newData = in.nextInt();
                        ling.insert_begin(ls, newData);
                    }
                    ling.displayList(ls);
                    break;
                case 2:
                    System.out.print("Enter the size of the list: ");
                    size = in.nextInt();
                    for (int j = 0; j < size; j++) {
                        System.out.print("Enter the number: ");
                        newData = in.nextInt();
                        ling.insert_end(ls, newData);
                    }
                    ling.displayList(ls);
                    break;
                case 3:
                    ling.delete_begin(ls);
                    ling.displayList(ls);
                    break;
                case 4:
                    ling.delete_end(ls);
                    ling.displayList(ls);
                    break;
                default:
                    System.out.println("Your input is invalid !!!!!");
                    break;
            }
        }
    }
}

    // public static void main(String[] args) {
    //     linked_list ling = new linked_list();
    //     list ls = ling.createLList();
    //     in = new Scanner(System.in);
    //     // int newData, size, i = 1, n;
    //     ling.insert_begin(ls, 12);
    //     ling.insert_begin(ls, 23);
    //     ling.insert_begin(ls, 34);
    //     ling.insert_begin(ls, 45);
    //     ling.insert_begin(ls, 56);
    //     ling.insert_begin(ls, 67);
    //     ling.insert_begin(ls, 78);
    //     ling.insert_begin(ls, 89);
    //     ling.insert_begin(ls, 90);
    //     ling.displayList(ls);
    //     System.out.println();
    //     ling.insert_end(ls, 100);
    //     ling.displayList(ls);
    //     System.out.println();
    //     ling.delete_begin(ls);
    //     ling.displayList(ls);
    //     System.out.println();
    //     ling.delete_end(ls);
    //     ling.displayList(ls);

    // }