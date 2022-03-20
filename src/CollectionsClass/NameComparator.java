package CollectionsClass;

import com.chess4math.Student;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getFullName().compareTo(student2.getFullName());
    }

    @Override
    public Comparator<Student> reversed() {
        return Comparator.super.reversed();
    }
}
