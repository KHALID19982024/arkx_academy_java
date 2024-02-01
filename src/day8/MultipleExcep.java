package day8;

public class MultipleExcep {
    public static void main(String[] args) {
        int[] arr = new int[6];
        try {
            int divisionResult = 15 / 0;
            int arrayValue = arr[10];
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
