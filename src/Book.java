public class Book {
  private String author;
  private String title;
  private int releaseYear;

  public Book(String author, String title, int releaseYear) {
    this.author = author;
    this.title = title;
    this.releaseYear = releaseYear;
  }
public String info() {
    return author + " : " + title + " (" + releaseYear + ")";
}
}
