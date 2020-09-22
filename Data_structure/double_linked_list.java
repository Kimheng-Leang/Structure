package Data_structure;
import java.util.*;
// create double linked-list using java programming language (difficult than C/C++)
// use class instead of struct (there is no keyword struct, only class)
public class double_linked_list { 
    /**
     * node
     */
    // treat class like struct (for structure purpose only)
    private class node { // structure for node 
        int data;
        node prev, next;
    }

    /**
     * list
     */
    private class list { // structure for list
        int n;
        node head, tail;
    }
    
    private list createList() { // create list 
        list ls = new list();

        ls.n = 0;
        ls.head = null;
        ls.tail = null;

        return ls;
    }
    
    private void insertBegin(list ls, int newData) {
        node e = new node();// create new element
        e.data = newData;
        e.next = ls.head;
        e.prev = null;
        //update tail
        if (ls.n == 0) {
            ls.tail = e;
        }
        //update head
        if (ls.n != 0) {
            ls.head.prev = e;
        }
        ls.head = e;
        ls.n = ls.n + 1;
    }

    private void insertEnd(list ls, int newData) {
        if (ls.n == 0) {
            insertBegin(ls, newData);
        } else {
            node e = new node();// create new element
            e.data = newData;// update data
            e.next = null;

            e.prev = ls.tail;
            ls.tail.next = e;
            ls.tail = e;

            ls.n = ls.n + 1;
        }
    }

    private void insertAnyPosition(list ls, int newData, int position) {
        // insert the element at the specific node
        node tmp = new node();
        tmp = ls.head;
        int i = 1;
        // find the requirement position that will insert the element
        while (i < position - 1 && tmp != null) { 
            tmp = tmp.next;
            i++;
        }
        // condition for input the element
        if (position == 1) {
            insertBegin(ls, newData);
        } else if (tmp == ls.tail) {
            insertEnd(ls, newData);
        } else if (tmp != null) {
            node e = new node(); // create new element 
            e.data = newData; // update data
            e.next = tmp.next;
            e.prev = tmp;

            if (tmp.next != null) {
                tmp.next.prev = e;
            }
            tmp.next = e;

            ls.n = ls.n + 1;
        }
    }

    private void deleteBegin(list ls) { // delete the first node
        if (ls.head == null) {
            System.out.print("The list is empty.");
        } else {
            ls.head = ls.head.next;
            ls.head.prev = null;
            
            ls.n = ls.n - 1;
        }
    }

    private void deleteEnd(list ls) { // delete the last node
        if (ls.tail == null) {
            System.out.print("The list is empty.");
        } else {
            ls.tail = ls.tail.prev;
            ls.tail.next = null;

            ls.n = ls.n - 1;
        }
    }

    private void deleteAnyPosition(list ls, int position) { // delete the node in specific position
        node cur;
        cur = ls.head;
        // find the position that will be delete
        for (int i = 0; i < position - 1 && cur != null; i++) { 
            if (cur != null) {
                cur = cur.next;
            }
        }
        // condition of the postion
        if (position == 1) {
            deleteBegin(ls);
        } else if (position == ls.n) {
            deleteEnd(ls);
        } else if (cur != null) {
            cur.prev.next = cur.next;
            cur.next.prev = cur.prev;
            cur = null;
        }
        
        ls.n = ls.n - 1; // reduce the size of the list
    }
    
    private void displayList(list ls) { // display the element from node 0 to node n - 1
        node e;
        e = ls.head;
        while (e != null) {
            System.out.printf("%d ", e.data);
            e = e.next;
        }
        System.out.println();
    }

    private void displayList2(list ls) { // display the element from node n - 1 to node 0
        node e;
        e = ls.tail;
        while (e != null) {
            System.out.printf("%d ", e.data);
            e = e.prev;
        }
        System.out.println();
    }

    private static Scanner in; // for user input

    // main driver(function)
    public static void main(String[] args) {
        double_linked_list ling = new double_linked_list();
        list ls = ling.createList();
        in = new Scanner(System.in);
        int newData, size, i = 1, n, position;
        while (i != 0) {
            System.out.println("1.Enter the number at the beginning of the list.");
            System.out.println("2.Enter the number at the ending of the list.");
            System.out.println("3.Enter the number at the specific position in the list.");
            System.out.println("4.Delete the number at the beginning of the list.");
            System.out.println("5.Delete the number at the ending of the list.");
            System.out.println("6.Delete the number at the specific postion of the list.");
            System.out.println("7.Display the element in the list in right order.");
            System.out.println("8.Display the element in the list in reverse order.");
            System.out.print("Enter the option: ");
            n = in.nextInt();
            System.out.println();
            switch (n) {
                case 1:
                    System.out.print("Enter the size of the list: ");
                    size = in.nextInt();
                    for (int j = 0; j < size; j++) {
                        System.out.print("Enter the number: ");
                        newData = in.nextInt();
                        ling.insertBegin(ls, newData);
                    }
                    break;
                case 2:
                    System.out.print("Enter the size of the list: ");
                    size = in.nextInt();
                    for (int j = 0; j < size; j++) {
                        System.out.print("Enter the number: ");
                        newData = in.nextInt();
                        ling.insertEnd(ls, newData);
                    }
                    break;
                case 3:
                    System.out.print("Enter the postion that you want to put in the list: ");
                    position = in.nextInt();
                    System.out.print("Enter the number: ");
                    newData = in.nextInt();
                    ling.insertAnyPosition(ls, newData, position);
                    break;
                case 4:
                    ling.deleteBegin(ls);
                    break;
                case 5:
                    ling.deleteEnd(ls);
                    break;
                case 6:
                    System.out.print("Enter the position of the element that you want to delete: ");
                    position = in.nextInt();
                    ling.deleteAnyPosition(ls, position);
                    break;
                case 7:
                    ling.displayList(ls);
                    break;
                case 8:
                    ling.displayList2(ls);
                    break;
                default:
                    System.out.println("Your input is invalid !!!!!");
                    break;
            }
        }
    }
}
