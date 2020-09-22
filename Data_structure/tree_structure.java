package Data_structure;

// import java.uitl.*;
import java.util.Scanner;

public class tree_structure {
    private class node {

        int data;
        node left, right;
    }

    /*private int getSize(node root) {
        if (root == null) {
            return 0;
        } else {
            return (1 + getSize(root.left) + getSize(root.right));
        }
    }*/

    private node findMin(node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    /*private node findMax(node root) {
        while (root.right != null) {
            root = root.right;
        }
        return root;
    }*/

    private node insert(node root, int data) {
        if (root == null) {
            root = new node();
            root.left = null;
            root.right = null;
            root.data = data;
        } else if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    private boolean search(node root, int data) {
        if (root == null) {
            return false;
        } else if (data == root.data) {
            return true;
        } else if (data >= root.data) {
            return search(root.right, data);
        } else if (data <= root.data) {
            return search(root.left, data);
        }
        return false;
    }

    private void deleteNode(node root, int data) {
        node parent = null;
        node curr = root;
        while (curr != null && curr.data != data) {
            parent = curr;
            if (data < curr.data) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
        if (curr == null) {
            System.out.print("Not found in tree or the tree is empty.");
        }
        if (curr.left != null && curr.right == null) {
            if (curr != root) {
                if (parent.left == curr) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            } else {
                root = null;
            }
            curr = null;
        } else if (curr.left != null && curr.right != null) {
            node right = findMin(curr.right);
            int val = right.data;
            deleteNode(root, right.data);
            curr.data = val;
        } else {
            node child = (curr.left) ? curr.left : curr.right;
            if (curr != root) {
                if (curr == parent.left) {
                    parent.left = child;
                } else {
                    parent.right = child;
                }
            } else {
                root = child;
            }
            curr = null;
        }
    }

    private void preorder(node root) {
        if (root != null) {
            System.out.printf("%d ", root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }

    private void inorder(node root) {
        if (root != null) {
            inorder(root.left);
            System.out.printf("%d ", root.data);
            inorder(root.right);
        }
    }

    private void postorder(node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.printf("%d ", root.data);
        }
    }

    private static Scanner in;
    public static void main(String[] args) {
        tree_structure tr = new tree_structure();
        in = new Scanner(System.in);
        node root = null;
        int size, data;
        char check;
        System.out.print("Enter the size of the tree: ");
        size = in.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the number: ");
            data = in.nextInt();
            tr.insert(root, data);
        }
        tr.preorder(root);
        tr.inorder(root);
        tr.postorder(root);

        System.out.println("\nDo you want to search a number in the tree?");
        System.out.println("[Y/N]");
        check = in.next().toCharArray()[0];
        if (check == 'y' || check == 'Y') {
            System.out.print("Enter the number that you want to search: ");
            data = in.nextInt();
            tr.search(root, data);
            if (tr.search(root, data)) {
                System.out.print("The number is exist.");
            } else {
                System.out.print("The number is not exist.");
            }
        }
        
        System.out.println("\nDo you want to delete a number in the tree?");
        System.out.println("[Y/N]");
        check = in.next().toCharArray()[0];
        if (check == 'y' || check == 'Y') {
            System.out.print("Enter the number that you want to delete: ");
            data = in.nextInt();
            tr.deleteNode(root, data);

            tr.preorder(root);
            tr.inorder(root);
            tr.postorder(root);
        }
    }
}
