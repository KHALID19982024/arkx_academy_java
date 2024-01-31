package day6.Challenge2_VehicleRentalSystem;
class MainVehicle
{
    public static void main(String[] args)
    {
        Vehicle v1= new Car("TOYOTA","T-123",200000, "Bike");
        Vehicle v2= new Vehicle("bwin","B-123",1500);
        Vehicle v3= new Vehicle("GTA","G-123",700000);
        Vehicle v4= new Vehicle("ford","F-123",110000);
        RentalAgency r1= new RentalAgency();
        r1.addVehicle(v1);
        r1.addVehicle(v2);
        r1.addVehicle(v3);
        r1.displayV();
        System.out.println("--------------------------");
        r1.rent(v2);
        r1.displayV();
    }
}