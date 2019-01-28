package uge11;

public class Book1 extends ReadingMatter{

    private String author;

    public Book1 (String thisTitle, long isbnNum, String auth)
    {
        super(thisTitle,isbnNum);
        author = auth;
    }
    public String toString()
    {
        return super.toString() + " Author: " + author;
    }
    public void content()
    {
        super.content();
        System.out.println ("Author: " + author);
    }

    public void makeIndexList(){
        System.out.println("Making index list...");
    }

}
