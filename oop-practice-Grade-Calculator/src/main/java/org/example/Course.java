package org.example;

public class Course {

    private final String subject; // 과목명
    private final int credit; // 학점
    private final String grade; // 성적

    public Course(String subject, int creadit, String grade) {

        this.subject = subject;
        this.credit = creadit;
        this.grade = grade;
    }

    public double multiplyCreditAndCourseGrade() {

        return credit * getGradeToNumber();
    }

    public int getCredit() {
        return credit;
    }

    public double getGradeToNumber() {

        return switch (this.grade) {
            case "A+" -> 4.5;
            case "A" -> 4.0;
            case "B+" -> 3.5;
            case "B" -> 3.0;
            case "C+" -> 2.5;
            case "C" -> 2.0;
            case "D+" -> 1.5;
            case "D" -> 1.0;
            default -> 0;
        };
    }

}
