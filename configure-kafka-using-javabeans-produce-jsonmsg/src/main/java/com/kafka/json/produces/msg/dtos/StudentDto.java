package com.kafka.json.produces.msg.dtos;

public class StudentDto {

    private Long studentId;

    private String studentName;

    private String studentAddress;

    @Override
    public String toString() {
        return "StudentDto{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }

    private String subject;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
