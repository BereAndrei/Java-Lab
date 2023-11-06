package lab4;

public class Student extends Person {
    private Integer[] grades;

    public Student(String name, Integer[] grades) {
        super(name);
        this.grades = grades;
    }

    public Integer[] getGrades() {
        return grades;
    }


}
