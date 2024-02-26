/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package layered.service.custom;

import java.util.List;
import layered.dto.CustomerDto;
import layered.service.SuperService;

/**
 *
 * @author Admin
 */
public interface CustomerService extends SuperService{
    String addCustomer(CustomerDto dto) throws Exception;

    String updateCustomer(CustomerDto dto) throws Exception;

    String deleteCustomer(String id) throws Exception;
    
    CustomerDto getCustomer(String id) throws Exception;
    
    List<CustomerDto> getAll() throws Exception;
}
