package PlanningTask;

public abstract class Planning {
    protected String name;
    // в абстрактном классевозможны еще такие параметры как:
    // id, какие-то данные пользователя планировщика

    Planning(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
