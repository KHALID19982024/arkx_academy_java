package day8;

public class NullPointer {
    public static void main(String[] args) {
        lengthStr(null);
    }
    private static void lengthStr(String str){
        try{
            System.out.println(str.length());
        }catch (NullPointerException enp){
            System.out.println("it is a NullPointerException\nsystem message"+enp.getMessage());
        }
    }
}
