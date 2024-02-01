package day8;

public class UnchekedExcep {
    public static void main(String[] args) {
        String str = null;
        try {
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException.\nsystem message: "+e.getMessage());
        }
    }
}
