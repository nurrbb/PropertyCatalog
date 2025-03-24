abstract class Property {
    private double price;
    private double squareMeters;
    private int roomCount;
    private int livingRoomCount;

    public Property(double price, double squareMeters, int roomCount, int livingRoomCount) {
        this.price = price;
        this.squareMeters = squareMeters;
        this.roomCount = roomCount;
        this.livingRoomCount = livingRoomCount;
    }

    public double getPrice() {
        return price;
    }

    public double getSquareMeters() {
        return squareMeters;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public int getLivingRoomCount() {
        return livingRoomCount;
    }

    @Override
    public String toString() {
        return "Price: " + price + ", Area: " + squareMeters + "m², Rooms: " + roomCount + ", Living Rooms: " + livingRoomCount;
    }
}
