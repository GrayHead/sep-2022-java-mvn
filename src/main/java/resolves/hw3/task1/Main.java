package resolves.hw3.task1;

import resolves.hw3.task1.models.Book;
import resolves.hw3.task1.models.Library;
import resolves.hw3.task1.models.Magazines;

public class Main {
    public static void main(String[] args) {
        Library.add(new Book("book1"));
        Library.add(new Magazines("magazine2"));
        Library.add(new Book("book2"));
        Library.add(new Book("book4"));
        Library.add(new Magazines("magazine1"));
        Library.add(new Book("book3"));
        Library.add(new Magazines("magazine3"));


        Library.showBooks();
        System.out.println("*********************");
        Library.showMagazines();
    }
}
