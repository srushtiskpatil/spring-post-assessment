package ideas.controller;

import com.ideas.model.Customer;
import com.ideas.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customer> getCustomers(){
        return customerService.getAllCustomers();
    }

    @PostMapping
    public void createCustomer(@RequestBody Customer customer){
        customerService.createCustomer(customer);
    }
}
