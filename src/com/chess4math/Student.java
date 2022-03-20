package com.chess4math;

import java.util.Comparator;
import java.util.Objects;
import java.util.function.Predicate;

public class Student {
    private String fullName;
    private int id;

    public Student(String fullName, int id) {
        this.fullName = fullName;
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", id=" + id +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getId() == student.getId() && getFullName().equals(student.getFullName());
    }




    @Override
    public int hashCode() {
        return Objects.hash(getFullName(), getId());
    }


}
