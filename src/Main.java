import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        City city1 = new City(312, "Bishkek");
        City city2 = new City(39, "Karakol");
        City city3 = new City(32, "Osh");
        City city4 = new City(3145, "Tokmok");
        City city5 = new City(3254, "Batken");
        City city6 = new City(37, "Jalal-Abad");

        Set<City> cities = new TreeSet<>(Comparator.reverseOrder());
        addEvenCodeCity(cities, city1);
        addEvenCodeCity(cities, city2);
        addEvenCodeCity(cities, city3);
        addEvenCodeCity(cities, city4);
        addEvenCodeCity(cities, city5);
        addEvenCodeCity(cities, city6);

        System.out.println("Cities with odd number code:");
        for (City city : cities) {
            System.out.println(city.getCode() + " - " + city.getName());
        }

    }

    public static void addEvenCodeCity(Set<City> cities, City city) {
        if (city.getCode() % 2 == 1) {
            cities.add(city);
        }
    }
}