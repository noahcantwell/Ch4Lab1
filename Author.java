
public class Author
{
    public String name;
    public int age;
    
    public Author( String nm, int yr)
    {
        this.name = nm;
        this.age = yr;
    }
    
    public String toStringAuthor() {
        return " Author name is " + this.name + "and author age is " + this.age;
    }

}
