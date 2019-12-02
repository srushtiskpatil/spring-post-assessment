package ideas.service;

import com.ideas.dao.CustomerDao;
import com.ideas.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public List<Customer> getAllCustomers(){
        return customerDao.findAll();
    }

    public void createCustomer(Customer customer) {
        customerDao.add(customer);
    }
}
