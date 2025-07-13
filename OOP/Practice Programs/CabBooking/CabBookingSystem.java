public class CabBookingSystem {
    public static void main(String[] args) {
        BookingService bookingService = new BookingService;
        bookingService.registerDriver(new Driver("Rahul", 9876543210L, "Chennai", true));
        bookingService.registerDriver(new Driver("Sneha", 9123456789L, "Chennai", true));
        bookingService.registerDriver(new Driver("John", 9988776655L, "Bangalore", true));
        
        Rider rider = new Rider("Aishwarya", 1234567890L, "Chennai");

        if (ride != null){
            ride.printReceipt();
        }
    }
}
