package presenter;

import java.util.Scanner;

import modeling.Family;
import modeling.FamilyTree;
import modeling.GenerateFamily;
import modeling.Person;
import viewer.Print;
import viewer.PrintTerminal;

public class Present {
    Print pr = new PrintTerminal();
    Present st  = new Present();
    public void ButtonClick() {
        System.out.println(
                "Для выбора объектов FamilyTree вести: \n1- Генеалогическое древо людей \n2 - Родословная собак");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        Family<Person> persons = GenerateFamily.personList(x);
        in.reset();
        // Print.printTerminal (persons);
        st.Start(persons);
        in.close();

    }

    private void Start(Family<Person> persons) {
        
        Scanner in = new Scanner(System.in);
        int index = 0;
        System.out.println(
                "Введите: \n1 - Показать членов семьи \n2 - Показать результаты исследования генеалогического древа\n3 - ВЫХОД");
        index = in.nextInt();
        switch (index) {
            case 1:

                in.reset();
                st.Start(persons);
                break;
            case 2:
                Family<Person> tree = FamilyTree.StartCheckChildren(persons);
                pr.print (tree);
                in.reset();
                st.Start(persons);
                break;
            case 3:
                System.out.println("Bye");
                in.close();
                break;
            default:
                in.reset();
                st.Start(persons);
                break;
        }
    }
}
