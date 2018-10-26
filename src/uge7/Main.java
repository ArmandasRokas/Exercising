package uge7;

public class Main {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,1,7,1,8,9};

        String s = ArrayUtil.arrayToString(array);
        System.out.println(s);

        int total = ArrayUtil.occurences(array,1);
        System.out.println(total);




    }

}
