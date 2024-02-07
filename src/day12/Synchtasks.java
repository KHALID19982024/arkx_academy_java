package day12;

import java.util.List;

public class Synchtasks {
    public void synchEx(List<Taskexemple> tasks){
        ;
        for(Taskexemple items: tasks)
        {
            items.executeTask();
        }
    }
}
