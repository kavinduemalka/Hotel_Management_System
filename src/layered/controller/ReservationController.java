/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layered.controller;

import java.util.List;
import layered.dto.ReservationDto;
import layered.service.ServiceFactory;
import layered.service.custom.ReservationService;

/**
 *
 * @author Admin
 */
public class ReservationController {

    private ReservationService reservationService = (ReservationService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.RESERVATION);

    public String saveReservation(ReservationDto reservationDto) throws Exception {
        return reservationService.addReservation(reservationDto);
    }

    public String updateReservation(ReservationDto reservationDto) throws Exception {
        return reservationService.updateReservation(reservationDto);
    }

    public String deleteReservation(String id) throws Exception {
        return reservationService.deleteReservation(id);
    }

    public ReservationDto getReservation(String id) throws Exception {
        return reservationService.getReservation(id);
    }

    public List<ReservationDto> getAllReservations() throws Exception {
        return reservationService.getAll();
    }
}

