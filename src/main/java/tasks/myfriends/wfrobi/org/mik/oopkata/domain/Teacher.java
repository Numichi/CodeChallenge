package tasks.myfriends.wfrobi.org.mik.oopkata.domain;

import java.util.Objects;

public class Teacher extends AbstractPerson {
    
    private Institute institute;
    
    public Teacher(
        String name,
        int birthYear,
        Institute institute
    ) {
        super(name, birthYear);
        this.institute = institute;
    }
    
    @Override
    public Institute getInstitute() {
        return institute;
    }
    
    @Override
    public boolean isTeacher() {
        return true;
    }
    
    @Override
    public void setName(String name) {
        super.setName(name == null || name.isEmpty() ? "Teacher" : name);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Teacher)) {
            return false;
        }
        Teacher teacher = (Teacher) o;
        return getInstitute() == teacher.getInstitute()
            && getBirthYear() == teacher.getBirthYear()
            && getName().equals(teacher.getName());
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getInstitute(), getBirthYear(), getName());
    }
}
