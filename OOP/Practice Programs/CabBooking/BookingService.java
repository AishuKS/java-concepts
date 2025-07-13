package cabbooking;

import java.util.ArrayList;
import java.util.List;

public class BookingService {
    
    private List<Driver> drivers = new ArrayList<>();

    public void registerDriver(Driver driver) {
        drivers.add(driver);
    }

    public Driver findAvailableDriver(String location) {
        for (Driver driver : drivers) {
            if (driver.isAvailable() && driver.getLocation().equalsIgnoreCase(location)) {
                driver.setAvailable(false); // Mark driver as unavailable
                return driver;
            }
        }
        return null;
    }

    public Ride bookRide(Rider rider, String toLocation, double distance) {
        Driver driver = findAvailableDriver(rider.getLocation());
        if (driver != null) {
            return new Ride(rider, driver, rider.getLocation(), toLocation, distance);
        } else {
            System.out.println("❌ No drivers available in your area.");
            return null;
        }
    }
}
