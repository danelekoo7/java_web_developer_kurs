package spring.dependency.src.main.java.pl.coderslab.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonService {
    private pl.coderslab.beans.PersonRepository personRepo;

    @Autowired
    public PersonService(pl.coderslab.beans.PersonRepository personRepo) {
        this.personRepo = personRepo;
    }

    public pl.coderslab.beans.PersonRepository getPersonRepo() {
        return personRepo;
    }

    public void setPersonRepo(pl.coderslab.beans.PersonRepository personRepo) {
        this.personRepo = personRepo;
    }
}
