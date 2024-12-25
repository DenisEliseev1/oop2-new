import java.util.ArrayList;

import modeling.Family;
import modeling.FamilyTree;
import modeling.GenerateFamily;
import modeling.Human;
import modeling.Person;
import filemanager.*;

/**
 * Сделать Person абстрактынм и наследовать от него Human  и Dogs
 * Класс FamilyTree сделать универсальным к выбору классов Human и Dogs
 * Сортировку вынести в отдельный package
 * 
 */

public class program {

    public static void main(String[] args) throws Exception{
        Family<Person> persons = new Family <>();
        persons = GenerateFamily.personList();
        for (Person person : persons) {
            System.out.println(person);        
            System.out.println(person.getClass());
        }

        FamilyTree.StartCheckChildren(persons);
        for (Person person : persons) {
            System.out.println(person);
            //person.Squeezy(person, new WorkFileStand());

        }
       /** 
        FamilyTree.sortSurname (persons);
        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println();
         
       FamilyTree.sortAges (persons);
       for (Person person : persons) {
           System.out.println(person);
       }
           */
    }

}