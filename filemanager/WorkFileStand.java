package filemanager;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import modeling.*;


public class WorkFileStand extends WorkFile {

    protected String nameFile;
    protected Person person;



    @Override
    public void Squeezy(Person person) throws IOException, ClassNotFoundException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.out"));
            System.out.println("+");
            objectOutputStream.writeObject(person);
        objectOutputStream.close();
     
    }


}
