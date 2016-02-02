package com.myapp.services;

import com.myapp.beans.Customer;
import com.myapp.utils.CustomerUtil;
import org.springframework.beans.factory.annotation.Autowired;


import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by chida on 2/2/16.
 */
@Path("/")
public class CustomerService {

    public CustomerUtil getCustomerUtil() {
        return customerUtil;
    }

    public void setCustomerUtil(CustomerUtil customerUtil) {
        this.customerUtil = customerUtil;
    }

    @Autowired
    private CustomerUtil customerUtil;





    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(Customer customer){
        customerUtil.createCustomer(customer);
    }

    @PUT
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Customer update(@PathParam("id") String id,Customer customer){
        System.out.println("Id "+id);
        return customerUtil.updateCustomer(id,customer);
    }


    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") String id){
        customerUtil.deleteCustomer(id);
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Customer get(@PathParam("id") String id){
        return customerUtil.getCustomer(id);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> getAll(){
         return customerUtil.getAllCustomers();
    }


}
