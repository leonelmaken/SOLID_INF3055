import java.util.Date;

public class Person {
    private String name;
    private String firstname;
    private Date birthDate;
    private Job job;

    public Person(String name, String firstname, Date birthDate, Job job) {
        this.name = name;
        this.firstname = firstname;
        this.birthDate = birthDate;
        this.job = job;
    }


    public String getName() {
        return name;
    }

    public String getFirstname() {
        return firstname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Job getJob() {
        return job;
    }
}
