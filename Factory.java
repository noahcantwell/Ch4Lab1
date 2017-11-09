
public class Factory
{
    String address;
    Car[] inventory;
    
    public Factory(String st, int size)
    {
        this.address = st;
        this.inventory = new Car[size];
    }

    public String toString() {
        String output = "This is the factory inventory: \n" ;
        for(Car c : inventory) {
            output += c.toString() + "\n";
        }
        return output;
    }
    
    public void addCar(Car c, int spot) {
        inventory[spot] = c;
    }
}
