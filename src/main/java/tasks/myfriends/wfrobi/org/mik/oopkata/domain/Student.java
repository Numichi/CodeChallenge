package tasks.myfriends.wfrobi.org.mik.oopkata.domain;

import java.util.Objects;

public class Student extends AbstractPerson
{
    private Specialization specialization;

    public Student(String name, int birthYear, Specialization specialization)
    {
        super(name, birthYear);
        this.specialization = specialization;
    }

    @Override
    public Specialization getSpecialization()
    {
        return specialization;
    }

    @Override
    public boolean isStudent()
    {
        return true;
    }

    @Override
    public void setName(String name)
    {
        super.setName(name == null || name.isEmpty() ? "Student" : name);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getSpecialization() == student.getSpecialization()
                && getBirthYear() == student.getBirthYear()
                && getName().equals(student.getName());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getSpecialization(), getBirthYear(), getName());
    }
}
