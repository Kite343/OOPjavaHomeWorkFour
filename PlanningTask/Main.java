package PlanningTask;

// import java.util.Date;
// import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
     TaskManager anna = new TaskManager("Анна", "Петрова", Position.secretary);
     System.out.println(anna);
     System.out.println();

     Calendar c1 = new GregorianCalendar();
     Calendar c2 = new GregorianCalendar();
     c2.add(Calendar.DAY_OF_YEAR, 7);

     JobTask one = new JobTask(TaskPriority.HIGH, "one", c1, c2, anna);
     System.out.println(one);
     System.out.println();

     c2.add(Calendar.DAY_OF_YEAR, 3);
     JobTask two = new JobTask(TaskPriority.LOW, "two", c1, c2, anna);
     System.out.println(two);
     System.out.println();

    }
}
