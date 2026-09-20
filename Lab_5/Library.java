/*
 * Allen G Meti
 * 24019726
 * Lab 5 Question 9
 */

import java.util.ArrayList;

public class Library {

  ArrayList<Book> books = new ArrayList<>();

   public void addBook(Book b) {
     books.add(b);
    }

   public void printAllBooks() {
    for (int i = 0; i < books.size(); i++) {
      System.out.println(books.get(i).getTitle());
     }
  }
}
