/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layered.controller;

import layered.dto.UserDto;
import layered.service.ServiceFactory;
import layered.service.custom.UserService;

/**
 *
 * @author Admin
 */
public class UserController {
    
    private UserService userService = (UserService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.USER);

    public String saveCustomer(UserDto userDto) throws Exception{
        return userService.addUser(userDto);
    }
    
        public UserDto getUser(String username) throws Exception{
        return userService.getUser(username);
    }
    

    
}
