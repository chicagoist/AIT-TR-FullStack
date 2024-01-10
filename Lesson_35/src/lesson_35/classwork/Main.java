package lesson_35.classwork;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Dauthor","Rbook",2020);
        Author author2 = new Author("Kauthor","Bbook",1895);
        Author author3 = new Author("Fauthor","Ybook",2023);
        Author author4 = new Author("Xauthor","Sbook",1971);
        Author author5 = new Author("Aauthor","Tbook",1958);

        Author[] authors = {author1,author2,author3,author4,author5};

        System.out.println("Before sorting: ");
        for(Author author: authors) {
            System.out.println(author);
        }

        System.out.println();

        Arrays.sort(authors);

        System.out.println("After name's sorting: ");
        for(Author author: authors) {
            System.out.println(author);
        }

        System.out.println();

        System.out.println("Sort by book's name:");
        Arrays.sort(authors, new BookNameComporator());
        for(Author author: authors) {
            System.out.println(author);
        }

        System.out.println();

        System.out.println("Sort by book's year:");
        Arrays.sort(authors, new YearComporator());
        for(Author author: authors) {
            System.out.println(author);
        }

    }
}
