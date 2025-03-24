import java.util.ArrayList;
import java.util.List;

class PropertyManager {
    private List<House> houses;
    private List<Villa> villas;
    private List<SummerHouse> summerHouses;

    public PropertyManager() {
        houses = new ArrayList<>();
        villas = new ArrayList<>();
        summerHouses = new ArrayList<>();

        houses.add(new House(150000, 120, 3, 1));
        houses.add(new House(180000, 140, 4, 1));
        houses.add(new House(130000, 110, 3, 1));

        villas.add(new Villa(300000, 250, 5, 2));
        villas.add(new Villa(350000, 280, 6, 2));
        villas.add(new Villa(320000, 260, 5, 2));

        summerHouses.add(new SummerHouse(200000, 180, 4, 1));
        summerHouses.add(new SummerHouse(220000, 190, 4, 1));
        summerHouses.add(new SummerHouse(210000, 185, 4, 1));
    }

    public List<House> getHouses() {
        return houses;
    }

    public List<Villa> getVillas() {
        return villas;
    }

    public List<SummerHouse> getSummerHouses() {
        return summerHouses;
    }
}
