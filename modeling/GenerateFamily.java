package modeling;

import java.util.ArrayList;
import java.util.Random;


public class GenerateFamily {
    private static String[] arrSName() {
        String[] arrSName = new String[] { "Иванов(а)", "Петров(а)", "Сидоров(а)" };
        return arrSName;
    }

    private static String [] arrName (){
        String [] arrName = new String[] {"Иван", "Петр", "Василий","Елена","Мария","Екатерина"};
    return arrName;
    }
    private static String[] arrSNdogs() {
        String[] arrSName = new String[] { "Чао-Чао", "Хаски", "Двортерьер" };
        return arrSName;
    }

    private static String [] arrNdogs (){
        String [] arrName = new String[] {"Бобик", "Шарик", "Мурзик","Чебурашка","Маха","Булька"};
    return arrName;
    }

    private static Person Members(int index) {
        String[] arrS = new String[3];
        String[] arrN = new String[6];
        int a = 0;
        Random rand = new Random();
        Person personArray = new Human();
        switch (index) {
            case 1:
            personArray = new Human();
            arrS = arrSName();
            arrN = arrName ();   
            a = rand.nextInt(50);
                break;
            case 2:
            personArray = new Dogs();
            arrS = arrSNdogs();
            arrN = arrNdogs();   
            a = rand.nextInt(20);
                break;
            default:
                break;
        }
        ArrayList<Integer> ch = new ArrayList<>();
        ch.add(0);
        personArray.setNumber(0);
        personArray.setName(arrN[rand.nextInt(5)]);
        personArray.setSurname(arrS[rand.nextInt(2)]);
        personArray.setAges(a);
        personArray.setNameFather(arrN[rand.nextInt(2)]);
        personArray.setNameMother(arrN[rand.nextInt(2) + 3]);
        personArray.setChild(ch);
        return personArray;
    }

    public static Family<Person> personList(int x) {
        Family<Person> persons = new Family<>();
        Person pers1;
        switch (x) {
            case 1:
            pers1 = new Human();   
            //in.close ();            
                break;
            case 2:
            pers1 = new Dogs(); 
            //in.close ();
            break;
            default:
            personList(x);
                break;
        }
        //in.close ();  
        for (int i = 0; i < 10; i++) {
            pers1 = GenerateFamily.Members(x);
            pers1.setNumber(1 + i);
            persons.add(pers1);

        }

        return persons;
    }

}
