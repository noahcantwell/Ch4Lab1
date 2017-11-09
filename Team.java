
public class Team {
    private String teamName;
    private Athlete[] athletes;
    
    public Team(String tmnm, int size) {
        this.athletes = new Athlete[size];
        this.teamName = tmnm;
    }
    
    public String toString() {
        String output = "Team name is: " + this.teamName;
        for (Athlete a: athletes) {
            output += a.toString() + "\n";
        }
        return output;
    }
    
    public void addAthlete(Athlete a, int spot) {
        athletes[spot] = a;
    }
}
