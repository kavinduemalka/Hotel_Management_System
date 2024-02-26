/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layered.service.custom.impl;

import java.util.ArrayList;
import java.util.List;
import layered.dao.DaoFactory;
import layered.dao.custom.CustomerDao;
import layered.dto.CustomerDto;
import layered.entity.CustomerEntity;
import layered.service.custom.CustomerService;

/**
 *
 * @author Admin
 */
public class CustomerServiceImpl implements CustomerService{
    private CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.CUSTOMER);

    @Override
    public String addCustomer(CustomerDto dto) throws Exception {
        CustomerEntity customerEntity = new CustomerEntity(
                dto.getCustId(),
                dto.getFname(), dto.getLname(),dto.getEmail(), dto.getPhone(),
                dto.getAddress(), 
                dto.getGender());

        if (customerDao.save(customerEntity)) {
            return "Successfully Saved";
        } else {
            return "Fail";
        }

    }

    @Override
    public String updateCustomer(CustomerDto dto) throws Exception {
    CustomerEntity customerEntity = new CustomerEntity(
            dto.getCustId(),
            dto.getFname(), dto.getLname(), dto.getEmail(), dto.getPhone(),
            dto.getAddress(),
            dto.getGender());

    if (customerDao.update(customerEntity)) {
        return "Successfully Updated";
    } else {
        return "Fail";
    }
}


    @Override
    public String deleteCustomer(String id) throws Exception {
        if (customerDao.delete(id)) {
            return "Successfully Deleted";
        } else {
            return "Fail";
        }
    }

    @Override
    public CustomerDto getCustomer(String id) throws Exception {
        CustomerEntity entity = customerDao.get(id);
        if (entity != null) {
            return new CustomerDto(entity.getCustId(),
                    entity.getFname(), entity.getLname(), entity.getEmail(), entity.getPhone(),
                    entity.getAddress(), entity.getGender());
        }
        return null;
    }

    @Override
    public List<CustomerDto> getAll() throws Exception {
        List<CustomerDto> customerDtos = new ArrayList<>();
        List<CustomerEntity> customerEntities = customerDao.getAll();
        for (CustomerEntity entity : customerEntities) {
            customerDtos.add(new CustomerDto(entity.getCustId(),
                    entity.getFname(), entity.getLname(), entity.getEmail(), entity.getPhone(),
                    entity.getAddress(), entity.getGender()));
        }
        return customerDtos;
    }

}
