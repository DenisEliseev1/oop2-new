public class Person {
    private String name;
    private String surname;
    private String nameFather;
    private String nameMother;
    private int ages;

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

    
    /**
     * Характеристики объекта
     * @param name
     * @param surname
     * @param nameFather
     * @param nameMother
     * @param ages
     */

    public Person() {
        this.name = name;
        this.surname = surname;
        this.nameFather = nameFather;
        this.nameMother = nameMother;
        this.ages = ages;
    }

    @Override
    public String toString() {
        return "- [name=" + name + ", surname=" + surname + ", nameFather=" + nameFather + ", nameMother="
                + nameMother + ", ages=" + ages + "]";
    }
   



    

    
    
}
