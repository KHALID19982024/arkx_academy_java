package day6.Challenge2_VehicleRentalSystem;
import java.util.ArrayList;
class RentalAgency{
    ArrayList<Vehicle> vehicles;
    RentalAgency()
    {
        vehicles = new ArrayList<>();
    }
    public void addVehicle(Vehicle v)
    {
        vehicles.add(v);
    }
    public void rent(Vehicle vcl)
    {
        vehicles.remove(vcl);
    }
    public void displayV()
    {
        for (Vehicle items:vehicles) {
            items.showInfo();
            System.out.println("------------------------------");
        }
    }

}