import java.util.List;

public interface PersonDAO {
    public void insertPerson(Person person);
    public List<Person> getAllPersons();
}
