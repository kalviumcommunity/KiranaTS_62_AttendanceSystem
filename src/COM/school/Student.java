package com.school;
public class Student extends Person {
    // private static int nextStudentIdCounter= 1;
    // int studentId;
    // String name;
    private String gradeLevel;

    public Student(String name, String gradeLevel) {
        // this.studentId = nextStudentIdCounter++;
        // this.name = name;
        super(name);
        this.gradeLevel = gradeLevel;
    }
//    public int getStudentId() {
//        return studentId;
//    }

//     public String getName() {
//         return name;
//     }

//     public void displayDetails() {
//         System.out.println("Student ID: " + this.studentId + ", Name: " + this.name);
//     }

    public String getGradeLevel() {
        return gradeLevel;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Grade Level: " + gradeLevel);
    }
}