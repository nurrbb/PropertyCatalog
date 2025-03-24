import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class PropertyService {private PropertyManager propertyManager;

    public PropertyService(PropertyManager propertyManager) {
        this.propertyManager = propertyManager;
    }

    public double calculateTotalHousePrice() {
        return propertyManager.getHouses().stream()
                .mapToDouble(Property::getPrice)
                .sum();
    }

    public double calculateTotalVillaPrice() {
        return propertyManager.getVillas().stream()
                .mapToDouble(Property::getPrice)
                .sum();
    }

    public double calculateTotalSummerHousePrice() {
        return propertyManager.getSummerHouses().stream()
                .mapToDouble(Property::getPrice)
                .sum();
    }

    public double calculateTotalPriceOfAllProperties() {
        double totalHousePrice = calculateTotalHousePrice();
        double totalVillaPrice = calculateTotalVillaPrice();
        double totalSummerHousePrice = calculateTotalSummerHousePrice();
        return totalHousePrice + totalVillaPrice + totalSummerHousePrice;
    }

    public double calculateAverageSquareMetersOfHouses() {
        return propertyManager.getHouses().stream()
                .mapToDouble(Property::getSquareMeters)
                .average().orElse(0);
    }

    public double calculateAverageSquareMetersOfVillas() {
        return propertyManager.getVillas().stream()
                .mapToDouble(Property::getSquareMeters)
                .average().orElse(0);
    }

    public double calculateAverageSquareMetersOfSummerHouses() {
        return propertyManager.getSummerHouses().stream()
                .mapToDouble(Property::getSquareMeters)
                .average().orElse(0);
    }

    public double calculateAverageSquareMetersOfAllProperties() {
        List<Property> allProperties = new ArrayList<>();
        allProperties.addAll(propertyManager.getHouses());
        allProperties.addAll(propertyManager.getVillas());
        allProperties.addAll(propertyManager.getSummerHouses());

        return allProperties.stream()
                .mapToDouble(Property::getSquareMeters)
                .average().orElse(0);
    }

    public List<Property> filterPropertiesByRoomCountAndLivingRoomCount(int roomCount, int livingRoomCount) {
        List<Property> allProperties = new ArrayList<>();
        allProperties.addAll(propertyManager.getHouses());
        allProperties.addAll(propertyManager.getVillas());
        allProperties.addAll(propertyManager.getSummerHouses());

        return allProperties.stream()
                .filter(property -> property.getRoomCount() == roomCount && property.getLivingRoomCount() == livingRoomCount)
                .collect(Collectors.toList());
    }
}
