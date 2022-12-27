package PlanningTask;

import java.util.ArrayList;

public class JobPlanning extends Planning implements WorkWithCSV{

    private ArrayList<JobTask> tasks;

    
    JobPlanning(String name) {
        super(name);
        this.tasks = new ArrayList<>();
    }

    public ArrayList<JobTask> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<JobTask> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void createCSV(ArrayList tasks, String name) {
        // TODO Auto-generated method stub
        // System.out.println(tasks + name);
        
    }

    @Override
    public ArrayList readTasksCSV(String name) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void writeTasksCSV(ArrayList tasks, String name) {
        // TODO Auto-generated method stub
        
    }

    
}
