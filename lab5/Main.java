package lab5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Cat firstCat = new Cat("Tom", "grey", 5);
        Cat secondCat = new Cat("Garfield", "orange", 8);

        /*/
        firstCat.play();
        firstCat.feed();
        firstCat.sleep();
        firstCat.meow();


        firstCat.getAge();
        firstCat.getName();
        firstCat.getColour();
        /*/
        String name;
        String email;
        Integer hourRate;
        Integer capacity;
        Integer freeDays;

        Scanner console = new Scanner(System.in);
        System.out.println("New employee data:\nName:");
        name = console.nextLine();
        System.out.println("Email:");
        email = console.nextLine();
        System.out.println("Hourly Rate:");
        hourRate = console.nextInt();
        System.out.println("Capacity:");
        capacity = console.nextInt();
        System.out.println("Free days:");
        freeDays = console.nextInt();


        Employee employee1 = new Employee(name,email,hourRate, capacity, freeDays);
        //System.out.println(employee1.calculateDailyIncome());
        employee1.calculateMonthlyIncome();

    }

}
