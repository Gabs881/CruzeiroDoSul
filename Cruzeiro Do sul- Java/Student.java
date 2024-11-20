// Serve para indentificar, armazenar e coletar as informações dos estudantes
// Herda os atributos base de person

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student extends Person{
    private final String id;
    List<Course> courses = new ArrayList<>();

    public Student(String name, String cpf, String tel, String id){
        super(name, cpf, tel);
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public List<Course> getCourses(){
        return courses;
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public void removeCourse(Course course){
        courses.remove(course);
    }

    public void studentTest(){
        System.out.printIn("Student Test");
    }

    @Override
    public boolean equals (Object obj) {
         if (obj instanceof Student other) {
            return Objects.equals(id, other.id);
        }
        return false;
    }
         // Caso haja sobrecarga do operador == 

    @Override
    public String toString(){
        return "Name: " + name + "\n" +
                "CPF: " + cpf + "\n" +
                "Telephone:" + tel + "\n" +
                "Matriculate: " + id;
    }   
}



    