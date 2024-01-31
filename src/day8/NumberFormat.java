package day8;
public class NumberFormat
{
    public static void main(String[] args)
    {
        StringToInt("67Y");
    }
    private static void StringToInt(String str)
    {

        int num= 0;
        try {
            num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Number format exception occurred\nsystem message: " + e.getMessage());
        }
    }
}
