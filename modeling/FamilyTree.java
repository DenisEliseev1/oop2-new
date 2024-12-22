package modeling;

import java.util.ArrayList;
import java.util.Collections;

public class FamilyTree  {
    public static ArrayList<Person> StartCheckChildren(ArrayList<Person> pers) {
        int ages;
        String name;
        // String nameF;
        // String nameM;
        String sName;
        for (Person person : pers) {
            name = person.getName();
            ages = person.getAges();
            sName = person.getSurname();
            // FileWriter file = new FileWriter (name+sName+ages+".txt");
            for (Person person2 : pers) {
                if ((sName == person2.getSurname())
                        && ((name == person2.getNameFather()) || (name == person2.getNameMother()))
                        && ((ages - person2.getAges()) >= 18)) {
                    person.addChild(person2.getNumber());
                }

            }

        }
        return pers;
    }

    public static void sortSurname (ArrayList<Person> persons) {
        Collections.sort (persons, (p1, p2) -> p1.getSurname().compareTo(p2.getSurname()));
    }

    public static void sortAges (ArrayList<Person> persons) {
        
        Collections.sort (persons, (p1, p2) -> Integer.compare (p1.getAges(), p2.getAges()));
    }
}