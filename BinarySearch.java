import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter elements in sorted order:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int low = 0;
        int high = n - 1;
        int position = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (a[mid] == key) {
                position = mid;
                break;
            }
            else if (key > a[mid]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        if (position != -1) {
            System.out.println("Element found at index: " + position);
        }
        else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
