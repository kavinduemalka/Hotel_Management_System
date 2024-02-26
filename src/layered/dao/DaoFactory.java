/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layered.dao;

import layered.dao.custom.impl.CategoryDaoImpl;
import layered.dao.custom.impl.CustomerDaoImpl;
import layered.dao.custom.impl.ReservationDaoImpl;
import layered.dao.custom.impl.RoomDaoImpl;
import layered.dao.custom.impl.UserDaoImpl;

/**
 *
 * @author Admin
 */
public class DaoFactory {
    private static DaoFactory daoFactory;

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }

        return daoFactory;
    }

    public SuperDao getDao(DaoType type) {
        switch (type) {
            case ROOM:
                return new RoomDaoImpl();
            case CUSTOMER:
                return new CustomerDaoImpl();
            case RESERVATION:
                return new ReservationDaoImpl();
//            case ORDER_DETAIL:
//                return new OrderDetailDaoImpl();
            case USER: 
                return new UserDaoImpl();    
            case CATEGORY: 
                return new CategoryDaoImpl();
            default:
                return null;
        }
    }

    public enum DaoType {
        ITEM, CUSTOMER, ORDER, ORDER_DETAIL, ROOM, USER, CATEGORY, RESERVATION
    }
}
