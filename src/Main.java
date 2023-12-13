import java.util.*;

public class Main {
    public static void main(String[] args) {

        City city1 = new City(1,"aaa");
        City city2 = new City(2,"bbb");
        City city3 = new City(3,"ccc");
        City city4 = new City(4,"ddd");
        City city5 = new City(5,"eee");
        City city6 = new City(6,"fff");

        List<City> cities = new ArrayList<>(Arrays.asList(
                city1,city2,city3,city4,city5,city6
        ));

        TreeSet<City> treeSet = new TreeSet<>();

        for (City city : cities) {
            if (city.getCode() % 2 != 0){
                treeSet.add(city);
            }
        }


        treeSet.reversed();

        System.out.println(treeSet);
    }
}