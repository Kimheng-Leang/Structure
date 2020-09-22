package Data_structure;
// import java.util.*;

public class queue {
    private class element {

        int data;
        element next;
    }

    /**
     * list
     */
    private class list {

        int queue;
        element front, rear;
    }
    
    private list createList() {
        list ls = new list();

        ls.queue = 0;
        ls.front = null;
        ls.rear = null;

        return ls;
    }

    private void enqueue(list ls, int newData) {
        element e = new element();
        e.data = newData;
        if (ls.queue == 0) {
            e.next = ls.front;
            ls.front = e;
            if (ls.queue == 0) {
                ls.rear = e;
            }

            ls.queue = ls.queue + 1;
        } else {
            e.next = null;

            ls.rear.next = e;
            ls.rear = e;
            ls.queue = ls.queue + 1;
        }
    }

    private void dequeue(list ls) {
        ls.front = ls.front.next;
        if (ls.queue == 1) {
            ls.rear = null;
        }
        ls.queue = ls.queue - 1;
    }

    private void displayList(list ls) {
        element tmp = ls.front;
        while (tmp != null) {
            System.out.printf("%d ", tmp.data);
            tmp = tmp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        queue que = new queue();
        list ls = que.createList();
        que.enqueue(ls, 89);
        que.enqueue(ls, 34);
        que.enqueue(ls, 54);
        que.enqueue(ls, 12);
        que.enqueue(ls, 78);
        que.enqueue(ls, 65);
        que.enqueue(ls, 48);
        que.enqueue(ls, 90);
        que.enqueue(ls, 21);
        que.enqueue(ls, 56);
        que.displayList(ls);
        que.dequeue(ls);
        que.displayList(ls);
    }
}
