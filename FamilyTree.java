import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class FamilyTree {

       public static void StartCheckChildren (ArrayList<Person> pers) throws Exception {
        int ages;
        String name;
        String nameF;
        String nameM;
        String sName;
        for (Person person : pers) {
            name = person.getName();
            ages = person.getAges();
            sName = person.getSurname();
            FileWriter file = new FileWriter (name+sName+ages+".txt");
            file.write ("Предок: " + person + "\n" + "Потомки:");
            file.append('\n');
            for (Person person2 : pers) {
                if ((sName == person2.getSurname())&&((name == person2.getNameFather())||(name == person2.getNameMother())) 
                && ((ages - person2.getAges()) >= 18)){
                    file.append ("-" + person2);
                    file.append('\n');
                }

            }
            file.close();
        }
    }
}