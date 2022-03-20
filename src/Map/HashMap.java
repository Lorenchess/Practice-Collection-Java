package Map;

import com.chess4math.Student;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMap {
    public static void main(String[] args) {

        /**
         * HashMap is a composition of two collections or table of two columns:
         * a Set of keys and a Collection of values. Key-value pairs
         *
         * Can create a read-only of Map using a Method of...
         * A var-arg method ofEntries
         * Map<Product, Integer> items = Map.of(new Good("Cake"), Integer.valueOf(2));
         */

        Student st1 = new Student("Peter Ledo",320);
        Student st2 = new Student("Oniel Sanchez", 333);
        Student st3 = new Student("Michael Lorente",111);

        Map<Student, Integer> attendance = new java.util.HashMap<>();

        attendance.put(st1, 1985);
        attendance.put(st3, 2007);
        Integer prevStudent = attendance.put(st1, 1900);
        System.out.println(prevStudent); //1985 returns the prev element always
        System.out.println(attendance);

        boolean michael = attendance.containsKey(st3);
        System.out.println(michael); //true

        boolean has1985 = attendance.containsValue(1985);
        System.out.println(has1985); //false

        System.out.println("------ Iterate------");


        /**
         * Iterate over with the "enhance loop" or the Iterator
         */

        Set<Student> keys = attendance.keySet();
        Collection<Integer> values = attendance.values();

        for (Student student : keys) {
            Integer quantity = attendance.get(student); //1900 2007
            System.out.println(quantity);
            System.out.println(student);
        }

        for (Integer quantity : values) {
            System.out.println(quantity); //1900  2007
        }


    }
}
