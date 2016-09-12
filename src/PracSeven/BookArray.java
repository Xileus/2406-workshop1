package PracSeven;

import java.util.ArrayList;

/**
 * Created by Xileus on 12/09/2016.
 */
public class BookArray {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Fiction("Fiction 1"));
        books.add(new NonFiction("NonFiction 2"));
        books.add(new Fiction("NonFiction 3"));
        books.add(new NonFiction("Fiction 4"));
        books.add(new Fiction("NonFiction 5"));
        books.add(new Fiction("NonFiction 6"));
        books.add(new NonFiction("Fiction 7"));
        books.add(new NonFiction("NonFiction 8"));
        books.add(new Fiction("Fiction 9"));
        books.add(new NonFiction("NonFiction 10"));
        for (Book book:books) {
            System.out.println(book);
        }
    }
}
