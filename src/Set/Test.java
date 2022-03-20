package Set;

import com.chess4math.Student;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(new Student("Michael Lorente",111),
                                                  new Student("Peter Ledo",320),
                                                  new Student("Oniel Sanchez", 333),
                                                  new Student("Michael Lorente",111));
    /**
     * Load factor is a measure of how full the hash table is allowed to get
     * before its capacity is automatically increased.
     */
        Set<Student> studentSet = new HashSet<>(10, (float) 0.85); //0.75 is the default value
        studentSet.addAll(studentList);

     for (var student:studentSet)  {
         System.out.println(student);
     }


    }
}
