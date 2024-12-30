package viewer;


import java.util.List;
import modeling.*;

public class Print {
    public static void printTerminal (List <Person> persons) {
        for (Person person : persons) {
            System.out.println(person);        
        }
    }
}
