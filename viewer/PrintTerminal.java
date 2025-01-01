package viewer;

import java.util.List;

import modeling.Person;

public class PrintTerminal extends Print {
 

            @Override
            public void print(List<Person> persons) {
                for (Person person : persons) {
                    System.out.println(person);        
                }
            }
}
