/*
 * Allen G Meti
 * 24019726
 * Lab 5 Question 6
 */

public class Question_6 {
  public static void main(String[] args) {

  Book[] books = new Book[3];

  books[0] = new Book("Life in Biust", "Allen Meti", 100);
  books[1] = new Book("Living in BPC", "Goabaone Meti", 120);
  books[2] = new Book("Living off campus", "Junior Meti", 90);

   for (int i = 0; i < books.length; i++) {
      System.out.println(books[i].getTitle() + " " +
      books[i].getAuthor() + " " +
      books[i].getPrice());
     }
  }
}

