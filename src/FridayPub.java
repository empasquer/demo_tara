import java.util.ArrayList;
import java.util.Collections;

public class FridayPub {
    private ArrayList<Student> students = new ArrayList<>();


    public static void main(String[] args) {
        new FridayPub().run();
    }

    private void run() {
        students.add(new Student("Oliver", 23));
        students.add(new Student("Lea", 27));

        System.out.println(students);

        Collections.sort(students, new StudentNameComparator());

        System.out.println(students);
        System.out.println("*************************");

        Collections.sort(students, new StudentAgeComparator());
        System.out.println(students);



    }

}
