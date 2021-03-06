package 算法分类.常见排序.普通排序;

/**
 * 每一趟从待排序的数据元素中选择最小（或最大）的一个元素作为首元素，直到所有元素排完为止，简单选择排序是不稳定排序
 */
public class 选择排序 {
    /**
     * 简单选择排序
     * 不稳定排序
     * 还全是n^2！！！！！！空间复杂度1
     * 从前往后每次选出一个当前最小的放到指定位置
     */
    public static void selectionSort(int[] a) {
        //记录每次要找的最小的位置
        int length = a.length;
        for (int i = 0; i < length - 1; i++) {//最后一个肯定是最大

            int minIdx = i;//记录最小值

            for (int j = i + 1; j < length; j++) {
                if (a[minIdx] > a[j]) {
                    minIdx = j;
                }
            }

            //2.最小元素交换到当前排序正确位置
            int temp = a[i];
            a[i] = a[minIdx];
            a[minIdx] = temp;
        }
    }

    public static void main(String[] args) {
        int a[] = {4, 3, 2, 1, 12, 4, 6};

        selectionSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
