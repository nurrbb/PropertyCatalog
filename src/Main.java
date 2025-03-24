public class Main {
    public static void main(String[] args) {
            PropertyManager propertyManager = new PropertyManager();
            PropertyService propertyService = new PropertyService(propertyManager);

            System.out.println("Houses:");
            propertyManager.getHouses().forEach(System.out::println);
            System.out.println("\nVillas:");
            propertyManager.getVillas().forEach(System.out::println);
            System.out.println("\nSummer Houses:");
            propertyManager.getSummerHouses().forEach(System.out::println);

            System.out.println("\nTotal House Price: " + propertyService.calculateTotalHousePrice());
            System.out.println("Total Villa Price: " + propertyService.calculateTotalVillaPrice());
            System.out.println("Total Summer House Price: " + propertyService.calculateTotalSummerHousePrice());
            System.out.println("Total Price of All Properties: " + propertyService.calculateTotalPriceOfAllProperties());

            System.out.println("\nAverage Square Meters of Houses: " + propertyService.calculateAverageSquareMetersOfHouses());
            System.out.println("Average Square Meters of Villas: " + propertyService.calculateAverageSquareMetersOfVillas());
            System.out.println("Average Square Meters of Summer Houses: " + propertyService.calculateAverageSquareMetersOfSummerHouses());
            System.out.println("Average Square Meters of All Properties: " + propertyService.calculateAverageSquareMetersOfAllProperties());

            int roomCount = 3;
            int livingRoomCount = 1;
            System.out.println("\nProperties with " + roomCount + " rooms and " + livingRoomCount + " living rooms:");
            propertyService.filterPropertiesByRoomCountAndLivingRoomCount(roomCount, livingRoomCount)
                    .forEach(System.out::println);

    }
}