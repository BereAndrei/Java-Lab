package lab4;

public class Profesor extends Person{
    String[] courses;

    public Profesor(String name, String[] courses) {
        super(name);
        this.courses = courses;
    }

    public String[] getCourses() {
        return courses;
    }

}
