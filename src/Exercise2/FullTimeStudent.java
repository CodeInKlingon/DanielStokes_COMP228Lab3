package Exercise2;

public class FullTimeStudent extends Student {

    public FullTimeStudent(String name, double creditHours){
        this.name = name;
        this.creditHours = creditHours;
        this.fullTimeStatus = true;
    }

    @Override
    public double getTuition() {
        return 2000;
    }
}
