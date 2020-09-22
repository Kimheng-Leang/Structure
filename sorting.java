import java.util.*;

// import jdk.nashorn.internal.parser.Scanner;

/**
 * array
 */
// Bubble sort
// public class sorting {

//     private static Scanner in;
//     public static void main(String[] args) {
//         in = new Scanner(System.in);
//         int[] arr = new int[10];
//         int tmp;
//         for (int i = 0; i < 10; i++) {
//             System.out.print("Enter the number: ");
//             arr[i] = in.nextInt();
//         }
//         System.out.println("Before sorting: " + Arrays.toString(arr));
//         for (int i = 1; i <= arr.length; i++) {
//             for (int j = 0; j < arr.length - 1; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     tmp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = tmp;
//                     // Collections.swap(i, arr[j], arr[j + 1]);
//                 }
//             }
//         }
//         System.out.println("After sorting: " + Arrays.toString(arr));
//     }
// }

// Heap sort
/**
 * sorting
 */
public class sorting {

    private static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter the number: ");
            arr[i] = in.nextInt();
        }
        System.out.println("Before sorting: " + Arrays.toString(arr));
        sorting as = new sorting();
        as.sort(arr);
        // printArray(arr);
        System.out.println("After sorting:  " + Arrays.toString(arr));
    }

    public void sort(int arr[]) {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int n, int i) 
    {
        int largest = i; // Initialize largest as root 
        int l = 2 * i + 1; // left = 2*i + 1 
        int r = 2 * i + 2; // right = 2*i + 2 

        // If left child is larger than root 
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far 
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root 
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree 
            heapify(arr, n, largest);
        }
    }
}

//insertion sort
/**
 * sorting
 */
// public class sorting {

//     private static Scanner in;
//     public static void main(String[] args) {
//         in = new Scanner(System.in);
//         int arr[] = new int[10];
//         for (int i = 0; i < 10; i++) {
//             System.out.print("Enter the number: ");
//             arr[i] = in.nextInt();
//         }
//         System.out.println("Before sort: " + Arrays.toString(arr));
//         for (int i = 1; i < arr.length; i++) {
//             int j = i, tmp;
//             while (j > 0 && arr[j - 1] > arr[j]) {
//                 tmp = arr[j - 1];
//                 arr[j - 1] = arr[j];
//                 arr[j] = tmp;
//                 j = j - 1;
//             }
//         }
//         System.out.println("After sort:  " + Arrays.toString(arr));
//     }
// }

//Merge sort
// class sorting {
//     // Merges two subarrays of arr[].
//     // First subarray is arr[l..m]
//     // Second subarray is arr[m+1..r]
//     void merge(int arr[], int l, int m, int r) {
//         // Find sizes of two subarrays to be merged
//         int n1 = m - l + 1;
//         int n2 = r - m;

//         /* Create temp arrays */
//         int L[] = new int[n1];
//         int R[] = new int[n2];

//         /* Copy data to temp arrays */
//         for (int i = 0; i < n1; ++i)
//             L[i] = arr[l + i];
//         for (int j = 0; j < n2; ++j)
//             R[j] = arr[m + 1 + j];

//         /* Merge the temp arrays */

//         // Initial indexes of first and second subarrays
//         int i = 0, j = 0;

//         // Initial index of merged subarry array
//         int k = l;
//         while (i < n1 && j < n2) {
//             if (L[i] <= R[j]) {
//                 arr[k] = L[i];
//                 i++;
//             } else {
//                 arr[k] = R[j];
//                 j++;
//             }
//             k++;
//         }

//         /* Copy remaining elements of L[] if any */
//         while (i < n1) {
//             arr[k] = L[i];
//             i++;
//             k++;
//         }

//         /* Copy remaining elements of R[] if any */
//         while (j < n2) {
//             arr[k] = R[j];
//             j++;
//             k++;
//         }
//     }

//     // Main function that sorts arr[l..r] using
//     // merge()
//     void sort(int arr[], int l, int r) {
//         if (l < r) {
//             // Find the middle point
//             int m = (l + r) / 2;

//             // Sort first and second halves
//             sort(arr, l, m);
//             sort(arr, m + 1, r);

//             // Merge the sorted halves
//             merge(arr, l, m, r);
//         }
//     }

//     // /* A utility function to print array of size n */
//     // static void printArray(int arr[]) {
//     //     int n = arr.length;
//     //     for (int i = 0; i < n; ++i)
//     //         System.out.print(arr[i] + " ");
//     //     System.out.println();
//     // }

//     // Driver method
//     private static Scanner in;
//     public static void main(String args[]) {
//         in = new Scanner(System.in);
//         sorting sa = new sorting();
//         int []arr = new int[10];
//         for (int i = 0; i < 10; i++) {
//             System.out.print("Enter the number: ");
//             arr[i] = in.nextInt();
//         }
//         System.out.println("Before sort: " + Arrays.toString(arr));
//         sa.sort(arr, 0, arr.length - 1);
//         System.out.println("After sort:  " + Arrays.toString(arr));
//     }
// }

/**
 * sorting
 */
// quick sort

// public class sorting {

//     private static Scanner in;

//     public static void main(String[] args) {
//         in = new Scanner(System.in);
//         int[] arr   = new int[10];
//         int n;
//         for (int i = 0; i < 10; i++) {
//             System.out.print("Enter the number: ");
//             arr[i] = in.nextInt();
//         }
//         System.out.println("Before sorting: " + Arrays.toString(arr));
//         n = arr.length;
//         sorting sa = new sorting();
//         sa.quickSort(arr, 0, n-1);
//         System.out.println("After sorting:  "+ Arrays.toString(arr));
//     }

//     int partition(int arr[], int low, int high) {
//         int pivot = arr[low];
//         int leftwall = low, temp;
//         for (int i = low + 1; i <= high; i++) {
//             if (arr[i] < pivot) {
//                 temp = arr[i];
//                 arr[i] = arr[leftwall];
//                 arr[leftwall] = temp;
//                 leftwall += 1;
//             }
//         }
//         temp = pivot;
//         pivot = arr[leftwall];
//         arr[leftwall] = temp;

//         return (leftwall);
//     }

//     void quickSort(int arr[], int low, int high) {
//         if (low < high) {
//             int pivot_location = partition(arr, low, high);
//             quickSort(arr, low, pivot_location);
//             quickSort(arr, pivot_location + 1, high);
//         }
//     }
// }
/**
 *  sorting
 */
// public class sorting {

//     /*
//      * This function takes last element as pivot, places the pivot element at its
//      * correct position in sorted array, and places all smaller (smaller than pivot)
//      * to left of pivot and all greater elements to right of pivot
//      */
//     int partition(int arr[], int low, int high) {
//         int pivot = arr[high];
//         int i = (low - 1); // index of smaller element
//         for (int j = low; j < high; j++) {
//             // If current element is smaller than the pivot
//             if (arr[j] < pivot) {
//                 i++;

//                 // swap arr[i] and arr[j]
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }

//         // swap arr[i+1] and arr[high] (or pivot)
//         int temp = arr[i + 1];
//         arr[i + 1] = arr[high];
//         arr[high] = temp;

//         return i + 1;
//     }

//     /*
//      * The main function that implements QuickSort() arr[] --> Array to be sorted,
//      * low --> Starting index, high --> Ending index
//      */
//     void quickSort(int arr[], int low, int high) {
//         if (low < high) {
//             /*
//              * pi is partitioning index, arr[pi] is now at right place
//              */
//             int pi = partition(arr, low, high);

//             // Recursively sort elements before
//             // partition and after partition
//             quickSort(arr, low, pi - 1);
//             quickSort(arr, pi + 1, high);
//         }
//     }

//     private static Scanner in;

//     public static void main(String[] args) {
//         in = new Scanner(System.in);
//         int[] arr = new int[10];
//         int n;
//         for (int i = 0; i < 10; i++) {
//             System.out.print("Enter the number: ");
//             arr[i] = in.nextInt();
//         }
//         System.out.println("Before sorting: " + Arrays.toString(arr));
//         n = arr.length;
//         sorting sa = new sorting();
//         sa.quickSort(arr, 0, n - 1);
//         System.out.println("After sorting: " + Arrays.toString(arr));
//     }
// }

// selection sort
/**
 * sorting
 */
// public class sorting {

//     private static Scanner in;

//     public static void main(String[] args) {
//         in = new Scanner(System.in);
//         int arr[] = new int[10];
//         for (int i = 0; i < 10; i++) {
//             System.out.print("Enter the number: ");
//             arr[i] = in.nextInt();
//         }
//         System.out.println("Before sorting: " + Arrays.toString(arr));
//         sorting sa = new sorting();
//         sa.selecionSort(arr);
//         System.out.println("After sorting:  " + Arrays.toString(arr));
//     }

//     void selecionSort(int arr[]) {
//         int min, tmp, n = arr.length;
//         for (int i = 0; i < n - 1; i++) {
//             min = i;
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[j] < arr[min]) {
//                     min = j;
//                 }
//             }
//             tmp = arr[min];
//             arr[min] = arr[i];
//             arr[i] = tmp;
//         }
//     }
// }