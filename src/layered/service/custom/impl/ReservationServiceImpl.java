/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layered.service.custom.impl;

import java.util.ArrayList;
import java.util.List;
import layered.dao.DaoFactory;
import layered.dao.custom.ReservationDao;
import layered.dto.ReservationDto;
import layered.entity.ReservationEntity;
import layered.service.custom.ReservationService;

/**
 *
 * @author Admin
 */
public class ReservationServiceImpl implements ReservationService {
    private ReservationDao reservationDao = (ReservationDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.RESERVATION);

    @Override
    public String addReservation(ReservationDto dto) throws Exception {
        ReservationEntity reservationEntity = new ReservationEntity(
                dto.getID(),
                dto.getRoomID(),
                dto.getCustomerID(),
                dto.getReservationDate(),
                dto.getReservationTime(),
                dto.getReservationAmount(),
                dto.IsCancelled()
        );

        if (reservationDao.save(reservationEntity)) {
            return "Successfully Saved";
        } else {
            return "Fail";
        }
    }

    @Override
    public String updateReservation(ReservationDto dto) throws Exception {
        ReservationEntity reservationEntity = new ReservationEntity(
                dto.getID(),
                dto.getRoomID(),
                dto.getCustomerID(),
                dto.getReservationDate(),
                dto.getReservationTime(),
                dto.getReservationAmount(),
                dto.IsCancelled()
        );

        if (reservationDao.update(reservationEntity)) {
            return "Successfully Updated";
        } else {
            return "Fail";
        }
    }

    @Override
    public String deleteReservation(String id) throws Exception {
        if (reservationDao.delete(id)) {
            return "Successfully Deleted";
        } else {
            return "Fail";
        }
    }

    @Override
    public ReservationDto getReservation(String id) throws Exception {
        ReservationEntity entity = reservationDao.get(id);
        if (entity != null) {
            return new ReservationDto(
                    entity.getID(),
                    entity.getRoomID(),
                    entity.getCustomerID(),
                    entity.getReservationDate(),
                    entity.getReservationTime(),
                    entity.getReservationAmount(),
                    entity.IsCancelled()
            );
        }
        return null;
    }

    @Override
    public List<ReservationDto> getAll() throws Exception {
        List<ReservationDto> reservationDtos = new ArrayList<>();
        List<ReservationEntity> reservationEntities = reservationDao.getAll();
        for (ReservationEntity entity : reservationEntities) {
            reservationDtos.add(new ReservationDto(
                    entity.getID(),
                    entity.getRoomID(),
                    entity.getCustomerID(),
                    entity.getReservationDate(),
                    entity.getReservationTime(),
                    entity.getReservationAmount(),
                    entity.IsCancelled()
            ));
        }
        return reservationDtos;
    }
}

