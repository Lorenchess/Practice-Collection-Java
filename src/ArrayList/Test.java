package ArrayList;

import com.chess4math.Student;
import com.chess4math.Teacher;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Ramon", "Lorente", "Chess");
        Teacher teacher2 = new Teacher("Jennifer", "Silva", "Digital Art");
        Teacher teacher3 = new Teacher("Robert", "Peralta", "Social Studies");
        Teacher teacher4 = new Teacher("Paul", "Froshet", "Physical Education");
        Teacher teacher5 = new Teacher("Paulina", "Diaz", "Math");

        Student student1 = new Student("Michael Lorente",111);
        Student student2 = new Student("Peter Ledo",130);
        Student student3 = new Student("Isan Sanchez",340);
        Student student4 = new Student("Isa White",777);
        Student student5 = new Student("Oniel Sanchez",313);


        Set<Teacher> teacherSet = new HashSet<>();
        teacherSet.add(teacher1);
        teacherSet.add(teacher2);
        teacherSet.add(teacher3);
        teacherSet.add(teacher4);
        teacherSet.add(teacher5);

        List<Teacher> teacherList = new ArrayList<>(teacherSet); //comes without order...

        List<Teacher> teacherList1 = Arrays.asList(teacher1,teacher2,teacher3,teacher4, teacher5);

        List<Teacher> teacherList2 = List.of(teacher1, teacher2, teacher3, teacher4, teacher5); //immutable collection

        List<Teacher> teacherList3 = new ArrayList<>(List.of(teacher1, teacher2, teacher3, teacher4, teacher5));

        /** old style using iterator but enhance loop is easier and also use the iterator under the hood

        var iterator = teacherList.iterator();
        while (iterator.hasNext()) {
            var current  = iterator.next();
            System.out.println(current);
        }


        // easier style foreach syntactic sugar of iterator
        for (Teacher current : teacherList) {
            System.out.println(current);
        }

         */

        /**
         *     remove element not supported with the List.of operation ...Exception in thread "main" java.lang.UnsupportedOperationException
         *     ...AbstractImmutableCollection.remove(ImmutableCollections.java:150)
         *
         *         teacherList2.remove(teacher5);
         *
         *         for (Teacher curr : teacherList2) {
         *             System.out.println(curr);
         *         }
         *
         */

        System.out.println("_______________________________");

        for (Teacher curr : teacherList3) {
            System.out.println(curr);
        }

        System.out.println("_______________________________");

        teacherList3.remove(teacher5);

        for (Teacher curr : teacherList3) {
            System.out.println(curr);
        }

        System.out.println("________________________");

        List<Teacher> other = new ArrayList<>(List.of(teacher1, teacher2, teacher3, teacher4, teacher5));

        System.out.println(other == teacherList1); //false
        System.out.println(other.equals(teacherList1)); //true

        Collections.addAll(other, teacher1, teacher2); //List support duplicates

        System.out.println(other);

        System.out.println("________________________");
        /**
         * Adding elements in between the list pushes the elements down
         */

        List<Teacher> testing = new ArrayList<>(4);
        testing.add(teacher1);
        testing.add(teacher2);
        //the slots index 2 and 3 are null by default
        testing.add(2, null);
        System.out.println(testing);

        testing.add(3, teacher1);
        System.out.println(testing);

        testing.add(2, teacher1);
        System.out.println(testing); //as you see it pushes to index 3 and 4 null and teacher1 to index 4 and 5 and fill index 2 with teacher 1

        testing.set(2, teacher3);
        System.out.println(testing);

        System.out.println("________________________");

        Set<Student> studentSet = new HashSet<>();
        Collections.addAll(studentSet, student1,student2,student3,student4,student5);

        System.out.println(studentSet);












    }
}
