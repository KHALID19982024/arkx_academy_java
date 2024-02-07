package day12;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class mainTask {
    public static void main(String[] args) {
        List<Taskexemple> tasks = new ArrayList<>();
        tasks.add(new Taskexemple(1,"A",3000));
        tasks.add(new Taskexemple(2,"B",1000));
        tasks.add(new Taskexemple(3,"C",5000));

        //synchronous tasks
        //Synchtasks synchtasks = new Synchtasks();
        //synchtasks.synchEx(tasks);

        //Asynchronous tasks
        //AsynchtasksCompletable AsynchtasksCompletable = new AsynchtasksCompletable();
        //CompletableFuture<Void> future = AsynchtasksCompletable.AsyncEx(tasks);
        //future.join();

        //threads tasks
        AsynchtasksThreads AsynchtasksThreads = new AsynchtasksThreads();
        AsynchtasksThreads.AsynchEx(tasks);
    }

}
