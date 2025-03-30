package mar29.Generics3;

public class Rogers<A,B,C>{ ///  creating class with <>

    ///  creating variable
    A id;
    B name;
    C csatPercentage;

    ///  creating constructor

    public Rogers(A id, B name, C csatPercentage) {
        this.id = id;
        this.name = name;
        this.csatPercentage = csatPercentage;
    }

    ///  creating toString

    @Override
    public String toString() {
        return "Rogers{" +
                "id=" + id +
                ", name=" + name +
                ", csatPercentage=" + csatPercentage +
                '}';
    }
}
