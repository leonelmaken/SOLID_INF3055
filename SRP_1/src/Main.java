import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Job job = new Job();
        Person person = new Person(
                "KUIMO",
                "Browndon",
                sdf.parse("12/02/2020"),
                job
        );
        person.getJob().setJobDescription("IT Teacher");
        person.getJob().setGoodSalary(true);
        System.out.println("Description de l'objet personne : ");
        System.out.println("Nom : "+person.getName());
        System.out.println("Prénom : "+person.getFirstname());
        System.out.println("Date de naissance : "+person.getBirthDate());
        System.out.println("Job Description : "+person.getJob().getJobDescription());
        System.out.println("Is Good Salary : "+person.getJob().getisGoodSalary());
    }
}