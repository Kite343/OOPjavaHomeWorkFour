package PlanningTask;

import java.util.Calendar;

public class JobTask extends Task{

    private TaskManager taskManager;

    JobTask(TaskPriority taskPriority, String name, Calendar dataStart, Calendar dataDeadline, TaskManager taskManager) {
        super(taskPriority, name, dataStart, dataDeadline);
        this.taskManager = taskManager;
    }

    JobTask(int id, TaskPriority taskPriority, String name, Calendar dataStart, Calendar dataDeadline, TaskManager taskManager) {
        super(id, taskPriority, name, dataStart, dataDeadline);
        this.taskManager = taskManager;
    }

    public TaskManager getTaskManager() {
        return taskManager;
    }
    public void setTaskManager(TaskManager taskManager) {
        this.taskManager = taskManager;
    }

    @Override
    public String toString() {
        return super.toString()  + ";" + taskManager.toString();
    }      

    
}
