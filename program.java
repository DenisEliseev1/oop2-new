import java.util.ArrayList;
import modeling.FamilyTree;
import modeling.GenerateFamily;
import modeling.Person;
import filemanager.*;

/**
 * Сделать Person абстрактынм и наследовать от него Human  и Dogs
 * Класс FamilyTree сделать универсальным к выбору классов Human и Dogs
 */

public class program {

    public static void main(String[] args) throws Exception{
        ArrayList<Person> persons = new ArrayList<>();
        persons = GenerateFamily.personList();
        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println();
        FamilyTree.StartCheckChildren(persons);
        for (Person person : persons) {
            System.out.println(person);
            person.Squeezy(person, new WorkFileStand());

        }
        FamilyTree.sortSurname (persons);
        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println();
       FamilyTree.sortAges (persons);
       for (Person person : persons) {
           System.out.println(person);
       }
    }

}