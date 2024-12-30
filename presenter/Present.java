package presenter;

import java.util.Scanner;

import modeling.Family;
import modeling.FamilyTree;
import modeling.GenerateFamily;
import modeling.Person;
import viewer.Print;

public class Present {
    public static void ButtonClick() {

        System.out.println(
                "Для выбора объектов FamilyTree вести: \n1- Генеалогическое древо людей \n2 - Родословная собак");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        Family<Person> persons = GenerateFamily.personList(x);
        in.reset();
        // Print.printTerminal (persons);
        start(persons);
        in.close();

    }

    private static void start(Family<Person> persons) {
        Scanner in = new Scanner(System.in);
        int index = 0;
        System.out.println(
                "Введите: \n1 - Показать членов семьи \n2 - Показать результаты исследования генеалогического древа\n3 - ВЫХОД");
        index = in.nextInt();
        switch (index) {
            case 1:
                Print.printTerminal(persons);
                in.reset();
                start(persons);
                break;
            case 2:
                Family<Person> tree = FamilyTree.StartCheckChildren(persons);
                Print.printTerminal(tree);
                in.reset();
                start(persons);
                break;
            case 3:
                System.out.println("Bye");
                in.close();
                break;
            default:
                in.reset();
                start(persons);
                break;
        }
    }
}