package cabbooking;

public class Ride {
    private Rider rider;
    private Driver driver;
    private String fromLocation;
    private String toLocation;
    private double distance;
    private double cost;

    public Ride(Rider rider, Driver driver, String fromLocation, String toLocation, double distance) {
        this.rider = rider;
        this.driver = driver;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.distance = distance;
        this.cost = distance * 10;
    }

    public void printReceipt() {
        System.out.println("🚖 Ride Details:");
        System.out.println("Rider: " + rider.getName());
        System.out.println("Driver: " + driver.getName());
        System.out.println("From: " + fromLocation + " To: " + toLocation);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Cost: ₹" + cost);
    }
}
