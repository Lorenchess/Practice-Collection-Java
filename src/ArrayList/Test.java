package ArrayList;

import com.chess4math.Teacher;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Ramon", "Lorente", "Chess");
        Teacher teacher2 = new Teacher("Jennifer", "Silva", "Digital Art");
        Teacher teacher3 = new Teacher("Robert", "Peralta", "Social Studies");
        Teacher teacher4 = new Teacher("Paul", "Froshet", "Physical Education");
        Teacher teacher5 = new Teacher("Paulina", "Diaz", "Math");

        Set<Teacher> teacherSet = new HashSet<>();
        teacherSet.add(teacher1);
        teacherSet.add(teacher2);
        teacherSet.add(teacher3);
        teacherSet.add(teacher4);
        teacherSet.add(teacher5);

        List<Teacher> teacherList = new ArrayList<>(teacherSet);
    }
}
