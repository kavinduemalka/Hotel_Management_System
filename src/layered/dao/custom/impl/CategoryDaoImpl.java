/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layered.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import layered.dao.CrudUtil;
import layered.dao.custom.CategoryDao;
import layered.entity.CategoryEntity;

/**
 *
 * @author Admin
 */
public class CategoryDaoImpl implements CategoryDao {
    @Override
    public boolean save(CategoryEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO RoomCategory(CategoryID,CategoryName,Description,Price,Capacity) VALUES (?,?,?,?,?)",
                t.getCategoryID(),
                t.getCategoryName(),
                t.getDescription(),
                t.getPrice(),
                t.getCapacity());
    }

    @Override
    public boolean update(CategoryEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE RoomCategory SET CategoryName=?, Description=?, Price=?, Capacity=? WHERE CategoryID=?",
                t.getCategoryName(),
                t.getDescription(),
                t.getPrice(),
                t.getCapacity(),
                t.getCategoryID());
    }


    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM RoomCategory WHERE CategoryID=?", id);
    }

    @Override
    public CategoryEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM RoomCategory WHERE CategoryID = ?", id);
        while (rst.next()) {
            return new CategoryEntity(
                    rst.getString("CategoryID"),
                    rst.getString("CategoryName"),
                    rst.getString("Description"),
                    rst.getDouble("Price"),
                    rst.getInt("Capacity"));
        }

        return null;
    }


    @Override
    public List<CategoryEntity> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM RoomCategory");
        List<CategoryEntity> categoryEntities = new ArrayList<>();

        while (rst.next()) {
            categoryEntities.add(new CategoryEntity(
                    rst.getString("CategoryID"),
                    rst.getString("CategoryName"),
                    rst.getString("Description"),
                    rst.getDouble("Price"),
                    rst.getInt("Capacity")));
        }
        return categoryEntities;
    }
}
