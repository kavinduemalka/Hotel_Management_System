/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layered.service.custom.impl;

import layered.dao.DaoFactory;
import layered.dao.custom.UserDao;
import layered.dto.UserDto;
import layered.entity.UserEntity;
import layered.service.custom.UserService;

/**
 *
 * @author Admin
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao = (UserDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.USER);

    @Override
    public String addUser(UserDto dto) throws Exception {
        UserEntity userEntity = new UserEntity(
                dto.getName(),
                dto.getNic(),
                dto.getEmail(),
                dto.getPhone(),
                dto.getUsername(),
                dto.getPassword()
        );

        if (userDao.save(userEntity)) {
            return "Successfully Saved";
        } else {
            return "Fail";
        }
    }

    @Override
    public UserDto getUser(String username) throws Exception {
        UserEntity entity = userDao.get(username);
        if (entity != null) {
            return new UserDto(entity.getUsername(),
                    entity.getName(), entity.getNic(), entity.getEmail(), entity.getPhone(),
                   entity.getPassword());
        }
        return null;
    }
}

