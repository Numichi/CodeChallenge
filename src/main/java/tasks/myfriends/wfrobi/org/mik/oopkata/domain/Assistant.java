package tasks.myfriends.wfrobi.org.mik.oopkata.domain;

import java.util.Objects;

public class Assistant extends AbstractPerson {
    public Assistant(
        String name,
        int birthYear
    ) {
        super(name, birthYear);
    }
    
    @Override
    public boolean isAssistant() {
        return true;
    }
    
    @Override
    public void setName(String name) {
        super.setName(name == null || name.isEmpty() ? "Assistant" : name);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Assistant)) {
            return false;
        }
        Assistant assistant = (Assistant) o;
        return getBirthYear() == assistant.getBirthYear()
            && getName().equals(assistant.getName());
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getBirthYear(), getName());
    }
}
