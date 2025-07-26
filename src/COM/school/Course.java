package com.school;

public class Course implements Storable {
    private static int courseIdCounter = 101; // static variable to keep track of the next course ID
    int courseId; // e.g., "CS101"
    String courseName;

    public Course(String name) {
        this.courseId = courseIdCounter++; // generate course ID like C1, C2, etc.
        this.courseName = name;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayDetails() {
        System.out.println("Course ID: " + this.courseId + ", Name: " + this.courseName);
    }

    public String toDataString() {
        return "Course," + courseId + "," + courseName;
    }
}