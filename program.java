import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import modeling.FamilyTree;
import modeling.GenerateFamily;
import modeling.Person;
import filemanager.*;


/**
 * Реализовать, с учетом ооп подхода, приложение. Для проведения исследований с
 * генеалогическим древом.
 * 
 * Идея: описать некоторое количество компонент, например - модель человека и
 * дерева.
 * Под “проведением исследования” можно понимать например получение всех детей
 * выбранного человека.
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
        Collections.sort (persons);
        for (Person person : persons) {
            System.out.println(person);
        }
        
       
    }

}