package ideas.dao;

import com.ideas.model.Customer;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class CustomerDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void add(Customer customer){
       entityManager.persist(customer);
    }



    public List<Customer> findAll(){
        return entityManager.createQuery("select c from Customer c").getResultList();
    }
}
