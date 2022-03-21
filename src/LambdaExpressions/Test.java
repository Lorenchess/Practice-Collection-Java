package LambdaExpressions;

import com.chess4math.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {

        /**
         * Lambda expressions implements the only abstract method provided by the functional interface
         */

        List<String> namesList = new ArrayList<>(List.of("Miguel", "Isa", "Anny", "Robert", "Lorente", "Ramon"));

        Collections.sort(namesList);

        System.out.println(namesList);

        namesList.removeIf(name -> name.startsWith("R"));
        System.out.println(namesList);

        System.out.println("-----using Default methods-----");

        Student student1 = new Student("Michael Lorente",111);
        Student student2 = new Student("Peter Ledo",130);
        Student student3 = new Student("Isan Sanchez",340);
        Student student4 = new Student("Isa White",777);
        Student student5 = new Student("Oniel Sanchez",313);

        List<Student> studentList = new ArrayList<>(List.of(student1,student2,student3,student4,student5));

        //Comparator<Student> sortNames = (n1, n2) -> n1.getFullName().compareTo(n2.getFullName());

        Comparator<Student> sortNames = Comparator.comparing(Student::getFullName);
        Comparator<Student> sortId = Comparator.comparing(Student::getId);

        //Collections.sort(studentList,sortNames.thenComparing(sortId));

        studentList.sort(sortNames.thenComparing(sortId));
        System.out.println(studentList);

        System.out.println("-------Predicate------");

        Predicate<Student> filterId = st -> st.getId() > 700;

        studentList.removeIf(filterId.negate());

        System.out.println(studentList);









    }
}
