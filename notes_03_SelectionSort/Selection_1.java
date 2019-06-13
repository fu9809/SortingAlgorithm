/**
 * @Description: TODO
 * @ClassName selectionSort.Selection_1
 * @Author 孔明
 * @Date 2019/6/13 13:11
 * @Version V1.0
 */
public class Selection_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 9, 28, 13, 31, 26, 1, 16, 7, 22, 49, 46, 45, 46};
        selection_sort(arr);
        System.out.print(Arrays.toString(arr));
    }

    public static void selection_sort(int[] arr){
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int k = i;
            for (int j = i + 1; j < len; j++) {
                if(arr[k] > arr[j]){
                    k = j;
                }
            }
            if(k != i){
                arr[i] = arr[i] ^ arr[k];
                arr[k] = arr[i] ^ arr[k];
                arr[i] = arr[i] ^ arr[k];
            }
        }
    }
}
