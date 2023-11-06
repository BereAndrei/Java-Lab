package lab4;
import java.util.Scanner;
public class First {

    public static String mijloc(String cuvant) {
        if (cuvant.length() % 2 == 0)
            return String.valueOf(cuvant.charAt(cuvant.length() / 2 - 1)) +
                    String.valueOf(cuvant.charAt(cuvant.length() / 2));
        else
            return String.valueOf(cuvant.charAt(cuvant.length() / 2));
    }

    public static Integer sumaCifrelor(Integer input){
        Integer suma = 0;
        while(input>0) {
        suma = suma + input % 10;
        input = input/10;
        }
        return suma;
    }

    public static void main(String[] args) {
        //mijloc
        System.out.println(mijloc("3501"));
        System.out.println(mijloc("350"));
        /*/
        square1 = new Patrat();
        Rectangle rectangle1 = new Rectangle();

        rectangle1.setLatura1(14);
        rectangle1.setLatura2(15);
        square1.setLatura1(5);
        /*/


        System.out.println("\n\n");
        Scanner sc = new Scanner(System.in);

        //suma cifrelor
        System.out.println("Introduceti numarul pentru a calcula suma cifrelor: ");
        Integer intreg = sc.nextInt();
        System.out.println(sumaCifrelor(intreg));

        System.out.println("\n\n");

        //clasa Dog

        Dog dog1 = new Dog("Fido", "Pitbull");
        Dog dog2 = new Dog("Rex", "Husky");

        System.out.println(dog1.getNume()+ " " + dog1.getRasa());
        System.out.println(dog2.getNume()+ " " + dog2.getRasa());
        dog1.setNume("Jack");
        dog1.setRasa("Dalmatian");
        System.out.println(dog1.getNume()+ " " + dog1.getRasa());

        System.out.println("\n\n");

        //clasa Rectangle
        Rectangle r1 = new Rectangle(10, 10);
        System.out.println("Perimetrul este:" + r1.calculPerimetru());
        System.out.println("Aria este: " + r1.calculArie());

        //clasa Person
        String[] materii = {"Algebra", "Analiza", "Geometrie"};
        Profesor p1 = new Profesor("Ion", materii);
        Integer[] note = {10, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Student s1 = new Student("Vali", note);


        System.out.println("\n\nCourses: ");
        for(String course: p1.getCourses())
            System.out.println(course);


        System.out.println("\n\nGrades: ");
        for (Integer grade:s1.getGrades())
            System.out.println(grade);

    }
}
