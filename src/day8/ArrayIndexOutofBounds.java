package day8;
import java.util.Random;
public class ArrayIndexOutofBounds {
    public static void main(String[] args)
    {
        array(10, 11, 6);
    }
    private static void array( int size, int index, int value) {
        try {
                int arr[] = new int[size];
                Random random = new Random();
                for (int i = 0; i < size; i++) {
                    arr[i] = random.nextInt(100) + 1;
                }
                arr[index] = value;
                System.out.println("arr[" + index + "]= " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException err) {
            System.out.println("ArrayIndexOutOfBounds Exception occurred\nsystem message: " + err.getMessage());
        }

    }
}
