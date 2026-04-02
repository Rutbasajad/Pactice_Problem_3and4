public class Problem6 {

    static void floorCeil(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int floor = -1, ceil = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                floor = ceil = arr[mid];
                break;
            }
            else if (arr[mid] < target) {
                floor = arr[mid];
                low = mid + 1;
            } else {
                ceil = arr[mid];
                high = mid - 1;
            }
        }

        System.out.println("Floor=" + floor + ", Ceil=" + ceil);
    }

    public static void main(String[] args) {
        int[] arr = {10,25,50,100};
        floorCeil(arr, 30);
    }
}