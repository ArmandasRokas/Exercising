package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        andenGradsLigning();

    }
    //  bla bla

    public static void calculateDistanceBetweenPointAndLine(){
        Scanner s = new Scanner(System.in);

        double lineA, lineB, pointX, pointY, distance;

        System.out.print("Enter a and b values of your line (y=a*x + b) med mellemrum: ");
        lineA = s.nextDouble();
        lineB = s.nextDouble();

        System.out.print("Enter x and y values of your point P:(x, y) med mellemrum: ");
        pointX = s.nextDouble();
        pointY = s.nextDouble();


        distance = Math.abs(lineA * pointX - pointY + lineB) / (Math.sqrt(1+lineA*lineA));
        System.out.println(distance);
    }

    public static void calculateSeconds(){
        int numberOfSeconds = 0;
        int numberOfMinutes = 0;
        int numberOfHours = 0;
        int numberOfDays = 0;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter seconds: ");
        numberOfSeconds = s.nextInt();


        if (numberOfSeconds > 86400){
            numberOfDays = numberOfSeconds / 86400;
            numberOfSeconds = numberOfSeconds % 86400;
        }

        if (numberOfSeconds > 3600){
            numberOfHours = numberOfSeconds / 3600;
            numberOfSeconds = numberOfSeconds % 3600;
        }
        if (numberOfSeconds > 60){
            numberOfMinutes = numberOfSeconds / 60;
            numberOfSeconds = numberOfSeconds % 60;
        }

        System.out.println("Days: " + numberOfDays + " ,hours: " + numberOfHours +
                " ,minutes: " + numberOfMinutes + " , seconds: " + numberOfSeconds);

    }

    public static void checkPassword(){

        String password = "0";

        Scanner s = new Scanner(System.in);
        System.out.print("Enter password: ");
        password = s.nextLine();

        if(password.length()<5){
            System.out.println("Password is too short");
        } else if (password.length() > 8){
            System.out.println("Password is too long");
        } else {
            System.out.println("Password is entered correctly");
        }
    }

    public static void andenGradsLigning(){
        double a, b, c, diskriminant, x1, x2;
// test
        // test 2
        // test 3

        // test 5
        Scanner s = new Scanner(System.in);
        System.out.print("Enter A B C med mellemrum: ");
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();


        if (!(a == 0)) {

            diskriminant = b * b - 4 * a * c;

            if (diskriminant > 0) {
                x1 = (-b + Math.sqrt(diskriminant)) / (2 * a);
                x2 = (-b - Math.sqrt(diskriminant)) / (2 * a);

                System.out.println(x1 + " " + x2);
            }

            if (diskriminant == 0) {
                x1 = -b / (2 * a);
                System.out.println(x1);
            }

            if (diskriminant < 0) {
                System.out.println("Ingen rødder");
            }
        }

        if ((a == 0) && !(b == 0)){
            x1 = -c/b;
            System.out.println(x1);
        }
        if ((a == 0) && (b == 0)){
            System.out.println("x er alle reele tal.");
        }
    }
}

