/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layered.controller;

import java.util.List;
import layered.dto.RoomDto;
import layered.service.ServiceFactory;
import layered.service.custom.RoomService;

/**
 *
 * @author Admin
 */
public class RoomController {
    private RoomService roomService = (RoomService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ROOM);

    public String saveRoom(RoomDto roomDto) throws Exception {
        return roomService.addRoom(roomDto);
    }

    public String updateRoom(RoomDto roomDto) throws Exception {
        return roomService.updateRoom(roomDto);
    }

    public String deleteRoom(String roomId) throws Exception {
        return roomService.deleteRoom(roomId);
    }

    public RoomDto getRoom(String roomId) throws Exception {
        return roomService.getRoom(roomId);
    }

    public List<RoomDto> getAllRooms() throws Exception {
        return roomService.getAllRooms();
    }
}
