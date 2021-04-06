package day05;

/**
 * @author zhongyanzu
 * @create 2020-11-19 10:56
 */
public class quicksort {
    public static void main(String[] args) {
        int[] arr = new int[]{3,8,5,1,2,9,4,7,6};
        quicksort.QuickSort(arr,0,arr.length-1);
    }
    public static void QuickSort(int[] array,int low,int hight){
        //if (array.length < 1 || low < 0 || hight >= array.length || low > hight) return null;
        if(low < hight){
            int privotpos = partition(array,low,hight);
            QuickSort(array,low,privotpos - 1);
            QuickSort(array,privotpos + 1,hight);
        }

    }

    public static int partition(int[] array,int low,int hight){
        int privot = array[low];
        while(low < hight){
            while(low < hight && array[hight] >= privot) --hight;
            array[low] = array[hight];
            while(low < hight && array[low] <= privot) ++low;
            array[hight] = array[low];
        }
        array[low] = privot;
        return low;
    }

}
