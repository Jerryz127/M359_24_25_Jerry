package U7.Examples;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 5, 2, 1, 0, 9, 8, 6, 4};
        printArr("Initial", arr);
        insertionSort(arr);
        printArr("Sorted", arr);
    }

    public static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int temVal = nums[i];
            int currPos = i;
            while(currPos > 0 && nums[currPos - 1] > temVal){
                //shift the bigger value over
                nums[currPos] = nums[currPos - 1];
                currPos--;
            }
            // insert into correct place
            nums[currPos] = temVal;
        }
    }

    public static void printArr(String msg, int[] arr) {
        System.out.println(msg);
        for(int i: arr){
            System.out.println(i + " ");
        }
        System.out.println();
    }
}