package day8.custom;

public class MainCustom {
    public static void main(String[] args) {
        try {
            validateInput("invalid");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validateInput(String input) throws CustomException {
        if ("invalid".equals(input)) {
            throw new CustomException("Input was invalid");
        }
        else
        {
            System.out.println("the intput is: "+input);
        }
    }
}
