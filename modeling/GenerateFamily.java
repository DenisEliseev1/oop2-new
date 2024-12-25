package modeling;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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

    private static Person Human(int index) {
        // String [] arrSName = new String[] {"Иванов(а)","Петров(а)","Сидоров(а)"};
        // String [] arrName = new String[] {"Иван", "Петр",
        // "Василий","Елена","Мария","Екатерина"};
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
        if (index == 1) {

        }
            else if (index == 2) {

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

    public static Family<Person> personList() {
        int index;
        System.out.println("Ввести: \n1- Generate Human \n2 - Generate Dogs");
        Scanner in = new Scanner(System.in);
        index = in.nextInt();
        System.out.println(index);
        Family<Person> persons = new Family<>();
        Person pers1;
        switch (index) {
            case 1:
            pers1 = new Human();   
            in.close ();            
                break;
            case 2:
            pers1 = new Dogs(); 
            in.close ();
            break;
            default:
            personList();
                break;
        }
  
        for (int i = 0; i < 10; i++) {
            pers1 = GenerateFamily.Human(index);
            pers1.setNumber(1 + i);
            persons.add(pers1);

        }

        return persons;
    }

}
