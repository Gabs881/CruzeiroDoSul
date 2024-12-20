// Criarei a entidade Course e seus métodos que vão ser usados em outras
// Cada course tem um ID, nome, days, professor, classroom e Students

import java.util.ArrayList;
import java.util.List;

public class Course{
    private final String id;
    private String name;
    private boolean[] days;

    private Classroom classroom;
    private Professor professor;
    private List<Student> students = new ArrayList<>();

    public Course(String id, String name, boolean[] days){
        this.id = id;
        this.name = name;
        this.days = days;
    }

    //getters
    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public boolean[] getDays(){
        return days;
    }

    public final Classroom getClassroom() { return classroom; }

    public final Professor getProfessor() { return professor; }
    
    List<Student> getStudents() { return students; }

    //Setters

    public void setDays(boolean[] days) { this.days = days; }

    public void setClassroom(Classroom classroom) { this.classroom = classroom; }

    public void setProfessor(Professor professor) { this.professor = professor; }

    public void setName (String name) { this.name = name; }



    public void removeProfessor() { this.professor = null; }

    public void addStudent(Student student) { students.add(student); } 

    public void removeStudent(Student student) { students.remove(student); }


    // Caso haja sobrecarga do operador ==
    public boolean equals(Course curso2) {
        return this.id.equals(curso2.id);
    }

    // Caso haja sobrecarga do operador <<
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append("\n");
        sb.append("ID: ").append(id).append("\n");
        sb.append("Days: ");
        for (boolean day : days) {
            sb.append(day ? "1" : "0");
        }
        sb.append("\n");
        return sb.toString();
    }
}