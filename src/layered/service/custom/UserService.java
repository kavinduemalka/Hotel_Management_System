/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package layered.service.custom;

import layered.dto.UserDto;
import layered.service.SuperService;

/**
 *
 * @author Admin
 */
public interface UserService extends SuperService{
    String addUser(UserDto dto) throws Exception;
    UserDto getUser(String username) throws Exception;
}
