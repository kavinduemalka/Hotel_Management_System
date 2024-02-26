/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layered.service;

import layered.service.custom.impl.CategoryServiceImpl;
import layered.service.custom.impl.CustomerServiceImpl;
import layered.service.custom.impl.ReservationServiceImpl;
import layered.service.custom.impl.RoomServiceImpl;
import layered.service.custom.impl.UserServiceImpl;

/**
 *
 * @author Admin
 */
public class ServiceFactory {
    private static ServiceFactory serviceFactory;
    
    private ServiceFactory(){}
    
    public static ServiceFactory getInstance(){
        if(serviceFactory == null){
            serviceFactory = new ServiceFactory();
        }
        
        return serviceFactory;
    }
    
    public SuperService getService(ServiceType type){
        switch (type) {
            case ROOM:
                return new RoomServiceImpl();
            case CUSTOMER:
                return new CustomerServiceImpl();
            case RESERVATION:
                return new ReservationServiceImpl();
            case USER:
                return new UserServiceImpl();
            case CATEGORY:
                return new CategoryServiceImpl();
            default:
                return null;
        }
    }
    
    public enum ServiceType{
        ITEM, CUSTOMER, ORDER, ROOM, USER, CATEGORY, RESERVATION
    }
    
}
