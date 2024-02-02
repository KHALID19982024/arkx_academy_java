package Day9DataStructure;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListOper {
    public static void main(String[] args) {
        LinkedList<String> llst=new LinkedList<>();

        //Add a node to the end of the linked list.
        llst.add("Casablanca");
        llst.add("Marrakech");
        llst.add(0,"Tanger");
        llst.add("Agadir");

        //Remove a node from the linked list.
        if (!llst.isEmpty()) {
            llst.remove();
        }
        //Find and print the length of the linked list.
        System.out.println("the length of "+llst+" is: "+llst.size());

        //Reverse the linked list.
        System.out.println("the linked list reversed: ");
        for (int i=llst.size()-1;i >= 0; i--) {
            System.out.print(llst.get(i)+" ");
        }
        //Print all elements of the linked list.
        if (!llst.isEmpty()) {
            System.out.println("\nLinkedList elements: ");
            //iterating LinkedList using iterator
            for (String str : llst) {
                System.out.println(str);
            }
        }
        else {
            System.out.println("Empty linked list");
        }
    }
}
