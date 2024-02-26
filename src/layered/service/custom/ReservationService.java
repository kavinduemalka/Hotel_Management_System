/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package layered.service.custom;

import java.util.List;
import layered.dto.ReservationDto;
import layered.service.SuperService;

/**
 *
 * @author Admin
 */
public interface ReservationService extends SuperService {

    String addReservation(ReservationDto dto) throws Exception;

    String updateReservation(ReservationDto dto) throws Exception;

    String deleteReservation(String id) throws Exception;

    ReservationDto getReservation(String id) throws Exception;

    List<ReservationDto> getAll() throws Exception;
}

