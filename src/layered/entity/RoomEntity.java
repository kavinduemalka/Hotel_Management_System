/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layered.entity;

/**
 *
 * @author Admin
 */
public class RoomEntity {
    private String roomId;
    private String roomNo;
    private String category;
    private String status;

    public RoomEntity() {
    }

    public RoomEntity(String roomId, String roomNo, String category, String status) {
        this.roomId = roomId;
        this.roomNo = roomNo;
        this.category = category;
        this.status = status;
    }

    /**
     * @return the roomId
     */
    public String getRoomId() {
        return roomId;
    }

    /**
     * @param roomId the roomId to set
     */
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    /**
     * @return the roomNo
     */
    public String getRoomNo() {
        return roomNo;
    }

    /**
     * @param roomNo the roomNo to set
     */
    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RoomDto{" + "roomId=" + roomId + ", roomNo=" + roomNo + ", category=" + category + ", status=" + status + '}';
    }
}
