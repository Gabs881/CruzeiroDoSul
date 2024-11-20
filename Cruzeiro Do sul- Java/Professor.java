// Serve para indentificar, armazenar e coletar as informações dos proferssores
// Herda os atributos base de person

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Professor extends Person {
    private List<Course> courses = new ArrayList<>();

    public Professor(String name, String cpf, String tel) {
        super(name, cpf, tel);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

   @Override
   public boolean equals(Object obj) {
       if (obj instanceof Professor other) {
           return Objects.equals(cpf, other.cpf);
       }
       return false;
   }

   // Caso haja sobrecarga do operador == 

   @Override
   public String toString() {
       return "Name: " + name + "\n" +
        "CPF: " + cpf + "\n" +
         "Telefone: " + tel;
   }

}
     
       