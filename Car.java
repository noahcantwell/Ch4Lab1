
public class Car
{
    private int year;
    private String brand;
    public Car()
    {
        
    }
    
    public Car(int carYear, String carBrand) {
        this.year = carYear;
        this.brand = carBrand;
    }
    
    public int getYear() {
        return this.year;
    }
    
    public String getBrand() {
        return this.brand;
    }
    
    public void summarize() {
        return "Car year is: " + year + " and car brand is: " + brand;
    }
}
