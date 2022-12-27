package PlanningTask;

import java.util.ArrayList;

public interface WorkWithCSV <T extends Task>{
   public void createCSV(ArrayList<T> tasks, String name);
   public ArrayList<String> readTasksCSV(String name);
   public void writeTasksCSV(ArrayList<T> tasks, String name);
}
