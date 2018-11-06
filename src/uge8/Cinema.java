package uge8;

public class Cinema {

    int[][] seats;

    public Cinema(int[] seatsOnRow){

        int rows = seatsOnRow.length;


        seats = new int[rows][]; // ragged array list

        for(int i = 0; i< seatsOnRow.length; i++){

            int seatsOnCurrentRow = seatsOnRow[i];

            seats[i] = new int[seatsOnCurrentRow];
        }


        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++){
                seats[i][j] = 0;
            }
        }

    }

    public int rows(){
        return seats.length;
    }

    public int seatsOnRow(int row){
        return seats[row].length;

    }

    public int seats(){
        int totalSeats = 0;

        for(int[] seatsOnRow: seats){
            totalSeats += seatsOnRow.length;
        }
        return totalSeats;

    }

    public int rowVacancies(int row){

        int vacanciesTotal = 0;

        for(int i: seats[row] ){
            if(i ==0){
                vacanciesTotal++;
            }
        }
        return vacanciesTotal;
    }



    public void booking(int row, int seat){

        seat -= 1;
        row -= 1;
        seats[row][seat] = 1;
    }

    public void release(int row, int seat){

        seat -= 1;
        row -= 1;
        seats[row][seat] = 0;

    }

    public String toString(){

        String output = "";

        for(int j = 0; j < seats.length; j++){
            for (int i: seats[j]){
                if(i==0){
                    output += "O";
                } else {
                    output += "#";
                }
            }
            if (j < seats.length - 1){ // do not add new line after last element
                output += "\n";
            }
        }
        return output;
    }

}


