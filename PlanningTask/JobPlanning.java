package PlanningTask;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
// import java.util.Map;
import java.util.Scanner;

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

    public void addTasks(JobTask task) {
        this.tasks.add(task);
    }

    

    @Override
    public void readTasksCSV(String nameFile) throws IOException, ParseException {
        // TODO Auto-generated method stub
        ArrayList<String> tasksString = new ArrayList<>();
        File file = new File(nameFile);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();            
            tasksString.add(line);
        }
        // System.out.println(tasksString);
        for (String l : tasksString) {            
            String[] taskNew = l.split(";");
            this.tasks.add(newTask(taskNew));
        }        
    }

    private JobTask newTask(String[] taskNew){
        HashMap<String, Position> pos = positions();
        String[] meneger = taskNew[5].split("/");
        TaskManager tempMeneger = new TaskManager(meneger[0], meneger[1], pos.get(meneger[2]));

        HashMap<String, TaskPriority> priority = priorityTask();

        String[] date1 = taskNew[3].split("/");
        Calendar c1 = new GregorianCalendar(Integer.parseInt(date1[0]), Integer.parseInt(date1[1]) - 1, Integer.parseInt(date1[2]));
        String[] date2 = taskNew[4].split("/");
        Calendar c2 = new GregorianCalendar(Integer.parseInt(date2[0]), Integer.parseInt(date2[1]) - 1, Integer.parseInt(date2[2]));

        JobTask temp = new JobTask(Integer.parseInt(taskNew[0]), priority.get(taskNew[1]), taskNew[2], c1, c2, tempMeneger);
        // System.out.println(temp);
        return temp;
    }

    
    @Override
    public void writeTasksCSV() throws IOException {
        String fileName = super.name + ".csv";
        FileWriter fileWriter = new FileWriter(fileName);
        for (JobTask t : this.tasks) {
            fileWriter.write(t.toString()+"\n");

        }
        fileWriter.flush();
        
    }

    private HashMap<String, TaskPriority> priorityTask(){
        HashMap<String, TaskPriority> priority = new HashMap<String, TaskPriority>();
        priority.put("HIGH", TaskPriority.HIGH);
        priority.put("MEDIUM", TaskPriority.MEDIUM);
        priority.put("LOW", TaskPriority.LOW);
        return priority;
    }

    private HashMap<String, Position> positions(){
        HashMap<String, Position> position = new HashMap<String, Position>();
        position.put("chief", Position.chief);
        position.put("accountant", Position.accountant);
        position.put("secretary", Position.secretary);
        return position;
    }

    
}
