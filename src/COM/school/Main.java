package com.school;
import java.util.ArrayList;
import java.util.List;
public class Main{
    public static void main(String [] args){
            System.out.println("--- School Attendance System ---");

        // Student[] students = new Student[2];
        // students[0] = new Student();
        // students[0].setDetails(1, "Alice Wonderland");
        // students[1] = new Student();
        // students[1].setDetails(2, "Bob The Builder");

        Student student1 = new Student("Alice Wonderland");
        Student student2 = new Student("Bob The Builder");
        
        // Course[] courses = new Course[2];
        
        // courses[0] = new Course();
        // courses[0].setDetails("CS101", "Intro to Programming");
        // courses[1] = new Course();
        // courses[1].setDetails("MA202", "Linear Algebra");
        Course course1 = new Course("CS101: Intro to Programming");
        Course course2 = new Course("MA202: Linear Algebra");
       

        System.out.println("\nRegistered Students:");
        // for (Student student : students) {
        //     if (student != null) student.displayDetails();
        // }
        student1.displayDetails();
        student2.displayDetails();
     


        System.out.println("\nAvailable Courses:");
        // for (Course course : courses) {
        //     if (course != null) course.displayDetails();
        // }
        course1.displayDetails();
        course2.displayDetails();
       
        System.out.println("\nSession 2: Core Domain Modelling Complete.");
        System.out.println("New Student is added");
        Student student3 = new Student("Charlie Brown");
        student3.displayDetails();
        Course course3 = new Course("EN101: English Literature");
        course3.displayDetails();
        System.out.println("\nSession 3: Constructor initializing and Auto-ID generation is completed.");

List<AttendanceRecord> attendanceLog = new ArrayList<>();

AttendanceRecord record1 = new AttendanceRecord(student1.getStudentId(), course1.getCourseId(), "present");
AttendanceRecord record2 = new AttendanceRecord(student2.getStudentId(), course2.getCourseId(), "Late");
AttendanceRecord record3 = new AttendanceRecord(student3.getStudentId(), course3.getCourseId(), "absent");


attendanceLog.add(record1);
attendanceLog.add(record2);
attendanceLog.add(record3);

System.out.println("\nAttendance Records:");
for (AttendanceRecord record : attendanceLog) {
    record.displayRecord();
}
System.out.println("\nSession 4: Data encapsulation and Attendance recording completed");

    }
}