package week1.library;

import java.util.Scanner;

public class LibraryApp {
  public static void main(String[] args) {
    Library library = new Library();
    addTestData(library);

    System.out.println("1. Show books");
    System.out.println("2. Add book");
    while (true) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Make a choice");
      int choice = scanner.nextInt();

      if (choice == 1) {
        library.showBooks();
      } else if (choice == 2) {
        System.out.println("Enter title");
        String title = scanner.next();
        System.out.println("Enter author");
        String author = scanner.next();
        Book newBook = new Book(title, author);
        library.addBook(newBook);
      }
    }
  }

  public static void addTestData(Library library) {
    Book book1 = new Book("Title1", "Author1");
    Book book2 = new Book("Title2", "Author2");
    Book book3 = new Book("Title3", "Author3");

    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);
  }
}
