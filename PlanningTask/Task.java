package PlanningTask;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Task {
    protected int id;
    protected TaskPriority taskPriority;
    protected String name;
    protected Calendar dataStart;
    protected Calendar dataDeadline;
    // private TaskManager taskManager;
    protected static int n = 0;

    Task(TaskPriority taskPriority, String name, Calendar dataStart, Calendar dataDeadline){
        this.taskPriority = taskPriority;
        this.name = name;
        this.dataStart = dataStart;
        this.dataDeadline = dataDeadline;
        this.id = ++n;
    }

    Task(int id, TaskPriority taskPriority, String name, Calendar dataStart, Calendar dataDeadline){
        this.id = id;
        this.taskPriority = taskPriority;
        this.name = name;
        this.dataStart = dataStart;
        this.dataDeadline = dataDeadline;
        
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Calendar getDataStart() {
        return dataStart;
    }
    public void setDataStart(Calendar dataStart) {
        this.dataStart = dataStart;
    }
    public Calendar getDataDeadline() {
        return dataDeadline;
    }
    public void setDataDeadline(Calendar dataDeadline) {
        this.dataDeadline = dataDeadline;
    }
    // public TaskManager getTaskManager() {
    //     return taskManager;
    // }
    // public void setTaskManager(TaskManager taskManager) {
    //     this.taskManager = taskManager;
    // }
    public static int getN() {
        return n;
    }
    public static void setN(int n) {
        Task.n = n;
    }

    @Override
    public String toString() {
        return id + "," +
                taskPriority  + "," +
                name + "," +
                data(dataStart) + "," +
                data(dataDeadline);
    }

    private String data(Calendar data){
        return data.get(Calendar.YEAR) + "/" + 
                (data.get(Calendar.MONTH) + 1) + "/" + 
                data.get(Calendar.DAY_OF_MONTH);
    }
    
}
