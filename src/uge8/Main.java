package uge8;


public class Main {

    public static void main(String[] args) {


        Cinema cinema = new Cinema(new int[]{6,5,4,3,3});


        System.out.println("Rows in total: " + cinema.rows());

        for(int i = 0; i<cinema.rows(); i++) {

            System.out.println("There are " + cinema.seatsOnRow(i) + " in " + i + " row.");
        }

        System.out.println("Total seats: " + cinema.seats());


        for(int i = 0; i<cinema.rows(); i++) {

            System.out.println("There are " + cinema.rowVacancies(i) + " vacancies in " + i + " row.");
        }


        cinema.booking(0,5);
        cinema.booking(1,3);
        cinema.booking(2,2);
        cinema.booking(3,1);
        cinema.booking(4,2);
        System.out.println(cinema.toString());



    }

}
