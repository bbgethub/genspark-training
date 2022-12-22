public class RotatedSortedArray {
    public static void main(String args[]) {
        int[] arr1 = {7, 5, 6, 1, 4, 2};
        int l = arr1.length;
        int target = 4;
        System.out.println("Result" + rotateSortArraySearch(arr1, 0, l, target));
    }

    public static int rotateSortArraySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == arr[mid])
                return mid;
            if (arr[start] <= arr[mid]) {
                if (target >= arr[start] && target < arr[mid])
                    end = mid -1;
                else
                    end = mid +1;
            } else {
                if (target > arr[mid] && target <= arr[end])
                    start = mid + 1;
                else
                    start = mid - 1;
            }
        }
        return -1;
    }
}