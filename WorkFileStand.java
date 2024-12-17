import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class WorkFileStand extends WorkFile {

    protected String nameFile;
    protected Person person;

    public static void OutMethod (ArrayList<Person> persons) throws IOException, ClassNotFoundException {
        //Squeezy(persons);
    }  

   
    public static void InMethod (String name) {

    }

    @Override
    public void Squeezy(Person person) throws IOException, ClassNotFoundException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.out"));
            System.out.println("+");
            objectOutputStream.writeObject(person);
        objectOutputStream.close();
     
    }


}
