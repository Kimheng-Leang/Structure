package Data_structure;
import java.util.*;

public class stack {
    /**
     * element
     */
    private class element {

        int data;
        element next;
    }

    /**
     * list
     */
    private class list {

        int stack;
        element top;
    }

    private list createList() {
        list ls = new list();

        ls.stack = 0;
        ls.top = null;
        return ls;
    }

    private void push(list ls, int newData) {
        element e = new element();
        e.data = newData;

        e.next = ls.top;
        ls.top = e;
        if (ls.stack == 0) {
        }
        ls.stack = ls.stack + 1;
    }

    private void pop(list ls) {
        if (ls.stack == 0) {
            System.out.print("The stack is empty !!!!!");
        } else if (ls.stack < 0) {
            System.out.print("The stack is underflow !!!!!");
        } else {
            ls.top = ls.top.next;
            ls.stack = ls.stack - 1;
        }
    }

    private void displayList(list ls) {
        element tmp = ls.top;
        while (tmp != null) {
            System.out.printf("%d ", tmp.data);
            tmp = tmp.next;
        }
    }

    private static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        stack st = new stack();
        list ls = st.createList();
        int num, newData;
        char check;
        System.out.print("Enter the size of list: ");
        num = in.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print("Enter the number: ");
            newData = in.nextInt();
            st.push(ls, newData);
        }
        st.displayList(ls);
        System.out.println("\nDo you want to pop ?");
        System.out.print("[Y | N]: ");
        check = in.next().toCharArray()[0];
        if (check == 'y' || check == 'Y') {
            System.out.print("How many element do you want to pop?: ");
            num = in.nextInt();
            for (int i = 0; i < num; i++) {
                st.pop(ls);
            }
            st.displayList(ls);
        } else {
            System.exit(0);
        }
    }
}
