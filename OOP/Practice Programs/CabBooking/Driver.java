public class Driver {
    private String userName;
    private long phoneNumber;
    private String location;
    private boolean isAvailable;

    public Driver(String userName, long phoneNumber, String address, String location, boolean isAvailable){
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.location = location;
        this.isAvailable = isAvailable;
    }

    public String getLocation(){
        return location;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public void setAvailable(boolean value){
        isAvailable = value;
    }
}
