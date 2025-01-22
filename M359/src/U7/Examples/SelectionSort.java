package U7.Examples;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {2, 5 ,7 ,2 ,1 ,0 ,9,3 ,6 , 7, 2 ,1 ,5};
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        selectionSortHelper(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public static void selectionSortHelper(int[] arr) {
        for (int i = 0; i < arr.length -1 ; i++) {
            // assume smallest value is at i
            int min = i;
            for (int j = i + 1; j< arr.length; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            // swap position min with position i
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
