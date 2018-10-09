package arrays;

public class MyString {

    char[] charArr;

    public MyString(char ... chars){

        charArr = chars;

    }

    public void printString(){
        for (char c: charArr){
            System.out.print(c);

        }
        System.out.println();
    }

}
