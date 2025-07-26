package com.school;

public class Course {
    private static int courseIdCounter = 1; // static variable to keep track of the next course ID
    int courseId; // e.g., "CS101"
    String courseName;

    public Course(String name) {
        this.courseId = courseIdCounter++; // generate course ID like C1, C2, etc.
        this.courseName = name;
    }
    // public void setDetails(String id, String cName) {
    //     this.courseId = id;
    //     this.courseName = cName;
    // }

    public void displayDetails() {
        System.out.println("Course ID: " + this.courseId + ", Name: " + this.courseName);
    }
}