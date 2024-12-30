package modeling;

import java.util.ArrayList;
import java.util.Collections;

public class FamilyTree  {
    public static Family<Person> StartCheckChildren(Family<Person> pers) {
        int ages;
        String name;
        String sName;
        for (Person person : pers) {
            name = person.getName();
            ages = person.getAges();
            sName = person.getSurname();

            for (Person person2 : pers) {
                if ((sName == person2.getSurname())
                        && ((name == person2.getNameFather()) || (name == person2.getNameMother()))) {
                        if (((ages - person2.getAges()) >= 18) && (person2.toString().contains("Human")))
                    person.addChild(person2.getNumber());
                    else if (((ages - person2.getAges()) >= 2) && (person2.toString().contains("Dogs")))  
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