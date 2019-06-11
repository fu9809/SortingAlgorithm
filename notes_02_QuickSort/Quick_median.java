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
        quick_sort(arr, 0, arr.length-1);

        System.out.println("排序结果：" + Arrays.toString(arr));
    }

    public static void quick_sort(int[] arr, int left, int right) {
        if (left >= right) return;   // 递归出口

// 左右指针法
        // 获取枢纽值，并将其放在当前待处理序列末尾
        SelectPivotMedianOfThree(arr, left, right);
        // 枢纽值被放在序列末尾
        int pivot = right - 1;

        int l = left + 1;       // 左指针
        int r = right - 2;      // 右指针
        while(l < r){
            while(l < r && arr[l] < arr[pivot]){
                l++;
            }
            while(l < r && arr[r] > arr[pivot]){
                r--;
            }
            // 交换两个位置的值
            if(l < r){
                swap(arr, l, r);
            }
        }
        if(l < right - 1){
            swap(arr, l, right - 1);
        }
        quick_sort(arr, left, l - 1);
        quick_sort(arr, l + 1, right);
    }

    // 三数取中法
    public static void SelectPivotMedianOfThree(int arr[],int left,int right) {
        int mid = left + ((right - left) >> 1);//计算数组中间的元素的下标
        //使用三数取中法选择枢轴
        if (arr[left] > arr[right]) {   //目标: arr[left] <= arr[right]
            swap(arr, left, right);
        }
        if (arr[left] > arr[mid]) {     //目标: arr[left] <= arr[mid]
            swap(arr, left, mid);
        }
        if (arr[right] < arr[mid]) {    //目标: arr[right] >= arr[mid]
            swap(arr, right, mid);
        }
        //此时，arr[left] <= arr[mid] <= arr[right]
        // 枢纽值被放在序列末尾
        if(right - 1 != mid) {
            swap(arr, right - 1, mid);
        }
    }

    public static void swap(int[] arr, int i, int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}

