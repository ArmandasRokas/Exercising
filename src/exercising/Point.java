package exercising;

public class Point {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point(int x, int y){

    this.x = x;
    this.y = y;
    }

    public String toString(){
        return "("+ x + "," + y + ")";
    }

    public boolean equals(Point pointToCompare){

        boolean resultat;

        if(pointToCompare.getX() == x  && pointToCompare.getY() == y){

            resultat = true;

        } else {
            resultat = false;
        }

        return resultat;
    }


    public void move(int dx, int dy){
        x = x + dx;
        y = y + dy;
    }


    public static void main(String[] args){
        Point p1 = new Point(5,10);
        Point p2 = new Point(5,10);
        printPoints(p1,p2);
        p1.move(2,2);
        printPoints(p1,p2);
        p1=p2; // begge p1 og p2 referencer refererer til det samme object p2. Så den gammel p1 object bliver carbage collected.
        printPoints(p1,p2);
        p1.move(2,2);
        printPoints(p1,p2);
    }

    private static void printPoints(Point pt1, Point pt2){
        System.out.println("Point 1's position is " + pt1);
        System.out.println("Point 2's position is " + pt2);
        System.out.println("Point1 == Point2: " + (pt1==pt2)); // checks reference number
        System.out.println("Point1.equals(Point2): " + pt1.equals(pt2) + "\n");
    }
}
