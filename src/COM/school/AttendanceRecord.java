package com.school;

public class AttendanceRecord implements Storable {
    private final int studentId;
    private final int courseId;
    private String status;

    public AttendanceRecord(int studentId, int courseId, String status) {
        this.studentId = studentId;
        this.courseId = courseId;
        if (status.equalsIgnoreCase("present") || status.equalsIgnoreCase("DayDreaming")) {
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

    public void setStatus(String status) {
        this.status = status;
    }

    public String toDataString() {
       return "Attendance," + studentId + "," + courseId + "," + status;
    }
}