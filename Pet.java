
public class Pet
{
    private int age;
    private String animal;
    private static int numPets;
    
    public Pet()
    {
        
    }
    
    public Pet(int num, String nm) {
        this.age = num;
        this.animal = nm;
        numPets++;
    }
    
    public String getAnimal() {
        return this.animal;
    }
    
    public Pet newPet() {
        Pet joe = new Pet(this.age, bestFriend.name);
        return joe;
    }
    
    public String getAge() {
        return age;
    }
}

public static void example() {
    System.out.print("This is in a static method!");
}
