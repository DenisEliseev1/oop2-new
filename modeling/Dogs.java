package modeling;

public class Dogs extends Person {
    private String breed;
    @Override
    public String getSurname() {
        return super.getSurname();
    }
    
    public String getBreed (){
        return getSurname();
    }

    @Override
    public void setSurname(String surname) {
        // TODO Auto-generated method stub
        super.setSurname(surname);
    }

    public void setBreed (String breed){
        this.breed = breed;
        setSurname (breed);
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "Dogs";
    }
   
}
