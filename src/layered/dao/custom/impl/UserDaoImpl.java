/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layered.dao.custom.impl;

import java.util.List;
import layered.dao.CrudUtil;
import layered.dao.custom.UserDao;
import layered.entity.UserEntity;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class UserDaoImpl implements UserDao {
    @Override
    public boolean save(UserEntity userEntity) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO User (name, nic, email, phone, username, password) VALUES (?,?,?,?,?,?)",
                userEntity.getName(),
                userEntity.getNic(),
                userEntity.getEmail(),
                userEntity.getPhone(),
                userEntity.getUsername(),
                userEntity.getPassword());
    }

    @Override
    public boolean update(UserEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public UserEntity get(String username) throws Exception {
         ResultSet rst = CrudUtil.executeQuery("SELECT * FROM user WHERE username = ?", username);
        while (rst.next()) {
            return new UserEntity(
                    rst.getString("name"),
                    rst.getString("nic"),
                    rst.getString("email"),
                    rst.getString("username"),
                    rst.getString("phone"),
                    rst.getString("password"));
        }

        return null;
    }

    @Override
    public List<UserEntity> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

