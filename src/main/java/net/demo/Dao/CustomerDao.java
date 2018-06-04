package net.demo.Dao;

import net.demo.Entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class CustomerDao {

    private static Map<Integer,Customer> customer;

    static{
        customer = new HashMap<Integer, Customer>(){
            {
                put(1,new Customer(1,"Johnny Balde","CTR1000"));
                put(1,new Customer(2,"David","CTR1001"));
                put(1,new Customer(3,"Ronaldo","CTR1002"));
            }
        };
    }

    public Collection<Customer> getAllCustomer(){
        return customer.values();
    }
}
