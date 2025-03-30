package mar29.Generics3;

public class Football<A, B>{

    A jerseyNumber;
    B name;

    public Football(A jerseyNumber, B name) {
        this.jerseyNumber = jerseyNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return "jerseyNumber=" + jerseyNumber +
                ", name=" + name;
    }
}
