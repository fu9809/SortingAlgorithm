import java.util.Arrays;

/**
 * @Description: TODO
 * @ClassName quickSort.Quick_median
 * @Author 孔明
 * @Date 2019/6/6 17:46
 * @Version V1.0
 */
// 左右指针法、三数取中法
public class Quick_median {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 9, 28, 13, 31, 26, 1, 16, 7, 22, 49, 46, 45, 46, 15};
        quickSortPart(arr, 0, arr.length-1);
        quick_sort(arr, 0, arr.length-1);

        System.out.println("排序结果：" + Arrays.toString(arr));
    }

    public static void quick_sort(int[] arr, int left, int right) {
        if (left >= right) return;   // 递归出口
        int l = left, r = right;
        // 三数取中，获取枢纽值，并将其放在当前待处理序列末尾
        int mid = quickSortPart(arr, 0, right);
        quick_sort(arr, left, mid-1);
        quick_sort(arr, mid+1, right);

    }

    // 左右指针法
    public static int quickSortPart(int[] arr, int left, int right){
        int key = right;        // 存储数组的下标
        int temp = arr[right];
        while(left < right){
            while(left < right && arr[left] <= temp){
                left++;
            }
            while(left < right && arr[right] >= temp){
                right--;
            }
            swap(arr, left, right);
        }
        swap(arr, left, key);
        return right;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

