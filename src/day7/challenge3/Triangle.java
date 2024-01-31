package day7.challenge3;

public class Triangle extends shape
{
    String type="triangle";
    @Override
    public void Drawshape()
    {
        System.out.println("Drawing a triangle");
    }

    @Override
    public void displayType() {
        System.out.println("type is triangle");
    }
}
