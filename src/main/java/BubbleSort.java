import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={1,3,6,9,5,4};

        for(int i=0; i<arr.length; i++){

            for(int j=1; j<arr.length-i; j++){

                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                }

            }


        }
        System.out.println(Arrays.toString(arr));
    }

}
