/**
 * @Description: TODO
 * @ClassName quickSort.Quick_median2
 * @Author 孔明
 * @Date 2019/6/11 21:40
 * @Version V1.0
 */
// 填坑法、三数取中 [ + 插入排序（未实现）]
public class Quick_median2 {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 9, 7, 22, 28, 13, 31, 7, 26, 1, 16, 7, 46, 7, 22, 49, 46,
                45, 46, 15};
        quick_sort(arr, 0, arr.length-1);

        System.out.println("排序结果：" + Arrays.toString(arr));
    }
// 填坑法
    public static void quick_sort(int[] arr, int left, int right){
        if(left >= right) return;
        /*  此处实现插排算法 */
        /*  if (right - left + 1 < 10){
                InsertSort(arr,left,right);
                return;
            }
        *
        */

        SelectPivotMedianOfThree(arr, left, right);
        int l = left + 1, r = right - 1;
        int key = arr[r];
        while (l < r){
            while (l < r && arr[l] <= key){
                l++;
            }
            arr[r] = arr[l];
            while (l < r && arr[r] >= key){
                r--;
            }
            arr[l] = arr[r];
        }
        arr[r] = key;
        quick_sort(arr, left, r - 1);
        quick_sort(arr, r + 1, right);
    }

    public static void SelectPivotMedianOfThree(int[] arr, int left, int right){
        int mid = (left + right) / 2;
        if(arr[left] > arr[mid]){
            swap(arr, left, mid);
        }
        if(arr[left] > arr[right]){
            swap(arr, left, right);
        }
        if(arr[mid] > arr[right]){
            swap(arr, mid, right);
        }
        if(mid != right-1){
            swap(arr, mid, right-1);
        }
    }

    public static void swap(int[] arr, int i, int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}

