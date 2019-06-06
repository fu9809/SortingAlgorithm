// 挖坑法
public class Quick_Classical {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 9, 28, 13, 31, 26, 1, 16, 7, 22, 49, 46, 45, 46};
        quick_sort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
    }

    public static void quick_sort(int[] arr, int left, int right){
        if(left >= right) return;   // 递归出口

        int l = left, r = right;
        int key = arr[l];
        while(l < r){
            while(l < r && key <= arr[r]){
                r--;
            }
            arr[l] = arr[r];
            while(l < r && key >= arr[l]){
                l++;
            }
            arr[r] = arr[l];
        }
        arr[l] = key;
        quick_sort(arr, left, l-1);
        quick_sort(arr, l+1, right);
    }
}

