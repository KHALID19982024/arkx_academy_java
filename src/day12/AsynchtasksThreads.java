package day12;

import java.util.List;

public class AsynchtasksThreads {
    public void AsynchEx(List<Taskexemple> tasks) {
        for (Taskexemple items : tasks) {
            new Thread(() -> items.executeTask()).start();

        }
    }
}
