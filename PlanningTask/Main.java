package PlanningTask;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
    
        TaskManager anna = new TaskManager("Анна", "Петрова", Position.secretary);
        System.out.println(anna);
        System.out.println();

        
        JobTask one = new JobTask(TaskPriority.LOW, "one", new GregorianCalendar(), dateDeadline(5), anna);
        System.out.println(one);
        System.out.println();
        
        JobTask two = new JobTask(TaskPriority.HIGH, "two", new GregorianCalendar(), dateDeadline(7), anna);
        System.out.println(two);
        System.out.println();

        ArrayList<JobTask> t = new ArrayList<>();
        t.add(one);
        t.add(two);
        Collections.sort(t);
        System.out.println(t);
        JobPlanning plan = new JobPlanning("myTask");
        plan.setTasks(t);
        System.out.println();
    
       
        JobTask three = new JobTask(TaskPriority.HIGH, "three", new GregorianCalendar(), dateDeadline(8), anna);
        System.out.println(three);
        System.out.println();

        plan.addTasks(three);
        t = plan.getTasks();
        Collections.sort(t);
        System.out.println(t);
        System.out.println();

        JobTask four = new JobTask(TaskPriority.MEDIUM, "four", new GregorianCalendar(), dateDeadline(2), anna);
        plan.addTasks(four);
        t = plan.getTasks();
        Collections.sort(t);
        for (JobTask c : t) {
            System.out.println(c);
        }
        System.out.println();

        // записали задачи в файл
        try {
            plan.writeTasksCSV();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // считали задачи из файла, добавили
        try {
            plan.readTasksCSV("newTasks.csv");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        t = plan.getTasks();
        Collections.sort(t);
        for (JobTask c : t) {
            System.out.println(c);
        }
        System.out.println();

        // // записали задачи в файл
        // try {
        //     plan.writeTasksCSV();
        // } catch (IOException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }

    }

    public static Calendar dateDeadline(int n){
        Calendar c = new GregorianCalendar();
        c.add(Calendar.DAY_OF_YEAR, n);
        return c;
    }

}
