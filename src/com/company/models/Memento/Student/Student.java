package com.company.models.Memento.Student;

public class Student {
    private String name;
    private int academicYear;

    public Student(String name) {
        this.name = name;
        academicYear = 1;
    }

    public void passYear() {
        this.academicYear++;
    }

    // Get snapshot (returns the current state) and should be called before changing the instance and saved somewhere
    public StudentMemento getMemento() {
        StudentMemento student = new StudentMemento();
        student.setName(this.name);
        student.setAcademicYear(this.academicYear);

        return student;
    }

    // Undo, should be called when poping the state from history
    public void setMemento(StudentMemento studentMemento) {
        this.name = studentMemento.getName();
        this.academicYear = studentMemento.getAcademicYear();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", academicYear=" + academicYear +
                '}';
    }
}
