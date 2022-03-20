package com.chess4math;

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

}
