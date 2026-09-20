/*
 * Allen G Meti
 * 24019726
 * Lab 5 Question 8
 */

public class Question_8 {
 public static Book cheaperBook(Book a, Book b) {

 if (a.getPrice() < b.getPrice()) {
   return a;
 } else {
   return b;
  }
}

  public static void main(String[] args) {

  Book b1 = new Book("Life in Biust", "Allen Meti", 100);
  Book b2 = new Book("Living off campus", "Junior meti", 90);

   Book cheaper = cheaperBook(b1, b2);

   System.out.println(cheaper.getTitle());
  }
}
