package CollectionsClass;

import com.chess4math.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Student student1 = new Student("Michael Lorente",111);
        Student student2 = new Student("Peter Ledo",130);
        Student student3 = new Student("Isan Sanchez",340);
        Student student4 = new Student("Isa White",777);
        Student student5 = new Student("Oniel Sanchez",313);

       List<Student> studentList = new ArrayList<>(List.of(student1,student2,student3,student4,student5));

        Collections.sort(studentList, new NameComparator());

        System.out.println("----Comparator---sort---reverse----");

        System.out.println(studentList);

        Collections.reverse(studentList);

        System.out.println(studentList);

        System.out.println("----Comparator---using Lambda Expression----");

        //Collections.sort(studentList, (st1,st2) -> st1.getFullName().compareTo(st2.getFullName()));

        Collections.sort(studentList, Comparator.comparing(Student::getFullName));

        System.out.println(studentList);










    }
}
