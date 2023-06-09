package fact.it.model;
import java.time.LocalDate;
import java.time.Year;

public class Visit {
    private Customer customer;
    private int enterWeight;
    private int exitWeight;
    public Visit(){
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getEnterWeight() {
        return enterWeight;
    }

    public void setEnterWeight(int enterWeight) {
        this.enterWeight = enterWeight;
    }

    public int getExitWeight() {
        return exitWeight;
    }

    public void setExitWeight(int exitWeight) {
        this.exitWeight = exitWeight;
    }
    public int getDepositeWeight(){
        return Math.abs(enterWeight-exitWeight);
    }
    public int getMembershipAge(){
         LocalDate ld = LocalDate.now();
        return ld.getYear()-customer.getYearOfOrigin();
    }
    public int getCost(){
        if (getDepositeWeight() <= 7 && getMembershipAge()>5){
            return 0;
        } else if (getDepositeWeight()<= 50) {
            return getDepositeWeight()*2;

        }
        else {
            return getDepositeWeight()*3;
        }
    }
    public String toString(){
        return customer.getName()+" registered in"+customer.getYearOfOrigin()+" has deposited" +getDepositeWeight()+" of waste: Cost = "+getCost()+" euro";
    }

}
