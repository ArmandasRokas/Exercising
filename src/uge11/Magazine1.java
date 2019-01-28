package uge11;

public class Magazine1 extends ReadingMatter{


    private int weeknumber;

    public Magazine1 (String thisTitle, long isbnNum, int weeknumber1)
    {
        super(thisTitle,isbnNum);
        weeknumber = weeknumber1;
    }

    public String toString()
    {
        return super.toString() + " Week number" + weeknumber;
    }

    public void content()
    {
        super.content();
        System.out.println ("Weeknumber: " + weeknumber);
    }

}
