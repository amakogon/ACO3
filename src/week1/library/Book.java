package week1.library;

public class Book {
  private String title;
  private String author;
  private int id;
  private static int booksCounter;

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
    id = ++booksCounter;
  }
  //  for test purpose
  public Book(String title) {
    this.title = title;
  }
//  for test purpose
  public Book(int id) {
    this("some");
  }


  public String asString() {
    return "Id=" + id + ", Title=" + title + ", Author=" + author;
  }

  public static int getCountOfBooks() {
//    System.out.println(title);
    return booksCounter;
  }

  @Override
  public String toString() {
    return "Book{" +
      "title='" + title + '\'' +
      ", author='" + author + '\'' +
      ", id=" + id +
      '}';
  }
}
