package mar29.Generics3;

public class Ontario <X,Y,Z>{

    X cityName;
    Y population;
    Z numberOfCollege;

    public Ontario(X cityName, Y population, Z numberOfCollege) {
        this.cityName = cityName;
        this.population = population;
        this.numberOfCollege = numberOfCollege;
    }

    @Override
    public String toString() {
        return "Ontario{" +
                "cityName=" + cityName +
                ", population=" + population +
                ", numberOfCollege=" + numberOfCollege +
                '}';
    }
}

class Main {
    public static void main(String[] args) {

        Ontario< String, Double, Integer> o1 = new Ontario<>("cambridge",15000.00, 5);
        System.out.println(o1);
    }
}

