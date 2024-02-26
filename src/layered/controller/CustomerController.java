/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layered.controller;

import java.util.List;
import layered.dto.CustomerDto;
import layered.service.ServiceFactory;
import layered.service.custom.CustomerService;

/**
 *
 * @author Admin
 */
public class CustomerController {

    private CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);

    public String saveCustomer(CustomerDto customerDto) throws Exception{
        return customerService.addCustomer(customerDto);
    }
    
    public String updateCustomer(CustomerDto customerDto) throws Exception{
        return customerService.updateCustomer(customerDto);
    }
    
    public String deleteCustomer(String id) throws Exception{
        return customerService.deleteCustomer(id);
    }
    
    public CustomerDto getCustomer(String id) throws Exception{
        return customerService.getCustomer(id);
    }
    
    public List<CustomerDto> getAllCustomer() throws Exception{
        return customerService.getAll();
    }
}
