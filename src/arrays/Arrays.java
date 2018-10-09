package arrays;

public class Arrays {


    public static void main(String args[]) {
        int[] intArr = {1, 2};

        System.out.println("Start value: " + intArr[0]);

        ArraysCalculator arraysCalculator = new ArraysCalculator();

        arraysCalculator.changeValue1(intArr);
        System.out.println("Value after changeValue1:" + intArr[0]);


        arraysCalculator.changeValue2(intArr);
        System.out.println("Value after changeValue2:" + intArr[0]);




        // testing String. Value is not changed globally
        String stringTest = new String("HeHe");
        modifyString(stringTest);
        System.out.println(stringTest);
        System.out.println();

        // testing with myString
        MyString myString = new MyString('h','e','l','l','o');
        myString.printString();
        modifyMyString(myString);
        myString.printString();




    }


    /** String are immutable. Så hvis vi bruger dem som parameter i metoden
     og prøver at give den anden værdi f.eks. "huhu" . så faktisk lave den helt ny string
     new String. Dvs hvis vi skriver s = "huhu", så betyder det
     new String ("huhu") og stringTest variable reference  refererer til en helt anden objekt i hukomelsen
     end der blev sendt som peremeter. So hvis vi prøver at printe
     hvilken værdi har s i main metod, får vi gammel værdi, fordi den stadigvæk
     refere til den gammel string objekt.
    */

    public static void modifyString(String s){
        s = new String("huhu");

        // den blev ikke ændret globalt, fordi den lave new String.
        // så s indholder en reference til en ny objekt ikke til den gammel
        System.out.println(s);

    }

    //

    public static void modifyMyString(MyString myString){

        MyString newMyString = new MyString('b','y','e');

        myString = newMyString; // tilknytter bare den anden reference til my string

        myString.printString();




    }

}


