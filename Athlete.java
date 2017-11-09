
public class Athlete
{
    
    private int age;
    private String name;
    
    public Athlete(int yr, String nm) {
        this.age = yr;
        this.name = nm;
    }

    public boolean equals(Athlete other) {
        if(this.name.equals(other.name) && this.age == other.age) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public String toString() {
        return " Athlete name: " + this.name + "\t Athlete age: " + this.age;
    }
}
