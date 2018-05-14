package myfriends.wfrobi.org.mik.oopkata.domain;

public interface Person
{
    void setName(String name);
    String getName();
    void setBirthYear(int birthYear);
    int getBirthYear();
    boolean isStudent();
    boolean isTeacher();
    boolean isAssistant();
    Institute getInstitute() throws Exception;
    Specialization getSpecialization() throws Exception;
}
