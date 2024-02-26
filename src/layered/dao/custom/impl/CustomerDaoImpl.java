/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layered.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import layered.dao.CrudUtil;
import layered.dao.custom.CustomerDao;
import layered.entity.CustomerEntity;

/**
 *
 * @author Admin
 */
public class CustomerDaoImpl implements CustomerDao {
    @Override
    public boolean save(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Customers VALUES (?,?,?,?,?,?,?)",
                t.getCustId(),
                t.getFname(), t.getLname(), t.getEmail(), t.getPhone(),
                t.getAddress(), 
                t.getGender());
    }


    @Override
    public boolean update(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE customers SET first_name=?, last_name=?, email=?, phone_number=?, address=?, gender=? WHERE customer_id=?",
                t.getFname(),
                t.getLname(),
                t.getEmail(),
                t.getPhone(),
                t.getAddress(),
                t.getGender(),
                t.getCustId());
    }


    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Customers WHERE customer_id=?", id);
    }

    @Override
    public CustomerEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM customers WHERE customer_id = ?", id);
        while (rst.next()) {
            return new CustomerEntity(
                    rst.getString("customer_id"),
                    rst.getString("first_name"),
                    rst.getString("last_name"),
                    rst.getString("email"),
                    rst.getInt("phone_number"),
                    rst.getString("address"),
                    rst.getString("gender"));
        }

        return null;
    }


    @Override
    public List<CustomerEntity> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM customers");
        List<CustomerEntity> customerEntities = new ArrayList<>();

        while (rst.next()) {
            customerEntities.add(new CustomerEntity(
                    rst.getString("customer_id"),
                    rst.getString("first_name"),
                    rst.getString("last_name"),
                    rst.getString("email"),
                    rst.getInt("phone_number"),  // or rst.getString("phone_number") if it's a string
                    rst.getString("address"),
                    rst.getString("gender")));
        }
        return customerEntities;
    }

}
