package PlanningTask;

import java.io.IOException;
import java.text.ParseException;

public interface WorkWithCSV {
   
   public void readTasksCSV(String name) throws IOException, ParseException ;
   public void writeTasksCSV()  throws IOException ;
   
}
