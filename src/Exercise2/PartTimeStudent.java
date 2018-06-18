package Exercise2;

public class PartTimeStudent extends Student{

    public PartTimeStudent(String name, double creditHours){
        this.name = name;
        this.creditHours = creditHours;
        this.fullTimeStatus = false;
    }

    @Override
    public double getTuition() {
        return creditHours * 100;
    }
}
