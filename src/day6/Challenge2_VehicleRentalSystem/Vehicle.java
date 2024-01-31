package day6.Challenge2_VehicleRentalSystem;
class Vehicle
{
    private String make;
    private String model;
    private int rentalPrice;

    public Vehicle(String make, String model, int rentalPrice)
    {
        this.make=make;
        this.model=model;
        this.rentalPrice=rentalPrice;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(int rentalPrice) {
        this.rentalPrice = rentalPrice;
    }
    public void showInfo()
    {
        System.out.println("make: "+make+"\nmodel: "+model+"\nrentalprice"+rentalPrice);
    }
}
class Car extends Vehicle
{
    private String type;
    public Car(String make, String model, int rentalPrice, String type)
    {
        super(make, model, rentalPrice);
        this.type=type;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void showInfo()
    {
        System.out.println("make: "+getMake()+"\nmodel: "+getModel()+"\nrentalprice"+getRentalPrice());
        System.out.println("type: car");
    }
}
class Bike extends Vehicle
{
    private String type;
    public Bike(String make, String model, int rentalPrice, String type)
    {
        super(make, model, rentalPrice);
        this.type=type;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void showInfo()
    {
        System.out.println("make: "+getMake()+"\nmodel: "+getModel()+"\nrentalprice"+getRentalPrice());
        System.out.println("type: car");
    }
}