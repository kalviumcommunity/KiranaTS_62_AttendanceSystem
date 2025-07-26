package com.school;

public class AttendanceRecord {
    private int studentId;
    private int courseId;
    private String status;

    public AttendanceRecord(int studentId, int courseId, String status) {
        this.studentId = studentId;
        this.courseId = courseId;
        if (status.equalsIgnoreCase("present") || status.equalsIgnoreCase("absent")) {
            this.status = status;
        } else {
            this.status = "Invalid";
            System.out.println("Invalid attendance status. Attendance record not created.");
        }
    }
public int getStudentId(){
    return studentId;
}
public int getCourseId() {
    return courseId;
}
public String getStatus() {
    return status;
}
    public void displayRecord() {
        System.out.println("Attendance Record -Student ID:" + studentId + " in course ID: " + courseId + " has status: " + status);
    }
}