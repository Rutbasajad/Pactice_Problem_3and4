import java.util.*;

public class Problem5 {

    static int linearSearch(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i].equals(key)) return i;
        return -1;
    }

    static int binarySearch(String[] arr, String key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid].equals(key)) return mid;
            else if (arr[mid].compareTo(key) < 0) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] arr = {"accA","accB","accB","accC"};

        System.out.println("Linear index: " + linearSearch(arr, "accB"));

        Arrays.sort(arr);
        int index = binarySearch(arr, "accB");

        int count = 0;
        for (String s : arr) if (s.equals("accB")) count++;

        System.out.println("Binary index: " + index);
        System.out.println("Count: " + count);
    }
}