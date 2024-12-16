import java.util.ArrayList;

public class FamilyTree {

       public static ArrayList<Person>  StartCheckChildren (ArrayList<Person> pers) {
        int ages;
        String name;
        //String nameF;
        //String nameM;
        String sName;
        for (Person person : pers) {
            name = person.getName();
            ages = person.getAges();
            sName = person.getSurname();
            //FileWriter file = new FileWriter (name+sName+ages+".txt");
            for (Person person2 : pers) {
                if ((sName == person2.getSurname())&&((name == person2.getNameFather())||(name == person2.getNameMother())) 
                && ((ages - person2.getAges()) >= 18)){
                    person.addChild(person2.getNumber());
                }

            }
            //file.write ("Предок: " + person + "\n" + "Потомки:");
            //file.close();
           
        }
        return pers;
    }
}