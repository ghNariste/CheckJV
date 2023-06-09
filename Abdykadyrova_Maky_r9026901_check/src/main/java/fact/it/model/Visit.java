package fact.it.model;

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

    }
    public int getCost(){

    }
}
