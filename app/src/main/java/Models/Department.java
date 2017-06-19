package Models;

/**
 * Created by Pavilion on 17/6/2017.
 */
public class Department {
    private int id;
    private String name;
    private int id_owner;
    private int id_renter;
    private String address;
    private int rooms_num;
    private int bath_num;
    private boolean internet_service;
    private boolean light_service;
    private boolean water_service;
    private int rate;
    private String description;
    private Double latitude;
    private Double longitude;
    private int payment_amount;

    public Department() {
    }

    public Department(int id,String name, int id_owner, int id_renter, String address,
                      int rooms_num, int bath_num, boolean internet_service,
                      boolean light_service, boolean water_service, int rate,
                      String description, Double latitude, Double longitude,int payment_amount) {

        this.id = id;
        this.name=name;
        this.id_owner = id_owner;
        this.id_renter = id_renter;
        this.address = address;
        this.rooms_num = rooms_num;
        this.bath_num = bath_num;
        this.internet_service = internet_service;
        this.light_service = light_service;
        this.water_service = water_service;
        this.rate = rate;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
        this.payment_amount=payment_amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPayment_amount() {
        return payment_amount;
    }

    public void setPayment_amount(int payment_amount) {
        this.payment_amount = payment_amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_owner() {
        return id_owner;
    }

    public void setId_owner(int id_owner) {
        this.id_owner = id_owner;
    }

    public int getId_renter() {
        return id_renter;
    }

    public void setId_renter(int id_renter) {
        this.id_renter = id_renter;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRooms_num() {
        return rooms_num;
    }

    public void setRooms_num(int rooms_num) {
        this.rooms_num = rooms_num;
    }

    public int getBath_num() {
        return bath_num;
    }

    public void setBath_num(int bath_num) {
        this.bath_num = bath_num;
    }

    public boolean isInternet_service() {
        return internet_service;
    }

    public void setInternet_service(boolean internet_service) {
        this.internet_service = internet_service;
    }

    public boolean isLight_service() {
        return light_service;
    }

    public void setLight_service(boolean light_service) {
        this.light_service = light_service;
    }

    public boolean isWater_service() {
        return water_service;
    }

    public void setWater_service(boolean water_service) {
        this.water_service = water_service;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
