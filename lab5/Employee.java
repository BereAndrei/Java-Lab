package lab5;

public class Employee {
    private  String name;
    private String email;
    private Integer hourRate; // cat castiga pe ora
    private Integer capacity; // ore lucrate pe zi
    private Integer freeDays;



    public Employee(String name, String email, Integer hourRate, Integer capacity, Integer freeDays) {
        this.name = name;
        this.email = email;
        this.hourRate = hourRate;
        this.capacity = capacity;
        this.freeDays = freeDays;
    }

    private Integer calculateDailyIncome(){
        //hourRate * capacity

        return this.hourRate*this.capacity;

    }

    public void calculateMonthlyIncome(){
        //calculateDailyIncome() * (21 - freeDays)
        System.out.println(calculateDailyIncome()*(21-this.freeDays));
    }

}
