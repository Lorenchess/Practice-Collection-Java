package Deque;

import com.chess4math.Student;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Student st1 = new Student("Peter Ledo",320);
        Student st2 = new Student("Oniel Sanchez", 333);
        Student st3 = new Student("Michael Lorente",111);

        /**
         * firstIn & firstLast, lastIn & firstOut algorithms (FIFO and LIFO)
         */


        Deque<Student> studentDeque = new ArrayDeque<>();

        studentDeque.poll(); //null

        studentDeque.offerFirst(st1); //top of the deque
        System.out.println(studentDeque);

        studentDeque.offerFirst(st2); //place on top and st1 to second slot
        System.out.println(studentDeque);

        System.out.println("--------------pollFirst----------------");

        Student oniel = studentDeque.pollFirst(); //returns the first element and removes it from the deque

        System.out.println(oniel);
        System.out.println(studentDeque);

        System.out.println("--------------peekFirst----------------");

        Student firstStudent = studentDeque.peekFirst();
        System.out.println(firstStudent);
        System.out.println(studentDeque);

        System.out.println("--------------offerLast----------------");

        System.out.println(studentDeque.offerLast(st3));
        System.out.println(studentDeque);
        System.out.println(studentDeque.offerLast(st2));
        System.out.println(studentDeque);

        System.out.println("--------------pollLast----------------");

        System.out.println(studentDeque.pollLast());
        System.out.println(studentDeque);

        System.out.println("--------------peekLast----------------");

        System.out.println(studentDeque.peekLast());
        System.out.println(studentDeque);

        /**
         * No offerLast or offerFirst null elements
         */
    }

}
