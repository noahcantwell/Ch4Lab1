
public class Book
{
    private String title;
    private Author authorInfo;
    
    public Book(Author authr, String bookTitle) { 
        this.authorInfo = authr;
        this.title = bookTitle;
    }
    
    public String toStringBook() {
        return ("Book title is " + this.title) + toStringAuthor();
    }
}
