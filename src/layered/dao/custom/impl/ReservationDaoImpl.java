package layered.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import layered.dao.CrudUtil;
import layered.dao.custom.ReservationDao;
import layered.entity.ReservationEntity;

public class ReservationDaoImpl implements ReservationDao {

    @Override
    public boolean save(ReservationEntity reservation) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Reservations(ReservationID,RoomID,CustomerID,ReservationDate,ReservationTime,ReservationAmount,IsCancelled) VALUES (?,?,?,?,?,?,?)",
                reservation.getID(),
                reservation.getRoomID(),
                reservation.getCustomerID(),
                reservation.getReservationDate(),
                reservation.getReservationTime(),
                reservation.getReservationAmount(),
                reservation.IsCancelled());
    }

    @Override
    public boolean update(ReservationEntity reservation) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Reservations SET RoomID=?, CustomerID=?, ReservationDate=?, ReservationTime=?, ReservationAmount=?, IsCancelled=? WHERE ReservationID=?",
                reservation.getRoomID(),
                reservation.getCustomerID(),
                reservation.getReservationDate(),
                reservation.getReservationTime(),
                reservation.getReservationAmount(),
                reservation.IsCancelled(),
                reservation.getID());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Reservations WHERE ReservationID=?", id);
    }

    @Override
    public ReservationEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Reservations WHERE ReservationID = ?", id);
        while (rst.next()) {
            return new ReservationEntity(
                    rst.getString("ReservationID"),
                    rst.getString("RoomID"),
                    rst.getString("CustomerID"),
                    rst.getDate("ReservationDate"),
                    rst.getTime("ReservationTime").toLocalTime(),
                    rst.getDouble("ReservationAmount"),
                    rst.getBoolean("IsCancelled"));
        }

        return null;
    }

    @Override
    public List<ReservationEntity> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Reservations");
        List<ReservationEntity> reservationEntities = new ArrayList<>();

        while (rst.next()) {
            reservationEntities.add(new ReservationEntity(
                    rst.getString("ReservationID"),
                    rst.getString("RoomID"),
                    rst.getString("CustomerID"),
                    rst.getDate("ReservationDate"),
                    rst.getTime("ReservationTime").toLocalTime(),
                    rst.getDouble("ReservationAmount"),
                    rst.getBoolean("IsCancelled")));
        }

        return reservationEntities;
    }
}
