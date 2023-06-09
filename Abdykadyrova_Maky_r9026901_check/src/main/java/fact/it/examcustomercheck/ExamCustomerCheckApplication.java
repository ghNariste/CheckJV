package fact.it.examcustomercheck;
import fact.it.model.Customer;
import fact.it.model.Visit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.lang.System.exit;

@SpringBootApplication
public class ExamCustomerCheckApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamCustomerCheckApplication.class, args);
        Customer customer = new Customer("John Doe");
        customer.setCitizen(true);
        customer.setYearOfOrigin(2014);
        System.out.println(customer.toString());
        Visit myV = new Visit();
        myV.setCustomer(customer);
        myV.setEnterWeight(10);
        myV.setExitWeight(5);
        System.out.println(myV.getMembershipAge());
        System.out.println(myV.getDepositeWeight());
        System.out.println(myV.getCost());
        System.out.println(myV.toString());

        System.out.println("Visit 1 Details: "+"\n"+customer.toString());
        System.exit(0);

    }
}
