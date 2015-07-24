package week7.day2;

import week1.library.Book;
import week1.library.Library;

public class RunFrame {
  public static void main(String[] args) {
    Library library = new Library();

    library.addBook(new Book("Biography Keicy", "Palanic"));
    library.addBook(new Book("King", "Shining"));
    library.addBook(new Book("Janna", "Wonderful garden"));
    library.addBook(new Book("Anonymous", "Hard management"));
    library.addBook(new Book("Bradbery", "451"));

    new LibraryFrame(library);



  }
}
