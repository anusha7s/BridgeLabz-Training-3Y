package OOPSPracticeProblem.Inheritance;

class Book {
    String title;
    int publicationYear;
    Book(String title,int year){
        this.title=title; this.publicationYear=year;
    }
    void displayInfo(){
        System.out.println("Book: "+title+", Year: "+publicationYear);
    }
}

class Author extends Book {
    String name,bio;
    Author(String title,int year,String name,String bio){
        super(title,year);
        this.name=name; this.bio=bio;
    }
    @Override void displayInfo(){
        super.displayInfo();
        System.out.println("Author: "+name+", Bio: "+bio);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Author a = new Author("Java Basics",2022,"James","Expert in Java");
        a.displayInfo();
    }
}

