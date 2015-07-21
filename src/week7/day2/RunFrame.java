package week7.day2;

import week1.library.Book;
import week1.library.Library;

public class RunFrame {
  public static void main(String[] args) {
    Library library = new Library();

    library.addBook(new Book("Biography Keicy", "Palanic"));
    library.addBook(new Book("King", "Shining"));
    library.addBook(new Book("Janna", "Wonderfull garden"));
    library.addBook(new Book("Anonimous", "Hard management"));
    library.addBook(new Book("Branbery", "451"));

    new LibraryFrame(library);
  }
}
