package Day9DataStructure;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueImplementation {
    public static void main(String[] args) {
        Queue<String> qTeam = new LinkedList<String>();

        //add an element to the back of the queue
        qTeam.add("Girona");
        qTeam.add("RMA");
        qTeam.add("FCB");
        qTeam.add("ATM");
        //remove the element from the front of the queue
        if (!qTeam.isEmpty())
        {
            qTeam.remove();
        }
        //get the element at the front of the queue without removing it
        try{
            System.out.println("the first element of the queue is: "+ qTeam.element());
        } catch (NoSuchElementException err)
        {
            System.out.println("system error: "+err);
        }
        //Check if the queue is empty.
        if (!qTeam.isEmpty()){
            System.out.println("elements in queue: "+qTeam);
        }
    }
}
