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
        Customer myCustomer = new Customer("John");
        myCustomer.setCitizen(true);
        myCustomer.setYearOfOrigin(2020);
        System.out.println(myCustomer.toString());
        System.exit(0);

    }
}
