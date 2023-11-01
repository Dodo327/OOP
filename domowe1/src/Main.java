import java.util.Random;

abstract class Publication{
    String author;
    String title;
    int year;
    static int BOOKLET_PAGE_LIMIT = 200;

    Publication(){
        this.author = "Unknown";
        this.title = "Unknown";
        this.year = 0;
    }

    Publication(String author, String title, int year){
        this.author = author;
        this.title = title;
        this.year = year;
    }

    @Override
    public String toString(){
       return "Autor: " + author + "\ntytuł: " + title + "\nrok: " + year;
    }
}

interface summarizeBook{
    public String generateSummarize();
}

class Book extends Publication implements summarizeBook{
    int pages;

    Book(){
        super();
        this.pages = 0;
    }

    Book(String author, String title, int year, int pages){
        super(author, title, year);
        this.pages = pages;
    }

    @Override
    public String toString(){

        return super.toString() + "\nLiczba stron: " + pages;
    }

    @Override
    public String generateSummarize() {
        String alphabet = "abcdefghijkalmnopqrstuwyxz";
        String summary = "";
        for (int i = 1; i <= 20; i++){
            Random random = new Random();
            int x = random.nextInt(20);
            summary += alphabet.charAt(x);
        }
        return summary;
    }
}

class BookLet extends Book{
    boolean published;

    BookLet(){
        super();
        this.published = false;
    }

    BookLet(boolean published, String author, String title, int year, int pages){
        super(author, title, year, pages);
        if (pages > BOOKLET_PAGE_LIMIT){
            return;
        }
        this.published = pages <= BOOKLET_PAGE_LIMIT && published;
    }

    @Override
    public String toString(){
        return super.toString() + "\nwydana: " + published;
    }
}

class Article extends Publication {
    String journalName;

    Article(){
        super();
        this.journalName = "Unknown";
    }

    Article(String journalName, String author, String title, int year){
        super(author, title, year);
        this.journalName = journalName;
    }

    @Override
    public String toString() {

        return super.toString() + "\nTytuł artykułu: " + journalName;

    }
}

public class Main {
    public static void main(String[] args) {
        Book book_1 = new BookLet(true,"Paweł Florek", "POG", 2023, 200);
        System.out.println(book_1);
        System.out.println(book_1.generateSummarize());
        }
    }
