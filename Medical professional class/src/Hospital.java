import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Hospital {

    private ArrayList<Person> people = new ArrayList<>();

    public void addPerson(Person p) {
        people.add(p);
    }

    // Search
    public Person findById(int id) {
        for (Person p : people) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    // Filter
    public void showPatientsOnly() {
        for (Person p : people) {
            if (p instanceof Patient) {
                p.printInfo();
            }
        }
    }

    // Sort
    public void sortByName() {
        Collections.sort(people, Comparator.comparing(Person::getName));
    }

    public void showAll() {
        for (Person p : people) {
            p.printInfo();
        }
    }
}

