package arrays;

public class ArraysCalculator {



    public void changeValue1(int[] arr1){ // value is changen only insinde in the method, because copy of array is made

        int[] arr2 = new int[arr1.length];

        int d =0;

        for (int i : arr1){

            arr2[d] = i;
            d++;

        }

        arr2[0] = 9;


    }

    public void changeValue2(int[] arr){ // changes value globally


        arr[0] = 9;

    }
}
