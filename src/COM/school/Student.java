package com.school;
public class Student {
    private static int nextStudentIdCounter= 1; // static variable to keep track of the next student ID
    int studentId;
    String name;

    public Student(String name) {
        this.studentId = nextStudentIdCounter++;
        this.name = name;
    }
   public int getStudentId() {
       return studentId;
   }

    public String getName() {
        return name;
    }

    public void displayDetails() {
        System.out.println("Student ID: " + this.studentId + ", Name: " + this.name);
    }
}