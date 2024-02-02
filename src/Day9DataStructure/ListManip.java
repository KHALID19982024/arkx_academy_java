package Day9DataStructure;

import java.util.ArrayList;

public class ListManip {
    public static void main(String[] args) {
        ArrayList<String> arrlst = new ArrayList<>();

        //Initialize an ArrayList with some String values
        arrlst.add("ali");
        arrlst.add("khalid");
        arrlst.add("mouad");
        arrlst.add("zakaria");
        arrlst.add(0, "first");

        //Remove an element from the ArrayList.
        arrlst.remove("zakaria");
        arrlst.remove(0);
        System.out.println(arrlst);

        //Check if a specific element exists in the ArrayList.
        checkExistance(arrlst, "mouad");

        //Print all elements of the ArrayList.
        for (int i=0; i < arrlst.size();i++) {
            System.out.println("arrlst["+i+"]= "+ arrlst.get(i));
        }
    }

    public static void checkExistance(ArrayList<String> arr,String element)
    {
        if (arr.contains(element))
        {
            System.out.println("this element \""+ element +"\" exist");
        }
    }
}
