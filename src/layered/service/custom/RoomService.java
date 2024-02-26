/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package layered.service.custom;

import java.util.List;
import layered.dto.RoomDto;
import layered.service.SuperService;

/**
 *
 * @author Admin
 */
public interface RoomService extends SuperService {

    String addRoom(RoomDto dto) throws Exception;

    String updateRoom(RoomDto dto) throws Exception;

    String deleteRoom(String roomId) throws Exception;

    RoomDto getRoom(String roomId) throws Exception;

    List<RoomDto> getAllRooms() throws Exception;
}
