package day12;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class AsynchtasksCompletable {
    public CompletableFuture<Void> AsyncEx(List<Taskexemple> tasks){
        CompletableFuture<Void>[] futures = new CompletableFuture[tasks.size()];

        for (int i = 0; i < tasks.size(); i++) {
            Taskexemple task = tasks.get(i);
            futures[i] = CompletableFuture.runAsync(() -> {
                task.executeTask();
            });
        }
        return CompletableFuture.allOf(futures);

    }

}
