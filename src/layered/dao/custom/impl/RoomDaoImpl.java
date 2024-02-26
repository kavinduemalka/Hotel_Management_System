/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layered.dao.custom.impl;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import layered.dao.CrudUtil;
import layered.dao.custom.RoomDao;
import layered.entity.RoomEntity;

public class RoomDaoImpl implements RoomDao {
    @Override
    public boolean save(RoomEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Rooms(RoomID,RoomNumber,CategoryID,status) VALUES (?,?,?,?)",
                t.getRoomId(),
                t.getRoomNo(),
                t.getCategory(),
                t.getStatus());
    }

    @Override
    public boolean update(RoomEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Rooms SET RoomNumber=?, CategoryID=?, status=? WHERE RoomID=?",
                t.getRoomNo(),
                t.getCategory(),
                t.getStatus(),
                t.getRoomId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Rooms WHERE RoomID=?", id);
    }

    @Override
    public RoomEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Rooms WHERE RoomID=?", id);
        while (rst.next()) {
            return new RoomEntity(
                    rst.getString("RoomID"),
                    rst.getString("RoomNumber"),
                    rst.getString("CategoryID"),
                    rst.getString("status"));
        }
        return null;
    }

    @Override
    public List<RoomEntity> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Rooms");
        List<RoomEntity> roomEntities = new ArrayList<>();

        while (rst.next()) {
            roomEntities.add(new RoomEntity(
                    rst.getString("RoomID"),
                    rst.getString("RoomNumber"),
                    rst.getString("CategoryID"),
                    rst.getString("status")));
        }
        return roomEntities;
    }
}

