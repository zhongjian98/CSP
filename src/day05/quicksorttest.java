package day05;

/**
 * @author zhongyanzu
 * @create 2020-11-19 11:28
 */
public class quicksorttest {
    public static void main(String[] args) {
        int[] a = new int[]{3,8,5,1,2,9,4,7,6};
        quickSort(a,0,a.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" " +
                    "");
        }
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int privotpos = partition(arr, left, right);
            quickSort(arr,left,privotpos-1);
            quickSort(arr,privotpos+1,right);
        }
    }

    public static int partition(int[] arr, int left, int right) {
        int privot = arr[left];
        while (left < right) {
            while (left<right&&arr[right]>=privot) right--;
            arr[left] = arr[right];
            while (left<right&&arr[left]<=privot) left++;
            arr[right] = arr[left];
        }
        arr[left] = privot;
        return left;
    }
}
