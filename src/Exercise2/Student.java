package Exercise2;

public abstract class Student {
    String name;
    boolean fullTimeStatus;
    double creditHours;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student :" + name;
    }

    public boolean isFullTimeStatus() {
        return fullTimeStatus;
    }

    public double getCreditHours() {
        return creditHours;
    }


    public abstract double getTuition();


}
