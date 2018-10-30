package uge7;

public class ArrayUtil {


    public static String arrayToString(int[] a){

        if (a == null){
            return "";

        }

        String s = "";

        for(int i: a){

            s = s + i + " ";
        }

        return s;

    }


    public static int occurences(int[] a, int n){
        if (a == null){
            return 0;

        }
        int total = 0;

        for (int i: a){

            if(i == n){

                total++;
            }
        }
        return total;
    }

    public static int sum(int[] a){
        if (a == null){
            return 0;

        }

        int sum = 0;


        for (int i: a){

            sum += i;

        }


        return sum;


    }

}
