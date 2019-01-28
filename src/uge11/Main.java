package uge11;

public class Main {

    public static void main(String[] args) {




       // Down casting  System.out.println(((Cylinder) figur).doSomething());

        ReadingMatter[] readingMatters = new ReadingMatter[2];
        readingMatters[0] = new Book1("Into the wild", 41526165, "Jon Krakauer");
        readingMatters[1] = new Magazine1("Health",465465465, 5);


        System.out.println(readingMatters[1].getTitle());



        for(ReadingMatter readingMatter: readingMatters){
            readingMatter.content();

            if (readingMatter instanceof Book1){
                ((Book1) readingMatter).makeIndexList();
            }
        }
    }
}
