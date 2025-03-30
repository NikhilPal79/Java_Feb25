package mar29.Generics3;

public class Ontario <X,Y,Z>{   /// USE VARIABLE BETWEEN <___>

    /// do not need to add int string just add single work,

    X cityName;
    Y population;
    Z numberOfCollege;


    ///  create constructor

    public Ontario(X cityName, Y population, Z numberOfCollege) {
        this.cityName = cityName;
        this.population = population;
        this.numberOfCollege = numberOfCollege;
    }

    ///  create tostring

    @Override
    public String toString() {
        return "Ontario{" +
                "cityName=" + cityName +
                ", population=" + population +
                ", numberOfCollege=" + numberOfCollege +
                '}';
    }
}

