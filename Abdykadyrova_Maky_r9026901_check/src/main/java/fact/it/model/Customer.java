package fact.it.model;

public class Customer {
    private String name;
    private boolean citizen;
    private int yearOfOrigin;
    public Customer(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCitizen() {
        return citizen;
    }

    public void setCitizen(boolean citizen) {
        this.citizen = citizen;
    }

    public int getYearOfOrigin() {
        return yearOfOrigin;
    }

    public void setYearOfOrigin(int yearOfOrigin) {
        this.yearOfOrigin = yearOfOrigin;
    }
    public String toString(){
        if (isCitizen()==true){
            return name+"(citizen) registered in"+getYearOfOrigin();
        }
        else{
            return name+"registered in"+getYearOfOrigin();
        }
    }
}
