/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layered.service.custom.impl;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.List;
import layered.dto.RoomDto;
import layered.entity.RoomEntity;
import layered.service.custom.RoomService;
import layered.dao.DaoFactory;
import layered.dao.custom.RoomDao;

public class RoomServiceImpl implements RoomService {
    private RoomDao roomDao = (RoomDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.ROOM);

    @Override
    public String addRoom(RoomDto dto) throws Exception {
        RoomEntity roomEntity = new RoomEntity(
                dto.getRoomId(),
                dto.getRoomNo(),
                dto.getCategory(),
                dto.getStatus()
        );

        if (roomDao.save(roomEntity)) {
            return "Successfully Saved";
        } else {
            return "Fail";
        }
    }

    @Override
    public String updateRoom(RoomDto dto) throws Exception {
        RoomEntity roomEntity = new RoomEntity(
                dto.getRoomId(),
                dto.getRoomNo(),
                dto.getCategory(),
                dto.getStatus()
        );

        if (roomDao.update(roomEntity)) {
            return "Successfully Updated";
        } else {
            return "Fail";
        }
    }

    @Override
    public String deleteRoom(String roomId) throws Exception {
        if (roomDao.delete(roomId)) {
            return "Successfully Deleted";
        } else {
            return "Fail";
        }
    }

    @Override
    public RoomDto getRoom(String roomId) throws Exception {
        RoomEntity entity = roomDao.get(roomId);
        if (entity != null) {
            return new RoomDto(
                    entity.getRoomId(),
                    entity.getRoomNo(),
                    entity.getCategory(),
                    entity.getStatus()
            );
        }
        return null;
    }

    @Override
    public List<RoomDto> getAllRooms() throws Exception {
        List<RoomDto> roomDtos = new ArrayList<>();
        List<RoomEntity> roomEntities = roomDao.getAll();
        for (RoomEntity entity : roomEntities) {
            roomDtos.add(new RoomDto(
                    entity.getRoomId(),
                    entity.getRoomNo(),
                    entity.getCategory(),
                    entity.getStatus()
            ));
        }
        return roomDtos;
    }
}
