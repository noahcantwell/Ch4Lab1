
public class Hat
{
    private int cost;
    private String brand;
    
    public Hat()
    {
        
    }
    
    public Hat(int cst, String brand) {
        this.cost = cst;
        this.brand = brand;
    }
    
    public String getBrand() {
        return this.brand;
    }
    
    public Hat newHat() {
        Hat cowboi = new Hat(this.cost, this.brand);
        return cowboi;
    }
    
    public int getCost() {
        return cost;
    }
}

