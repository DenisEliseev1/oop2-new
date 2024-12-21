package modeling;


import java.util.ArrayList;
import java.util.Random;

public class GenerateFamily {

    private static Person  Person () {
        String [] arrSName = new String[3];
        arrSName [0] = "Иванов(а)";
        arrSName [1] = "Петров(а)";
        arrSName [2] = "Сидоров(а)";
        String [] arrName = new String[6];
        arrName [0] = "Иван";
        arrName [1] = "Петр";
        arrName [2] = "Василий";
        arrName [3] = "Елена";
        arrName [4] = "Мария";
        arrName [5] = "Екатерина";
        Random rand = new Random();
        Person personArray = new Person();
        ArrayList <Integer> ch = new ArrayList<>();
        ch.add(0);
        personArray.setNumber(0);
        personArray.setName(arrName [rand.nextInt(5)]);
        personArray.setSurname(arrSName [rand.nextInt(2)]);
        personArray.setAges (rand.nextInt(50));
        personArray.setNameFather (arrName [rand.nextInt(2)]);
        personArray.setNameMother  (arrName [rand.nextInt(2)+3]);
        personArray.setChild (ch);
        return personArray;
    }

    public static ArrayList <Person> personList () {
        ArrayList <Person> persons = new ArrayList<>();
        Person pers1 = new Person();
        for (int i = 0; i < 10; i++) {
            pers1 = GenerateFamily.Person();
            pers1.setNumber (1+i);
            persons.add(pers1);
            
        }
        return persons;
    }
    
}