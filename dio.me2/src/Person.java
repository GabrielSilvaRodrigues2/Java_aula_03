
import java.time.OffsetDateTime;

public class Person {
    private int lastYearAgeInc = OffsetDateTime.now().getYear();
    private String name;
    private int age;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
        this.age = 1;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void incAge(){
        if (this.lastYearAgeInc >= OffsetDateTime.now().getYear()) return;
        this.age++;
        this.lastYearAgeInc = OffsetDateTime.now().getYear();
    }
    
}
