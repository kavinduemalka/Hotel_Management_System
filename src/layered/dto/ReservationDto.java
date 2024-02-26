/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layered.dto;

import java.util.Date;
import java.time.LocalTime;

/**
 *
 * @author Admin
 */
public class ReservationDto {
    private String ID;
    private String roomID;
    private String customerID;
    private Date reservationDate;
    private LocalTime reservationTime;
    private Double reservationAmount;
    private boolean isCancelled;

    public ReservationDto() {
    }

    public ReservationDto(String ID, String roomID, String customerID, Date reservationDate, LocalTime reservationTime, Double reservationAmount, boolean isCancelled) {
        this.ID = ID;
        this.roomID = roomID;
        this.customerID = customerID;
        this.reservationDate = reservationDate;
        this.reservationTime = reservationTime;
        this.reservationAmount = reservationAmount;
        this.isCancelled = isCancelled;
    }
    
    

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the roomID
     */
    public String getRoomID() {
        return roomID;
    }

    /**
     * @param roomID the roomID to set
     */
    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    /**
     * @return the customerID
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    /**
     * @return the reservationDate
     */
    public Date getReservationDate() {
        return reservationDate;
    }

    /**
     * @param reservationDate the reservationDate to set
     */
    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    /**
     * @return the reservationTime
     */
    public LocalTime getReservationTime() {
        return reservationTime;
    }

    /**
     * @param reservationTime the reservationTime to set
     */
    public void setReservationTime(LocalTime reservationTime) {
        this.reservationTime = reservationTime;
    }

    /**
     * @return the reservationAmount
     */
    public Double getReservationAmount() {
        return reservationAmount;
    }

    /**
     * @param reservationAmount the reservationAmount to set
     */
    public void setReservationAmount(Double reservationAmount) {
        this.reservationAmount = reservationAmount;
    }

    /**
     * @return the isCancelled
     */
    public boolean IsCancelled() {
        return isCancelled;
    }

    /**
     * @param isCancelled the isCancelled to set
     */
    public void setCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }
     
}
