package modeling;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import filemanager.WorkFile;

public abstract class Person implements Serializable {
    private int number;
    private String name;
    public String surname;
    private String nameFather;
    private String nameMother;
    private int ages;
    private ArrayList<Integer> Child;
    
    public void addChild(int c) {
        Child.add(c);
    }

    public void setChild(ArrayList<Integer> child) {
        Child = child;
    }

    public ArrayList<Integer> getChild() {
        return Child;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNameFather(String nameFather) {
        this.nameFather = nameFather;
    }

    public void setNameMother(String nameMother) {
        this.nameMother = nameMother;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNameFather() {
        return nameFather;
    }

    public String getNameMother() {
        return nameMother;
    }

    public int getAges() {
        return ages;
    }

    public Person() {
        // this.Child.add(1);
    }

    @Override
    public String toString() {
        return "- [num=" + number + ", name=" + name + ", surname=" + surname + ", nameFather=" + nameFather
                + ", nameMother="
                + nameMother + ", ages=" + ages + ", Child=" + Child + "]";
    }

    public void Squeezy(Person person, WorkFile File) throws IOException, ClassNotFoundException {
        File.Squeezy(person);
    }

    

    


}
