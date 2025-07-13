class Rider{
    private String userName;
    private long phoneNumber;
    private String location;

    public Rider(String userName, long phoneNumber, String location){
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    public String getLocation(){
        return location;
    }

    public String getName(){
        return userName;
    }
}