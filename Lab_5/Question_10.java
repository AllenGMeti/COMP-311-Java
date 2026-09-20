/*
 * Allen G Meti
 * 24019726
 * Lab 5 Question 10
 */

public class Question_10 {
  public static void main(String[] args) {

  Library library = new Library();

  library.addBook(new Book("Year 1", "Allen", 100));
  library.addBook(new Book("Year 2", "Meti", 120));
  library.addBook(new Book("Year 3", "Goabaone", 90));
  library.addBook(new Book("Year 4", "Junior", 110));

  library.printAllBooks();
  }
}
