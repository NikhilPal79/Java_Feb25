package mar29.Generics3;

public class FootballTeam <A, B>{

    A jerseyNumber;
    B name;

    public FootballTeam(A jerseyNumber, B name) {
        this.jerseyNumber = jerseyNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return "jerseyNumber=" + jerseyNumber +
                ", name=" + name;
    }
}
