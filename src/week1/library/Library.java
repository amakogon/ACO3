package week1.library;

import week5.day1.MyArrayList;
import week5.day1.MyList;

public class Library {
  private MyList books = new MyArrayList();
  private int booksCounter;

  private LibraryReader[] libraryReaders = new LibraryReader[16];
  private int readersCounter;


  public void addBook(Book book) {
//    if(booksCounter >= books.length) {
//      System.out.println("Can't add new book. Library is full");
//      return;
//    }
//    books[booksCounter++] = book;
    books.add(book);
  }

  public void showBooks() {
    for (int i = 0; i < booksCounter; i++) {
      System.out.println(books.get(i));
    }
  }

  public MyList getBooks(){
    return books;
  }

  public void addReader(LibraryReader libraryReader) {
    if (readersCounter >= libraryReaders.length) {
      return;
    }
    libraryReaders[readersCounter++] = libraryReader;
  }

  public void showLibraryReaders() {
    for (int i = 0; i < readersCounter; i++) {
      System.out.println(libraryReaders[i].asString());
    }
  }


}
