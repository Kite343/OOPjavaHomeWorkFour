package PlanningTask;

public enum TaskPriority {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    private int code;
    TaskPriority(int code){
        this.code = code;
    }
    public int getCode(){ return code;}
}
