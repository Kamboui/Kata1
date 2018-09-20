package kata1;

import java.util.Date;

public class Person {
    //a
    private final String name;
    private final Date birthdate;

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthdate = birthday;
    }

    public Date getBirthday() {
        return birthdate;
    }

    public String getName() {
        return name;
    }
    
    public int getAge(){
        return (int) ((new Date().getTime() - birthdate.getTime())/31557600000L);
    }
    
    
}
