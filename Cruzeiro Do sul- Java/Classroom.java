// Será criada a entidade Classroom, e meios de manusea-la em outras classes.
// Cada Classroom vai ter um ID, uma capacidade e uma Lista de Cursos.

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Classroom {
    private final String id;
    private final int capacity;
    List<Course> courses = new ArrayList<>();

    public Classroom(String id, int capacity){
        this.id = id;
        this.capacity = capacity;
    }

    //Getters
    public String getId(){
        return id;
    }

    public int getCapacity(){
        return capacity;
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

    // Caso haja sobrecarga do operador == 
    @Override
    public boolean equals (Object obj){
        if (obj instanceof Classroom other) {
            return Objects.equals(id, other.id);
        }
        return false;
    }

    // Caso haja sobrecarga do operador <<
    @Override
    public String toString() {
        return id + " " + capacity;
    }
}