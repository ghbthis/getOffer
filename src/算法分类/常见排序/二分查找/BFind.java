package 算法分类.常见排序.二分查找;

/**
 * Created by Jackson on 2017/7/30.
 */
public class BFind {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 8, 9};
        System.out.println(binarySearch(array, 9));
        System.out.println(bSearch(array, 0, array.length-1, 9));
    }

    public static int binarySearch(int[] array, int target) {
        int lengh = array.length;
        int low = 0;
        int high = lengh - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] > target) {
                high = mid - 1;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    //递归实现，需要传入数组的起始位置
    public static int bSearch(int[] a, int low, int high, int target) {

        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (a[mid] > target)
            return bSearch(a, low, mid - 1, target);
        if (a[mid] < target)
            return bSearch(a, mid + 1, high, target);
        return mid;
    }

}
