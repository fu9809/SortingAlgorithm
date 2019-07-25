/*
 * 直接插入排序
 */
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 9, 28, 13, 31, 26, 1, 16, 7, 22, 49, 46, 45, 46};
        insert(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insert(int[] arr){
        int len = arr.length;
        int temp, i, j;
        for (i = 1; i < len; i++) {
            temp = arr[i];
            for (j = i-1; j >= 0; j--) {
		// 升序排序
                if(temp < arr[j]){
                    arr[j+1] = arr[j];
                }else {
                    break;
                }
            }
            arr[j+1] = temp;
        }
    }
}

