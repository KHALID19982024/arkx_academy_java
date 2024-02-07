package day12;

import java.util.List;

public class Taskexemple {
    private int taskId;
    private String taskName;
    private int duration;

    Taskexemple(int taskId,String taskName, int duration){
        this.taskId=taskId;
        this.taskName=taskName;
        this.duration=duration;
    }
    public void executeTask(){
            System.out.println("Task "+this.getTaskName()+" started asynchronously.");
            try {
                Thread.sleep(this.getDuration());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task"+this.getTaskName()+"completed asynchronously! (Duration: "+this.getDuration()+")");
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void addTask(Taskexemple tasks){

    }
}
