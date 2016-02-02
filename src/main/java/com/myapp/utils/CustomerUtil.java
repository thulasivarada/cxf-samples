package com.myapp.utils;

import com.myapp.beans.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by chida on 2/2/16.
 */
public class CustomerUtil {
    public static Map<String,Customer> customers = new HashMap<String, Customer>();


    public void createCustomer(Customer customer) {
        customer.setId(Integer.valueOf(customers.size()+1).toString());
        customers.put(customer.getId(),customer);
    }

    public Customer updateCustomer(String id,Customer customer){
        customer.setId(id);
        customers.put(id,customer);
        return customers.get(id);
    }

    public void deleteCustomer(String id){
        customers.remove(id);
    }

    public Customer getCustomer(String id){
        return customers.get(id);
    }

    public List<Customer> getAllCustomers(){
        return new ArrayList<Customer>(customers.values());
    }
}
