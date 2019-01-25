package exam;



public class Main {
    public static void main(String[] arg){

        // Increment
        int i = 100;
        int total;
        System.out.println("Before increment: " + i);
        System.out.println("=+increment: " + (total = i++) + " i: " + i);
        System.out.println("After increment: " + i);

        //Casting
        int a = 5;
        float b = a;
        double e = b;
        float f = (float) e;
        int c = (int) b;

        // else if
        if (true){
            System.out.println("Else if: 1");
        } else if(true){
            System.out.println("Else if: 2");
        }   // bliver printet ud kun "1"

        //The conditional operator
        int num1 = 1;
        int num2 = 2;

        int larger = ((num1 > num2) ? num1: num2);
        System.out.println("Conditional operator: " + larger);

        // Class variable
//        Car.numberOfCars = 1;

        //Instance variable
//        Car audi = new Car();
//        audi.setNumberOfSeats(2);
//
//        Car mers = new Car();
//        mers.setNumberOfSeats(2);
//
//
//        System.out.println(" Number of cars " + Car.numberOfCars);
//        System.out.println(audi.toString());
//        System.out.println(mers.toString());
//        if (mers.equals(audi)){
//            System.out.println("works ==");
//        } else{
//            System.out.println("not works ==");
//        }

        int[] intArray = {1,2,3};

        //Strings comparing
        String string1 = "1";
        String string2 = "1";

        if(string1.compareTo(string2) == 0){
            System.out.println("Equals");
        } else {
            System.out.println("No Equals");
        }


        // do while
        int count;
        do{
            System.out.println("I am running");
            count++;
        } while (count <3);


        // for loop
        for(int fori = 64; fori > 1; fori/=2){
            System.out.println("Here is loop");
        }

        // Cars in different packages
        exam.yourCar.Car car = new exam.yourCar.Car("audi");

        exam.myCar.Car car1 = new exam.myCar.Car();


        while (true){
            if(true){
                int inIf = 0;
                System.out.println("hi");
                break;
            }
        }
    }
}
