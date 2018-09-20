package kata1;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private final String name;
    private final LocalDate birthdate;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthdate = birthday;
    }

    public LocalDate getBirthday() {
        return birthdate;
    }

    public String getName() {
        return name;
    }
    
    public int getAge(){
        LocalDate today = LocalDate.now();
        return (int) (Period.between(birthdate, today).getYears());
    }
    
}
