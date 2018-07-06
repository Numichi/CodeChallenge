package tasks.myfriends.wfrobi.org.mik.oopkata.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class University {
    private List<Person> list = new ArrayList<>();

    public void addTeacher(Teacher teacher) {
        list.add(teacher);
    }

    public void addStudent(Student student) {
        list.add(student);
    }

    public void addAssistant(Assistant assistant) {
        list.add(assistant);
    }

    public Set<Student> getStudents() {
        Set<Student> result = new HashSet<>();
        for (Person person : list) {
            if (person.isStudent()) {
                result.add((Student) person);
            }
        }

        return result;
    }

    public Person findPersonByName(String s) {
        if (!(s == null || s.isEmpty())) {
            for (Person person : list) {
                if (person.getName().equals(s)) {
                    return person;
                }
            }
        }

        return null;
    }
}
