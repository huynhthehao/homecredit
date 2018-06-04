package net.demo.Service;

import net.demo.Dao.CustomerDao;
import net.demo.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public Collection<Customer> getAllCustomer(){
        return this.customerDao.getAllCustomer();
    }
}
