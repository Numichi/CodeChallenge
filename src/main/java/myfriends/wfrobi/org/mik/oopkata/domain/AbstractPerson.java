package myfriends.wfrobi.org.mik.oopkata.domain;

public abstract class AbstractPerson implements Person
{
    public static final int MIN_NAME_LENGTH = 3;

    public static final int MIN_YEAR = 1929;

    public static final int MAX_YEAR = 2000;

    private String name;
    private int birthYear;

    public AbstractPerson(String name, int birthYear)
    {
        this.name = name;
        this.birthYear = birthYear;
    }

    @Override
    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void setBirthYear(int birthYear)
    {
        // test did not require it
    }

    @Override
    public int getBirthYear()
    {
        return birthYear;
    }

    @Override
    public boolean isStudent()
    {
        return false;
    }

    @Override
    public boolean isTeacher()
    {
        return false;
    }

    @Override
    public boolean isAssistant()
    {
        return false;
    }

    @Override
    public Institute getInstitute() throws Exception
    {
        throw new Exception();
    }

    @Override
    public Specialization getSpecialization() throws Exception
    {
        throw new Exception();
    }
}
