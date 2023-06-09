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
        Visit myV = new Visit();
        myV.setCustomer(customer);
        myV.setEnterWeight(10);
        myV.setExitWeight(5);

        Customer customer2 = new Customer("Jane Smith");
        customer2.setCitizen(false);
        customer2.setYearOfOrigin(2015);
        Visit myJ = new Visit();
        myJ.setCustomer(customer2);
        myJ.setEnterWeight(19);
        myJ.setExitWeight(8);

        System.out.println("Visit 1 Details: "+"\n"+myV.toString());
        System.out.println("Visit 2 Details: "+"\n"+myJ.toString());
        System.exit(0);

    }
}
