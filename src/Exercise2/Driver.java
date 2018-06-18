package Exercise2;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {


        for(int i = 0; i < 3; i++){
            System.out.print("Please enter the students name: ");
            String name = new Scanner(System.in).nextLine();

            System.out.println();
            System.out.printf("Is %s a full-time student? (y/n) :",name);
            String response = new Scanner(System.in).nextLine();

            System.out.println();
            System.out.printf("How many credit hours for this student:");
            double hours = new Scanner(System.in).nextDouble();


            Student student1;
            if(response.toLowerCase() == "y"){
                 student1 = new FullTimeStudent(name, hours );
            }else{
                 student1 = new PartTimeStudent(name, hours );
            }


            System.out.println(student1);
            System.out.println();
        }
    }
}

