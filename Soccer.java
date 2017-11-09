

public class Soccer
{
    public static void main(String[] args) {
        Team bestwinnerteam = new Team("Bay City Bombers", 10);
        
        Athlete morrow = new Athlete(35, "Mr Morrow");
        Athlete jill = new Athlete(17, "Jill");
        System.out.println(morrow.equals(jill));
        
        bestwinnerteam.addAthlete(morrow , 0);
        System.out.println(bestwinnerteam);
    }
}
